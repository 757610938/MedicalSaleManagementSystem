package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.authorization.manager.TokenManager;
import com.medicalSaleManagementSystem.authorization.model.TokenModel;
import com.medicalSaleManagementSystem.core.dao.UserMapper;
import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.core.model.VO.UserVO;
import com.medicalSaleManagementSystem.core.model.entity.User;
import com.medicalSaleManagementSystem.core.model.entity.UserExample;
import com.medicalSaleManagementSystem.core.service.UserService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.MD5Util;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.sql.Date;
import java.text.SimpleDateFormat;
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
    public Resp loginByUserNameAndPassword(UserDTO userDTO) {
        if ("".equals(userDTO.getUserName()) || "".equals(userDTO.getPassword())) {
            //400 (Bad Request) 如：密码不符合要求，昵称不允许为空，等等；
            return Resp.httpStatus(HttpStatus.BAD_REQUEST,"用户名或密码不能为空");
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
            if(userList.get(0).getUserValid()==0){
                return  Resp.httpStatus(HttpStatus.BAD_REQUEST,"帐号已经禁止登录！");
            }
            //登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
            TokenModel token=tokenManager.createToken(userList.get(0).getUserId());//保存token到redis
            Map<String, Object> ext = new HashMap<>();
            ext.put("token", token.getToken());//返回前端token
            UserVO userVO= new UserVO();
            BeanUtilEx.copyProperties(userVO,userList.get(0));
            ext.put("userVO",userVO);//返回前端用户信息
            userList.get(0).setLastLoginTime(new Date(System.currentTimeMillis()));//记录本次登录时间
            userList.get(0).setLastLoginIp(userDTO.getLastLoginIp());//记录登录ip
            int i = userMapper.updateByPrimaryKey(userList.get(0));//更新数据库的信息
            return Resp.httpStatus(HttpStatus.OK,"登录成功！",ext);
        }
        //400 (Bad Request) 如：密码不符合要求，昵称不允许为空，等等；
        return Resp.httpStatus(HttpStatus.BAD_REQUEST,"帐号或密码不正确！");
    }

    @Override
    public User selectByPrimaryKey(Integer userId) {
       try{
           if ("".equals(userId) ||userId==0) {
               return null;
           }
           return userMapper.selectByPrimaryKey(userId);
       }catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

    @Override
    public  List<User> selectByPrimaryUserName(String userName) {
        System.out.println("selectByPrimaryUserName"+userName);
        try{
            if ("".equals(userName) ||userName==null) {
                return null;
            }
            UserExample userExample = new UserExample();
            UserExample.Criteria criteria = userExample.createCriteria();
            criteria.andUserNameEqualTo(userName);
            return userMapper.selectByExample(userExample);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int insertSelective(UserDTO record) {
        try {
            List<User> userList = selectByPrimaryUserName(record.getUserName());//查询账户是否存在
            System.out.println(userList);
            System.out.println(userList.size());
            if (userList.size()<=0){
                User user=new User();
                BeanUtilEx.copyProperties(user,record);
                user.setUserValid(1);//将 valid状态改为1
                user.setPassword(MD5Util.string2MD5("123456"));//设置默认密码123456，md5加密
                return userMapper.insertSelective(user);//将账户存入数据库中
            }
            return 0;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            return userMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateValidByPrimaryKey(Integer userId,Integer valid) {
        if (valid==1){
            //valid ==1 ---->状态正常
            //改成正常状态
            return openValidByPrimaryKey(userId);
        }
        else if (valid==0){
            //valid ==0 ---->状态禁用
            //改成禁用状态
            return closeValidByPrimaryKey(userId);
        }
        return 0;
    }


    private int closeValidByPrimaryKey(Integer userId){
        try{
            User user = new User();
            user.setUserId(userId);
            user.setUserValid(0);//将user状态改为0
            return userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e){
            e.printStackTrace();
        }
        return  0;
    }


    private int openValidByPrimaryKey(Integer userId) {
        try{
            User user = new User();
            user.setUserId(userId);
            user.setUserValid(1);//将user状态改为0
            return userMapper.updateByPrimaryKeySelective(user);
        } catch (Exception e){
            e.printStackTrace();
        }
        return  0;
    }

    @Override
    public int updateByPrimaryKeySelective(UserDTO record){
        if ("".equals(record.getUserName()) || "".equals(record.getPassword())) {
            //400 (Bad Request) 如：密码不符合要求，昵称不允许为空，等等；
            return 0;
        }
        try {
            User user=new User();
            BeanUtilEx.copyProperties(user,record);
            return userMapper.updateByPrimaryKeySelective(user);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<String> selectAllUserNumber() {
        return userMapper.selectAllUserNumber();
    }

    @Override
    public List<User> getAll() {
        return userMapper.selectByExample(null);
    }

    @Override
    public List<User> vagueSelectByPrimaryName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameLike("%"+name+"%");
        return userMapper.selectByExample(userExample);
    }

    @Override
    public List<User> checkUserNumber(String userNumber) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNumberEqualTo(userNumber);
        return userMapper.selectByExample(userExample);
    }
}
