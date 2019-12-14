package com.medicalSaleManagementSystem.core.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.service.WarehouseService;
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
    WarehouseService warehouseService;

    @RequestMapping("/warehouse")
    public String index() {
        return "/warehouseManagement/warehouse";
    }

    @ResponseBody
    @RequestMapping("/warehouseManagement/jsonWarehouseList")
    public Resp warehouseList(@RequestParam(value = "pn", defaultValue = "1") int pn) {
        PageHelper.startPage(pn, 5);
        List<Warehouse> warehouseList = warehouseService.findAllWarehouse();
        PageInfo pageInfo = new PageInfo(warehouseList, 5);
        return Resp.httpStatus(HttpStatus.OK, "仓库列表更新成功", pageInfo);
    }

    @ResponseBody
    @RequestMapping("/warehouseManagement/selectWarehouse")
    public Resp findWarehouseByFuzzySearch(Integer page, String orderBy, String key) {
        return warehouseService.findWhseByFuzzySearch(key, orderBy, page);
    }

    @ResponseBody
    @RequestMapping(value = "/warehouseManagement/warehouse", method = RequestMethod.POST)
    public Resp addWarehouse(Warehouse warehouse) {
        try {
            warehouse.setGenTime(new Date(System.currentTimeMillis()));
            warehouseService.addWhse(warehouse);
            return Resp.httpStatus(HttpStatus.OK, "新增仓库成功");
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "仓库列表新增失败");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/warehouseManagement/warehouse/{ids}", method = RequestMethod.DELETE)
    public Resp deleteWarehouse(@PathVariable("ids") String ids) {
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

    @ResponseBody
    @RequestMapping(value = "/warehouseManagement/warehouse", method = RequestMethod.PUT)
    public Resp updateWarehouse(@Valid WarehouseVO warehouseVO) {
        return warehouseService.updateWhse(warehouseVO);
    }

    @ResponseBody
    @RequestMapping(value = "/warehouseManagement/warehouse", method = RequestMethod.GET)
    public Resp findWarehouse(WarehouseVO warehouseVO) {
        return warehouseService.findWhseById(warehouseVO);
    }


}
