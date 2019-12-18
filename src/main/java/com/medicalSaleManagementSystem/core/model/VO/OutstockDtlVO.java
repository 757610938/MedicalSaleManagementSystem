package com.medicalSaleManagementSystem.core.model.VO;

public class OutstockDtlVO {
    private Integer outstockDtlId;

    private String outstockDtlNumber;

    private Integer medicineId;

    private Integer outstockAmount;

    private Integer whseId;

    private String outstockNumber;

    @Override
    public String toString() {
        return "OutstockDtlVO{" +
                "outstockDtlId=" + outstockDtlId +
                ", outstockDtlNumber='" + outstockDtlNumber + '\'' +
                ", medicineId=" + medicineId +
                ", outstockAmount=" + outstockAmount +
                ", whseId=" + whseId +
                ", outstockNumber='" + outstockNumber + '\'' +
                '}';
    }

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
        this.outstockDtlNumber = outstockDtlNumber;
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

    public String getOutstockNumber() {
        return outstockNumber;
    }

    public void setOutstockNumber(String outstockNumber) {
        this.outstockNumber = outstockNumber;
    }
}
