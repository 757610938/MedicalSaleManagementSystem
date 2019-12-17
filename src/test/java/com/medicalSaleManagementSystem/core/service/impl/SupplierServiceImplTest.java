package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.model.entity.Supplier;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class SupplierServiceImplTest {

    @Test
    public void findSupplierByName() {
    }

    @Test
    public void findSupplierById() {
    }

    @Test
    public void registerSupplier() {
    }

    @Test
    public void deleteSupplierById() {
    }

    @Test
    public void updateSupplier() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取业务层对象
        SupplierServiceImpl supplierService = ac.getBean("supplierServiceImpl", SupplierServiceImpl.class);

    }
}