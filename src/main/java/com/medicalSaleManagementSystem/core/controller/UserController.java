package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.bean.VO.UserVo;
import com.medicalSaleManagementSystem.core.service.UserService;
import com.medicalSaleManagementSystem.redis.TokenManager;
import com.medicalSaleManagementSystem.redis.TokenModel;
import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private TokenManager tokenManager;
    @RequestMapping(value="/token",method= RequestMethod.POST)
    @ResponseBody
    public Result login(@RequestBody UserVo userVo){
        //打印测试接受参数是否正确
        System.out.println("userVo--->"+userVo);
        Result result = new Result();
        //设置返回状态码，200代表成功
        result.setStatus(200);
        return result;
    }

}
