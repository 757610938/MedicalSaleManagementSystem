package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.core.bean.DTO.Msg;
import com.medicalSaleManagementSystem.core.service.EmployeeService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/login")
    public String  login(@Param("name")String name, @Param("password")String password, Model model){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpAccount(name);
        employeeDTO.setEmpPassword(password);
        Msg msg = employeeService.login(employeeDTO);
        ModelAndView modelAndView = new ModelAndView();
        if (msg.getCode() == 200){
            // 登录失败返回错误信息
            System.out.println("登录失败");
            return "/index.jsp";
        }else{
            //登录成功返回正确信息
            System.out.println("登录成功");
            return "success";
        }
    }
}
