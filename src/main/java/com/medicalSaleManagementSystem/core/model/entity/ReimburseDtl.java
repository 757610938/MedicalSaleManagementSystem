package com.medicalSaleManagementSystem.core.model.entity;

public class ReimburseDtl {
    private Integer reimburseDtlId;

    private Integer medicineId;

    private Integer reimburseAmount;

    private String reimburseDtlRemark;

    public Integer getReimburseDtlId() {
        return reimburseDtlId;
    }

    public void setReimburseDtlId(Integer reimburseDtlId) {
        this.reimburseDtlId = reimburseDtlId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getReimburseAmount() {
        return reimburseAmount;
    }

    public void setReimburseAmount(Integer reimburseAmount) {
        this.reimburseAmount = reimburseAmount;
    }

    public String getReimburseDtlRemark() {
        return reimburseDtlRemark;
    }

    public void setReimburseDtlRemark(String reimburseDtlRemark) {
        this.reimburseDtlRemark = reimburseDtlRemark == null ? null : reimburseDtlRemark.trim();
    }
}