package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.InstockDtl;
import com.medicalSaleManagementSystem.core.model.entity.InstockDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstockDtlMapper {
    long countByExample(InstockDtlExample example);

    int deleteByExample(InstockDtlExample example);

    int deleteByPrimaryKey(Integer instockDtlId);

    int insert(InstockDtl record);

    int insertSelective(InstockDtl record);

    List<InstockDtl> selectByExample(InstockDtlExample example);

    InstockDtl selectByPrimaryKey(Integer instockDtlId);

    int updateByExampleSelective(@Param("record") InstockDtl record, @Param("example") InstockDtlExample example);

    int updateByExample(@Param("record") InstockDtl record, @Param("example") InstockDtlExample example);

    int updateByPrimaryKeySelective(InstockDtl record);

    int updateByPrimaryKey(InstockDtl record);
}