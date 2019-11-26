package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.entity.SaleDtl;
import com.medicalSaleManagementSystem.core.bean.entity.SaleDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleDtlMapper {
    long countByExample(SaleDtlExample example);

    int deleteByExample(SaleDtlExample example);

    int deleteByPrimaryKey(Integer saleDtlId);

    int insert(SaleDtl record);

    int insertSelective(SaleDtl record);

    List<SaleDtl> selectByExample(SaleDtlExample example);

    SaleDtl selectByPrimaryKey(Integer saleDtlId);

    int updateByExampleSelective(@Param("record") SaleDtl record, @Param("example") SaleDtlExample example);

    int updateByExample(@Param("record") SaleDtl record, @Param("example") SaleDtlExample example);

    int updateByPrimaryKeySelective(SaleDtl record);

    int updateByPrimaryKey(SaleDtl record);
}