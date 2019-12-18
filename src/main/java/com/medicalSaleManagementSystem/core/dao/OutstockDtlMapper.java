package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.OutstockDtl;
import com.medicalSaleManagementSystem.core.model.entity.OutstockDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutstockDtlMapper {
    long countByExample(OutstockDtlExample example);

    int deleteByExample(OutstockDtlExample example);

    int deleteByPrimaryKey(Integer outstockDtlId);

    int insert(OutstockDtl record);

    int insertSelective(OutstockDtl record);

    List<OutstockDtl> selectByExample(OutstockDtlExample example);

    OutstockDtl selectByPrimaryKey(Integer outstockDtlId);

    int updateByExampleSelective(@Param("record") OutstockDtl record, @Param("example") OutstockDtlExample example);

    int updateByExample(@Param("record") OutstockDtl record, @Param("example") OutstockDtlExample example);

    int updateByPrimaryKeySelective(OutstockDtl record);

    int updateByPrimaryKey(OutstockDtl record);
}