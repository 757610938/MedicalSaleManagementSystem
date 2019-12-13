package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.util.message.Msg;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerServiceImplTest {

    @Test
    public void findCustomerByName() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取业务层对象
        CustomerServiceImpl customerService = ac.getBean("customerService", CustomerServiceImpl.class);
        //3.执行方法
        int i = customerService.deleteByPrimaryKey(5);
        System.out.println("test...i--->"+i);
    }

    @Test
    public void findCustomerById() {
    }

    @Test
    public void registerCustomer() {
    }

    @Test
    public void deleteCustomerById() {
    }

    @Test
    public void updateCustomer() {
    }

}