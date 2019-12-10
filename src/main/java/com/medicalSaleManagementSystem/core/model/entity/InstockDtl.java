package com.medicalSaleManagementSystem.core.model.entity;

public class InstockDtl {
    private Integer instockDtlId;

    private Integer medicineId;

    private Integer checkMedicineAmount;

    private Integer checkPassAmount;

    private String checkRemark;

    private Integer whseId;

    private Integer instockAmount;

    private String instockRemark;

    private Integer applyAmount;

    private String applyRemark;

    public Integer getInstockDtlId() {
        return instockDtlId;
    }

    public void setInstockDtlId(Integer instockDtlId) {
        this.instockDtlId = instockDtlId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getCheckMedicineAmount() {
        return checkMedicineAmount;
    }

    public void setCheckMedicineAmount(Integer checkMedicineAmount) {
        this.checkMedicineAmount = checkMedicineAmount;
    }

    public Integer getCheckPassAmount() {
        return checkPassAmount;
    }

    public void setCheckPassAmount(Integer checkPassAmount) {
        this.checkPassAmount = checkPassAmount;
    }

    public String getCheckRemark() {
        return checkRemark;
    }

    public void setCheckRemark(String checkRemark) {
        this.checkRemark = checkRemark == null ? null : checkRemark.trim();
    }

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }

    public Integer getInstockAmount() {
        return instockAmount;
    }

    public void setInstockAmount(Integer instockAmount) {
        this.instockAmount = instockAmount;
    }

    public String getInstockRemark() {
        return instockRemark;
    }

    public void setInstockRemark(String instockRemark) {
        this.instockRemark = instockRemark == null ? null : instockRemark.trim();
    }

    public Integer getApplyAmount() {
        return applyAmount;
    }

    public void setApplyAmount(Integer applyAmount) {
        this.applyAmount = applyAmount;
    }

    public String getApplyRemark() {
        return applyRemark;
    }

    public void setApplyRemark(String applyRemark) {
        this.applyRemark = applyRemark == null ? null : applyRemark.trim();
    }
}