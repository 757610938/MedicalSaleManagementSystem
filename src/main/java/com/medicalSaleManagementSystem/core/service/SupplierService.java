package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.bean.DTO.Msg;
import com.medicalSaleManagementSystem.core.bean.DTO.SupplierDTO;


public interface SupplierService {
    /**
     * 查找数据库是否存在该供应商名字
     * @param name
     * @return 用户类
     * @author 林贤钦
     */
    Msg findSupplierByName(String name);

    /**
     * 通过供应商id查找客户信息
     * @param id
     * @return 用户类
     * @author 林贤钦
     */
    Msg findSupplierById(Integer id);
    /**
     * 注册供应商信息
     * @param supplierDTO
     * @return 用户类
     * @author 林贤钦
     */
    Msg registerSupplier(SupplierDTO supplierDTO);
    /**
     * 通过供应商id删除客户信息
     * @param id
     * @return 用户类
     * @author 林贤钦
     */
    Msg deleteSupplierById(Integer id);
    /**
     * 更新供应商信息
     * @param supplierDTO
     * @return 用户类
     * @author 林贤钦
     */
    Msg updateSupplier(SupplierDTO supplierDTO);
}
