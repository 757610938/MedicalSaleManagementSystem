package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.SupplierDTO;
import com.medicalSaleManagementSystem.core.model.entity.Supplier;

import java.util.List;


public interface SupplierService {

    /**
     * 通过供应商id查找客户信息
     * @param id
     * @return 用户类
     * @author 林贤钦
     */
    Supplier selectByPrimaryKey(Integer id);
    /**
     * 注册供应商信息
     * @param record
     * @return 用户类
     * @author 林贤钦
     */
    int insertSelective(SupplierDTO record);
    /**
     * 通过供应商id删除客户信息
     * @param id
     * @return 用户类
     * @author 林贤钦
     */
    int deleteByPrimaryKey(Integer id);
    /**
     * 更新供应商信息
     * @param record
     * @return 用户类
     * @author 林贤钦
     */
    int updateByPrimaryKeySelective(SupplierDTO record);
    /*
     * 功能描述: <br>
     * 〈〉
     * @Param:
     * @Return: List<Supplier>
     * @Author: 林贤钦
     * @Date: 2019/12/12 21:35
     */
    List<Supplier> getAll();
    /*
     * 功能描述: <br>
     * 〈〉通过模糊查询名字获取供应商信息
     * @Param:
     * @Return: List<Supplier>
     * @Author: 林贤钦
     * @Date: 2019/12/12 21:35
     */
    List<Supplier> vagueSelectByPrimaryName(String name);
    /*
     * 功能描述: <br>
     * 〈〉模糊查询id获取供应商信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/17 15:37
     */
    List<Supplier> vagueSelectByPrimaryKey(Integer primaryKey);
}
