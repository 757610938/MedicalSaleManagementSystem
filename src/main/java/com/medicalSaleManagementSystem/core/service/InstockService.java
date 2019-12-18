package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.BO.InstockBO;
import com.medicalSaleManagementSystem.core.model.entity.InstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockCheckRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockRecord;

import java.util.List;

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

    /**
     * 查找所有入库申请记录
     * @return
     */
    List<InstockApplyRecord> findAllInstockApply();

    /**
     * 查找所有入库审核记录
     * @return
     */
    List<InstockCheckRecord> findAllInstockCheck();

    /**
     * 查找所有入库记录
     * @return
     */
    List<InstockRecord> findAllInstock();

    String addInstockDtl(InstockBO record);

    String insertSelective(InstockBO record);

    InstockBO selectInstockAndDtlByInstockNumber(String instockNumber);
    InstockBO selectInstockByInstockNumber(String instockNumber);

    List<InstockRecord> selectAllInstock();
}
