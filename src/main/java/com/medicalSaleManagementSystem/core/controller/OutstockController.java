package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.VO.OutstockApplyVO;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.service.OutstockService;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

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

    @RequestMapping(value = "/outstockManage/outstock/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp warehouseList(@PathVariable(value = "pageNum") int pageNum, @PathVariable(value = "pageSize") int pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<OutstockApplyRecord> outstockApplyRecordList = outstockService.findAllOutstockApply();
            PageInfo pageInfo = new PageInfo(outstockApplyRecordList, 5);
            return Resp.httpStatus(HttpStatus.OK, "仓库列表更新成功", pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "仓库列表更新失败");
        }
    }

    @RequestMapping(value = "/outstockManage/outstock", method = RequestMethod.PUT)
    @ResponseBody
    public Resp updateOutstockValid(@RequestBody OutstockApplyVO outstockApplyVO) {

        return outstockService.updateOutstockApplyValid(outstockApplyVO);
    }





}
