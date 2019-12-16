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
    private WarehouseMapper warehouseMapper;

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
    public Resp findWhseById(WarehouseVO warehouseVO) {
        if(warehouseVO.getWhseId()!=null) {
            Warehouse warehouse = warehouseMapper.selectByPrimaryKey(warehouseVO.getWhseId());
            if(warehouse.getWhseId()!=null){
                WarehouseVO result = entityToVO(warehouse);
                Map<String,Object> ext=new HashMap<>();
                ext.put("result",result);
                return Resp.httpStatus(HttpStatus.OK,"查询仓库信息成功",ext);
            }
        }
        return Resp.fail("找不到该仓库");
    }

    @Override
    public Resp findWhseById(Integer whseId) {

        return null;
    }

    @Override
    public Resp findWhseByFuzzySearch(String key, Integer pageNum,Integer pageSize) {
        WarehouseExample warehouseExample = new WarehouseExample();
        PageHelper.startPage(pageNum, pageSize);
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
        return warehouseMapper.selectAll(null);
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
    public Resp updateWhse(WarehouseVO warehouseVO) {
        try {
            if (warehouseVO.getWhseId() == null || warehouseVO.getWhseId() <= 0) {
                return Resp.fail("当前仓库ID为非法ID");
            }
            Warehouse warehouse = warehouseVOToEntity(warehouseVO);
            WarehouseExample warehouseExample = new WarehouseExample();
            WarehouseExample.Criteria criteria = warehouseExample.createCriteria();
            criteria.andWhseIdEqualTo(warehouse.getWhseId());
            List<Warehouse> warehouseList = warehouseMapper.selectByExample(warehouseExample);
            warehouse.setWhseId(warehouseList.get(0).getWhseId());
            warehouseMapper.updateByPrimaryKeySelective(warehouse);
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.fail("修改失败，请重新再试一次");
        }
        return Resp.success("更新成功");
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

    private Warehouse warehouseVOToEntity(WarehouseVO warehouseVO) {
        Warehouse warehouse = new Warehouse();
        if (warehouseVO.getWhseId() != null) {
            warehouse.setWhseId(warehouseVO.getWhseId());
        }
        if (warehouseVO.getUserNumber() != null && !"".equals(warehouseVO.getUserNumber())) {
            warehouse.setUserNumber(warehouseVO.getUserNumber());
        }
        if (warehouseVO.getWhseAddress() != null && !"".equals(warehouseVO.getWhseAddress())) {
            warehouse.setWhseAddress(warehouseVO.getWhseAddress());
        }
        if (warehouseVO.getWhseCapacity() != null && !"".equals(warehouseVO.getWhseCapacity())) {
            warehouse.setWhseCapacity(warehouseVO.getWhseCapacity());
        }
        if (warehouseVO.getWhseName() != null && !"".equals(warehouseVO.getWhseName())) {
            warehouse.setWhseName(warehouseVO.getWhseName());
        }
        if (warehouseVO.getWhseTel() != null && !"".equals(warehouseVO.getWhseTel())) {
            warehouse.setWhseTel(warehouseVO.getWhseTel());
        }
        return warehouse;
    }
}
