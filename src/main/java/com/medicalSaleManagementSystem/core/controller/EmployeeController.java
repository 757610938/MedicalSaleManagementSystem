package com.medicalSaleManagementSystem.core.controller;


import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.core.bean.VO.UserVo;
import com.medicalSaleManagementSystem.core.service.EmployeeService;
import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.util.Result;
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
    @CrossOrigin
    public Result checkLogin (@RequestBody UserVo userVo) {
        System.out.println("userVo--->"+userVo);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpAccount(userVo.getName());
        employeeDTO.setEmpPassword(userVo.getPassword());
        Msg msg = employeeService.login(employeeDTO);
       Result result = new Result();
        result.setCode(msg.getCode());
        System.out.println(msg);
        if (result.getCode() == 400){
            // 登录失败返回错误信息
            System.out.println("登录失败");
            result.setMessage("SSM 登录失败");
        }else{
            //登录成功返回正确信息
            System.out.println("登录成功");
            result.setMessage("SSM 登录成功");
        }
        return result;
    }
}
