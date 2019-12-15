package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.CustomerDTO;
import com.medicalSaleManagementSystem.core.model.entity.Customer;
import com.medicalSaleManagementSystem.core.model.entity.Medicine;
import com.medicalSaleManagementSystem.util.message.Msg;

import java.util.List;

public interface CustomerService {

    /**
     * 通过客户id查找客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    Customer selectByPrimaryKey(Integer id);
    /**
     * 注册客户信息
     * @param record
     * @return Msg
     * @author 林贤钦
     */
    int insertSelective(CustomerDTO record);
    /**
     * 通过客户id删除客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 更新客户信息
     * @param record
     * @return Msg
     * @author 林贤钦
     */
    int updateByPrimaryKeySelective(CustomerDTO record);

    /*
     * 功能描述: <br>
     * 〈〉查询所有客户信息
     * @Param:
     * @Return: List<Customer>
     * @Author: 林贤钦
     * @Date: 2019/12/12 21:08
     */
    List<Customer> getAll();
    /*
     * 功能描述: <br>
     * 〈〉通过名称模糊查询数据库
     * @Param:  keyword
     * @Return: List<Customer>
     * @Author: 林贤钦
     * @Date: 2019/12/12 21:09
     */
    List<Customer> vagueSelectByPrimaryName(String keyword);
}
