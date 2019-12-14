package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.SupplierMapper;
import com.medicalSaleManagementSystem.core.model.DTO.SupplierDTO;
import com.medicalSaleManagementSystem.core.model.entity.Supplier;
import com.medicalSaleManagementSystem.core.model.entity.SupplierExample;
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
    public Supplier selectByPrimaryKey(Integer id) {
        try {
            return supplierMapper.selectByPrimaryKey(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  null;
    }

    @Override
    public  int insertSelective(SupplierDTO record) {
        try {
            Supplier supplier = new Supplier();
            BeanUtilEx.copyProperties(supplier,record);//将DTO转换成POJO
            return supplierMapper.insertSelective(supplier);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            return supplierMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(SupplierDTO supplierDTO) {
        try{
            if (supplierDTO.getSupplierId() == null ||supplierDTO.getSupplierId()  <= 0){
                return 0;
            }
            Supplier supplier = new Supplier();
            BeanUtilEx.copyProperties(supplier,supplierDTO);//将DTO转换成POJO
            return supplierMapper.updateByPrimaryKeySelective(supplier);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Supplier> getAll() {
        return supplierMapper.selectByExample(null);
    }

    @Override
    public List<Supplier> vagueSelectByPrimaryName(String name) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();
        criteria.andSupplierNameLike("%"+name+"%");
        return supplierMapper.selectByExample(supplierExample);
    }
}
