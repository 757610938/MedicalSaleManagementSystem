package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.SaleDtlMapper;
import com.medicalSaleManagementSystem.core.model.BO.SaleDtlBO;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseDtl;
import com.medicalSaleManagementSystem.core.model.entity.SaleDtl;
import com.medicalSaleManagementSystem.core.service.SaleDtlService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/18
 */
@Service
public class SaleDtlServiceImpl implements SaleDtlService {
    @Autowired
    private SaleDtlMapper saleDtlMapper;

    @Override
    public int insertSelective(SaleDtlBO record) {
        try {
            if ("".equals(record.getSaleOrderId())||record.getSaleOrderId()==null){
                return 0;//如果采购单的编号为空，返回0
            }
            SaleDtl saleDtl = new SaleDtl();
            BeanUtilEx.copyProperties(saleDtl,record);
            //生成采购项编号
            String saleDtlOrderId = OrderCodeFactory.getPurchaseDtlCode(TypeCastHelper.toLong(80000));
            saleDtl.setSaleDtlOrderId(saleDtlOrderId);
            return saleDtlMapper.insertSelective(saleDtl);//生成销售项
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            int i = saleDtlMapper.deleteByPrimaryKey(id);
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SaleDtlBO record) {
        if (record.getSaleDtlId()== null || record.getSaleDtlId() <= 0){
            return 0;
        }
        try{
            SaleDtl saleDtl = new SaleDtl();
            BeanUtilEx.copyProperties(saleDtl,record);
            return saleDtlMapper.updateByPrimaryKeySelective(saleDtl);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public SaleDtl selectByPrimaryKey(Integer id) {
        try{
            return saleDtlMapper.selectByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
