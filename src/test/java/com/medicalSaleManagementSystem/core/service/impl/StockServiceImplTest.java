package com.medicalSaleManagementSystem.core.service.impl;


import com.medicalSaleManagementSystem.core.model.entity.Stock;
import com.medicalSaleManagementSystem.util.message.Msg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.*;
import java.util.Map;

import static org.junit.Assert.*;

public class StockServiceImplTest {




    @Test
    public void selectAll() {
       //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
       //2.获取业务层对象
       StockServiceImpl stockService = ac.getBean("stockServiceImpl", StockServiceImpl.class);
        Map<String, Object> stringObjectMap5 = stockService.selectAll(52002, 1, 5);
        System.out.println("23123131312");
        Map<String, Object> stringObjectMap = stockService.selectByMedicineID(1000002, 52002, 1,2);
        System.out.println("1111111111111111111111");
        Map<String, Object> stringObjectMap2 = stockService.selectByMedicineCategory("药", 52002, 1,2);
        System.out.println("2222222222222");
        Map<String, Object> stringObjectMap3 = stockService.selectByMedicineName("龟", 52002, 1,2);

    }

    @Test
    public void testSelectAll() {
    }

    @Test
    public void selectByMedicineID() {
    }

    @Test
    public void testSelectByMedicineID() {
    }

    @Test
    public void selectByMedicineName() {
    }

    @Test
    public void testSelectByMedicineName() {
    }

    @Test
    public void selectByMedicineCategory() {
    }

    @Test
    public void testSelectByMedicineCategory() {
    }

    @Test
    public void addStock() {
    }

    @Test
    public void updateStock() {
    }

    @Test
    public void storageIncrease() {
    }

    @Test
    public void storageDecrease() {
    }

    @Test
    public void deleteStock() {
    }

    @Test
    public void importStorage() {
    }

    @Test
    public void exportStorage() {
    }
}
