package com.medicalSaleManagementSystem.core.dao;

import com.medicalSaleManagementSystem.core.model.BO.MedicineBO;
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

    List<MedicineBO> getAll();

    List<MedicineBO> vagueSelectByPrimaryName(String keyword);

    /**
     * 选择指定 id 的 medicine
     * @param medicineId 药品的ID
     * @return 返回执行ID对应的medicine
     */
    Medicine selectById(Integer medicineId);

}