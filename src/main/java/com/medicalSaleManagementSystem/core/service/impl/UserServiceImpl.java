package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.VO.UserVo;
import com.medicalSaleManagementSystem.core.dao.EmployeeMapper;
import com.medicalSaleManagementSystem.core.service.UserService;
import com.medicalSaleManagementSystem.redis.TokenManager;
import com.medicalSaleManagementSystem.redis.TokenModel;
import com.medicalSaleManagementSystem.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TokenManager tokenManager;
    @Override
    public Msg checkLogin(String username, String password) {
        if (username.equals("admin")&&password.equals("123456")){
            TokenModel token=tokenManager.createToken(123456);
            return Msg.success().add("token",token);
        }else{
            return Msg.fail("账户或者密码错误");
        }
    }
}
