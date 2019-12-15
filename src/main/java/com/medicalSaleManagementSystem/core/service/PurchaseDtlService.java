package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDtlDTO;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseDtl;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: PurchaseDtlService
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
public interface PurchaseDtlService {
    /*
     * 功能描述: <br>
     * 〈〉添加采购项
     * @Param: purchaseDtlDTO
     * @Return: int
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:12
     */
    int insertSelective( PurchaseDtlDTO record);
    /*
     * 功能描述: <br>
     * 〈〉删除采购项
     * @Param: id
     * @Return: int
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:30
     */
    int deleteByPrimaryKey(Integer id);
    /*
     * 功能描述: <br>
     * 〈〉更新采购项
     * @Param:  record
     * @Return:   int
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:30
     */
    int updateByPrimaryKeySelective(PurchaseDtlDTO record);
    /*
     * 功能描述: <br>
     * 〈〉查询采购项
     * @Param: id
     * @Return: PurchaseDtl
     * @Author: 林贤钦
     * @Date: 2019/12/14 21:30
     */
    PurchaseDtl selectByPrimaryKey(Integer id);
}
