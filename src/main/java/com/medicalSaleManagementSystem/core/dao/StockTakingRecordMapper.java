package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.StockTakingRecord;
import com.medicalSaleManagementSystem.core.model.entity.StockTakingRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockTakingRecordMapper {
    long countByExample(StockTakingRecordExample example);

    int deleteByExample(StockTakingRecordExample example);

    int deleteByPrimaryKey(Integer stockTakingId);

    int insert(StockTakingRecord record);

    int insertSelective(StockTakingRecord record);

    List<StockTakingRecord> selectByExample(StockTakingRecordExample example);

    StockTakingRecord selectByPrimaryKey(Integer stockTakingId);

    int updateByExampleSelective(@Param("record") StockTakingRecord record, @Param("example") StockTakingRecordExample example);

    int updateByExample(@Param("record") StockTakingRecord record, @Param("example") StockTakingRecordExample example);

    int updateByPrimaryKeySelective(StockTakingRecord record);

    int updateByPrimaryKey(StockTakingRecord record);
}