package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.BO.SaleBO;
import com.medicalSaleManagementSystem.core.model.entity.Sale;
import com.medicalSaleManagementSystem.core.service.SaleService;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
@Controller
@Scope(value = "prototype")
public class SaleController {
    @Autowired
    private SaleService saleService;
    /*
     * 功能描述: <br>
     * 〈〉分页查询所有销售单信息
     * @Param: [pageNum, pageSize]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:25
     */
    @RequestMapping( value = "/sales/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll(@PathVariable int pageNum , @PathVariable int pageSize){
        try{
            //设置现在的页数为pageNum，显示的条数为pageSize条
            PageHelper.startPage(pageNum, pageSize);
            List<Sale> list = saleService.getAllSale();
            PageInfo<Sale> pageInfo  = new PageInfo<>(list);
            return Resp.httpStatus(HttpStatus.OK,"查找销售信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /*
     * 功能描述: <br>
     * 〈〉通过purOrderId查找采购单信息
     * @Param: [purOrderId]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:24
     */
    @RequestMapping ( value = "/sale/{saleOrderId}", method = RequestMethod.GET)
    @ResponseBody
    public Resp selectByPrimaryKey(@PathVariable String saleOrderId){
        try{
            SaleBO saleBO = saleService.selectSaleAndDtlBySaleOrderId(saleOrderId);
            if(saleBO==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找销售单信息失败");
            }
            Map<String, Object> ext = new HashMap<>();
            ext.put("sale", saleBO);
            return Resp.httpStatus(HttpStatus.OK,"查找销售单信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
