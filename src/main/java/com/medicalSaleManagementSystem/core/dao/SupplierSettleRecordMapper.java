package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.entity.SupplierSettleRecord;
import com.medicalSaleManagementSystem.core.bean.entity.SupplierSettleRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierSettleRecordMapper {
    long countByExample(SupplierSettleRecordExample example);

    int deleteByExample(SupplierSettleRecordExample example);

    int deleteByPrimaryKey(Integer supplierSettleId);

    int insert(SupplierSettleRecord record);

    int insertSelective(SupplierSettleRecord record);

    List<SupplierSettleRecord> selectByExample(SupplierSettleRecordExample example);

    SupplierSettleRecord selectByPrimaryKey(Integer supplierSettleId);

    int updateByExampleSelective(@Param("record") SupplierSettleRecord record, @Param("example") SupplierSettleRecordExample example);

    int updateByExample(@Param("record") SupplierSettleRecord record, @Param("example") SupplierSettleRecordExample example);

    int updateByPrimaryKeySelective(SupplierSettleRecord record);

    int updateByPrimaryKey(SupplierSettleRecord record);
}