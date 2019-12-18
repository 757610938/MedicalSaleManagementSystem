package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.BO.OutstockBO;
import com.medicalSaleManagementSystem.core.model.entity.OutstockRecord;
import com.medicalSaleManagementSystem.core.model.entity.OutstockRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockRecordMapper {
    long countByExample(OutstockRecordExample example);

    int deleteByExample(OutstockRecordExample example);

    int deleteByPrimaryKey(Integer outstockId);

    int insert(OutstockRecord record);

    int insertSelective(OutstockRecord record);

    List<OutstockRecord> selectByExample(OutstockRecordExample example);

    OutstockRecord selectByPrimaryKey(Integer outstockId);

    int updateByExampleSelective(@Param("record") OutstockRecord record, @Param("example") OutstockRecordExample example);

    int updateByExample(@Param("record") OutstockRecord record, @Param("example") OutstockRecordExample example);

    int updateByPrimaryKeySelective(OutstockRecord record);

    int updateByPrimaryKey(OutstockRecord record);



    OutstockBO selectOutstockAndDtlByOutstockNumber(String outstockNumber);

    OutstockBO selectOutstockByOutstockNumber(String outstockNumber);

    List<OutstockBO> selectByFuzzySearch(String outstockNumber);

    List<OutstockRecord> selectAllOutstock();

    List<OutstockBO> selectAllOutstockAndDtl();

    List<Integer> selectAllOutstockNumber();
}