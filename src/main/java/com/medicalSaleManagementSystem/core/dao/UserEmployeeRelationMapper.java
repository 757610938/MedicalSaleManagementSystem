package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.UserEmployeeRelation;
import com.medicalSaleManagementSystem.core.model.entity.UserEmployeeRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserEmployeeRelationMapper {
    long countByExample(UserEmployeeRelationExample example);

    int deleteByExample(UserEmployeeRelationExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(UserEmployeeRelation record);

    int insertSelective(UserEmployeeRelation record);

    List<UserEmployeeRelation> selectByExample(UserEmployeeRelationExample example);

    UserEmployeeRelation selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") UserEmployeeRelation record, @Param("example") UserEmployeeRelationExample example);

    int updateByExample(@Param("record") UserEmployeeRelation record, @Param("example") UserEmployeeRelationExample example);

    int updateByPrimaryKeySelective(UserEmployeeRelation record);

    int updateByPrimaryKey(UserEmployeeRelation record);
}