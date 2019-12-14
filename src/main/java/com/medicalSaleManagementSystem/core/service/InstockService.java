package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.entity.InstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockCheckRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockRecord;

public interface InstockService {

    /**
     * 新增入库申请表
     * @param instockApplyRecord
     */
    void addInstockApply(InstockApplyRecord instockApplyRecord);

    /**
     * 新增入库审核表
     * @param instockCheckRecord
     */
    void addInstockCheck(InstockCheckRecord instockCheckRecord);

    /**
     * 新增入库表
     * @param instockRecord
     */
    void addInstock(InstockRecord instockRecord);
}
