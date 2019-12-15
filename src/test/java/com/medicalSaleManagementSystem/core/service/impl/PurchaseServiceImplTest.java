package com.medicalSaleManagementSystem.core.service.impl;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        List<Integer> list = purchaseService.getAllPurOrderId();
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}