package com.medicalSaleManagementSystem.core.model.BO;

import java.util.Date;
import java.util.List;

public class PurchaseBO {
    private List<PurchaseDtlBO> purDtlList;

    private Integer purId;

    private String purOrderId;

    private String purName;

    private Integer supplierId;

    private String userNumber;

    private Double purTotalMoney;

    private String purStatus;

    private Integer warehouseId;

    private Date purDate;

    private String purRemark;

    public Integer getPurId() {
        return purId;
    }

    public void setPurId(Integer purId) {
        this.purId = purId;
    }

    public String getPurOrderId() {
        return purOrderId;
    }

    public void setPurOrderId(String purOrderId) {
        this.purOrderId = purOrderId == null ? null : purOrderId.trim();
    }

    public String getPurName() {
        return purName;
    }

    public void setPurName(String purName) {
        this.purName = purName == null ? null : purName.trim();
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public Double getPurTotalMoney() {
        return purTotalMoney;
    }

    public void setPurTotalMoney(Double purTotalMoney) {
        this.purTotalMoney = purTotalMoney;
    }

    public String getPurStatus() {
        return purStatus;
    }

    public void setPurStatus(String purStatus) {
        this.purStatus = purStatus == null ? null : purStatus.trim();
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public String getPurRemark() {
        return purRemark;
    }

    public void setPurRemark(String purRemark) {
        this.purRemark = purRemark == null ? null : purRemark.trim();
    }

    public List<PurchaseDtlBO> getPurDtlList() {
        return purDtlList;
    }

    public void setPurDtlList(List<PurchaseDtlBO> purDtlList) {
        this.purDtlList = purDtlList;
    }

    @Override
    public String toString() {
        return "PurchaseBO{" +
                "purDtlList=" + purDtlList +
                ", purId=" + purId +
                ", purOrderId='" + purOrderId + '\'' +
                ", purName='" + purName + '\'' +
                ", supplierId=" + supplierId +
                ", userNumber='" + userNumber + '\'' +
                ", purTotalMoney=" + purTotalMoney +
                ", purStatus='" + purStatus + '\'' +
                ", warehouseId=" + warehouseId +
                ", purDate=" + purDate +
                ", purRemark='" + purRemark + '\'' +
                '}';
    }
}