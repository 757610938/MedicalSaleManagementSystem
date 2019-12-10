package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.StockTakingDtl;
import com.medicalSaleManagementSystem.core.model.entity.StockTakingDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockTakingDtlMapper {
    long countByExample(StockTakingDtlExample example);

    int deleteByExample(StockTakingDtlExample example);

    int deleteByPrimaryKey(Integer stockTakingDtlId);

    int insert(StockTakingDtl record);

    int insertSelective(StockTakingDtl record);

    List<StockTakingDtl> selectByExample(StockTakingDtlExample example);

    StockTakingDtl selectByPrimaryKey(Integer stockTakingDtlId);

    int updateByExampleSelective(@Param("record") StockTakingDtl record, @Param("example") StockTakingDtlExample example);

    int updateByExample(@Param("record") StockTakingDtl record, @Param("example") StockTakingDtlExample example);

    int updateByPrimaryKeySelective(StockTakingDtl record);

    int updateByPrimaryKey(StockTakingDtl record);
}