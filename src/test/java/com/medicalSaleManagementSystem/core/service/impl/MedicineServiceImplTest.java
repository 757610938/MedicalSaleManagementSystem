//package com.medicalSaleManagementSystem.core.service.impl;
//
//import com.medicalSaleManagementSystem.core.model.DTO.MedicineDTO;
//import com.medicalSaleManagementSystem.core.model.POJO.Medicine;
//import com.medicalSaleManagementSystem.util.message.Msg;
//import org.junit.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//import java.util.Date;
//import java.util.List;
//
//public class MedicineServiceImplTest {
//
//    @Test
//    public void findMedicineByName() {
//    }
//
//    @Test
//    public void vagueFindMedicineByName() {
//        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        MedicineServiceImpl medicineService = ac.getBean("medicineServiceImpl", MedicineServiceImpl.class);
//        Msg msg = medicineService.vagueFindMedicineByName("1");
//        //Msg msg = medicineService.findAllMedicine();
//        System.out.println(msg);
//        List<Medicine> medicineList= (List<Medicine>) msg.getExt().get("medicineList");
//        for (Medicine medicine : medicineList) {
//            System.out.println(medicine.getMedicineName());
//        }
//    }
//
//    @Test
//    public void findMedicineById() {
//    }
//
//    @Test
//    public void registerMedicine() {
//        //1.获取容器
//        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2.获取业务层对象
//        MedicineServiceImpl medicineService = ac.getBean("medicineServiceImpl", MedicineServiceImpl.class);
//        //3.执行方法
//        MedicineDTO medicineDTO=new MedicineDTO();
//        medicineDTO.setMedicineName("药品3");
//        medicineDTO.setMedicineApprovaldate(new Date());
//        medicineDTO.setMedicineApprovalNumber("3");
//        Msg msg = medicineService.registerMedicine(medicineDTO);
//        System.out.println(msg);
//    }
//
//    @Test
//    public void deleteMedicineById() {
//    }
//
//    @Test
//    public void updateMedicine() {
//    }
//}