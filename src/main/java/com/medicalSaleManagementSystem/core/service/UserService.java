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
    List<User>  selectByPrimaryUserName(String userName);

    /*
     * 功能描述: <br>
     * 〈〉添加用户信息
     * @Param: [record]
     * @Return: int
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:37
     */
    int insertSelective(UserDTO record);

    /*
     * 功能描述: <br>
     * 〈〉通过id删除用户信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:37
     */
    int deleteByPrimaryKey(Integer id);

    /*
     * 功能描述: <br>
     * 〈〉更改账户状态，禁用账户则将user表中的valid状态改为0，否则改成1
     * @Param: userId,valid
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:33
     */
    int updateValidByPrimaryKey(Integer userId,Integer valid);

    /*
     * 功能描述: <br>
     * 〈〉更新user信息
     * @Param: [record]
     * @Return: int
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:47
     */
    int updateByPrimaryKeySelective(UserDTO record);
    /*
     * 功能描述: <br>
     * 〈〉查询所有员工工号
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 16:26
     */
    List<String> selectAllUserNumber();
    /*
     * 功能描述: <br>
     * 〈〉查询所有用户数据
     * @Param:
     * @Return: List<User>
     * @Author: 林贤钦
     * @Date: 2019/12/12 18:26
     */
    List<User> getAll();
    /*
     * 功能描述: <br>
     * 〈〉模糊查询用户信息
     * @Param: name
     * @Return: List<User>
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:47
     */
    List<User> vagueSelectByPrimaryName(String name);
    /*
     * 功能描述: <br>
     * 〈〉查询校验员工工号
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 20:07
     */
    List<User>checkUserNumber(String userNumber);
}
