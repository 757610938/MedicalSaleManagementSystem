package com.medicalSaleManagementSystem.core.dao;



import com.medicalSaleManagementSystem.core.model.entity.Supplier;
import com.medicalSaleManagementSystem.core.model.entity.SupplierExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer supplierId);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer supplierId);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    List<Integer> getAllPrimaryKey();
}