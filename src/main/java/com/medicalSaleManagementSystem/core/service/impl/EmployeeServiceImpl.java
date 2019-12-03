package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.redis.TokenManager;
import com.medicalSaleManagementSystem.redis.TokenModel;
import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.core.bean.POJO.Employee;
import com.medicalSaleManagementSystem.core.bean.POJO.EmployeeExample;
import com.medicalSaleManagementSystem.core.dao.EmployeeMapper;
import com.medicalSaleManagementSystem.core.service.EmployeeService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    private TokenManager tokenManager;
    /**
     * 用户登录，数据使用md5加密，如果登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
     * 修改：登录时间 登录IP的获取--byChoKhoOu
     * @param employeeDTO 需要包含用户账户account，密码password、登录时间LoginTime、登录LoginIp
     * @return 消息类
     * @author 林贤钦
     */
    @Override
    public Msg login(EmployeeDTO employeeDTO) {
        //Example类指定如何构建一个动态的where子句.
        EmployeeExample employeeExample = new EmployeeExample();
        //创建SQL语句条件对象
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        //添加SQL语句where子句的条件：
        criteria.andEmpAccountEqualTo(employeeDTO.getEmpAccount());
        criteria.andEmpPasswordEqualTo(MD5Util.string2MD5(employeeDTO.getEmpPassword()));
        //执行查询，返回结果
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if(employeeList.size()>0){
            if(employeeList.get(0).getValid()==0){
                return Msg.fail("帐号已经禁止登录！");
            }
            //登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
            TokenModel token=tokenManager.createToken(employeeList.get(0).getEmpId());//保存token到redis
            employeeList.get(0).setLastLoginTime(employeeList.get(0).getLoginTime());//将登录时间移动到上次登录时间
            employeeList.get(0).setLoginTime(new Date(System.currentTimeMillis()));//记录本次登录时间
            employeeList.get(0).setLoginIp(employeeDTO.getLoginIp());//记录登录ip
            int i = employeeMapper.updateByPrimaryKey(employeeList.get(0));//更新数据库的信息
            return Msg.success().add("token",token);
        }else{
            //登录失败，放回失败信息
            return Msg.fail("帐号或密码不正确！");
        }
    }
    /**
     * 注册账号
     *
     * @param employeeDTO 需要包含用户账户account ，用户密码password，用户名username
     * @return 消息类
     * @author 林贤钦
     */
    @Override
    public Msg registerEmployee(EmployeeDTO employeeDTO)  {
        Msg msg = findEmployeeByAccount(employeeDTO.getEmpAccount());//查询账户是否存在
        if (msg.getCode() == 400) {
            return Msg.fail("账号已存在");
        } else {
                Employee employee = new Employee();
                BeanUtilEx.copyProperties(employee,employeeDTO);//将DTO转换成POJO
                employee.setEmpPassword(MD5Util.string2MD5(employeeDTO.getEmpPassword()));//md5加密密码
                employee.setGenTime(new Date(System.currentTimeMillis()));//创建账户时间
                employee.setValid(1);//将 employee表中的valid状态改为1
                System.out.println(employee);
                employeeMapper.insertSelective(employee);//将账户存入数据库中
            return Msg.success();
        }
    }

    /**
     * 查找账号
     * @param account 用户名
     * @return 消息类
     * @author 林贤钦
     * @return Msg
     */
    @Override
    public Msg findEmployeeByAccount(String account) {
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEmpAccountEqualTo(account);
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if (employeeList.size() == 0) {
            //数据库中没有该账号
            return Msg.fail("账号不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("employeeList", employeeList);
        }
    }

    /**
     *  删除账户，将employee表中的valid状态改为1
     * @param empId
     * @return 消息类
     * @author 林贤钦
     */
    @Override
    public Msg deleteEmployee(Integer empId) {
        Employee employee = new Employee();
        employee.setEmpId(empId);
        employee.setValid(0);//valid状态改为1表示停用
        employeeMapper.updateByPrimaryKeySelective(employee);
        return Msg.success();
    }

    /**
     * 获取员工的学生信息
     *
     * @param employeeDTO
     * @return 消息类
     * @author 林贤钦
     */
    @Override
    public Msg getEmployee(EmployeeDTO employeeDTO)  {
        if (employeeDTO.getEmpId() == null ||employeeDTO.getEmpId() <= 0){
            return Msg.fail("员工id非法");
        }
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEmpIdEqualTo(employeeDTO.getEmpId());
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if (employeeList.size() > 0) {
            EmployeeDTO result = new EmployeeDTO();
            BeanUtilEx.copyProperties(employeeDTO,employeeList.get(0));
            return Msg.success().add("result", result);
        }
        return Msg.fail("找不到该员工信息");
    }
    /**
     * 更新员工的学生信息
     *
     * @param employeeDTO
     * @return 消息类
     * @author 林贤钦
     */
    @Override
    public Msg updateEmployee(EmployeeDTO employeeDTO) {
        if (employeeDTO.getEmpId() == null ||employeeDTO.getEmpId() <= 0){
            return Msg.fail("员工id非法");
        }
        try{
            Employee employee = new Employee();
            BeanUtilEx.copyProperties(employee,employeeDTO);
            employeeMapper.updateByPrimaryKeySelective(employee);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }


}
