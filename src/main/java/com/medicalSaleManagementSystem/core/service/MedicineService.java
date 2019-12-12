package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
import com.medicalSaleManagementSystem.core.model.entity.Medicine;
import com.medicalSaleManagementSystem.util.message.Msg;

import java.util.List;

public interface MedicineService {
    /**
     * 查找数据库是否存在该药品名称
     * @param name
     * @return msg
     * @author 林贤钦
     */
    List<Medicine> selectByPrimaryName(String name);

    /**
     * 通过名称模糊查询数据库
     * @param name
     * @return msg
     * @author 林贤钦
     */
    List<Medicine> vagueSelectByPrimaryName(String name);

    /**
     * 通过id查找药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    Medicine selectByPrimaryKey(Integer id);

    /**
     * 注册药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    int insertSelective(MedicineDTO medicineDTO);

    /**
     * 通过客户id删除药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 更新药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    int updateByPrimaryKeySelective(MedicineDTO medicineDTO);

    /**
     * 查询所有药品信息
     * @return msg
     * @author 林贤钦
     */
    List<Medicine> getAll();
}
