package com.medicalSaleManagementSystem.core.bean.POJO;

public class PurchaseDtl {
    private Integer purDtlId;

    private String purDtlOrderid;

    private String purOrderid;

    private Integer medicineId;

    private Integer purDtlTotalAmount;

    private String purDtlRemark;

    public Integer getPurDtlId() {
        return purDtlId;
    }

    public void setPurDtlId(Integer purDtlId) {
        this.purDtlId = purDtlId;
    }

    public String getPurDtlOrderid() {
        return purDtlOrderid;
    }

    public void setPurDtlOrderid(String purDtlOrderid) {
        this.purDtlOrderid = purDtlOrderid == null ? null : purDtlOrderid.trim();
    }

    public String getPurOrderid() {
        return purOrderid;
    }

    public void setPurOrderid(String purOrderid) {
        this.purOrderid = purOrderid == null ? null : purOrderid.trim();
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getPurDtlTotalAmount() {
        return purDtlTotalAmount;
    }

    public void setPurDtlTotalAmount(Integer purDtlTotalAmount) {
        this.purDtlTotalAmount = purDtlTotalAmount;
    }

    public String getPurDtlRemark() {
        return purDtlRemark;
    }

    public void setPurDtlRemark(String purDtlRemark) {
        this.purDtlRemark = purDtlRemark == null ? null : purDtlRemark.trim();
    }
}