package com.medicalSaleManagementSystem.core.bean.entity;

public class Purchase {
    private Integer purId;

    private String purOrderid;

    private Integer supplierId;

    private Integer empId;

    private Double purTotalMoney;

    public Integer getPurId() {
        return purId;
    }

    public void setPurId(Integer purId) {
        this.purId = purId;
    }

    public String getPurOrderid() {
        return purOrderid;
    }

    public void setPurOrderid(String purOrderid) {
        this.purOrderid = purOrderid == null ? null : purOrderid.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Double getPurTotalMoney() {
        return purTotalMoney;
    }

    public void setPurTotalMoney(Double purTotalMoney) {
        this.purTotalMoney = purTotalMoney;
    }
}