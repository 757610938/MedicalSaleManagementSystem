package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.POJO.OutstocRecord;
import com.medicalSaleManagementSystem.core.bean.POJO.OutstocRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstocRecordMapper {
    long countByExample(OutstocRecordExample example);

    int deleteByExample(OutstocRecordExample example);

    int deleteByPrimaryKey(Integer outstockId);

    int insert(OutstocRecord record);

    int insertSelective(OutstocRecord record);

    List<OutstocRecord> selectByExample(OutstocRecordExample example);

    OutstocRecord selectByPrimaryKey(Integer outstockId);

    int updateByExampleSelective(@Param("record") OutstocRecord record, @Param("example") OutstocRecordExample example);

    int updateByExample(@Param("record") OutstocRecord record, @Param("example") OutstocRecordExample example);

    int updateByPrimaryKeySelective(OutstocRecord record);

    int updateByPrimaryKey(OutstocRecord record);
}