package com.medicalSaleManagementSystem.core.bean.entity;

import java.util.Date;

public class InstockRecord {
    private Integer instockId;

    private String instockListId;

    private String instockCategory;

    private Integer medicineId;

    private Integer instockNumber;

    private Integer empId;

    private String instockRemark;

    private Date instockTime;

    public Integer getInstockId() {
        return instockId;
    }

    public void setInstockId(Integer instockId) {
        this.instockId = instockId;
    }

    public String getInstockListId() {
        return instockListId;
    }

    public void setInstockListId(String instockListId) {
        this.instockListId = instockListId == null ? null : instockListId.trim();
    }

    public String getInstockCategory() {
        return instockCategory;
    }

    public void setInstockCategory(String instockCategory) {
        this.instockCategory = instockCategory == null ? null : instockCategory.trim();
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getInstockNumber() {
        return instockNumber;
    }

    public void setInstockNumber(Integer instockNumber) {
        this.instockNumber = instockNumber;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getInstockRemark() {
        return instockRemark;
    }

    public void setInstockRemark(String instockRemark) {
        this.instockRemark = instockRemark == null ? null : instockRemark.trim();
    }

    public Date getInstockTime() {
        return instockTime;
    }

    public void setInstockTime(Date instockTime) {
        this.instockTime = instockTime;
    }
}