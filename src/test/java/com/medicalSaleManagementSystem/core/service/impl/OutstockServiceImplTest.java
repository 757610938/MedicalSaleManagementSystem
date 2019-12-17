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
        outstockApply.setMedicineId(1000003);
        outstockApply.setUserNumber(2323);
        outstockApply.setOutstockApplyRemark("ssasfas...");
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
