package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.model.BO.MedicineBO;
import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
import com.medicalSaleManagementSystem.core.model.entity.Medicine;
import com.medicalSaleManagementSystem.core.model.entity.MedicineExample;
import com.medicalSaleManagementSystem.core.dao.MedicineMapper;
import com.medicalSaleManagementSystem.core.service.MedicineService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    MedicineMapper medicineMapper;
    /**
     * 查找数据库是否存在该药品名称
     * @param name
     * @return msg
     * @author 林贤钦
     */
    @Override
    public List<Medicine> selectByPrimaryName(String name) {
        MedicineExample medicineExample = new MedicineExample();
        MedicineExample.Criteria criteria = medicineExample.createCriteria();
        criteria.andMedicineNameEqualTo(name);
        return medicineMapper.selectByExample(medicineExample);
    }

    /**
     * 通过名称模糊查询数据库
     * @param name
     * @return msg
     * @author 林贤钦
     */
    @Override
    public List<Medicine> vagueSelectByPrimaryName(String name) {
        MedicineExample medicineExample = new MedicineExample();
        MedicineExample.Criteria criteria = medicineExample.createCriteria();
        criteria.andMedicineNameLike("%"+name+"%");
        return medicineMapper.selectByExample(medicineExample);
    }

    /**
     * 通过id查找药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    @Override
    public Medicine selectByPrimaryKey(Integer id) {
        try {
            return  medicineMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }
    /**
     * 注册药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    @Override
    public int insertSelective(MedicineDTO medicineDTO) {
        try {
            Medicine medicine = new Medicine();
            BeanUtilEx.copyProperties(medicine,medicineDTO);
            return medicineMapper.insertSelective(medicine);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
    /**
     * 通过客户id删除药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    @Override
    public int deleteByPrimaryKey(Integer id){
        try {
            return medicineMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 更新药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    @Override
    public int updateByPrimaryKeySelective(MedicineDTO medicineDTO){
        if (medicineDTO.getMedicineId() == null || medicineDTO.getMedicineId() <= 0){
            return 0;
        }
        try{
            Medicine medicine = new Medicine();
            BeanUtilEx.copyProperties(medicine,medicineDTO);
            return medicineMapper.updateByPrimaryKeySelective(medicine);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public  List<MedicineBO> getAll() {
        return medicineMapper.getAll();
    }
}
