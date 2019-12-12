package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.core.model.VO.UserVO;
import com.medicalSaleManagementSystem.core.model.entity.User;
import com.medicalSaleManagementSystem.core.service.UserService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserService userService;

    /*
     * 功能描述: 登录验证
     * 〈〉
     * @Param: [userVo, request]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/12 15:29
     */
    @RequestMapping (method = RequestMethod.POST )
    @ResponseBody
    public Resp checkLogin( UserVO userVo, HttpServletRequest request){
        //@RequestBody
        try{
            String ip = request.getHeader("X-Forwarded-For");//获取用户登录ip
            UserDTO userDTO=new UserDTO();
            BeanUtilEx.copyProperties(userDTO,userVo);//将VO转换成DTO
            return this.userService.loginByUserNameAndPassword(userDTO);//调用userService查询数据库
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    @RequestMapping (method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll( ){
        try{
            //设置现在的页数为2，显示的条数为5条
            PageHelper.startPage(1, 5);
            List<User> userList = userService.getAll();
            System.out.println(userList.size());
            //取分页信息，PageInfo。
            PageInfo<User> page  = new PageInfo<>(userList);
            System.out.println("总数量：" + page.getTotal());
            System.out.println("当前页查询记录：" + page.getList().size());
            System.out.println("当前页码：" + page.getPageNum());
            System.out.println("每页显示数量：" + page.getPageSize());
            System.out.println("总页：" + page.getPages());
            //取得分页之后的单页的信息
            //List<User> list2 = page.getList();
            return Resp.httpStatus(HttpStatus.OK,"查找用户信息成功！",page);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
