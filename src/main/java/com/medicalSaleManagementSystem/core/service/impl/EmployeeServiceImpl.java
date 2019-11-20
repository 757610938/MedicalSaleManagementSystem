package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.core.bean.DTO.Msg;
import com.medicalSaleManagementSystem.core.bean.POJO.Employee;
import com.medicalSaleManagementSystem.core.bean.POJO.EmployeeExample;
import com.medicalSaleManagementSystem.core.dao.EmployeeMapper;
import com.medicalSaleManagementSystem.core.service.EmployeeService;
import com.medicalSaleManagementSystem.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 用户登录，数据使用md5加密，如果登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
     * 修改：登录时间 登录IP的获取--byChoKhoOu
     * @param employeeDTO 需要包含用户账户account，密码password、登录时间LoginTime、登录LoginIp
     * @return 消息类
     * @author 林贤钦
     */
    @Override
    public Msg login(EmployeeDTO employeeDTO) {
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEmpAccountEqualTo(employeeDTO.getEmpAccount());
        criteria.andEmpPasswordEqualTo(MD5Util.string2MD5(employeeDTO.getEmpPassword()));
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if(employeeList.size()>=1){
            if(employeeList.get(0).getValid()==0){
                return Msg.fail("帐号已经禁止登录！");
            }
            //登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
            employeeList.get(0).setLastLoginTime(employeeList.get(0).getLoginTime());//将登录时间移动到上次登录时间
            employeeList.get(0).setLoginTime(new Date(System.currentTimeMillis()));//记录本次登录时间
            employeeList.get(0).setLoginIp(employeeDTO.getLoginIp());//记录登录ip
            int i = employeeMapper.updateByPrimaryKey(employeeList.get(0));//更新数据库的信息
            return Msg.success();
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
    public Msg registerEmployee(EmployeeDTO employeeDTO) {
        Msg msg = findEmployeeByAccount(employeeDTO.getEmpAccount());//查询账户是否存在
        if (msg.getCode() == 100) {
            return Msg.fail("账号已存在");
        } else {
            Employee employee =employeeDtoToPojo(employeeDTO);//将DTO转换成POJO
            employee.setEmpPassword(MD5Util.string2MD5(employeeDTO.getEmpPassword()));//md5加密密码
            employee.setGenTime(new Date(System.currentTimeMillis()));//创建账户时间
            employee.setValid(1);//将 employee表中的valid状态改为1
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
    public Msg getEmployee(EmployeeDTO employeeDTO) {
        if (employeeDTO.getEmpId() == null ||employeeDTO.getEmpId() <= 0){
            return Msg.fail("员工id非法");
        }
        EmployeeExample employeeExample = new EmployeeExample();
        EmployeeExample.Criteria criteria = employeeExample.createCriteria();
        criteria.andEmpIdEqualTo(employeeDTO.getEmpId());
        List<Employee> employeeList = employeeMapper.selectByExample(employeeExample);
        if (employeeList.size() > 0) {
            EmployeeDTO result = employeePojoToDto(employeeList.get(0));
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
        Employee employee = employeeDtoToPojo(employeeDTO);
        try{
            employeeMapper.updateByPrimaryKeySelective(employee);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }

    /**
     * DTO转换成POJO
     *
     * @param employeeDTO
     * @return 用户类
     * @author 林贤钦
     */
    private Employee employeeDtoToPojo(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        if(employeeDTO.getEmpId()!=null&&!"".equals(employeeDTO.getEmpId())){
            employee.setEmpId(employeeDTO.getEmpId());
        }
        if(employeeDTO.getEmpAccount()!=null&&!"".equals(employeeDTO.getEmpAccount())){
            employee.setEmpAccount(employeeDTO.getEmpAccount());
        }
        if(employeeDTO.getEmpPassword()!=null&&!"".equals(employeeDTO.getEmpPassword())){
            employee.setEmpPassword(employeeDTO.getEmpPassword());
        }
        if(employeeDTO.getEmpName()!=null&&!"".equals(employeeDTO.getEmpName())){
            employee.setEmpName(employeeDTO.getEmpName());
        }
        if(employeeDTO.getEmpSex()!=null&&!"".equals(employeeDTO.getEmpSex())){
            employee.setEmpSex(employeeDTO.getEmpSex());
        }
        if(employeeDTO.getEmpBirthday()!=null&&!"".equals(employeeDTO.getEmpBirthday())){
            employee.setEmpBirthday(employeeDTO.getEmpBirthday());
        }
        if(employeeDTO.getEmpIdCard()!=null&&!"".equals(employeeDTO.getEmpIdCard())){
            employee.setEmpIdCard(employeeDTO.getEmpIdCard());
        }
        if(employeeDTO.getEmpPhone()!=null&&!"".equals(employeeDTO.getEmpPhone())){
            employee.setEmpPhone(employeeDTO.getEmpPhone());
        }
        if(employeeDTO.getEmpEmail()!=null&&!"".equals(employeeDTO.getEmpEmail())){
            employee.setEmpEmail(employeeDTO.getEmpEmail());
        }
        if(employeeDTO.getEmpDeptId()!=null&&!"".equals(employeeDTO.getEmpDeptId())){
            employee.setEmpDeptId(employeeDTO.getEmpDeptId());
        }
        if(employeeDTO.getEmpPosition()!=null&&!"".equals(employeeDTO.getEmpPosition())){
            employee.setEmpPosition(employeeDTO.getEmpPosition());
        }
        if(employeeDTO.getEmpWages()!=null&&!"".equals(employeeDTO.getEmpWages())){
            employee.setEmpWages(employeeDTO.getEmpWages());
        }
        if(employeeDTO.getGenTime()!=null&&!"".equals(employeeDTO.getGenTime())){
            employee.setGenTime(employeeDTO.getGenTime());
        }
        if(employeeDTO.getLastLoginTime()!=null&&!"".equals(employeeDTO.getLastLoginTime())){
            employee.setLastLoginTime(employeeDTO.getLastLoginTime());
        }
        if(employeeDTO.getLoginIp()!=null&&!"".equals(employeeDTO.getLoginIp())){
            employee.setLoginIp(employeeDTO.getLoginIp());
        }
        if(employeeDTO.getLoginTime()!=null&&!"".equals(employeeDTO.getLoginTime())){
            employee.setLoginTime(employeeDTO.getLoginTime());
        }
        if(employeeDTO.getValid()!=null&&!"".equals(employeeDTO.getValid())){
            employee.setValid(employeeDTO.getValid());
        }
        return employee;
    }
    /**
     * POJO转换成DTO
     *
     * @param employee
     * @return employeeDTO
     * @author 林贤钦
     */
    private EmployeeDTO employeePojoToDto(Employee employee){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        if(employee.getEmpId()!=null&&!"".equals(employee.getEmpId())){
            employeeDTO.setEmpId(employee.getEmpId());
        }
        if(employee.getEmpAccount()!=null&&!"".equals(employee.getEmpAccount())){
            employeeDTO.setEmpAccount(employee.getEmpAccount());
        }
        if(employee.getEmpPassword()!=null&&!"".equals(employee.getEmpPassword())){
            employeeDTO.setEmpPassword(employee.getEmpPassword());
        }
        if(employee.getEmpName()!=null&&!"".equals(employee.getEmpName())){
            employeeDTO.setEmpName(employee.getEmpName());
        }
        if(employee.getEmpSex()!=null&&!"".equals(employee.getEmpSex())){
            employeeDTO.setEmpSex(employee.getEmpSex());
        }
        if(employee.getEmpBirthday()!=null&&!"".equals(employee.getEmpBirthday())){
            employeeDTO.setEmpBirthday(employee.getEmpBirthday());
        }
        if(employee.getEmpIdCard()!=null&&!"".equals(employee.getEmpIdCard())){
            employeeDTO.setEmpIdCard(employee.getEmpIdCard());
        }
        if(employee.getEmpPhone()!=null&&!"".equals(employee.getEmpPhone())){
            employeeDTO.setEmpPhone(employee.getEmpPhone());
        }
        if(employee.getEmpEmail()!=null&&!"".equals(employee.getEmpEmail())){
            employeeDTO.setEmpEmail(employee.getEmpEmail());
        }
        if(employee.getEmpDeptId()!=null&&!"".equals(employee.getEmpDeptId())){
            employeeDTO.setEmpDeptId(employee.getEmpDeptId());
        }
        if(employee.getEmpPosition()!=null&&!"".equals(employee.getEmpPosition())){
            employeeDTO.setEmpPosition(employee.getEmpPosition());
        }
        if(employee.getEmpWages()!=null&&!"".equals(employee.getEmpWages())){
            employeeDTO.setEmpWages(employee.getEmpWages());
        }
        if(employee.getGenTime()!=null&&!"".equals(employee.getGenTime())){
            employeeDTO.setGenTime(employee.getGenTime());
        }
        if(employee.getLastLoginTime()!=null&&!"".equals(employee.getLastLoginTime())){
            employeeDTO.setLastLoginTime(employee.getLastLoginTime());
        }
        if(employee.getLoginIp()!=null&&!"".equals(employee.getLoginIp())){
            employeeDTO.setLoginIp(employee.getLoginIp());
        }
        if(employee.getLoginTime()!=null&&!"".equals(employee.getLoginTime())){
            employeeDTO.setLoginTime(employee.getLoginTime());
        }
        if(employee.getValid()!=null&&!"".equals(employee.getValid())){
            employeeDTO.setValid(employee.getValid());
        }
        return employeeDTO;
    }
}
