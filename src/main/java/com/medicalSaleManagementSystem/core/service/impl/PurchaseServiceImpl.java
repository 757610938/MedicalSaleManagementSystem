package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.PurchaseMapper;
import com.medicalSaleManagementSystem.core.model.BO.PurchaseBO;
import com.medicalSaleManagementSystem.core.model.BO.PurchaseDtlBO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDTO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDtlDTO;
import com.medicalSaleManagementSystem.core.model.entity.Purchase;
import com.medicalSaleManagementSystem.core.service.PurchaseDtlService;
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

    @Autowired
    private PurchaseDtlService purchaseDtlService;
    /*
     * 功能描述: <br>
     * 〈〉
     * @Param:
     * @Return: 
     * @Author: 林贤钦
     * @Date: 2019/12/15 13:43
     */
    @Override
    public String insertSelective(PurchaseDTO record) {
        try {
            if("".equals(record.getUserNumber())||record.getUserNumber()==null){
                return "400";
            }
            Purchase purchase = new Purchase();
            BeanUtilEx.copyProperties(purchase,record);
            purchase.setPurOrderId(OrderCodeFactory.getPurchaseCode(TypeCastHelper.toLong(70000)));//生成单号
            if ("".equals(purchase.getPurStatus())||purchase.getPurStatus()==null){
                purchase.setPurStatus("未审核");//设置默认状态
            }
            int i = purchaseMapper.insertSelective(purchase);
            if (i==0){
                return  "400";
            }
            return "200";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "500";
    }

    @Override
    public String makePurchaseOrder(PurchaseDTO record) {
        try {
            //1.创建采购单。
            String result = insertSelective(record);
            if (result==null||"".equals(result)||result=="400"||result=="500"){
                return  result;//采购单存入错误
            }
            //遍历record.getPutDtlList()
            for (PurchaseDtlDTO purchaseDtlDTO : record.getPutDtlList()) {
                //2. 添加采购项
                int i = purchaseDtlService.insertSelective(purchaseDtlDTO);
                if (i==0){
                    return "400";
                }
            }
            return "200";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "500";
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            return purchaseMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPurOrderId(String purOrderId) {
        try {
            PurchaseBO purchaseBO = selectByPurOrderId(purOrderId);//查询数据库是否存在该采购单
            if (purchaseBO==null){
                return 0;
            }
            for (PurchaseDtlBO purchaseDtlBO : purchaseBO.getPutDtlList()) {
                //调用方法删除每一项
                purchaseDtlService.deleteByPrimaryKey(purchaseDtlBO.getPurDtlId());
            }
            //再删除采购单
            return deleteByPrimaryKey(purchaseBO.getPurId());
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public PurchaseBO selectByPurOrderId(String purOrderId) {
        try{
            return purchaseMapper.selectByPurOrderId(purOrderId);
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
    public List<Purchase> getAll() {
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
        return purchaseMapper.getAllByUserNumber("%"+userNumber+"%");
    }

}
