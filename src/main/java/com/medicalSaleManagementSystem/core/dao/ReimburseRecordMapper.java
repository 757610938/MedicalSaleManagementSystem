package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.ReimburseRecord;
import com.medicalSaleManagementSystem.core.model.entity.ReimburseRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReimburseRecordMapper {
    long countByExample(ReimburseRecordExample example);

    int deleteByExample(ReimburseRecordExample example);

    int deleteByPrimaryKey(Integer reimburseId);

    int insert(ReimburseRecord record);

    int insertSelective(ReimburseRecord record);

    List<ReimburseRecord> selectByExample(ReimburseRecordExample example);

    ReimburseRecord selectByPrimaryKey(Integer reimburseId);

    int updateByExampleSelective(@Param("record") ReimburseRecord record, @Param("example") ReimburseRecordExample example);

    int updateByExample(@Param("record") ReimburseRecord record, @Param("example") ReimburseRecordExample example);

    int updateByPrimaryKeySelective(ReimburseRecord record);

    int updateByPrimaryKey(ReimburseRecord record);
}