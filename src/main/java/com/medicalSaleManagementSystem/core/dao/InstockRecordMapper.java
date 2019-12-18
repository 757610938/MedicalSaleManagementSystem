package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.BO.InstockBO;
import com.medicalSaleManagementSystem.core.model.entity.InstockRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockRecordMapper {
    long countByExample(InstockRecordExample example);

    int deleteByExample(InstockRecordExample example);

    int deleteByPrimaryKey(Integer instockId);

    int insert(InstockRecord record);

    int insertSelective(InstockRecord record);

    List<InstockRecord> selectByExample(InstockRecordExample example);

    InstockRecord selectByPrimaryKey(Integer instockId);

    int updateByExampleSelective(@Param("record") InstockRecord record, @Param("example") InstockRecordExample example);

    int updateByExample(@Param("record") InstockRecord record, @Param("example") InstockRecordExample example);

    int updateByPrimaryKeySelective(InstockRecord record);

    int updateByPrimaryKey(InstockRecord record);


    InstockBO selectInstockAndDtlByInstockNumber(String instockNumber);

    InstockBO selectInstockByInstockNumber(String instockNumber);

    List<InstockBO> selectByFuzzySearch(String instockNumber);

    List<InstockRecord> selectAllInstock();

    List<InstockBO> selectAllInstockAndDtl();

    List<Integer> selectAllInstockNumber();
}