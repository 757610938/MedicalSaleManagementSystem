package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.service.WarehouseService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

@Controller
@Scope(value = "prototype")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping("/warehouse")
    public String index() {
        return "/warehouseManage/warehouse";
    }


    @RequestMapping(value = "/warehouseManage/warehouse/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp warehouseList(@PathVariable(value = "pageNum") int pageNum,@PathVariable(value = "pageSize") int pageSize) {
        try {
            PageHelper.startPage(pageNum, pageSize);
            List<Warehouse> warehouseList = warehouseService.findAllWarehouse();
            PageInfo pageInfo = new PageInfo(warehouseList, 5);
            return Resp.httpStatus(HttpStatus.OK, "仓库列表更新成功", pageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "仓库列表更新失败");
        }
    }


    @RequestMapping(value = "/warehouseManage/warehouse/{key}/{pageNum}/{pageSize}", method = RequestMethod.GET)
    @ResponseBody
    public Resp findWarehouseByFuzzySearch(@PathVariable(value = "key") String key, @PathVariable(value = "pageNum") Integer pageNum, @PathVariable(value = "pageSize") Integer pageSize) {
        return warehouseService.findWhseByFuzzySearch(key, pageNum, pageSize);
    }

    @RequestMapping(value = "/warehouseManage/warehouse", method = RequestMethod.POST)
    @ResponseBody
    public Resp addWarehouse(@RequestBody Warehouse warehouse) {
        try {
            warehouse.setGenTime(new Date(System.currentTimeMillis()));
            warehouseService.addWhse(warehouse);
            return Resp.httpStatus(HttpStatus.OK, "新增仓库成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "仓库列表新增失败");
        }
    }

    @RequestMapping(value = "/warehouseManage/warehouse/{ids}", method = RequestMethod.DELETE)
    @ResponseBody
    public Resp deleteWarehouse(@PathVariable(value = "ids") String ids) {
        try {
            if (ids.contains("-")) {
                String[] str_ids = ids.split("-");
                List<Integer> int_ids = new ArrayList<Integer>();
                for (String id : str_ids) {
                    int_ids.add(Integer.parseInt(id));
                }
                warehouseService.deleteWhseByWhseIds(int_ids);
            } else {
                Integer id = Integer.parseInt(ids);
                warehouseService.deleteWhseByWhseId(id);
            }
            return Resp.httpStatus(HttpStatus.OK, "删除仓库成功");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.OK, "删除仓库成功");
        }
    }

    @RequestMapping(value = "/warehouseManage/warehouse", method = RequestMethod.PUT)
    @ResponseBody
    public Resp updateWarehouse(@RequestBody WarehouseVO warehouseVO) {

        return warehouseService.updateWhse(warehouseVO);
    }

    @RequestMapping(value = "/warehouseManage/warehouse/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Resp findWarehouse(@PathVariable("id")Integer id) {

        try {
            Warehouse warehouse =warehouseService.findWhseByWhseId(id);
            if(warehouse==null){
                return Resp.httpStatus(HttpStatus.BAD_REQUEST,"查找仓库信息失败");
            }
            WarehouseVO warehouseVO = new WarehouseVO();
            BeanUtilEx.copyProperties(warehouseVO,warehouse);
            Map<String, Object> ext = new HashMap<>();
            ext.put("warehouseVO", warehouseVO);
            return Resp.httpStatus(HttpStatus.OK,"查找仓库信息成功！",ext);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Resp.httpStatus(HttpStatus.INTERNAL_SERVER_ERROR,"查找仓库信息失败");
    }


}
