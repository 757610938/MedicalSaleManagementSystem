package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.core.service.EmployeeService;
import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.util.Result;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping ( value = "/checkLogin", method = RequestMethod.POST )
    @ResponseBody
    @CrossOrigin
    public Result checkLogin (@Param("name")String name, @Param("password")String password) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpAccount(name);
        employeeDTO.setEmpPassword(password);
        Msg msg = employeeService.login(employeeDTO);
        Result result = new Result();
        result.setCode(msg.getCode());//设置返回Code
        return result;
    }

}
