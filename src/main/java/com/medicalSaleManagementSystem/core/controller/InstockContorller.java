package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.BO.InstockBO;
import com.medicalSaleManagementSystem.core.model.VO.InstockVO;
import com.medicalSaleManagementSystem.core.model.entity.InstockRecord;
import com.medicalSaleManagementSystem.core.service.InstockService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope(value = "prototype")
public class InstockContorller {

    @Autowired
    InstockService instockService;

    @RequestMapping("/instock")
    public String index() {
        return "/instockManage/instock";
    }

    /**
     * 生成入库单
     * @param
     * @return
     */
    @RequestMapping(value = "instockManage/instockRecord",method = RequestMethod.POST)
    @ResponseBody
    public Resp addInstock(@RequestBody(required = false) InstockBO instockBO){
        System.out.println("准备生成入库单....");
        try{
            String result = insertSelective(instockBO);
            if (result=="400"||result=="500"){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"生成入库单失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"生成入库单成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    private String insertSelective(InstockBO instockBO){
        if (instockBO.getInstockDtlList().size()<=0){
            return "400";
        }
        return  instockService.addInstockDtl(instockBO);
    }

    /**
     * 通过instockNumber查找入库单，查看详情
     * @param
     * @return
     */
    @RequestMapping(value ="instockManage/instockRecord/{instockNumber}",method = RequestMethod.GET )
    @ResponseBody
    public Resp selectInstockByInstockNumber(@PathVariable String instockNumber){
        try{
            InstockBO instockBO = instockService.selectInstockAndDtlByInstockNumber(instockNumber);
            if(instockBO==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找出库单信息失败");
            }
            InstockVO instockVO=new InstockVO();
            //BO转VO
            BeanUtilEx.copyProperties(instockVO,instockBO);
            Map<String, Object> ext = new HashMap<>();
            ext.put("outstockVO", instockVO);
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
    public Resp selectAllInstock(@PathVariable int pageNum , @PathVariable int pageSize){
        try{
            PageHelper.startPage(pageNum, pageSize);
            List<InstockRecord> instockRecordList = instockService.selectAllInstock();
            PageInfo<InstockRecord> pageInfo  = new PageInfo<>(instockRecordList);
            return Resp.httpStatus(HttpStatus.OK,"查找出库单信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /**
     * 查询所有的入库编号
     * @return
     */
    public Resp selectAllInstockNumber(){
        return null;
    }


}
