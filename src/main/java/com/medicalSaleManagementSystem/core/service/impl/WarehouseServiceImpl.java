package com.medicalSaleManagementSystem.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.dao.WarehouseMapper;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.model.entity.WarehouseExample;
import com.medicalSaleManagementSystem.core.service.WarehouseService;
import com.medicalSaleManagementSystem.util.LoggerUtils;
import com.medicalSaleManagementSystem.util.message.HttpStatus;
import com.medicalSaleManagementSystem.util.message.Msg;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseMapper warehouseMapper;

    @Override
    public Warehouse findWhseByWhseId(Integer whseId) {
        try {
            return warehouseMapper.selectByPrimaryKey(whseId);
        } catch (Exception e) {
            LoggerUtils.error(WarehouseServiceImpl.class, "查询失败", e);
            return null;
        }
    }

    @Override
    public Resp findWhseByFuzzySearch(String key, String orderBy, Integer page) {
        WarehouseExample warehouseExample = new WarehouseExample();
        if (orderBy != null && !"".equals(orderBy)) {
            warehouseExample.setOrderByClause(orderBy.replace("-", " "));
        }
        PageHelper.startPage(page, 10);
        key = "%" + key + "%";
        warehouseExample.setWhseName(key);
        List<Warehouse> warehouseList = warehouseMapper.selectWhseByWhseName(warehouseExample);
        if (warehouseList.size() <= 0) {
            return Resp.httpStatus(HttpStatus.BAD_REQUEST, "模糊查询失败");
        }
        List<WarehouseVO> warehouseVOList = new ArrayList<>();
        for (Warehouse warehouse : warehouseList) {
            warehouseVOList.add(entityToVO(warehouse));
        }
        PageInfo<WarehouseVO> pageInfo = new PageInfo<>(warehouseVOList, 5);
        return Resp.httpStatus(HttpStatus.OK, "模糊查询成功", pageInfo);

    }

    @Override
    public List<Warehouse> findAllWarehouse() {
        return warehouseMapper.selectByExample(null);
    }

    @Override
    public Msg WarehouseList(String orderby, Integer page) {
        WarehouseExample warehouseExample = new WarehouseExample();
        if (orderby != null && !"".equals(orderby)) {
            warehouseExample.setOrderByClause(orderby.replace("-", " "));
        }
        PageHelper.startPage(page, 16);
        List<Warehouse> warehouseList = warehouseMapper.findAllWarehouse(warehouseExample);
        List<WarehouseVO> warehouseVOList = new ArrayList<>();
        for (Warehouse warehouse : warehouseList) {
            warehouseVOList.add(entityToVO(warehouse));
        }
        PageInfo<WarehouseVO> pageInfo = new PageInfo<>(warehouseVOList, 5);
        return Msg.success().add("result", pageInfo);
    }

    @Override
    public void addWhse(Warehouse warehouse) {
        warehouseMapper.insertSelective(warehouse);
    }

    @Override
    public Msg deleteWhseByWhseId(Warehouse warehouse) {
        warehouseMapper.deleteByPrimaryKey(warehouse.getWhseId());
        try {
            return Msg.success();
        } catch (Exception e) {
            LoggerUtils.error(WarehouseServiceImpl.class, "删除成功", e);
            return Msg.fail("删除失败");
        }
    }

    @Override
    public int deleteWhseByWhseId(Integer whseId) {
        return warehouseMapper.deleteByPrimaryKey(whseId);
    }

    @Override
    public void deleteWhseByWhseIds(List<Integer> ids) {
        WarehouseExample warehouseExample = new WarehouseExample();
        WarehouseExample.Criteria criteria = warehouseExample.createCriteria();
        criteria.andWhseIdIn(ids);
        warehouseMapper.deleteByExample(warehouseExample);
    }

    @Override
    public Msg updateWhse(Warehouse warehouse) {
        try {
            warehouseMapper.updateByPrimaryKey(warehouse);
            return Msg.success();
        } catch (Exception e) {
            LoggerUtils.error(WarehouseServiceImpl.class, "更新失败", e);
            return Msg.fail("更新失败");
        }
    }

    private WarehouseVO entityToVO(Warehouse warehouse) {
        WarehouseVO warehouseVO = new WarehouseVO();
        warehouseVO.setWhseId(warehouse.getWhseId());
        warehouseVO.setUserNumber(warehouse.getUserNumber());
        warehouseVO.setWhseAddress(warehouse.getWhseAddress());
        warehouseVO.setWhseCapacity(warehouse.getWhseCapacity());
        warehouseVO.setWhseName(warehouse.getWhseName());
        warehouseVO.setWhseTel(warehouse.getWhseTel());
        return warehouseVO;
    }
}
