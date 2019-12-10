package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.InstockCheckRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockCheckRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockCheckRecordMapper {
    long countByExample(InstockCheckRecordExample example);

    int deleteByExample(InstockCheckRecordExample example);

    int deleteByPrimaryKey(Integer instockCheckId);

    int insert(InstockCheckRecord record);

    int insertSelective(InstockCheckRecord record);

    List<InstockCheckRecord> selectByExample(InstockCheckRecordExample example);

    int updateByExampleSelective(@Param("record") InstockCheckRecord record, @Param("example") InstockCheckRecordExample example);

    int updateByExample(@Param("record") InstockCheckRecord record, @Param("example") InstockCheckRecordExample example);
}