package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.OutstocDtl;
import com.medicalSaleManagementSystem.core.model.entity.OutstocDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstocDtlMapper {
    long countByExample(OutstocDtlExample example);

    int deleteByExample(OutstocDtlExample example);

    int deleteByPrimaryKey(Integer outstockDtlId);

    int insert(OutstocDtl record);

    int insertSelective(OutstocDtl record);

    List<OutstocDtl> selectByExample(OutstocDtlExample example);

    OutstocDtl selectByPrimaryKey(Integer outstockDtlId);

    int updateByExampleSelective(@Param("record") OutstocDtl record, @Param("example") OutstocDtlExample example);

    int updateByExample(@Param("record") OutstocDtl record, @Param("example") OutstocDtlExample example);

    int updateByPrimaryKeySelective(OutstocDtl record);

    int updateByPrimaryKey(OutstocDtl record);
}