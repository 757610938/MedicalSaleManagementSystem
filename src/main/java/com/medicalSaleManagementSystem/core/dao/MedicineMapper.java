package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.entity.Medicine;
import com.medicalSaleManagementSystem.core.model.entity.MedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicineMapper {
    long countByExample(MedicineExample example);

    int deleteByExample(MedicineExample example);

    int deleteByPrimaryKey(Integer medicineId);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    List<Medicine> selectByExample(MedicineExample example);

    Medicine selectByPrimaryKey(Integer medicineId);

    int updateByExampleSelective(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByExample(@Param("record") Medicine record, @Param("example") MedicineExample example);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}