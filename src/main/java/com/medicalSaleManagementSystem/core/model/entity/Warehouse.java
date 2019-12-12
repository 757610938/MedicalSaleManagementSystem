package com.medicalSaleManagementSystem.core.model.entity;

import com.alibaba.fastjson.JSON;

import java.util.Date;

public class Warehouse {
    private Integer whseId;

    private String whseName;

    private String whseAddress;

    private String whseTel;

    private Integer whseCapacity;

    private String userNumber;

    private Date genTime;

    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

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
        this.whseName = whseName == null ? null : whseName.trim();
    }

    public String getWhseAddress() {
        return whseAddress;
    }

    public void setWhseAddress(String whseAddress) {
        this.whseAddress = whseAddress == null ? null : whseAddress.trim();
    }

    public String getWhseTel() {
        return whseTel;
    }

    public void setWhseTel(String whseTel) {
        this.whseTel = whseTel == null ? null : whseTel.trim();
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
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public String toString(){
        return JSON.toJSONString(this);
    }
}