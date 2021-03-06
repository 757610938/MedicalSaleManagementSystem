package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.PurchaseDtlMapper;
import com.medicalSaleManagementSystem.core.dao.PurchaseDtlStatusMapper;
import com.medicalSaleManagementSystem.core.model.BO.PurchaseDtlBO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDtlDTO;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseDtl;
import com.medicalSaleManagementSystem.core.service.MedicineService;
import com.medicalSaleManagementSystem.core.service.PurchaseDtlService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * FileName: PurchaseDtlServiceImpl.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
@Service
public class PurchaseDtlServiceImpl implements PurchaseDtlService {
    @Autowired
    private PurchaseDtlMapper purchaseDtlMapper;

    @Override
    public int insertSelective(PurchaseDtlBO record) {
        try {
            if ("".equals(record.getPurOrderId())||record.getPurOrderId()==null){
                return 0;//如果采购单的编号为空，返回0
            }
            PurchaseDtl purchaseDtl = new PurchaseDtl();
            BeanUtilEx.copyProperties(purchaseDtl,record);
            //生成采购项编号
            String PurDtlOrderId = OrderCodeFactory.getSaleDtlCode(TypeCastHelper.toLong(60000));
            purchaseDtl.setPurDtlOrderId(PurDtlOrderId);
            return purchaseDtlMapper.insertSelective(purchaseDtl);//生成采购项
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            int i = purchaseDtlMapper.deleteByPrimaryKey(id);
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseDtlBO record) {
        if (record.getPurDtlId()== null || record.getPurDtlId() <= 0){
            return 0;
        }
        try{
            PurchaseDtl purchaseDtl = new PurchaseDtl();
            BeanUtilEx.copyProperties(purchaseDtl,record);
            return purchaseDtlMapper.updateByPrimaryKeySelective(purchaseDtl);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public PurchaseDtl selectByPrimaryKey(Integer id) {
        try{
            return purchaseDtlMapper.selectByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
