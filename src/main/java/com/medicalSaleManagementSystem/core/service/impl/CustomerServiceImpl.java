package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.bean.DTO.CustomerDTO;
import com.medicalSaleManagementSystem.core.bean.DTO.Msg;
import com.medicalSaleManagementSystem.core.bean.POJO.Customer;
import com.medicalSaleManagementSystem.core.bean.POJO.CustomerExample;
import com.medicalSaleManagementSystem.core.dao.CustomerMapper;
import com.medicalSaleManagementSystem.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerServiceImpl  implements CustomerService {
    @Autowired
    CustomerMapper customerMapper;
    /**
     * 查找数据库是否存在该客户名字
     * @param name
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public Msg findCustomerByName(String name) {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustNameEqualTo(name);
        List<Customer>  customerList = customerMapper.selectByExample(customerExample);
        if (customerList.size() == 0) {
            //数据库中没有该账号
            return Msg.fail("该客户不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("customerList", customerList);
        }
    }
    /**
     * 通过客户id查找客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public Msg findCustomerById(Integer id) {
        Customer customer = customerMapper.selectByPrimaryKey(id);
        if (customer == null) {
            //数据库中没有该账号
            return Msg.fail("该客户不存在");
        } else {
            //数据库中已存在该账号
            return Msg.success().add("customer", customer);
        }
    }
    /**
     * 注册客户信息
     * @param customerDTO
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public Msg registerCustomer(CustomerDTO customerDTO) {
        Customer customer = customerDtoToPojo(customerDTO);
        try {
            customerMapper.insertSelective(customer);
        }catch (Exception e){
            return Msg.fail("注册客户信息失败，请重新注册");
        }
        return Msg.success();

    }

    /**
     * 通过客户id删除客户信息
     * @param id
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public Msg deleteCustomerById(Integer id) {
        try {
            customerMapper.deleteByPrimaryKey(id);
        }catch (Exception e){
            return Msg.fail("删除客户信息失败，请重新删除");
        }
        return Msg.success();
    }
    /**
     * 更新客户信息
     * @param customerDTO
     * @return Msg
     * @author 林贤钦
     */
    @Override
    public Msg updateCustomer(CustomerDTO customerDTO) {
        if (customerDTO.getCustId() == null ||customerDTO.getCustId() <= 0){
            return Msg.fail("客户id非法");
        }
        Customer customer = customerDtoToPojo(customerDTO);
        try{
            customerMapper.updateByPrimaryKeySelective(customer);
        }catch (Exception e){
            return Msg.fail("修改失败，请重新修改");
        }
        return Msg.success();
    }
    /**
     * DTO转换成POJO
     *
     * @param customerDTO
     * @return customer
     * @author 林贤钦
     */
    private Customer customerDtoToPojo(CustomerDTO customerDTO){
        Customer customer = new Customer();
        if(customerDTO.getCustId() !=null && !"".equals(customerDTO.getCustId())){
            customer.setCustId(customerDTO.getCustId());
        }
        if(customerDTO.getCustName() !=null && !"".equals(customerDTO.getCustName())){
            customer.setCustName(customerDTO.getCustName());
        }
        if(customerDTO.getCustCategory() !=null && !"".equals(customerDTO.getCustCategory())){
            customer.setCustCategory(customerDTO.getCustCategory());
        }
        if(customerDTO.getCustAddress() !=null && !"".equals(customerDTO.getCustAddress())){
            customer.setCustAddress(customerDTO.getCustAddress());
        }
        if(customerDTO.getCustShippingAddress() !=null && !"".equals(customerDTO.getCustShippingAddress())){
            customer.setCustShippingAddress(customerDTO.getCustShippingAddress());
        }
        if(customerDTO.getCustTel() !=null && !"".equals(customerDTO.getCustTel())){
            customer.setCustTel(customerDTO.getCustTel());
        }
        if(customerDTO.getCustZipCode() !=null && !"".equals(customerDTO.getCustZipCode())){
            customer.setCustZipCode(customerDTO.getCustZipCode());
        }
        if(customerDTO.getCustFax() !=null && !"".equals(customerDTO.getCustFax())){
            customer.setCustFax(customerDTO.getCustFax());
        }
        if(customerDTO.getCustOpeningBank() !=null && !"".equals(customerDTO.getCustOpeningBank())){
            customer.setCustOpeningBank(customerDTO.getCustOpeningBank());
        }
        if(customerDTO.getCustBankNumber() !=null && !"".equals(customerDTO.getCustBankNumber())){
            customer.setCustBankNumber(customerDTO.getCustBankNumber());
        }
        if(customerDTO.getCustContactsName() !=null && !"".equals(customerDTO.getCustContactsName())){
            customer.setCustContactsName(customerDTO.getCustContactsName());
        }
        if(customerDTO.getCustContactsTel() !=null && !"".equals(customerDTO.getCustContactsTel())){
            customer.setCustContactsTel(customerDTO.getCustContactsTel());
        }
        return  customer;
    }
    /**
     * POJO转换成DTO
     *
     * @param customer
     * @return customerDTO
     * @author 林贤钦
     */
    private CustomerDTO customerPojoToDto(Customer customer){
        CustomerDTO customerDTO = new CustomerDTO();
        if(customer.getCustId() !=null && !"".equals(customer.getCustId())){
            customerDTO.setCustId(customer.getCustId());
        }
        if(customer.getCustName() !=null && !"".equals(customer.getCustName())){
            customerDTO.setCustName(customer.getCustName());
        }
        if(customer.getCustCategory() !=null && !"".equals(customer.getCustCategory())){
            customerDTO.setCustCategory(customer.getCustCategory());
        }
        if(customer.getCustAddress() !=null && !"".equals(customerDTO.getCustAddress())){
            customerDTO.setCustAddress(customerDTO.getCustAddress());
        }
        if(customer.getCustShippingAddress() !=null && !"".equals(customer.getCustShippingAddress())){
            customerDTO.setCustShippingAddress(customer.getCustShippingAddress());
        }
        if(customer.getCustTel() !=null && !"".equals(customer.getCustTel())){
            customerDTO.setCustTel(customer.getCustTel());
        }
        if(customer.getCustZipCode() !=null && !"".equals(customer.getCustZipCode())){
            customerDTO.setCustZipCode(customer.getCustZipCode());
        }
        if(customer.getCustFax() !=null && !"".equals(customer.getCustFax())){
            customerDTO.setCustFax(customer.getCustFax());
        }
        if(customer.getCustOpeningBank() !=null && !"".equals(customer.getCustOpeningBank())){
            customerDTO.setCustOpeningBank(customer.getCustOpeningBank());
        }
        if(customer.getCustBankNumber() !=null && !"".equals(customer.getCustBankNumber())){
            customerDTO.setCustBankNumber(customer.getCustBankNumber());
        }
        if(customer.getCustContactsName() !=null && !"".equals(customer.getCustContactsName())){
            customerDTO.setCustContactsName(customer.getCustContactsName());
        }
        if(customer.getCustContactsTel() !=null && !"".equals(customer.getCustContactsTel())){
            customerDTO.setCustContactsTel(customer.getCustContactsTel());
        }
        return  customerDTO;
    }
}
