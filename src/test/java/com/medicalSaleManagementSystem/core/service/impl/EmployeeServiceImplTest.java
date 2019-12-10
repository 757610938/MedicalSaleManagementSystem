//package com.medicalSaleManagementSystem.core.service.impl;
//
//import com.medicalSaleManagementSystem.core.model.DTO.EmployeeDTO;
//import com.medicalSaleManagementSystem.util.message.Msg;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class EmployeeServiceImplTest {
//
//    @Test
//    public void login() {
//        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        EmployeeServiceImpl employeeService = ac.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
//        //3.执行方法
//        EmployeeDTO  employeeDTO = new EmployeeDTO();
//        employeeDTO.setEmpAccount("admin");
//        employeeDTO.setEmpPassword("123456");
//        Msg msg = employeeService.login(employeeDTO);
//        System.out.println(msg.getCode());
//
//        System.out.println(msg.getMsg());
//    }
//
//    @Test
//    public void registerUser(){
//        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        EmployeeServiceImpl employeeService = ac.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
//        //3.执行方法
//        EmployeeDTO  employeeDTO = new EmployeeDTO();
//        employeeDTO.setEmpAccount("1234567");
//        employeeDTO.setEmpPassword("1234567");
//        Msg msg = employeeService.registerEmployee(employeeDTO);
//        System.out.println(msg.getCode());
//        System.out.println(msg.getMsg());
//    }
//
//    /**
//     * 查找数据库是否存在账号
//     * @return 消息类
//     * @author 林贤钦
//     */
//    @Test
//    public void findEmployeeByAccount() {
//         //1.获取容器
//         ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        MedicineServiceImpl medicineService=ac.getBean("medicineServiceImpl",MedicineServiceImpl.class);
//        //3.执行方法
//        Msg msg = medicineService.vagueFindMedicineByName("lin");
//        System.out.println(msg.getCode());
//        System.out.println(msg.getMsg());
//        System.out.println(msg.getExt().get("medicineList"));
//    }
//    /**
//     *  删除账户，将employee表中的valid状态改为1
//     * @return 消息类
//     * @author 林贤钦
//     */
//    @Test
//    public void deleteEmployee(){
//        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        EmployeeServiceImpl employeeService = ac.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
//        //3.执行方法
//        Msg msg = employeeService.deleteEmployee(1);
//        System.out.println(msg.getCode());
//        System.out.println(msg.getMsg());
//    }
//    public void getEmployee(){
//        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        EmployeeServiceImpl employeeService = ac.getBean("employeeServiceImpl", EmployeeServiceImpl.class);
//        //3.执行方法
//        Msg msg = employeeService.deleteEmployee(1);
//        System.out.println(msg.getCode());
//        System.out.println(msg.getMsg());
//    }
//}