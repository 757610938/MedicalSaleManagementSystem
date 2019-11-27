package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.util.Msg;
import com.medicalSaleManagementSystem.core.bean.DTO.SupplierDTO;
import com.medicalSaleManagementSystem.core.bean.POJO.Supplier;
import com.medicalSaleManagementSystem.core.bean.POJO.SupplierExample;
import com.medicalSaleManagementSystem.core.dao.SupplierMapper;
import com.medicalSaleManagementSystem.core.service.SupplierService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
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
        try {
            Supplier supplier = new Supplier();
            BeanUtilEx.copyProperties(supplier,supplierDTO);//将DTO转换成POJO
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
        Supplier supplier = new Supplier();
        try{
            BeanUtilEx.copyProperties(supplier,supplierDTO);//将DTO转换成POJO
            supplierMapper.updateByPrimaryKeySelective(supplier);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }
}
