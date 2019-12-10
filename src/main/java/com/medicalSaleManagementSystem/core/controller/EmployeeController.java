//package com.medicalSaleManagementSystem.core.controller;
//
//import com.medicalSaleManagementSystem.core.model.DTO.EmployeeDTO;
//import com.medicalSaleManagementSystem.core.model.VO.EmployeeVO;
//import com.medicalSaleManagementSystem.core.model.VO.UserDTO;
//import com.medicalSaleManagementSystem.core.service.EmployeeService;
//import com.medicalSaleManagementSystem.authorization.model.TokenModel;
//import com.medicalSaleManagementSystem.util.BeanUtilEx;
//import com.medicalSaleManagementSystem.util.message.Msg;
//import com.medicalSaleManagementSystem.util.message.Result;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//@RequestMapping(value = "/employee")
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeService employeeService;
//
//    @RequestMapping ( value = "/checkLogin", method = RequestMethod.POST )
//    @ResponseBody
//    public Result checkLogin (@RequestBody UserDTO userVO, HttpServletRequest request) {
//        System.out.println("userVO--->"+userVO);//打印测试接受参数是否正确
//        String ip = request.getHeader("X-Forwarded-For");//获取用户登录ip
//        System.out.println("用户ip--->"+ip);//打印测试用户ip
//        EmployeeDTO employeeDTO = new EmployeeDTO();
//        employeeDTO.setEmpAccount(userVO.getUserName());
//        employeeDTO.setEmpPassword(userVO.getPassword());
//        employeeDTO.setLoginIp(ip);
//        Msg msg = employeeService.login(employeeDTO);
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        if (msg.getCode()==200){
//            //200登录成功、返回token
//            result.setMessage("登录成功！");//设置result提示消息
//            TokenModel tokenModel = (TokenModel)msg.getExt().get("token");//获取业务层token
//            String token = tokenModel.getToken();//赋值token
//            System.out.println("token---->"+token);//控制台测试打印token
//            result.setToken(token);//返回result存入token
//            return result;
//        }else {
//            result.setMessage(msg.getMsg());//设置result提示消息
//            return result;
//        }
//    }
//
//    @RequestMapping ( value = "/register", method = RequestMethod.POST )
//    @ResponseBody
//    public Result register(@RequestBody EmployeeVO employeeVO){
//        System.out.println("employeeVO--->"+employeeVO);//打印测试接受参数是否正确
//        EmployeeDTO employeeDTO= new EmployeeDTO();
//        BeanUtilEx.copyProperties(employeeDTO,employeeVO);//将VO转换成DTO
//        Msg msg = employeeService.registerEmployee(employeeDTO);//注册员工账号
//        Result result = new Result();
//        result.setStatus(msg.getCode());//设置返回状态码
//        return result;
//    }
//
//}
