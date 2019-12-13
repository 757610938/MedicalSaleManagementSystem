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
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@Scope(value = "prototype")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public String index() {
        return "/userManagement/user";
    }
    /*
     * 功能描述: 登录验证
     * 〈〉
     * @Param: [userVo, request]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/12 15:29
     */
    @RequestMapping (value = "/user",method = RequestMethod.POST )
    @ResponseBody
    public Resp checkLogin(@RequestBody UserVO userVo, HttpServletRequest request){
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
    /*
     * 功能描述: <br>
     * 〈〉获取用户所有数据
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:20
     */
    @RequestMapping (value = "/user",method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll(@RequestParam(value = "pn", defaultValue = "1") int pn){
        try{
            //设置现在的页数为1，显示的条数为5条
            PageHelper.startPage(pn, 5);
            List<User> userList = userService.getAll();
            //取分页信息，PageInfo。
            PageInfo<User> pageInfo  = new PageInfo<>(userList);
            return Resp.httpStatus(HttpStatus.OK,"查找用户信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
