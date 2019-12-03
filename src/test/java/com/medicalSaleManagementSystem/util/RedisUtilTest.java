package com.medicalSaleManagementSystem.util;

import com.medicalSaleManagementSystem.core.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

import java.io.Serializable;

import static org.junit.Assert.*;

public class RedisUtilTest {
    @Resource
    private RedisTemplate<Serializable, Object> redisTemplate;

    private RedisUtil redisUtil=new RedisUtil();
    @Test
    public void remove() {

    }

    @Test
    public void removePattern() {
    }

    @Test
    public void remove1() {
    }

    @Test
    public void exists() {
    }

    @Test
    public void get() {
    }

    @Test
    public void set() {


    }

    @Test
    public void set1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        long lo=1245;
        boolean b = redisUtil.set("1234", "1234", lo);
        System.out.println(b);
    }

    @Test
    public void setRedisTemplate() {
    }
}