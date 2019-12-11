package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.medicalSaleManagementSystem.authorization.model.TokenModel;
import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.core.model.VO.UserVO;
import com.medicalSaleManagementSystem.core.service.UserService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Msg;
import com.medicalSaleManagementSystem.util.message.PageInfo;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 登录验证
     * @return
     */
    @RequestMapping (method = RequestMethod.POST )
    @ResponseBody
    public Resp checkLogin(@RequestBody UserVO userVo, HttpServletRequest request){
        System.out.println(".....");
        System.out.println(userVo);
        try{
            String ip = request.getHeader("X-Forwarded-For");//获取用户登录ip
            UserDTO userDTO=new UserDTO();
            BeanUtilEx.copyProperties(userDTO,userVo);//将VO转换成DTO
            return this.userService.login(userDTO);//调用userService查询数据库
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
