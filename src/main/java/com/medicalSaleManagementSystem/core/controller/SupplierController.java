package com.medicalSaleManagementSystem.core.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.DTO.SupplierDTO;
import com.medicalSaleManagementSystem.core.model.VO.SupplierVO;
import com.medicalSaleManagementSystem.core.model.VO.ValueVo;
import com.medicalSaleManagementSystem.core.model.entity.Supplier;
import com.medicalSaleManagementSystem.core.service.SupplierService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@Scope(value = "prototype")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;
    /*
     * 功能描述: <br>
     * 〈〉添加供应商信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:05
     */
    @RequestMapping ( value = "/supplier", method = RequestMethod.POST)
    @ResponseBody
    public Resp insertSelective(@RequestBody SupplierVO supplierVO){
        try{
            SupplierDTO supplierDTO=new SupplierDTO();
            BeanUtilEx.copyProperties(supplierDTO,supplierVO);//转化实体类
            int i = supplierService.insertSelective(supplierDTO);//调用service方法存入药品信息
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"增加供应商信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"增加供应商信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉通过id查找供应商信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:07
     */
    @RequestMapping ( value = "/supplier/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Resp selectByPrimaryKey(@PathVariable Integer id){
        try{
            Supplier supplier = supplierService.selectByPrimaryKey(id);
            if(supplier==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找供应商信息失败");
            }
            SupplierVO supplierVO = new SupplierVO();
            BeanUtilEx.copyProperties(supplierVO,supplier);
            Map<String, Object> ext = new HashMap<>();
            ext.put("supplierVO", supplierVO);
            return Resp.httpStatus(HttpStatus.OK,"查找供应商信息成功！",ext);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉通过id删除供应商信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:11
     */
    @RequestMapping ( value = "/supplier/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public Resp deleteByPrimaryKey(@PathVariable Integer id){
        try{
            int i = supplierService.deleteByPrimaryKey(id);
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"删除供应商信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"删除供应商信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉更新供应商信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:12
     */
    @RequestMapping ( value = "/supplier", method = RequestMethod.PUT )
    @ResponseBody
    public Resp updateByPrimaryKeySelective(@RequestBody SupplierVO supplierVO){
        try{
            SupplierDTO supplierDTO=new SupplierDTO();
            BeanUtilEx.copyProperties(supplierDTO,supplierVO);//转化实体类
            int i = supplierService.updateByPrimaryKeySelective(supplierDTO);//调用service方法更新药品信息
            if(i==0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"更新供应商信息失败");
            }
            return Resp.httpStatus(HttpStatus.OK,"更新供应商信息成功！");
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉分页查询供应商信息
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/13 1:16
     */
    @RequestMapping ( value = "/suppliers/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAll(@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            //设置现在的页数为pageNum，显示的条数为pageSize条
            PageHelper.startPage(pageNum, pageSize);
            List<Supplier> supplierList = supplierService.getAll();
            PageInfo<Supplier> pageInfo  = new PageInfo<>(supplierList);
            return Resp.httpStatus(HttpStatus.OK,"查找供应商信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }

    @RequestMapping ( value = "/suppliers/{pageNum}/{pageSize}/{name}", method = RequestMethod.GET)
    @ResponseBody
    public Resp vagueSelectByPrimaryName(@PathVariable String name,@PathVariable int pageNum ,@PathVariable int pageSize){
        try{
            PageHelper.startPage(pageNum, pageSize);  //设置现在的页数为pageNum，显示的条数为pageSize条
            List<Supplier> supplierList = supplierService.vagueSelectByPrimaryName(name);
            if(supplierList.size() == 0){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找供应商信息失败");
            }
            PageInfo<Supplier> pageInfo  = new PageInfo<>(supplierList);
            return Resp.httpStatus(HttpStatus.OK,"查找供应商信息成功！",pageInfo);
        }catch (Exception e){
            e.printStackTrace();
        }
        //500
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
    /*
     * 功能描述: <br>
     * 〈〉获取所有供应商编号
     * @Param:
     * @Return:
     * @Author: 林贤钦
     * @Date: 2019/12/17 16:21
     */
    @RequestMapping ( value = "/suppliers", method = RequestMethod.GET)
    @ResponseBody
    public Resp getAllPrimaryKey(){
        try {
            List<Integer> list = supplierService.getAllPrimaryKey();
            JSON.toJSONString(list);
            return Resp.httpStatus(HttpStatus.OK,"获取所有供应商编号成功",list);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"系统内部错误");
    }
}
