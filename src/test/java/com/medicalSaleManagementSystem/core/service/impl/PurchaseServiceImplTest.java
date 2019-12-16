package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDTO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDtlDTO;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseDtl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
public class PurchaseServiceImplTest {

    @Test
    public void getAllPurOrderId() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取业务层对象
        PurchaseServiceImpl purchaseService = ac.getBean("purchaseServiceImpl", PurchaseServiceImpl.class);

        PurchaseDTO purchaseDTO =  new PurchaseDTO();
        purchaseDTO.setPurName("测试");
        purchaseDTO.setSupplierId(200000);
        purchaseDTO.setUserNumber("04171213");
        purchaseDTO.setPurTotalMoney(4564654.0);

        PurchaseDtlDTO purchaseDtlDTO = new PurchaseDtlDTO();
        purchaseDtlDTO.setMedicineId(1000001);
        purchaseDtlDTO.setMedicineName("龟龙中风丸");

        List<PurchaseDtlDTO> list = new ArrayList<>();
        list.add(purchaseDtlDTO);
        purchaseDTO.setPutDtlList(list);
        System.out.println(purchaseDTO);
        String s = purchaseService.makePurchaseOrder(purchaseDTO);
        System.out.println(s);

    }
}