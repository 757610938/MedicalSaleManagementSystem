package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.BO.PurchaseBO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDTO;
import com.medicalSaleManagementSystem.core.model.entity.Purchase;

import java.util.List;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: PurchaseService.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
public interface PurchaseService {

    /*
     * 功能描述: <br>
     * 〈创建采购单〉<不包含采购项>
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:45
     */
    String insertSelective(PurchaseDTO record);
    /*
     * 功能描述: <br>
     * 〈〈创建采购单〉<包含采购项>〉
     * @Param:  PurchaseDTO record
     * @Return:  int
     * @Author: 林贤钦
     * @Date: 2019/12/16 9:41
     */
    String makePurchaseOrder(PurchaseDTO record);
    /*
     * 功能描述: <br>
     * 〈删除采购单〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:47
     */
    int deleteByPrimaryKey(Integer id);
    /*
     * 功能描述: <br>
     * 〈〉删除采购单
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 22:48
     */
    int deleteByPurOrderId(String purOrderId);

    /*
     * 功能描述: <br>
     * 〈通过purOrderId查找采购单信息，包含采购项〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:43
     */
    PurchaseBO selectPurAndDtlByPurOrderId(String purOrderId);
    /*
     * 功能描述: <br>
     * 〈通过purOrderId查找采购单信息，不包含采购项〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/16 23:07
     */
    PurchaseBO selectPurByPurOrderId(String purOrderId);
    /**

     *@描述  更新订单状态

     *@参数  PurchaseDTO record，,String purStatus

     *@返回值  String

     *@创建人  林贤钦

     *@创建时间  2019/12/16

     *@修改人和其它信息

     */
    String updateOrderByPurOrderIdAndPurStatus(String purOrderId,String purStatus);
    /*
     * 功能描述: <br>
     * 〈更新采购单〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:46
     */
    int updateByPrimaryKeySelective(PurchaseDTO record);
    /*
     * 功能描述: <br>
     * 〈查询所有采购单信息〉
     * @Param:
     * @Return: List<Purchase>
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:51
     */
    List<Purchase>  getAll();
    /*
     * 功能描述: <br>
     * 〈通过编号模糊查询数据库〉
     * @Param: keyword
     * @Return:  List<Purchase>
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:53
     */
    List<Purchase>  vagueSelectByPrimaryName(String keyword);
    /*
     * 功能描述: <br>
     * 〈〉获取采购单所有id
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 22:23
     */
    List<Integer> getAllPurOrderId();
    /*
     * 功能描述: <br>
     * 〈〉查询特定员工编号的采购单
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 12:04
     */
    List<PurchaseBO>  getAllByUserNumber(String userNumber);
}
