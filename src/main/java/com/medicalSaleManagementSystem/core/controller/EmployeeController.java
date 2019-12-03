package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.core.bean.VO.EmployeeVO;
import com.medicalSaleManagementSystem.core.bean.VO.UserVo;
import com.medicalSaleManagementSystem.core.service.EmployeeService;
import com.medicalSaleManagementSystem.redis.TokenModel;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.util.Result;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping ( value = "/checkLogin", method = RequestMethod.POST )
    @ResponseBody
    public Result checkLogin (@RequestBody UserVo userVo) {
        System.out.println("userVo--->"+userVo);//打印测试接受参数是否正确
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpAccount(userVo.getName());
        employeeDTO.setEmpPassword(userVo.getPassword());
        Msg msg = employeeService.login(employeeDTO);
        Result result = new Result();
        result.setStatus(msg.getCode());//设置返回状态码
        System.out.println("测试打印状态码result.getCode()："+result.getStatus());//测试打印状态码
        JSONObject data=new JSONObject();
        data.put("status",result.getStatus());
        if (result.getStatus()==200){
            //登录成功
            TokenModel tokenModel = (TokenModel)msg.getExt().get("token");
            String token = tokenModel.getToken();
            System.out.println("token---->"+token);
            data.put("token",token);
            result.setToken(token);
        }else{
            //400登录失败
        }
        return result;
    }

    @RequestMapping ( value = "/register", method = RequestMethod.POST )
    @ResponseBody
    public Result register(@RequestBody EmployeeVO employeeVO){
        System.out.println("employeeVO--->"+employeeVO);//打印测试接受参数是否正确
        EmployeeDTO employeeDTO= new EmployeeDTO();
        BeanUtilEx.copyProperties(employeeDTO,employeeVO);//将VO转换成DTO
        Msg msg = employeeService.registerEmployee(employeeDTO);//注册员工账号
        Result result = new Result();
        result.setStatus(msg.getCode());//设置返回状态码
        return result;
    }

}
