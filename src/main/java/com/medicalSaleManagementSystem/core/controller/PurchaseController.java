package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.BO.PurchaseBO;
import com.medicalSaleManagementSystem.core.model.VO.PurchaseVO;
import com.medicalSaleManagementSystem.core.model.entity.Purchase;
import com.medicalSaleManagementSystem.core.service.PurchaseService;
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

/**
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/14
 */
@Controller
@Scope(value = "prototype")
public class PurchaseController {
    @Autowired
    private PurchaseService purchaseService;
    /*
     * 功能描述: <br>
     * 〈〉保存采购单信息
     * @Param: [purchaseVO]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:24
     */
    @RequestMapping( value = "/purchase", method = RequestMethod.POST )
    @ResponseBody
    public Resp savePur(@RequestBody(required = false) PurchaseBO purchaseBO){
        System.out.println("保存采购单");
        System.out.println(purchaseBO);
        try{
            String result = insertSelective(purchaseBO);
            if (result=="400"||result=="500"){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"增加采购单失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"增加采购单成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉提交审核采购单信息
     * @Param: [purchaseVO]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:24
     */
    @RequestMapping( value = "purchase/submitPur", method = RequestMethod.POST )
    @ResponseBody
    public Resp submitPur(@RequestBody(required = false) PurchaseBO purchaseBO){
        try{
            String result = insertSelective(purchaseBO);
            if (result=="400"||result=="500"){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"增加采购单失败");
            }

            //修改采购单状态为"未审核状态"
            String status = purchaseService.updateOrderByPurOrderIdAndPurStatus(result, "审核中");
            if (status != "200"){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"提交审核采购单失败");
            }

            return Resp.httpStatus(HttpStatus.OK,"提交审核采购单成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    private String insertSelective(PurchaseBO purchaseBO){
        if (purchaseBO.getPurDtlList().size()<= 0){
            return "400";
        }
        return  purchaseService.makePurchaseOrder(purchaseBO);//调用service方法存入采购单
    }
    /*
     * 功能描述: <br>
     * 〈〉通过purOrderId查找采购单信息
     * @Param: [purOrderId]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:24
     */
    @RequestMapping ( value = "/purchase/{purOrderId}", method = RequestMethod.GET)
    @ResponseBody
    public Resp selectByPrimaryKey(@PathVariable String purOrderId){
        try{
            PurchaseBO purchaseBO = purchaseService.selectPurAndDtlByPurOrderId(purOrderId);
            if(purchaseBO==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找采购单信息失败");
            }
            PurchaseVO purchaseVO=new PurchaseVO();
            BeanUtilEx.copyProperties(purchaseVO,purchaseBO);//转化实体类
            Map<String, Object> ext = new HashMap<>();
            ext.put("purchaseVO", purchaseVO);
            return Resp.httpStatus(HttpStatus.OK,"查找采购单信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /*
     * 功能描述: <br>
     * 〈〉通过id删除采购单信息
     * @Param: [id]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:24
     */
    @RequestMapping ( value = "/purchase/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Resp deleteByPrimaryKey(@PathVariable("id") String id){
        try{
            int i = purchaseService.deleteByPurOrderId(id);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"删除采购单信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"删除采购单信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉更新采购单信息
     * @Param: [medicineVO]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:25
     */
    @RequestMapping ( value = "/purchase", method = RequestMethod.PUT )
    @ResponseBody
    public Resp updateByPrimaryKeySelective(@RequestBody PurchaseBO purchaseBO){
        try{
            int i = purchaseService.updateByPrimaryKeySelective(purchaseBO);//调用service方法更新药品信息
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"更新采购单信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"更新采购单信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉提交审核订单
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 22:34
     */
    @RequestMapping ( value = "/purchases/submitAuditOrder/{purOrderId}", method = RequestMethod.GET)
    @ResponseBody
    public Resp submitAuditOrderByPurOrderIdAndPurStatus(@PathVariable String purOrderId){
        try{
            String status = purchaseService.updateOrderByPurOrderIdAndPurStatus(purOrderId, "审核中");
            if (status != "200"){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"提交审核订单失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"提交审核订单成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /*
     * 功能描述: <br>
     * 〈〉获取所有采购单编号
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/14 22:34
     */
    @RequestMapping ( value = "/purchase/purOrderId", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAllPurOrderId(){
        try{
            List<Integer> list = purchaseService.getAllPurOrderId();
            if (list.size()<=0){
                return  Resp.httpStatus(HttpStatus.BAD_REQUEST,"获取采购单编号失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"获取所有采购单编号成功！",list);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    /*
     * 功能描述: <br>
     * 〈〉分页查询所有采购单信息
     * @Param: [pageNum, pageSize]
     * @Return: com.medicalSaleManagementSystem.util.message.Resp
     * @Author: 林贤钦
     * @Date: 2019/12/14 15:25
     */
    @RequestMapping ( value = "/purchases/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll(@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            //设置现在的页数为pageNum，显示的条数为pageSize条
            PageHelper.startPage(pageNum, pageSize);
            List<Purchase> purchaseList = purchaseService.getAll();
            PageInfo<Purchase> pageInfo  = new PageInfo<>(purchaseList);
            return Resp.httpStatus(HttpStatus.OK,"查找采购单信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉获取该员工的采购单编号
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/15 22:18
     */
    @RequestMapping ( value = "/purchases/{pageNum}/{pageSize}/{userNumber}", method = RequestMethod.GET )
    @ResponseBody
    public Resp getAllByUserNumber(@PathVariable String userNumber,@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            //设置现在的页数为pageNum，显示的条数为pageSize条
            PageHelper.startPage(pageNum, pageSize);
            List<PurchaseBO> purchaseList = purchaseService.getAllByUserNumber(userNumber);

            if (purchaseList.size()<=0){
                return  Resp.httpStatus(HttpStatus.BAD_REQUEST,"查询失败");
            }
            PageInfo<PurchaseBO> pageInfo  = new PageInfo<>(purchaseList);
            return Resp.httpStatus(HttpStatus.OK,"查询成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
