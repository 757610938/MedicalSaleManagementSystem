package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.core.model.entity.User;
import com.medicalSaleManagementSystem.util.message.Resp;

import java.util.List;

public interface UserService {
    /**
     * 用户登录，数据使用md5加密，如果登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
     * @return 消息类
     * @author 林贤钦
     */
    Resp loginByUserNameAndPassword(UserDTO userDTO);

    /**
     * 通过id查询用户
     * @author 林贤钦
     * @return
     */
    User selectByPrimaryKey(Integer id);

    /*
     * 功能描述: <br>
     * 〈〉通过userName查询用户
     * @Param: userName
     * @Return:  User
     * @Author: 林贤钦
     * @Date: 2019/12/12 21:50
     */
    List<User>  selectByPrimaryUserName(String  userName);
    /**
     * 添加用户信息
     * @author 林贤钦
     * @return
     */
    int insertSelective(UserDTO record);

    /**
     * 关闭账户，将user表中的valid状态改为0
     * @param userId
     * @author 林贤钦
     * @return
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * 开启账户状态，将user表中的valid状态改为1
     * @param userId
     * @author 林贤钦
     * @return
     */
    int openValidByPrimaryKey(Integer userId);
    /**
     * 更新user信息
     * @author 林贤钦
     * @return
     */
    int updateByPrimaryKeySelective(UserDTO record);

    /*
     * 功能描述: <br>查询所有用户数据
     * 〈〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/12 18:26
     */
    List<User> getAll();
}
