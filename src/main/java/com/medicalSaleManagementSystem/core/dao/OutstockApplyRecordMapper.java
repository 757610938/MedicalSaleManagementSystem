package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockApplyRecordMapper {
    long countByExample(OutstockApplyRecordExample example);

    int deleteByExample(OutstockApplyRecordExample example);

    int deleteByPrimaryKey(Integer outstockApplyId);

    int insert(OutstockApplyRecord record);

    int insertSelective(OutstockApplyRecord record);

    List<OutstockApplyRecord> selectByExample(OutstockApplyRecordExample example);

    OutstockApplyRecord selectByPrimaryKey(Integer outstockApplyId);

    int updateByExampleSelective(@Param("record") OutstockApplyRecord record, @Param("example") OutstockApplyRecordExample example);

    int updateByExample(@Param("record") OutstockApplyRecord record, @Param("example") OutstockApplyRecordExample example);

    int updateByPrimaryKeySelective(OutstockApplyRecord record);

    int updateByPrimaryKey(OutstockApplyRecord record);

    List<OutstockApplyRecord> selectAll(OutstockApplyRecordExample outstockApplyRecordExample);


}