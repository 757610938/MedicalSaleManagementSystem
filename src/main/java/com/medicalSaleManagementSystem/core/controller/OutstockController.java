package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.BO.OutstockBO;
import com.medicalSaleManagementSystem.core.model.VO.OutstockApplyVO;
import com.medicalSaleManagementSystem.core.model.VO.OutstockVO;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.OutstockRecord;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.service.OutstockService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
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
    public Resp addWarehouse(@RequestBody(required = false) OutstockApplyRecord outstockApply){
        System.out.println(outstockApply);
        if (outstockApply==null){
            System.out.println("封装失败");
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "出库申请表生成失败");
        }
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
    public Resp warehouseList(@PathVariable int pageNum, @PathVariable int pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<OutstockApplyRecord> outstockApplyRecordList = outstockService.findAllOutstockApply();
            PageInfo pageInfo = new PageInfo(outstockApplyRecordList, 5);
            return Resp.httpStatus(HttpStatus.OK, "入库申请单列表更新成功", pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "入库申请单列表更新失败");
        }
    }

    @RequestMapping(value = "/outstockManage/outstock", method = RequestMethod.PUT)
    @ResponseBody
    public Resp updateOutstockValid(@RequestBody OutstockApplyVO outstockApplyVO) {

        return outstockService.updateOutstockApplyValid(outstockApplyVO);
    }

    /**
     * 生成出库单
     * @param outstockBO
     * @return
     */
    @RequestMapping(value = "outstockManage/outstockRecord",method = RequestMethod.POST)
    @ResponseBody
    public Resp addOutstock(@RequestBody(required = false) OutstockBO outstockBO){
        System.out.println("准备生成出库单....");
        try{
            String result = insertSelective(outstockBO);
            if (result=="400"||result=="500"){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"生成出库单失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"生成出库单成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    private String insertSelective(OutstockBO outstockBO){
        if (outstockBO.getOutstockDtlBOList().size()<=0){
            return "400";
        }
        return  outstockService.addOutstockDtl(outstockBO);
    }

    /**
     * 通过outstockNumber（出库单编号）查找出库单，可查看详情
     * @param outstockNumber
     * @return
     */
    @RequestMapping(value ="outstockManage/outstockRecord/{outstockNumber}",method = RequestMethod.GET )
    @ResponseBody
    public Resp selectOutstockByOutstockNumber(@PathVariable String outstockNumber){
        try{
            OutstockBO outstockBO = outstockService.selectOutstockAndDtlByOutstockNumber(outstockNumber);
            if(outstockBO==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找出库单信息失败");
            }
            OutstockVO outstockVO=new OutstockVO();
            //BO转VO
            BeanUtilEx.copyProperties(outstockVO,outstockBO);
            Map<String, Object> ext = new HashMap<>();
            ext.put("outstockVO", outstockVO);
            return Resp.httpStatus(HttpStatus.OK,"查找出库单信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /**
     * 分页查找出库记录
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "outstockManage/outstockRecord/{pageNum}/{pageSize}",method = RequestMethod.GET)
    @ResponseBody
    public Resp selectAllOutstock(@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            PageHelper.startPage(pageNum, pageSize);
            List<OutstockRecord> outstockRecordList = outstockService.selectAllOutstock();
            PageInfo<OutstockRecord> pageInfo  = new PageInfo<>(outstockRecordList);
            return Resp.httpStatus(HttpStatus.OK,"查找出库单信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }


    @RequestMapping(value = "outstockManage/outstockRecord/outstockNumber", method = RequestMethod.GET)
    @ResponseBody
    public Resp selectAllOutstockNumber(){
        try{
            List<Integer> list = outstockService.selectAllOutstockNumber();
            if (list.size()<=0){
                return  Resp.httpStatus(HttpStatus.BAD_REQUEST,"获取出库单编号失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"获取所有出库单编号成功！",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }


}
