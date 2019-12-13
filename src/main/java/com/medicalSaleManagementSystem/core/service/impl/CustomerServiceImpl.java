package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.model.DTO.CustomerDTO;
import com.medicalSaleManagementSystem.core.model.entity.Customer;
import com.medicalSaleManagementSystem.core.dao.CustomerMapper;
import com.medicalSaleManagementSystem.core.model.entity.CustomerExample;
import com.medicalSaleManagementSystem.core.service.CustomerService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl  implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    /**
     * 通过客户id查找客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public Customer selectByPrimaryKey(Integer id) {
        try{
            return customerMapper.selectByPrimaryKey(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
    /**
     * 增加客户信息
     * @param record
     * @return int
     * @author 林贤钦
     */
    @Override
    public int insertSelective(CustomerDTO record){
        try {
            Customer customer = new Customer();
            BeanUtilEx.copyProperties(customer,record);
            return customerMapper.insertSelective(customer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 通过客户id删除客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public int deleteByPrimaryKey(Integer id) {
        try {
            int i = customerMapper.deleteByPrimaryKey(id);
            System.out.println("deleteByPrimaryKey--->"+i);
            return i;
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    /**
     * 更新客户信息
     * @param record
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public int updateByPrimaryKeySelective(CustomerDTO record) {
        if (record.getCustId() == null ||record.getCustId() <= 0){
            return 0;
        }
        try{
            Customer customer = new Customer();
            BeanUtilEx.copyProperties(customer,record);
            return customerMapper.updateByPrimaryKeySelective(customer);
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Customer> getAll() {
        return customerMapper.selectByExample(null);
    }

    @Override
    public List<Customer> vagueSelectByPrimaryName(String name) {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustNameLike("%"+name+"%");
        return customerMapper.selectByExample(customerExample);
    }

}
