package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.DTO.MedicineDTO;
import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.core.bean.POJO.Medicine;
import com.medicalSaleManagementSystem.core.bean.POJO.MedicineExample;
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
    public Msg findMedicineByName(String name) {
        MedicineExample medicineExample = new MedicineExample();
        MedicineExample.Criteria criteria = medicineExample.createCriteria();
        criteria.andMedicineNameEqualTo(name);
        List<Medicine> medicineList = medicineMapper.selectByExample(medicineExample);
        if (medicineList.size() == 0) {
            //数据库中没有该账号
            return Msg.fail("该药品不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("medicineList", medicineList);
        }
    }

    /**
     * 通过名称模糊查询数据库
     * @param name
     * @return msg
     * @author 林贤钦
     */
    @Override
    public Msg vagueFindMedicineByName(String name) {
        MedicineExample medicineExample = new MedicineExample();
        MedicineExample.Criteria criteria = medicineExample.createCriteria();
        criteria.andMedicineNameLike(name);
        List<Medicine> medicineList = medicineMapper.selectByExample(medicineExample);
        if (medicineList.size() == 0) {
            //数据库中没有该账号
            return Msg.fail("该药品不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("medicineList", medicineList);
        }
    }

    /**
     * 通过id查找药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    @Override
    public Msg findMedicineById(Integer id) {
        Medicine medicine =  medicineMapper.selectByPrimaryKey(id);
        if (medicine == null) {
            //数据库中没有该账号
            return Msg.fail("该药品信息不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("medicine", medicine);
        }
    }
    /**
     * 注册药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    @Override
    public Msg registerMedicine(MedicineDTO medicineDTO) {
        try {
            Medicine medicine = new Medicine();
            BeanUtilEx.copyProperties(medicine,medicineDTO);
            medicineMapper.insertSelective(medicine);
        }catch (Exception e){
            return Msg.fail("注册药品信息失败，请重新注册");
        }
        return Msg.success();
    }
    /**
     * 通过客户id删除药品信息
     * @param id
     * @return msg
     * @author 林贤钦
     */
    @Override
    public Msg deleteMedicineById(Integer id) {
        try {
            medicineMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            return Msg.fail("删除药品信息失败，请重新删除");
        }
        return Msg.success();
    }

    /**
     * 更新药品信息
     * @param medicineDTO
     * @return msg
     * @author 林贤钦
     */
    @Override
    public Msg updateMedicine(MedicineDTO medicineDTO) {
        if (medicineDTO.getMedicineId() == null || medicineDTO.getMedicineId() <= 0){
            return Msg.fail("药品id非法");
        }
        try{
            Medicine medicine = new Medicine();
            BeanUtilEx.copyProperties(medicine,medicineDTO);
            medicineMapper.updateByPrimaryKeySelective(medicine);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }

}
