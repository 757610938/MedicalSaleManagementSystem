package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.POJO.SaleDtlStatus;
import com.medicalSaleManagementSystem.core.bean.POJO.SaleDtlStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaleDtlStatusMapper {
    long countByExample(SaleDtlStatusExample example);

    int deleteByExample(SaleDtlStatusExample example);

    int deleteByPrimaryKey(Integer saleDtlStatusId);

    int insert(SaleDtlStatus record);

    int insertSelective(SaleDtlStatus record);

    List<SaleDtlStatus> selectByExample(SaleDtlStatusExample example);

    SaleDtlStatus selectByPrimaryKey(Integer saleDtlStatusId);

    int updateByExampleSelective(@Param("record") SaleDtlStatus record, @Param("example") SaleDtlStatusExample example);

    int updateByExample(@Param("record") SaleDtlStatus record, @Param("example") SaleDtlStatusExample example);

    int updateByPrimaryKeySelective(SaleDtlStatus record);

    int updateByPrimaryKey(SaleDtlStatus record);
}