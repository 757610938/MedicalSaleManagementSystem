package com.medicalSaleManagementSystem.core.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.medicalSaleManagementSystem.core.dao.WarehouseMapper;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.model.entity.WarehouseExample;
import com.medicalSaleManagementSystem.core.service.WarehouseService;
import com.medicalSaleManagementSystem.util.LoggerUtils;
import com.medicalSaleManagementSystem.util.message.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    WarehouseMapper warehouseMapper;

    @Override
    public Warehouse findWhseByWhseId(Integer whseId) {
        try {
            return warehouseMapper.selectByPrimaryKey(whseId);
        } catch (Exception e) {
            LoggerUtils.error(WarehouseServiceImpl.class,"查询失败",e);
            return null;
        }
    }

    @Override
    public Msg findWhseByFuzzySearch(String key, String orderBy, Integer page) {
        WarehouseExample warehouseExample = new WarehouseExample();
        if (orderBy != null && !"".equals(orderBy)){
            warehouseExample.setOrderByClause(orderBy.replace("-"," "));
        }
        PageHelper.startPage(page,10);
        key="%"+key+"%";
        warehouseExample.setWhseName(key);
        List<Warehouse> warehouseList=warehouseMapper.selectWhseByWhseName(warehouseExample);
        if (warehouseList.size()<=0){
            return Msg.fail("查询出错");
        }
        List<WarehouseVO> warehouseVOList = new ArrayList<>();
        for (Warehouse warehouse : warehouseList) {
            warehouseVOList.add(entityToVO(warehouse));
        }
        PageInfo<WarehouseVO> pageInfo = new PageInfo<>(warehouseVOList, 5);
        return Msg.success().add("result", pageInfo);

    }

    @Override
    public List<Warehouse> findAllWhse() {
        return null;
    }

    @Override
    public Msg addWhse(Warehouse warehouse) {
        return null;
    }

    @Override
    public Msg deleteWhseByWhseId(Warehouse warehouse) {
        return null;
    }

    @Override
    public int deleteWhseByWhseId(Integer whseId) {
        return 0;
    }

    @Override
    public void deleteWhseByWhseIds(List<Integer> ids) {

    }

    @Override
    public Msg updateWhse(Warehouse warehouse) {
        return null;
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
