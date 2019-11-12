package com.medicalSaleManagementSystem.core.bean.POJO;

public class Department {
    private Integer deptId;

    private String deptName;

    private String deptLeaderName;

    private String deptIntro;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptLeaderName() {
        return deptLeaderName;
    }

    public void setDeptLeaderName(String deptLeaderName) {
        this.deptLeaderName = deptLeaderName == null ? null : deptLeaderName.trim();
    }

    public String getDeptIntro() {
        return deptIntro;
    }

    public void setDeptIntro(String deptIntro) {
        this.deptIntro = deptIntro == null ? null : deptIntro.trim();
    }
}