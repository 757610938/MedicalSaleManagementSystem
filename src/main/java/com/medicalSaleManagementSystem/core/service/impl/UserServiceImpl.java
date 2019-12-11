package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.authorization.manager.TokenManager;
import com.medicalSaleManagementSystem.authorization.model.TokenModel;
import com.medicalSaleManagementSystem.core.dao.UserMapper;
import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.core.model.entity.User;
import com.medicalSaleManagementSystem.core.model.entity.UserExample;
import com.medicalSaleManagementSystem.core.service.UserService;
import com.medicalSaleManagementSystem.util.MD5Util;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Msg;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.sql.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private TokenManager tokenManager;

    @Override
    public Resp login(UserDTO userDTO) {
        if ("".equals(userDTO.getUserName()) || "".equals(userDTO.getPassword())) {
            return Resp.result("400","用户名或密码不能为空");
        }
        //Example类指定如何构建一个动态的where子句.
        UserExample userExample = new UserExample();
        //创建SQL语句条件对象
        UserExample.Criteria criteria = userExample.createCriteria();
        //添加SQL语句where子句的条件：
        criteria.andUserNameEqualTo(userDTO.getUserName());
        criteria.andPasswordEqualTo(MD5Util.string2MD5(userDTO.getPassword()));
        //执行查询，返回结果
        List<User> userList = userMapper.selectByExample(userExample);
        if(userList.size()>0){
            if(userList.get(0).getValid()==0){
                return Resp.result("400","帐号已经禁止登录！");
            }
            //登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
            TokenModel token=tokenManager.createToken(userList.get(0).getUserId());//保存token到redis
            Map<String, Object> ext = new HashMap<>();
            ext.put("token", token.getToken());
            userList.get(0).setLastLoginTime(new Date(System.currentTimeMillis()));//记录本次登录时间
            userList.get(0).setLastLoginIp(userDTO.getLastLoginIp());//记录登录ip
            int i = userMapper.updateByPrimaryKey(userList.get(0));//更新数据库的信息
            return Resp.httpStatus(HttpStatus.OK,"登录成功！",ext);
        }
        //登录失败，放回失败信息
        return Resp.result("400","帐号或密码不正确！");
    }

    @Override
    public Resp findUserByEmpId(Integer userId) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserIdEqualTo(userId);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() == 0) {
            //数据库中没有该id
            //return Msg.fail("id不存在");
            return null;
        } else {
            //数据库中已存在该id
            //return Msg.success().add("userList", userList);
            return null;
        }
    }

    @Override
    public Resp addUser() {
        return null;
    }
}
