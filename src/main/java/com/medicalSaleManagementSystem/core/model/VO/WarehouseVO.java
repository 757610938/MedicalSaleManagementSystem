package com.medicalSaleManagementSystem.core.model.VO;

public class WarehouseVO {
    private Integer whseId;

    private String whseName;

    private String whseAddress;

    private String whseTel;

    private Integer whseCapacity;

    private String userNumber;

    public Integer getWhseId() {
        return whseId;
    }

    public void setWhseId(Integer whseId) {
        this.whseId = whseId;
    }

    public String getWhseName() {
        return whseName;
    }

    public void setWhseName(String whseName) {
        this.whseName = whseName;
    }

    public String getWhseAddress() {
        return whseAddress;
    }

    public void setWhseAddress(String whseAddress) {
        this.whseAddress = whseAddress;
    }

    public String getWhseTel() {
        return whseTel;
    }

    public void setWhseTel(String whseTel) {
        this.whseTel = whseTel;
    }

    public Integer getWhseCapacity() {
        return whseCapacity;
    }

    public void setWhseCapacity(Integer whseCapacity) {
        this.whseCapacity = whseCapacity;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }
}
