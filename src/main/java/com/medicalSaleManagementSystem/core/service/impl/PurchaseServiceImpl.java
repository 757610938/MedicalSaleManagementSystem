package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.PurchaseMapper;
import com.medicalSaleManagementSystem.core.model.BO.PurchaseBO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDTO;
import com.medicalSaleManagementSystem.core.model.entity.Purchase;
import com.medicalSaleManagementSystem.core.service.PurchaseService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
@Service
public class PurchaseServiceImpl implements PurchaseService {
    @Autowired
    private PurchaseMapper purchaseMapper;


    /*
     * 功能描述: <br>
     * 〈〉
     * @Param:
     * @Return: 
     * @Author: 林贤钦
     * @Date: 2019/12/15 13:43
     */
    @Override
    public int insertSelective(PurchaseDTO record) {
        try {
            Purchase purchase = new Purchase();
            BeanUtilEx.copyProperties(purchase,record);
            purchase.setPurOrderId(OrderCodeFactory.getPurchaseCode(TypeCastHelper.toLong(70000)));//生成单号
            if ("".equals(purchase.getPurStatus())||purchase.getPurStatus()==null){
                purchase.setPurStatus("制定中");//设置默认状态
            }
            return purchaseMapper.insertSelective(purchase);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            int i = purchaseMapper.deleteByPrimaryKey(id);
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public PurchaseBO selectBPurOrderId(String purOrderId) {
        try{
            return purchaseMapper.selectBPurOrderId(purOrderId);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(PurchaseDTO record) {
        if (record.getPurId() == null ||record.getPurId() <= 0){
            return 0;
        }
        try{
            Purchase purchase = new Purchase();
            BeanUtilEx.copyProperties(purchase,record);
            return purchaseMapper.updateByPrimaryKeySelective(purchase);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<PurchaseBO> getAll() {
        return purchaseMapper.getAll();
    }

    @Override
    public List<Purchase> vagueSelectByPrimaryName(String keyword) {
        return null;
    }

    @Override
    public List<Integer> getAllPurOrderId() {
        return purchaseMapper.getAllPurOrderId();
    }

    @Override
    public List<PurchaseBO> getAllByUserNumber(String userNumber) {
        return purchaseMapper.getAllByUserNumber(userNumber);
    }

}
