package com.medicalSaleManagementSystem.core.model.entity;

public class SaleDtl {
    private Integer saleDtlId;

    private String saleDtlOrderid;

    private String saleOrderid;

    private Integer medicineId;

    private Integer saleDtlTotalAmount;

    private String saleDtlRemark;

    public Integer getSaleDtlId() {
        return saleDtlId;
    }

    public void setSaleDtlId(Integer saleDtlId) {
        this.saleDtlId = saleDtlId;
    }

    public String getSaleDtlOrderid() {
        return saleDtlOrderid;
    }

    public void setSaleDtlOrderid(String saleDtlOrderid) {
        this.saleDtlOrderid = saleDtlOrderid == null ? null : saleDtlOrderid.trim();
    }

    public String getSaleOrderid() {
        return saleOrderid;
    }

    public void setSaleOrderid(String saleOrderid) {
        this.saleOrderid = saleOrderid == null ? null : saleOrderid.trim();
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getSaleDtlTotalAmount() {
        return saleDtlTotalAmount;
    }

    public void setSaleDtlTotalAmount(Integer saleDtlTotalAmount) {
        this.saleDtlTotalAmount = saleDtlTotalAmount;
    }

    public String getSaleDtlRemark() {
        return saleDtlRemark;
    }

    public void setSaleDtlRemark(String saleDtlRemark) {
        this.saleDtlRemark = saleDtlRemark == null ? null : saleDtlRemark.trim();
    }
}