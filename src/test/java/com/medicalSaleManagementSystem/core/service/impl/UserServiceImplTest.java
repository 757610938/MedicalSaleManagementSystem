package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.redis.RedisTokenManager;
import com.medicalSaleManagementSystem.redis.TokenManager;
import com.medicalSaleManagementSystem.redis.TokenModel;
import com.medicalSaleManagementSystem.util.Msg;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserServiceImplTest {
    @Test
    public void checkLogin() {
        //1.获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取业务层对象
        UserServiceImpl userService = ac.getBean("userServiceImpl", UserServiceImpl.class);
        //3.执行方法
        Msg msg = userService.checkLogin("admin", "123456");
        TokenModel tokenModel = (TokenModel)msg.getExt().get("token");
        String token = tokenModel.getToken();
        System.out.println("返回的token——》"+token);
        TokenManager redisTokenManager = new RedisTokenManager();
        boolean checkToken =  redisTokenManager.checkToken(tokenModel);
        System.out.println(checkToken);
    }
}