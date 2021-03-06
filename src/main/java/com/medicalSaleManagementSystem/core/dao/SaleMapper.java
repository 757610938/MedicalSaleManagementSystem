package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.BO.SaleBO;
import com.medicalSaleManagementSystem.core.model.entity.Sale;
import com.medicalSaleManagementSystem.core.model.entity.SaleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
public interface SaleMapper {
    long countByExample(SaleExample example);

    int deleteByExample(SaleExample example);

    int deleteByPrimaryKey(Integer saleId);

    int insert(Sale record);

    int insertSelective(Sale record);

    List<Sale> selectByExample(SaleExample example);

    Sale selectByPrimaryKey(Integer saleId);

    int updateByExampleSelective(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByExample(@Param("record") Sale record, @Param("example") SaleExample example);

    int updateByPrimaryKeySelective(Sale record);

    int updateByPrimaryKey(Sale record);

    SaleBO selectSaleAndDtlBySaleOrderId(String SaleOrderId);

    SaleBO selectSaleBySaleOrderId(String SaleOrderId);

    List<Sale> getAllSale();

}