package com.medicalSaleManagementSystem.core.model.entity;

public class OutstocDtl {
    private Integer outstockDtlId;

    private String outstockDtlNumber;

    private Integer medicineId;

    private Integer outstockAmount;

    private Integer whseId;

    public Integer getOutstockDtlId() {
        return outstockDtlId;
    }

    public void setOutstockDtlId(Integer outstockDtlId) {
        this.outstockDtlId = outstockDtlId;
    }

    public String getOutstockDtlNumber() {
        return outstockDtlNumber;
    }

    public void setOutstockDtlNumber(String outstockDtlNumber) {
        this.outstockDtlNumber = outstockDtlNumber == null ? null : outstockDtlNumber.trim();
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public Integer getOutstockAmount() {
        return outstockAmount;
    }

    public void setOutstockAmount(Integer outstockAmount) {
        this.outstockAmount = outstockAmount;
    }

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }
}