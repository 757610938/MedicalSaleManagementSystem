package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.BO.PurchaseDtlBO;
import com.medicalSaleManagementSystem.core.model.BO.SaleDtlBO;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseDtl;
import com.medicalSaleManagementSystem.core.model.entity.SaleDtl;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/18
 */
public interface SaleDtlService {
    /*
     * 功能描述: <br>
     * 〈〉添加销售项
     * @Param: purchaseDtlDTO
     * @Return: int
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:12
     */
    int insertSelective( SaleDtlBO record);
    /*
     * 功能描述: <br>
     * 〈〉删除销售项
     * @Param: id
     * @Return: int
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:30
     */
    int deleteByPrimaryKey(Integer id);
    /*
     * 功能描述: <br>
     * 〈〉更新销售项
     * @Param:  record
     * @Return:   int
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:30
     */
    int updateByPrimaryKeySelective(SaleDtlBO record);
    /*
     * 功能描述: <br>
     * 〈〉查询采购项
     * @Param: id
     * @Return: PurchaseDtl
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:30
     */
    SaleDtl selectByPrimaryKey(Integer id);
}
