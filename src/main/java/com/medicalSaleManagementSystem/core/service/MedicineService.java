package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
import com.medicalSaleManagementSystem.util.message.Msg;

public interface MedicineService {
    /**
     * 查找数据库是否存在该药品名称
     * @param name
     * @return msg
     * @author 林贤钦
     */
    Msg findMedicineByName(String name);

    /**
     * 通过名称模糊查询数据库
     * @param name
     * @return msg
     * @author 林贤钦
     */
    Msg vagueFindMedicineByName(String name);

    /**
     * 通过id查找药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    Msg findMedicineById(Integer id);
    /**
     * 注册药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    Msg registerMedicine(MedicineDTO medicineDTO);
    /**
     * 通过客户id删除药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    Msg deleteMedicineById(Integer id);
    /**
     * 更新药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    Msg updateMedicine(MedicineDTO medicineDTO);

    /**
     * 查询所有药品信息
     * @return msg
     * @author 林贤钦
     */
    Msg findAllMedicine();
}
