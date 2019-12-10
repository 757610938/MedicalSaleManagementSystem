//package com.medicalSaleManagementSystem.core.service.impl;
//
//import com.medicalSaleManagementSystem.core.model.DTO.CustomerDTO;
//import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
//import com.medicalSaleManagementSystem.util.message.Msg;
//import com.medicalSaleManagementSystem.core.model.POJO.Customer;
//import com.medicalSaleManagementSystem.core.model.POJO.CustomerExample;
//import com.medicalSaleManagementSystem.core.dao.CustomerMapper;
//import com.medicalSaleManagementSystem.core.service.CustomerService;
//import com.medicalSaleManagementSystem.util.BeanUtilEx;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class CustomerServiceImpl  implements CustomerService {
//    @Autowired
//    CustomerMapper customerMapper;
//    /**
//     * 查找数据库是否存在该客户名字
//     * @param name
//     * @return Msg
//     * @author 林贤钦
//     */
//    @Override
//    public Msg findCustomerByName(String name) {
//        CustomerExample customerExample = new CustomerExample();
//        CustomerExample.Criteria criteria = customerExample.createCriteria();
//        criteria.andCustNameEqualTo(name);
//        List<Customer>  customerList = customerMapper.selectByExample(customerExample);
//        if (customerList.size() == 0) {
//            //数据库中没有该账号
//            return Msg.fail("该客户不存在");
//        } else {
//            //数据库中已存在该账号2
//            return Msg.success().add("customerList", customerList);
//        }
//    }
//    /**
//     * 通过客户id查找客户信息
//     * @param id
//     * @return Msg
//     * @author 林贤钦
//     */
//    @Override
//    public Msg findCustomerById(Integer id) {
//        Customer customer = customerMapper.selectByPrimaryKey(id);
//        if (customer == null) {
//            //数据库中没有该账号
//            return Msg.fail("该客户不存在");
//        } else {
//            //数据库中已存在该账号
//            MedicineDTO medicineDTO= new MedicineDTO();
//            BeanUtilEx.copyProperties(medicineDTO,customer);//转化实体类
//            return Msg.success().add("medicineDTO", medicineDTO);
//        }
//    }
//    /**
//     * 增加客户信息
//     * @param customerDTO
//     * @return Msg
//     * @author 林贤钦
//     */
//    @Override
//    public Msg addCustomer(CustomerDTO customerDTO) {
//        try {
//            Customer customer = new Customer();
//            BeanUtilEx.copyProperties(customer,customerDTO);
//            customerMapper.insertSelective(customer);
//        }catch (Exception e){
//            System.out.println("CustomerServiceImpl--->addCustomer");
//            return Msg.fail("注册客户信息失败，请重新注册");
//        }
//        return Msg.success();
//    }
//
//    /**
//     * 通过客户id删除客户信息
//     * @param id
//     * @return Msg
//     * @author 林贤钦
//     */
//    @Override
//    public Msg deleteCustomerById(Integer id) {
//        try {
//            customerMapper.deleteByPrimaryKey(id);
//        }catch (Exception e){
//            return Msg.fail("删除客户信息失败，请重新删除");
//        }
//        return Msg.success();
//    }
//
//    /**
//     * 更新客户信息
//     * @param customerDTO
//     * @return Msg
//     * @author 林贤钦
//     */
//    @Override
//    public Msg updateCustomer(CustomerDTO customerDTO) {
//        if (customerDTO.getCustId() == null ||customerDTO.getCustId() <= 0){
//            return Msg.fail("客户id非法");
//        }
//        try{
//            Customer customer = new Customer();
//            BeanUtilEx.copyProperties(customer,customerDTO);
//            customerMapper.updateByPrimaryKeySelective(customer);
//        }catch (Exception e){
//            return Msg.fail("修改失败，请重新修改");
//        }
//        return Msg.success();
//    }
//
//}
