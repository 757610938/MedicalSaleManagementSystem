package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import com.medicalSaleManagementSystem.core.service.OutstockService;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@RequestMapping
@Scope(value = "prototype")
public class OutstockController {


    @Autowired
    private OutstockService outstockService;

    @RequestMapping("/outstock")
    public String index() {
        return "/outstockManage/outstock";
    }


    @RequestMapping(value = "/outstockManage/outstock", method = RequestMethod.POST)
    @ResponseBody
    public Resp addWarehouse(@RequestBody OutstockApplyRecord outstockApply){
        try {
            outstockApply.setOutstockTime(new Date(System.currentTimeMillis()));
            outstockService.addOutstock(outstockApply);
            return Resp.httpStatus(HttpStatus.OK, "出库申请表生成成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "出库申请表生成失败");
        }
    }

}
