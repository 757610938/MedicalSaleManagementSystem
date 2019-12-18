package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.SaleMapper;
import com.medicalSaleManagementSystem.core.model.BO.SaleBO;
import com.medicalSaleManagementSystem.core.model.BO.SaleDtlBO;
import com.medicalSaleManagementSystem.core.model.entity.Sale;
import com.medicalSaleManagementSystem.core.model.entity.SaleExample;
import com.medicalSaleManagementSystem.core.service.SaleDtlService;
import com.medicalSaleManagementSystem.core.service.SaleService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/18
 */
@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleMapper saleMapper;
    @Autowired
    private SaleDtlService saleDtlService;
    /*
     * 功能描述: <br>
     * 〈创建销售单〉<不包含销售项>〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:45
     */
    @Override
    public String insertSelective(Sale record) {
        try {
            if("".equals(record.getUserNumber())||record.getUserNumber()==null){
                return "400";
            }
            String SaleOrderId= OrderCodeFactory.getSaleCode(TypeCastHelper.toLong(70000));
            record.setSaleOrderId(SaleOrderId);
            if ("".equals(record.getSaleStatus())||record.getSaleStatus()==null){
                record.setSaleStatus("保存");//如果为空，则设置默认状态
            }
            int i=saleMapper.insertSelective(record);
            if (i==0){
                return  "400";
            }
            return SaleOrderId;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "500";
    }
    /*
     * 功能描述: <br>
     * 〈〉计算销售单单总金额
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/17 21:02
     */
    private Double calculatedAmount(SaleBO record){
        Double SaleTotalMoney=0.0;
        for (SaleDtlBO saleDtlBO : record.getSaleDtlList()) {
            //累加金额
            SaleTotalMoney= SaleTotalMoney+saleDtlBO.getSaleDtlPrice()*saleDtlBO.getSaleDtlPrice();
        }
        return SaleTotalMoney;
    }
    /*
     * 功能描述: <br>
     * 〈〈创建销售单〉<包含销售项>〉
     * @Param:  SaleBO record
     * @Return:  int
     * @Author: 林贤钦
     * @Date: 2019/12/16 9:41
     */
    @Override
    public String makeSaleOrder(SaleBO record) {
        try {
            Sale sale = new Sale();
            BeanUtilEx.copyProperties(sale,record);
            String result = insertSelective(sale); //1.创建销售单。
            if (result==null||"".equals(result)||result=="400"||result=="500"){
                return  result;//销售单单存入错误
            }
            record.setSaleTotalMoney(calculatedAmount(record));//2.计算销售金额
            //遍历record.getSaleDtlList();
            for (SaleDtlBO saleDtlBO :record.getSaleDtlList() ) {
                //3. 每一项设置销售单编号
                saleDtlBO.setSaleOrderId(result);
                //4. 添加销售项
                int i = saleDtlService.insertSelective(saleDtlBO);
                if (i==0){
                    return "400";
                }
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "500";
    }
    /*
     * 功能描述: <br>
     * 〈 删除销售单〉<包含销售项>〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 22:48
     */
    @Override
    public int deleteBySaleOrderId(String saleOrderId) {
        try {
            SaleBO saleBO = selectSaleBySaleOrderId(saleOrderId);
            if (saleBO==null){
                return 0;
            }
            for (SaleDtlBO saleDtlBO : saleBO.getSaleDtlList()) {
                //调用方法删除每一项
                saleDtlService.deleteByPrimaryKey(saleDtlBO.getSaleDtlId());
            }
            //再删除销售单
            return deleteByPrimaryKey(saleBO.getSaleId());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
    /*
     * 功能描述: <br>
     * 〈删除销售单〉<不包含销售项>
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 20:47
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            return saleMapper.deleteByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public SaleBO selectSaleAndDtlBySaleOrderId(String saleOrderId) {
        try {
            SaleBO saleBO = saleMapper.selectSaleAndDtlBySaleOrderId(saleOrderId);
            if (saleBO==null){
                return selectSaleBySaleOrderId(saleOrderId);
            }
            return saleBO;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public SaleBO selectSaleBySaleOrderId(String saleOrderId) {
        try{
            return saleMapper.selectSaleBySaleOrderId(saleOrderId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(SaleBO record) {
        try{
            if (record.getSaleId() == null ||record.getSaleId() <= 0){
                return 0;
            }
            Sale sale = new Sale();
            BeanUtilEx.copyProperties(sale,record);
            return saleMapper.updateByPrimaryKeySelective(sale);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public String updateSaleAndDtl(SaleBO record) {
        try {
            if ("".equals(record.getSaleId())||record.getSaleId()==null){
                return "400";//编号不存在
            }
            record.setSaleTotalMoney(calculatedAmount(record));//计算采购金额
            SaleExample saleExample = new SaleExample();
            SaleExample.Criteria criteria = saleExample.createCriteria();
            Sale sale = new Sale();
            BeanUtilEx.copyProperties(sale,record);
            int i = saleMapper.updateByPrimaryKey(sale);//更新数据库的采购单
            if ( i == 0){
                return "400";
            }
            for (SaleDtlBO saleDtlBO : record.getSaleDtlList()) {
                //遍历更新数据库的采购项
                i=saleDtlService.updateByPrimaryKeySelective(saleDtlBO);
                if ( i == 0){
                    return "400";
                }
            }
            return "200";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "500";
    }

    @Override
    public String updateOrderBySaleOrderIdAndSaleStatus(String saleOrderId, String SaleStatus) {
        return null;
    }

    @Override
    public List<Sale> getAllSale() {
        return null;
    }

    @Override
    public List<Sale> vagueSelectSaleBySaleOrderId(String keyword) {
        return null;
    }

    @Override
    public List<Sale> getAllSaleAndDtl() {
        return null;
    }

    @Override
    public List<SaleBO> getAllSaleKeyword(String Keyword) {
        return null;
    }

    @Override
    public List<SaleBO> getAllSaleBySaleStatusAndKeyword(String SaleStatus, String Keyword) {
        return null;
    }

    @Override
    public List<Integer> getAllSaleOrderId() {
        return null;
    }
}
