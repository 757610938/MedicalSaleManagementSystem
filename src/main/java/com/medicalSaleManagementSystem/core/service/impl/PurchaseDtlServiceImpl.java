package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.PurchaseDtlMapper;
import com.medicalSaleManagementSystem.core.dao.PurchaseDtlStatusMapper;
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
    public int insertSelective(PurchaseDtlDTO record) {
        try {
            PurchaseDtl purchaseDtl = new PurchaseDtl();
            BeanUtilEx.copyProperties(purchaseDtl,record);
            purchaseDtl.setPurDtlOrderId(OrderCodeFactory.getPurchaseDtlCode(TypeCastHelper.toLong(80000)));
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
    public int updateByPrimaryKeySelective(PurchaseDtlDTO record) {
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
