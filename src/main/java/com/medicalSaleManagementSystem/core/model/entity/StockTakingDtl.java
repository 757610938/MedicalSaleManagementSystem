package com.medicalSaleManagementSystem.core.model.entity;

public class StockTakingDtl {
    private Integer stockTakingDtlId;

    private Integer stockTakingDtlNumber;

    private Integer medicineId;

    private Integer takingMedicineAmount;

    private Integer takingUpdateAmount;

    private Integer takingReimburseAmount;

    private String takingRemark;

    public Integer getStockTakingDtlId() {
        return stockTakingDtlId;
    }

    public void setStockTakingDtlId(Integer stockTakingDtlId) {
        this.stockTakingDtlId = stockTakingDtlId;
    }

    public Integer getStockTakingDtlNumber() {
        return stockTakingDtlNumber;
    }

    public void setStockTakingDtlNumber(Integer stockTakingDtlNumber) {
        this.stockTakingDtlNumber = stockTakingDtlNumber;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getTakingMedicineAmount() {
        return takingMedicineAmount;
    }

    public void setTakingMedicineAmount(Integer takingMedicineAmount) {
        this.takingMedicineAmount = takingMedicineAmount;
    }

    public Integer getTakingUpdateAmount() {
        return takingUpdateAmount;
    }

    public void setTakingUpdateAmount(Integer takingUpdateAmount) {
        this.takingUpdateAmount = takingUpdateAmount;
    }

    public Integer getTakingReimburseAmount() {
        return takingReimburseAmount;
    }

    public void setTakingReimburseAmount(Integer takingReimburseAmount) {
        this.takingReimburseAmount = takingReimburseAmount;
    }

    public String getTakingRemark() {
        return takingRemark;
    }

    public void setTakingRemark(String takingRemark) {
        this.takingRemark = takingRemark == null ? null : takingRemark.trim();
    }
}