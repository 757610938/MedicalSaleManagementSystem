package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.bean.entity.CustomerSettleRecord;
import com.medicalSaleManagementSystem.core.bean.entity.CustomerSettleRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerSettleRecordMapper {
    long countByExample(CustomerSettleRecordExample example);

    int deleteByExample(CustomerSettleRecordExample example);

    int deleteByPrimaryKey(Integer custSettleId);

    int insert(CustomerSettleRecord record);

    int insertSelective(CustomerSettleRecord record);

    List<CustomerSettleRecord> selectByExample(CustomerSettleRecordExample example);

    CustomerSettleRecord selectByPrimaryKey(Integer custSettleId);

    int updateByExampleSelective(@Param("record") CustomerSettleRecord record, @Param("example") CustomerSettleRecordExample example);

    int updateByExample(@Param("record") CustomerSettleRecord record, @Param("example") CustomerSettleRecordExample example);

    int updateByPrimaryKeySelective(CustomerSettleRecord record);

    int updateByPrimaryKey(CustomerSettleRecord record);
}