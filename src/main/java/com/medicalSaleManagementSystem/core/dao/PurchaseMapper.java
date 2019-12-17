package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.BO.PurchaseBO;
import com.medicalSaleManagementSystem.core.model.entity.Purchase;
import com.medicalSaleManagementSystem.core.model.entity.PurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PurchaseMapper {
    long countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer purId);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer purId);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);

    List<Integer> getAllPurOrderId();

    List<PurchaseBO> getAllAndDtl();
    
    List<Purchase> getAll();

    List<PurchaseBO> getAllByUserNumber(String userNumber);

    PurchaseBO selectPurAndDtlByPurOrderId(String purOrderId);

    PurchaseBO selectPurByPurOrderId(String purOrderId);

    List<PurchaseBO> getAllByPurStatusAndKeyword(@Param("purStatus")String purStatus,@Param("Keyword") String Keyword);
}