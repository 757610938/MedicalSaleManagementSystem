package com.medicalSaleManagementSystem.core.bean;

import com.medicalSaleManagementSystem.core.bean.DTO.EmployeeDTO;
import com.medicalSaleManagementSystem.core.bean.VO.EmployeeVO;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import org.junit.Test;

public class DtoCopyToPojo {
    @Test
    public void DtoCopyToPojo(){
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setEmpAccount("linxianqin");
        employeeDTO.setEmpPassword("12345678");
        EmployeeVO employeeVO = new EmployeeVO();
        System.out.println("转化前employeeDTO:"+employeeDTO);
        System.out.println("转化前employeeVO:"+employeeVO);
        BeanUtilEx.copyProperties(employeeVO,employeeDTO);
        System.out.println("转化后employeeDTO:"+employeeDTO);
        System.out.println("转化后employeeVO:"+employeeVO);
    }
}
