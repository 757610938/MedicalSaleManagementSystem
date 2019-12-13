package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.DTO.CustomerDTO;
import com.medicalSaleManagementSystem.core.model.VO.CustomerVO;
import com.medicalSaleManagementSystem.core.model.entity.Customer;
import com.medicalSaleManagementSystem.core.service.CustomerService;
import com.medicalSaleManagementSystem.core.service.impl.CustomerServiceImpl;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope(value = "prototype")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/customer")
    public String index() {
        return "/customerManagement/customer";
    }
    /*
     * 功能描述: <br>
     * 〈〉添加客户信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 13:26
     */
    @RequestMapping ( value = "/customer", method = RequestMethod.POST)
    @ResponseBody
    public Resp<Void> insertSelective(@RequestBody CustomerVO customerVO){
        try{
            CustomerDTO customerDTO = new CustomerDTO();
            BeanUtilEx.copyProperties(customerDTO,customerVO);
            int i = customerService.insertSelective(customerDTO);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"增加客户信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"增加客户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /**
     * 通过id查找客户信息
     * @param id
     * @author 林贤钦
     * @return
     */
    @RequestMapping ( value = "/customer/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Resp selectByPrimaryKey(@PathVariable("id")Integer id){
        try{
            System.out.println("selectByPrimaryKey");
            Customer customer = customerService.selectByPrimaryKey(id);
            if (customer==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找客户信息失败");
            }
            //资源存在，响应200
            CustomerVO customerVO = new CustomerVO();
            BeanUtilEx.copyProperties(customerVO,customer);
            Map<String, Object> ext = new HashMap<>();
            ext.put("customerVO", customerVO);
            return Resp.httpStatus(HttpStatus.OK,"查找客户信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /**
     * 通过id删除客户信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public  Resp deleteByPrimaryKey(@PathVariable Integer id)  {
        System.out.println("deleteId---->"+id);
        try{
            int i = customerService.deleteByPrimaryKey(id);
            System.out.println("i---->"+i);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"删除客户信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"删除客户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /**
     *
     * @return
     */
    @RequestMapping(value = "/customer",method = RequestMethod.PUT)
    @ResponseBody
    public Resp<Void> updateByPrimaryKeySelective(@RequestBody CustomerVO customerVO){
        try{
            CustomerDTO customerDTO = new CustomerDTO();
            BeanUtilEx.copyProperties(customerDTO,customerVO);
            int i = customerService.updateByPrimaryKeySelective(customerDTO);//调用service方法更新药品信息
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"更新客户信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"更新客户信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /*
     * 功能描述: <br>
     * 〈〉分页查询客户信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:16
     */
    @RequestMapping ( value = "/customers/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll(@PathVariable int pageNum ,@PathVariable int pageSize){
//        System.out.println("执行CustomerController的getAll方法");
        try{
            //设置现在的页数为1，显示的条数为5条
            PageHelper.startPage(pageNum, pageSize);
            List<Customer> customerList = customerService.getAll();
            PageInfo<Customer> pageInfo  = new PageInfo<Customer>(customerList);
            return Resp.httpStatus(HttpStatus.OK,"查找客户信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    @RequestMapping ( value = "/customers/{pageNum}/{pageSize}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Resp vagueSelectByPrimaryName(@PathVariable String name,@PathVariable int pageNum ,@PathVariable int pageSize){
//        System.out.println("执行CustomerController的vagueSelectByPrimaryName方法");
        try{
            PageHelper.startPage(pageNum, pageSize);  //设置现在的页数为pageNum，显示的条数为pageSize条
            List<Customer> customerList= customerService.vagueSelectByPrimaryName(name);
            if(customerList.size() == 0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找客户信息失败");
            }
            PageInfo pageInfo  = new PageInfo(customerList);
            return Resp.httpStatus(HttpStatus.OK,"查找客户信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
