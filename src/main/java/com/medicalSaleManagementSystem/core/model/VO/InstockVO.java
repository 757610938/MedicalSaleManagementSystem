package com.medicalSaleManagementSystem.core.model.VO;

import java.util.Date;
import java.util.List;

public class InstockVO {

    private List<InstockDtlVO> instockDtlVOList;

    private Integer instockId;

    private String instockNumber;

    private String instockCategory;

    private String userNumber;

    private Date instockTime;

    private Integer instockDtlId;

    private String instockRemark;

    @Override
    public String toString() {
        return "InstockVO{" +
                "instockDtlVOList=" + instockDtlVOList +
                ", instockId=" + instockId +
                ", instockNumber='" + instockNumber + '\'' +
                ", instockCategory='" + instockCategory + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", instockTime=" + instockTime +
                ", instockDtlId=" + instockDtlId +
                ", instockRemark='" + instockRemark + '\'' +
                '}';
    }

    public List<InstockDtlVO> getInstockDtlVOList() {
        return instockDtlVOList;
    }

    public void setInstockDtlVOList(List<InstockDtlVO> instockDtlVOList) {
        this.instockDtlVOList = instockDtlVOList;
    }

    public Integer getInstockId() {
        return instockId;
    }

    public void setInstockId(Integer instockId) {
        this.instockId = instockId;
    }

    public String getInstockNumber() {
        return instockNumber;
    }

    public void setInstockNumber(String instockNumber) {
        this.instockNumber = instockNumber;
    }

    public String getInstockCategory() {
        return instockCategory;
    }

    public void setInstockCategory(String instockCategory) {
        this.instockCategory = instockCategory;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public Date getInstockTime() {
        return instockTime;
    }

    public void setInstockTime(Date instockTime) {
        this.instockTime = instockTime;
    }

    public Integer getInstockDtlId() {
        return instockDtlId;
    }

    public void setInstockDtlId(Integer instockDtlId) {
        this.instockDtlId = instockDtlId;
    }

    public String getInstockRemark() {
        return instockRemark;
    }

    public void setInstockRemark(String instockRemark) {
        this.instockRemark = instockRemark;
    }
}
