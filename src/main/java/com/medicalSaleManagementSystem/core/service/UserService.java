package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.util.message.Msg;

public interface UserService {
    /**
     * 用户登录，数据使用md5加密，如果登录成功，记录登录时间，将数据库的登录时间移动到上次登录时间，记录登录ip
     * @return 消息类
     * @author 林贤钦
     */
    Msg login(UserDTO userDTO);

    /**
     * 通过id查询用户
     * @return userId
     */
    Msg findUserByEmpId(Integer userId);
}
