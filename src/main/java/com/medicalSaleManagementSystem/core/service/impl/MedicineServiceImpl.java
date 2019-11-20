package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.DTO.MedicineDTO;
import com.medicalSaleManagementSystem.core.bean.DTO.Msg;
import com.medicalSaleManagementSystem.core.bean.POJO.Medicine;
import com.medicalSaleManagementSystem.core.bean.POJO.MedicineExample;
import com.medicalSaleManagementSystem.core.dao.MedicineMapper;
import com.medicalSaleManagementSystem.core.service.MedicineService;
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
        Medicine medicine = medicineDtoToPojo(medicineDTO);
        try {
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
        Medicine medicine = medicineDtoToPojo(medicineDTO);
        try{
            medicineMapper.updateByPrimaryKeySelective(medicine);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }
    /**
     * DTO转换成POJO
     *
     * @param medicineDTO
     * @return medicine
     * @author 林贤钦
     */
    private Medicine medicineDtoToPojo(MedicineDTO medicineDTO){
        Medicine medicine = new Medicine();
        if (medicineDTO.getMedicineId() != null && !"".equals(medicineDTO.getMedicineId())){
            medicine.setMedicineId(medicineDTO.getMedicineId());
        }
        if (medicineDTO.getMedicineApprovalNumber() != null && !"".equals(medicineDTO.getMedicineApprovalNumber())){
            medicine.setMedicineApprovalNumber(medicineDTO.getMedicineApprovalNumber());
        }
        if (medicineDTO.getMedicineName() != null && !"".equals(medicineDTO.getMedicineName())){
            medicine.setMedicineName(medicineDTO.getMedicineName());
        }
        if (medicineDTO.getMedicineEnglishName() != null && !"".equals(medicineDTO.getMedicineEnglishName())){
            medicine.setMedicineEnglishName(medicineDTO.getMedicineEnglishName());
        }
        if (medicineDTO.getMedicineDosageformCategory() != null && !"".equals(medicineDTO.getMedicineDosageformCategory())){
            medicine.setMedicineDosageformCategory(medicineDTO.getMedicineDosageformCategory());
        }
        if (medicineDTO.getMedicineManufacturer() != null && !"".equals(medicineDTO.getMedicineManufacturer())){
            medicine.setMedicineManufacturer(medicineDTO.getMedicineManufacturer());
        }
        if (medicineDTO.getMedicineSpecification() != null && !"".equals(medicineDTO.getMedicineSpecification())){
            medicine.setMedicineSpecification(medicineDTO.getMedicineSpecification());
        }
        if (medicineDTO.getMedicineManufacturingAddress() != null && !"".equals(medicineDTO.getMedicineManufacturingAddress())){
            medicine.setMedicineManufacturingAddress(medicineDTO.getMedicineManufacturingAddress());
        }
        if (medicineDTO.getMedicineCategory() != null && !"".equals(medicineDTO.getMedicineCategory())){
            medicine.setMedicineCategory(medicineDTO.getMedicineCategory());
        }
        if (medicineDTO.getMedicineApprovaldate() != null && !"".equals(medicineDTO.getMedicineApprovaldate())){
            medicine.setMedicineApprovaldate(medicineDTO.getMedicineApprovaldate());
        }
        if (medicineDTO.getMedicineOriginalApprovalNumber() != null && !"".equals(medicineDTO.getMedicineOriginalApprovalNumber())){
            medicine.setMedicineOriginalApprovalNumber(medicineDTO.getMedicineOriginalApprovalNumber());
        }
        if (medicineDTO.getMedicineSuppliersId() != null && !"".equals(medicineDTO.getMedicineSuppliersId())){
            medicine.setMedicineSuppliersId(medicineDTO.getMedicineSuppliersId());
        }
        if (medicineDTO.getMedicinePicture() != null && !"".equals(medicineDTO.getMedicinePicture())){
            medicine.setMedicinePicture(medicineDTO.getMedicinePicture());
        }
        if (medicineDTO.getMedicineStockAmount() != null && !"".equals(medicineDTO.getMedicineStockAmount())){
            medicine.setMedicineStockAmount(medicineDTO.getMedicineStockAmount());
        }
        if (medicineDTO.getMedicinePurchasePrice() != null && !"".equals(medicineDTO.getMedicinePurchasePrice())){
            medicine.setMedicinePurchasePrice(medicineDTO.getMedicinePurchasePrice());
        }
        if (medicineDTO.getMedicineRetailPrice() != null && !"".equals(medicineDTO.getMedicineRetailPrice())){
            medicine.setMedicineRetailPrice(medicineDTO.getMedicineRetailPrice());
        }
        if (medicineDTO.getMedicineWholesalePrice() != null && !"".equals(medicineDTO.getMedicineWholesalePrice())){
            medicine.setMedicineWholesalePrice(medicineDTO.getMedicineWholesalePrice());
        }
        return medicine;
    }

    /**
     * POJO转换成DTO
     *
     * @param medicine
     * @return medicineDTO
     * @author 林贤钦
     */
    private  MedicineDTO medicinePojoToDto(Medicine medicine){
        MedicineDTO medicineDTO = new MedicineDTO();
        if (medicine.getMedicineId() != null && !"".equals(medicine.getMedicineId())){
            medicineDTO.setMedicineId(medicine.getMedicineId());
        }
        if (medicine.getMedicineApprovalNumber() != null && !"".equals(medicine.getMedicineApprovalNumber())){
            medicineDTO.setMedicineApprovalNumber(medicine.getMedicineApprovalNumber());
        }
        if (medicine.getMedicineName() != null && !"".equals(medicine.getMedicineName())){
            medicineDTO.setMedicineName(medicine.getMedicineName());
        }
        if (medicine.getMedicineEnglishName() != null && !"".equals(medicine.getMedicineEnglishName())){
            medicineDTO.setMedicineEnglishName(medicine.getMedicineEnglishName());
        }
        if (medicine.getMedicineDosageformCategory() != null && !"".equals(medicine.getMedicineDosageformCategory())){
            medicineDTO.setMedicineDosageformCategory(medicine.getMedicineDosageformCategory());
        }
        if (medicine.getMedicineManufacturer() != null && !"".equals(medicine.getMedicineManufacturer())){
            medicineDTO.setMedicineManufacturer(medicine.getMedicineManufacturer());
        }
        if (medicine.getMedicineSpecification() != null && !"".equals(medicine.getMedicineSpecification())){
            medicineDTO.setMedicineSpecification(medicine.getMedicineSpecification());
        }
        if (medicine.getMedicineManufacturingAddress() != null && !"".equals(medicine.getMedicineManufacturingAddress())){
            medicineDTO.setMedicineManufacturingAddress(medicine.getMedicineManufacturingAddress());
        }
        if (medicine.getMedicineCategory() != null && !"".equals(medicine.getMedicineCategory())){
            medicineDTO.setMedicineCategory(medicine.getMedicineCategory());
        }
        if (medicine.getMedicineApprovaldate() != null && !"".equals(medicine.getMedicineApprovaldate())){
            medicineDTO.setMedicineApprovaldate(medicine.getMedicineApprovaldate());
        }
        if (medicine.getMedicineOriginalApprovalNumber() != null && !"".equals(medicine.getMedicineOriginalApprovalNumber())){
            medicineDTO.setMedicineOriginalApprovalNumber(medicine.getMedicineOriginalApprovalNumber());
        }
        if (medicine.getMedicineSuppliersId() != null && !"".equals(medicine.getMedicineSuppliersId())){
            medicineDTO.setMedicineSuppliersId(medicine.getMedicineSuppliersId());
        }
        if (medicine.getMedicinePicture() != null && !"".equals(medicine.getMedicinePicture())){
            medicineDTO.setMedicinePicture(medicine.getMedicinePicture());
        }
        if (medicine.getMedicineStockAmount() != null && !"".equals(medicine.getMedicineStockAmount())){
            medicineDTO.setMedicineStockAmount(medicine.getMedicineStockAmount());
        }
        if (medicine.getMedicinePurchasePrice() != null && !"".equals(medicine.getMedicinePurchasePrice())){
            medicineDTO.setMedicinePurchasePrice(medicine.getMedicinePurchasePrice());
        }
        if (medicine.getMedicineRetailPrice() != null && !"".equals(medicine.getMedicineRetailPrice())){
            medicineDTO.setMedicineRetailPrice(medicine.getMedicineRetailPrice());
        }
        if (medicine.getMedicineWholesalePrice() != null && !"".equals(medicine.getMedicineWholesalePrice())){
            medicineDTO.setMedicineWholesalePrice(medicine.getMedicineWholesalePrice());
        }
        return medicineDTO;
    }

}
