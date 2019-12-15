package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.instockRelation;
import com.medicalSaleManagementSystem.core.model.entity.instockRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface instockRelationMapper {
    long countByExample(instockRelationExample example);

    int deleteByExample(instockRelationExample example);

    int deleteByPrimaryKey(Integer instockRelationId);

    int insert(instockRelation record);

    int insertSelective(instockRelation record);

    List<instockRelation> selectByExample(instockRelationExample example);

    instockRelation selectByPrimaryKey(Integer instockRelationId);

    int updateByExampleSelective(@Param("record") instockRelation record, @Param("example") instockRelationExample example);

    int updateByExample(@Param("record") instockRelation record, @Param("example") instockRelationExample example);

    int updateByPrimaryKeySelective(instockRelation record);

    int updateByPrimaryKey(instockRelation record);
}