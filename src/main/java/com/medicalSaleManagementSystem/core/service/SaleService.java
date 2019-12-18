package com.medicalSaleManagementSystem.core.service;
import com.medicalSaleManagementSystem.core.model.BO.SaleBO;
import com.medicalSaleManagementSystem.core.model.entity.Sale;

import java.util.List;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/18
 */
public interface SaleService {
    /*
     * 功能描述: <br>
     * 〈创建销售单〉<不包含销售项>〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:45
     */
    String insertSelective(Sale record);
    /*
     * 功能描述: <br>
     * 〈〈创建销售单〉<包含销售项>〉
     * @Param:  SaleBO record
     * @Return:  int
     * @Author: 林贤钦
     * @Date: 2019/12/16 9:41
     */
    String makeSaleOrder(SaleBO record);

    /*
     * 功能描述: <br>
     * 〈 删除销售单〉<包含销售项>〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 22:48
     */
    int deleteBySaleOrderId(String saleOrderId);
    /*
     * 功能描述: <br>
     * 〈删除销售单〉<不包含销售项>
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:47
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 功能描述: <br>
     * 〈通过saleOrderId查找销售单〉<包含销售项>〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:43
     */
    SaleBO selectSaleAndDtlBySaleOrderId(String saleOrderId);

    /*
     * 功能描述: <br>
     * 〈通过saleOrderId查找销售单〉<不包含销售项>
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/16 23:07
     */
    SaleBO selectSaleBySaleOrderId(String saleOrderId);
    /*
     * 功能描述: <br>
     * 〈更新销售单〉<不包含销售项>
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:46
     */
    int updateByPrimaryKeySelective(SaleBO record);
    /*
     * 功能描述: <br>
     * 〈〉更新销售单〉<包含销售项>
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/17 20:57
     */
    String updateSaleAndDtl(SaleBO record);

    /*
     * 功能描述: <br>
     * 〈〉更改订单状态
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/18 10:45
     */
    String updateOrderBySaleOrderIdAndSaleStatus(String saleOrderId,String SaleStatus);

    /*
     * 功能描述: <br>
     * 〈查询所有销售单信息〉<不包含销售项>
     * @Param:
     * @Return: List<Sale>
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:51
     */
    List<Sale> getAllSale();

    /*
     * 功能描述: <br>
     * 〈通过编号模糊查询数据库〉销售单信息〉<不包含销售项>
     * @Param: keyword
     * @Return:  List<Purchase>
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:53
     */
    List<Sale>  vagueSelectSaleBySaleOrderId(String keyword);

    /*
     * 功能描述: <br>
     * 〈查询所有销售单信息〉<包含销售项>
     * @Param:
     * @Return: List<Sale>
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:51
     */
    List<Sale> getAllSaleAndDtl();

    /*
     * 功能描述: <br>
     * 〈〉全局模糊查询员工账号，销售状态等获取采销售单列表
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/18 2:08
     */
    List<SaleBO> getAllSaleKeyword(String Keyword);
    /*
     * 功能描述: <br>
     * 〈〉在特定销售单的状态下 模糊查询员工账号，销售状态等获取采销售单列表
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/18 2:08
     */
    List<SaleBO> getAllSaleBySaleStatusAndKeyword(String SaleStatus,String Keyword);

    /*
     * 功能描述: <br>
     * 〈〉获取销售单所有id
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 22:23
     */
    List<Integer> getAllSaleOrderId();
}
