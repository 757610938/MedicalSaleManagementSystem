package com.medicalSaleManagementSystem.core.model.VO;

/**
 * Copyright (C), 2006-2010, ChengDu Lovo info. Co., Ltd.
 * FileName: Test.java
 *
 * @author 林贤钦
 * @version 1.00
 * @Date 2019/12/19
 */
public class ValueVo {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ValueVo{" +
                "value='" + value + '\'' +
                '}';
    }
}
