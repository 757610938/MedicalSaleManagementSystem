package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.entity.PurchaseDtlStatus;
import com.medicalSaleManagementSystem.core.bean.entity.PurchaseDtlStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseDtlStatusMapper {
    long countByExample(PurchaseDtlStatusExample example);

    int deleteByExample(PurchaseDtlStatusExample example);

    int deleteByPrimaryKey(Integer purDtlStatusId);

    int insert(PurchaseDtlStatus record);

    int insertSelective(PurchaseDtlStatus record);

    List<PurchaseDtlStatus> selectByExample(PurchaseDtlStatusExample example);

    PurchaseDtlStatus selectByPrimaryKey(Integer purDtlStatusId);

    int updateByExampleSelective(@Param("record") PurchaseDtlStatus record, @Param("example") PurchaseDtlStatusExample example);

    int updateByExample(@Param("record") PurchaseDtlStatus record, @Param("example") PurchaseDtlStatusExample example);

    int updateByPrimaryKeySelective(PurchaseDtlStatus record);

    int updateByPrimaryKey(PurchaseDtlStatus record);
}