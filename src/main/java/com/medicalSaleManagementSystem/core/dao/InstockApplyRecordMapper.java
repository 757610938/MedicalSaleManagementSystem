package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.InstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockApplyRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockApplyRecordMapper {
    long countByExample(InstockApplyRecordExample example);

    int deleteByExample(InstockApplyRecordExample example);

    int deleteByPrimaryKey(Integer instockApplyId);

    int insert(InstockApplyRecord record);

    int insertSelective(InstockApplyRecord record);

    List<InstockApplyRecord> selectByExample(InstockApplyRecordExample example);

    InstockApplyRecord selectByPrimaryKey(Integer instockApplyId);

    int updateByExampleSelective(@Param("record") InstockApplyRecord record, @Param("example") InstockApplyRecordExample example);

    int updateByExample(@Param("record") InstockApplyRecord record, @Param("example") InstockApplyRecordExample example);

    int updateByPrimaryKeySelective(InstockApplyRecord record);

    int updateByPrimaryKey(InstockApplyRecord record);
}