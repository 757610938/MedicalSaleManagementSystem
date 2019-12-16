package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;


public class OutstockServiceImplTest {


    @Test
    public void addOutstock() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取业务层对象
        OutstockServiceImpl outstockService = ac.getBean("outstockServiceImpl", OutstockServiceImpl.class);
        OutstockApplyRecord outstockApply=new OutstockApplyRecord();
        outstockApply.setOutstockAmount(100);
        outstockApply.setMedicineId(1000002);
        outstockApply.setUserNumber(04171225);
        outstockApply.setOutstockApplyRemark("请按时...");
        outstockApply.setOutstockApplyCategory("销售出库");
        outstockService.addOutstock(outstockApply);
    }

    @Test
    public void findAllOutstock(){
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取业务层对象
        OutstockServiceImpl outstockService = ac.getBean("outstockServiceImpl", OutstockServiceImpl.class);
        List<OutstockApplyRecord> outstockApplyRecordList =outstockService.findAllOutstockApply();
        System.out.println(outstockApplyRecordList);
    }
}
