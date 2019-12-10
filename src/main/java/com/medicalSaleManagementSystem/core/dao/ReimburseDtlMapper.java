package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.ReimburseDtl;
import com.medicalSaleManagementSystem.core.model.entity.ReimburseDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReimburseDtlMapper {
    long countByExample(ReimburseDtlExample example);

    int deleteByExample(ReimburseDtlExample example);

    int deleteByPrimaryKey(Integer reimburseDtlId);

    int insert(ReimburseDtl record);

    int insertSelective(ReimburseDtl record);

    List<ReimburseDtl> selectByExample(ReimburseDtlExample example);

    ReimburseDtl selectByPrimaryKey(Integer reimburseDtlId);

    int updateByExampleSelective(@Param("record") ReimburseDtl record, @Param("example") ReimburseDtlExample example);

    int updateByExample(@Param("record") ReimburseDtl record, @Param("example") ReimburseDtlExample example);

    int updateByPrimaryKeySelective(ReimburseDtl record);

    int updateByPrimaryKey(ReimburseDtl record);
}