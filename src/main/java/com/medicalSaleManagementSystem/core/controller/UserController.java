package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.DTO.UserDTO;
import com.medicalSaleManagementSystem.core.model.VO.UserVO;
import com.medicalSaleManagementSystem.core.model.entity.Customer;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope(value = "prototype")
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
    @RequestMapping (value = "/user/checkLogin",method = RequestMethod.POST )
    @ResponseBody
    public Resp checkLogin(@RequestBody UserVO userVo, HttpServletRequest request){
        try{
            String ip = request.getHeader("X-Forwarded-For");//获取用户登录ip
            UserDTO userDTO=new UserDTO();
            BeanUtilEx.copyProperties(userDTO,userVo);//将VO转换成DTO
            userDTO.setLastLoginIp(ip);
            return this.userService.loginByUserNameAndPassword(userDTO);//调用userService查询数据库
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    @RequestMapping ( value = "/user/{userId}/{valid}", method = RequestMethod.GET)
    @ResponseBody
    public Resp updateValidByPrimaryKey(@PathVariable Integer userId ,@PathVariable Integer valid){
        try{
            String message;
            if (valid==1){
                //改成正常状态
                message="开启";
            }else if (valid==0){
                //改成禁用状态
                message="禁用";
            }else{
                //非法状态
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"非法状态码");
            }
            int i = userService.updateValidByPrimaryKey(userId, valid);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,message+"用户状态失败");
            }
            return Resp.httpStatus(HttpStatus.OK,message+"用户状态成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉 增加用户信息
     * @Param: userVO
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:31
     */
    @RequestMapping ( value = "/user", method = RequestMethod.POST )
    @ResponseBody
    public Resp insertSelective(@RequestBody UserVO userVO){
        try{
            UserDTO userDTO = new UserDTO();
            BeanUtilEx.copyProperties(userDTO,userVO);
            int i = userService.insertSelective(userDTO);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"增加用户信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"增加用户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉
     * @Param: id
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:34
     */
    @RequestMapping ( value = "/user/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Resp selectByPrimaryKey(@PathVariable Integer id){
        try{
            User user = userService.selectByPrimaryKey(id);
            if (user ==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找用户信息失败");
            }
            UserVO userVO = new UserVO();
            BeanUtilEx.copyProperties(userVO,user);
            Map<String, Object> ext = new HashMap<>();
            ext.put("userVO", userVO);
            return Resp.httpStatus(HttpStatus.OK,"查找用户信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈通过id删除用户信息〉
     * @Param: [id]
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:41
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public  Resp deleteByPrimaryKey(@PathVariable Integer id)  {
        try {
            int i = userService.deleteByPrimaryKey(id);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"删除用户信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"删除用户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @ResponseBody
    public Resp<Void> updateByPrimaryKeySelective(@RequestBody UserVO userVO){
        try {
            UserDTO userDTO = new UserDTO();
            BeanUtilEx.copyProperties(userDTO,userVO);
            int i = userService.updateByPrimaryKeySelective(userDTO);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"更新用户信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"更新用户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
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
    @RequestMapping (value = "/users/{pageNum}/{pageSize}",method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll(@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            //设置现在的页数为pageNum，显示的条数为pageSize条
            PageHelper.startPage(pageNum, pageSize);
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
    /*
     * 功能描述: <br>
     * 〈分页模糊查询用户信息〉
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 16:45
     */
    @RequestMapping ( value = "/users/{pageNum}/{pageSize}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Resp vagueSelectByPrimaryName(@PathVariable String name,@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            PageHelper.startPage(pageNum, pageSize);  //设置现在的页数为pageNum，显示的条数为pageSize条
            List<User> userList = userService.vagueSelectByPrimaryName(name);
            if(userList.size() == 0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找用户信息失败");
            }
            PageInfo pageInfo  = new PageInfo(userList);
            return Resp.httpStatus(HttpStatus.OK,"查找用户息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
