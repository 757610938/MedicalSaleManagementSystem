//package com.medicalSaleManagementSystem.core.controller;
//
//import com.medicalSaleManagementSystem.core.model.DTO.CustomerDTO;
//import com.medicalSaleManagementSystem.core.model.POJO.Customer;
//import com.medicalSaleManagementSystem.core.model.VO.CustomerVO;
//import com.medicalSaleManagementSystem.core.service.CustomerService;
//import com.medicalSaleManagementSystem.util.BeanUtilEx;
//import com.medicalSaleManagementSystem.util.message.HttpStatus;
//import com.medicalSaleManagementSystem.util.message.Msg;
//import com.medicalSaleManagementSystem.util.message.Resp;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//@RequestMapping("v1/customers")
//public class CustomerController {
//    @Autowired
//    private CustomerService customerService;
//
//    /**
//     * 增加客户信息
//     * @param customerVO
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( method = RequestMethod.POST )
//    @ResponseBody
//    public Resp<Void> addCustomer(@RequestBody CustomerVO customerVO){
//        try{
//            CustomerDTO customerDTO=new CustomerDTO();
//            BeanUtilEx.copyProperties(customerDTO,customerVO);
//            Msg msg = customerService.addCustomer(customerDTO);
//            if (msg.getCode()==400){
//                //资源不存在，响应404
//                return  Resp.httpStatus(HttpStatus.CONFLICT,msg.getMsg());
//            }
//            return  Resp.httpStatus(HttpStatus.CREATED,msg.getMsg());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        //500
//        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
//    }
//    /**
//     * 通过id查找客户信息
//     * @param id
//     * @author 林贤钦
//     * @return
//     */
//    @RequestMapping ( value = "{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public Resp<Customer> findCustomerById(@PathVariable("id")Integer id){
//        try{
//            Msg msg = customerService.findCustomerById(id);
//            if (msg.getCode()==400){
//                //资源不存在，响应404
//                return  Resp.httpStatus(HttpStatus.NOT_FOUND,msg.getMsg());
//            }
//            //资源存在，响应200
//            Customer customer= (Customer) msg.getExt().get("customer");
//            return  Resp.httpStatus(HttpStatus.OK,msg.getMsg(),customer);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        //500
//        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
//    }
//
//    /**
//     * 通过id删除客户信息
//     * @param id
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.DELETE)
//    public  Resp deleteCustomerById(@RequestParam(value = "id",defaultValue = "0")  Integer id){
//        try{
//            if (id.intValue() == 0){
//                //请求参数有误 400
//                return Resp.httpStatus(HttpStatus.BAD_REQUEST, "请求参数有误");
//            }
//            Msg msg = customerService.deleteCustomerById(id);
//            if (msg.getCode()==400){
//                //资源不存在，响应404
//                return  Resp.httpStatus(HttpStatus.NOT_FOUND,msg.getMsg());
//            }
//            //202 请求已被接受
//            return  Resp.httpStatus(HttpStatus.ACCEPTED, msg.getMsg());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        //500
//        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
//    }
//
//    /**
//     *
//     * @return
//     */
//    @RequestMapping(method = RequestMethod.PUT)
//    public Resp<Void> updateCustomer(CustomerVO customerVO){
//        try{
//            CustomerDTO customerDTO=new CustomerDTO();
//            BeanUtilEx.copyProperties(customerDTO,customerVO);
//            Msg msg = this.customerService.updateCustomer(customerDTO);
//            if (msg.getCode()==400){
//                //资源不存在，响应404
//                return  Resp.httpStatus(HttpStatus.NOT_FOUND,msg.getMsg());
//            }
//            //204 操作已经成功，但是没返回数据
//            return  Resp.httpStatus(HttpStatus.NO_CONTENT, msg.getMsg());
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        //500
//        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
//    }
//}
