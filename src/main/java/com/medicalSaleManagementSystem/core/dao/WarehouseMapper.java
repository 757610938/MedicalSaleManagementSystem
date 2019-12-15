package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.core.model.entity.WarehouseExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface WarehouseMapper {
    long countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(Integer whseId);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectAll(WarehouseExample example);

    List<Warehouse> selectByExample(WarehouseExample example);

    /**
     * 通过仓库名查找仓库
     *
     * @param warehouseExample
     * @return
     */
    List<Warehouse> selectWhseByWhseName(WarehouseExample warehouseExample);

    Warehouse selectByPrimaryKey(Integer whseId);

    /**
     * 查询所有仓库信息并且作为首页列表展示
     *
     * @param warehouseExample
     * @return
     */
    List<Warehouse> findAllWarehouse(WarehouseExample warehouseExample);


    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);

    /**
     * 选择指定 warehouse ID 的 Warehouse 记录
     * @param whseId 仓库ID
     * @return 返回指定的Warehouse
     */
    Warehouse selectByID(Integer whseId);
}