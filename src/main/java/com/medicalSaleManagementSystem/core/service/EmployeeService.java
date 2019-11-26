package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.util.Msg;

/**
 * 员工信息业务
 *
 * @author 林贤钦
 * @version 1.0
 * @since 0.1.0
 */
public interface EmployeeService {

    /**
     * 用户登录，数据使用md5加密，如果登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
     * @return 消息类
     * @author 林贤钦
     */
    Msg login(EmployeeDTO employeeDTO);

    /**
     * 创建账号
     * @param employeeDTO
     * @return 消息类
     * @author 林贤钦
     */
    Msg registerEmployee(EmployeeDTO employeeDTO) ;

    /**
     * 查找数据库是否存在账号
     * @param account
     * @return 用户类
     * @author 林贤钦
     */
    Msg findEmployeeByAccount(String account);

    /**
     *  删除账户，将employee表中的valid状态改为1
     * @param empId
     * @return 消息类
     * @author 林贤钦
     */
    Msg deleteEmployee(Integer empId);

    /**
     * 获取员工的学生信息
     *
     * @param employeeDTO
     * @return 消息类
     * @author 林贤钦
     */
    Msg getEmployee(EmployeeDTO employeeDTO) ;

    /**
     * 更新员工的学生信息
     *
     * @param employeeDTO
     * @return 消息类
     * @author 林贤钦
     */
    Msg updateEmployee(EmployeeDTO employeeDTO);

}
