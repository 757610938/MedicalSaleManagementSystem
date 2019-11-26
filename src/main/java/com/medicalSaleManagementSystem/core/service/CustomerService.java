package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.bean.DTO.CustomerDTO;
import com.medicalSaleManagementSystem.util.Msg;

public interface CustomerService {
    /**
     * 查找数据库是否存在该客户名字
     * @param name
     * @return Msg
     * @author 林贤钦
     */
    Msg findCustomerByName(String name);

    /**
     * 通过客户id查找客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    Msg findCustomerById(Integer id);
    /**
     * 注册客户信息
     * @param customerDTO
     * @return Msg
     * @author 林贤钦
     */
    Msg registerCustomer(CustomerDTO customerDTO);
    /**
     * 通过客户id删除客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    Msg deleteCustomerById(Integer id);
    /**
     * 更新客户信息
     * @param customerDTO
     * @return Msg
     * @author 林贤钦
     */
    Msg updateCustomer(CustomerDTO customerDTO);
}
