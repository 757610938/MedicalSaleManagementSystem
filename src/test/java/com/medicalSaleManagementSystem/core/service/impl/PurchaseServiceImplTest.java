package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.model.BO.PurchaseBO;
import com.medicalSaleManagementSystem.core.model.BO.PurchaseDtlBO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDTO;
import com.medicalSaleManagementSystem.core.model.DTO.PurchaseDtlDTO;
import com.medicalSaleManagementSystem.core.model.entity.Purchase;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseDtl;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
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
        List<PurchaseBO> all = purchaseService.getAllByPurStatusAndKeyword("未审核", "04171213");
        if (all.size()<=0){
            System.out.println("没有数据");
        }
        for (PurchaseBO purchaseBO : all) {
            System.out.println(purchaseBO);
        }

    }
}