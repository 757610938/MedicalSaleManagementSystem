package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.Date;

public class OutstocRecord {
    private Integer outstockId;

    private String outstockListId;

    private String outstockCategory;

    private Date outstockDate;

    private Integer medincineId;

    private Integer outstockNumber;

    private Integer empId;

    private String outstockRemark;

    public Integer getOutstockId() {
        return outstockId;
    }

    public void setOutstockId(Integer outstockId) {
        this.outstockId = outstockId;
    }

    public String getOutstockListId() {
        return outstockListId;
    }

    public void setOutstockListId(String outstockListId) {
        this.outstockListId = outstockListId == null ? null : outstockListId.trim();
    }

    public String getOutstockCategory() {
        return outstockCategory;
    }

    public void setOutstockCategory(String outstockCategory) {
        this.outstockCategory = outstockCategory == null ? null : outstockCategory.trim();
    }

    public Date getOutstockDate() {
        return outstockDate;
    }

    public void setOutstockDate(Date outstockDate) {
        this.outstockDate = outstockDate;
    }

    public Integer getMedincineId() {
        return medincineId;
    }

    public void setMedincineId(Integer medincineId) {
        this.medincineId = medincineId;
    }

    public Integer getOutstockNumber() {
        return outstockNumber;
    }

    public void setOutstockNumber(Integer outstockNumber) {
        this.outstockNumber = outstockNumber;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getOutstockRemark() {
        return outstockRemark;
    }

    public void setOutstockRemark(String outstockRemark) {
        this.outstockRemark = outstockRemark == null ? null : outstockRemark.trim();
    }
}