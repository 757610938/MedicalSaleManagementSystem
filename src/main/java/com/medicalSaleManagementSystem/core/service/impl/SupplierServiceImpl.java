package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.DTO.Msg;
import com.medicalSaleManagementSystem.core.bean.DTO.SupplierDTO;
import com.medicalSaleManagementSystem.core.bean.POJO.Supplier;
import com.medicalSaleManagementSystem.core.bean.POJO.SupplierExample;
import com.medicalSaleManagementSystem.core.dao.SupplierMapper;
import com.medicalSaleManagementSystem.core.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {
    @Autowired
    SupplierMapper supplierMapper;
    @Override
    public Msg findSupplierByName(String name) {
        SupplierExample customerExample = new SupplierExample();
        SupplierExample.Criteria criteria = customerExample.createCriteria();
        criteria.andSupplierNameEqualTo(name);
        List<Supplier> supplierList= supplierMapper.selectByExample(customerExample);
        if (supplierList.size() == 0) {
            //数据库中没有该账号
            return Msg.fail("该供应商不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("supplierList", supplierList);
        }
    }

    @Override
    public Msg findSupplierById(Integer id) {
        Supplier supplier = supplierMapper.selectByPrimaryKey(id);
        if (supplier == null) {
            //数据库中没有该账号
            return Msg.fail("该供应商不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("supplier", supplier);
        }
    }

    @Override
    public Msg registerSupplier(SupplierDTO supplierDTO) {
        Supplier supplier = supplierDtoToPojo(supplierDTO);
        try {
            supplierMapper.insertSelective(supplier);
        }catch (Exception e){
            return Msg.fail("注册供应商信息失败，请重新注册");
        }
        return Msg.success();
    }

    @Override
    public Msg deleteSupplierById(Integer id) {
        try {
            supplierMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            return Msg.fail("删除客户信息失败，请重新删除");
        }
        return Msg.success();
    }

    @Override
    public Msg updateSupplier(SupplierDTO supplierDTO) {
        if (supplierDTO.getSupplierId() == null ||supplierDTO.getSupplierId()  <= 0){
            return Msg.fail("供应商id非法");
        }
        Supplier supplier = supplierDtoToPojo(supplierDTO);
        try{
            supplierMapper.updateByPrimaryKeySelective(supplier);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }
    /**
     * DTO转换成POJO
     *
     * @param supplierDTO
     * @return supplier
     * @author 林贤钦
     */
    private Supplier supplierDtoToPojo(SupplierDTO supplierDTO){
        Supplier supplier = new Supplier();
        if(supplierDTO.getSupplierId() !=null && !"".equals(supplierDTO.getSupplierId() )){
            supplier.setSupplierId(supplierDTO.getSupplierId() );
        }
        if(supplierDTO.getSupplierName() !=null && !"".equals(supplierDTO.getSupplierName() )){
            supplier.setSupplierName(supplierDTO.getSupplierName() );
        }
        if(supplierDTO.getSupplierAddress() !=null && !"".equals(supplierDTO.getSupplierAddress() )){
            supplier.setSupplierAddress(supplierDTO.getSupplierAddress() );
        }
        if(supplierDTO.getSupplierZipcode() !=null && !"".equals(supplierDTO.getSupplierZipcode() )){
            supplier.setSupplierZipcode(supplierDTO.getSupplierZipcode() );
        }
        if(supplierDTO.getSupplierTel() !=null && !"".equals(supplierDTO.getSupplierTel() )){
            supplier.setSupplierTel(supplierDTO.getSupplierTel() );
        }
        if(supplierDTO.getSupplierFax() !=null && !"".equals(supplierDTO.getSupplierFax() )){
            supplier.setSupplierFax(supplierDTO.getSupplierFax() );
        }
        if(supplierDTO.getSupplierOpeningBank() !=null && !"".equals(supplierDTO.getSupplierOpeningBank() )){
            supplier.setSupplierOpeningBank(supplierDTO.getSupplierOpeningBank() );
        }
        if(supplierDTO.getSupplierBanknumber() !=null && !"".equals(supplierDTO.getSupplierBanknumber() )){
            supplier.setSupplierBanknumber(supplierDTO.getSupplierBanknumber() );
        }
        if(supplierDTO.getSupplierWarehouse() !=null && !"".equals(supplierDTO.getSupplierWarehouse() )){
            supplier.setSupplierWarehouse(supplierDTO.getSupplierWarehouse() );
        }
        if(supplierDTO.getSupplierWarehoustel() !=null && !"".equals(supplierDTO.getSupplierWarehoustel() )){
            supplier.setSupplierWarehoustel(supplierDTO.getSupplierWarehoustel() );
        }
        if(supplierDTO.getSupplierContactsname() !=null && !"".equals(supplierDTO.getSupplierContactsname() )){
            supplier.setSupplierContactsname(supplierDTO.getSupplierContactsname() );
        }
        if(supplierDTO.getSupplierContactstel() !=null && !"".equals(supplierDTO.getSupplierContactstel() )){
            supplier.setSupplierContactstel(supplierDTO.getSupplierContactstel() );
        }
        return  supplier;
    }
    /**
     * POJO转换成DTO
     *
     * @param supplier
     * @return supplierDTO
     * @author 林贤钦
     */
    private SupplierDTO supplierPojoToDTO(Supplier supplier){
        SupplierDTO supplierDTO = new SupplierDTO();
        if(supplier.getSupplierId() !=null && !"".equals(supplier.getSupplierId() )){
            supplierDTO.setSupplierId(supplier.getSupplierId() );
        }
        if(supplier.getSupplierName() !=null && !"".equals(supplier.getSupplierName() )){
            supplierDTO.setSupplierName(supplier.getSupplierName() );
        }
        if(supplier.getSupplierAddress() !=null && !"".equals(supplier.getSupplierAddress() )){
            supplierDTO.setSupplierAddress(supplier.getSupplierAddress() );
        }
        if(supplier.getSupplierZipcode() !=null && !"".equals(supplier.getSupplierZipcode() )){
            supplierDTO.setSupplierZipcode(supplier.getSupplierZipcode() );
        }
        if(supplier.getSupplierTel() !=null && !"".equals(supplier.getSupplierTel() )){
            supplierDTO.setSupplierTel(supplier.getSupplierTel() );
        }
        if(supplier.getSupplierFax() !=null && !"".equals(supplier.getSupplierFax() )){
            supplierDTO.setSupplierFax(supplier.getSupplierFax() );
        }
        if(supplier.getSupplierOpeningBank() !=null && !"".equals(supplier.getSupplierOpeningBank() )){
            supplierDTO.setSupplierOpeningBank(supplier.getSupplierOpeningBank() );
        }
        if(supplier.getSupplierBanknumber() !=null && !"".equals(supplier.getSupplierBanknumber() )){
            supplierDTO.setSupplierBanknumber(supplier.getSupplierBanknumber() );
        }
        if(supplier.getSupplierWarehouse() !=null && !"".equals(supplier.getSupplierWarehouse() )){
            supplierDTO.setSupplierWarehouse(supplier.getSupplierWarehouse() );
        }
        if(supplier.getSupplierWarehoustel() !=null && !"".equals(supplier.getSupplierWarehoustel() )){
            supplierDTO.setSupplierWarehoustel(supplier.getSupplierWarehoustel() );
        }
        if(supplier.getSupplierContactsname() !=null && !"".equals(supplier.getSupplierContactsname() )){
            supplierDTO.setSupplierContactsname(supplier.getSupplierContactsname() );
        }
        if(supplier.getSupplierContactstel() !=null && !"".equals(supplier.getSupplierContactstel() )){
            supplierDTO.setSupplierContactstel(supplier.getSupplierContactstel() );
        }
        return  supplierDTO;
    }

}
