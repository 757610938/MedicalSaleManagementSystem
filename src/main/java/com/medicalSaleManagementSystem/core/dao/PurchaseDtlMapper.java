package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.POJO.PurchaseDtl;
import com.medicalSaleManagementSystem.core.bean.POJO.PurchaseDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDtlMapper {
    long countByExample(PurchaseDtlExample example);

    int deleteByExample(PurchaseDtlExample example);

    int deleteByPrimaryKey(Integer purDtlId);

    int insert(PurchaseDtl record);

    int insertSelective(PurchaseDtl record);

    List<PurchaseDtl> selectByExample(PurchaseDtlExample example);

    PurchaseDtl selectByPrimaryKey(Integer purDtlId);

    int updateByExampleSelective(@Param("record") PurchaseDtl record, @Param("example") PurchaseDtlExample example);

    int updateByExample(@Param("record") PurchaseDtl record, @Param("example") PurchaseDtlExample example);

    int updateByPrimaryKeySelective(PurchaseDtl record);

    int updateByPrimaryKey(PurchaseDtl record);
}