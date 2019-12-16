package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;

public interface OutstockService {

    /**
     * 生成出库申请单
     * @param outstockApplyRecord
     */
    void addOutstock(OutstockApplyRecord outstockApplyRecord);
}
