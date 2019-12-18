package com.medicalSaleManagementSystem.core.controller;

import com.medicalSaleManagementSystem.core.service.InstockService;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope(value = "prototype")
public class InstockContorller {


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
    public Resp addInstock(){
        return null;
    }

    /**
     * 通过instockNumber查找入库单，查看详情
     * @param
     * @return
     */
    @RequestMapping(value ="instockManage/instockRecord/{instockNumber}",method = RequestMethod.GET )
    @ResponseBody
    public Resp selectInstockByInstockNumber(@PathVariable String instockNumber){
        return null;
    }

    /**
     * 分页查找出库记录
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Resp selectAllInstock(@PathVariable int pageNum , @PathVariable int pageSize){
        return null;
    }

    /**
     * 查询所有的入库编号
     * @return
     */
    public Resp selectAllInstockNumber(){
        return null;
    }


}
