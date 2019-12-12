package com.medicalSaleManagementSystem.core.model.entity;

public class Employee {
    private Integer empId;

    private String empDeptId;

    private String empPosition;

    private String empWages;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(String empDeptId) {
        this.empDeptId = empDeptId;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public String getEmpWages() {
        return empWages;
    }

    public void setEmpWages(String empWages) {
        this.empWages = empWages;
    }
}