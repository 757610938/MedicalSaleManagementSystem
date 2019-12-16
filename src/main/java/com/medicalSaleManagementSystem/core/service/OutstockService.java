package com.medicalSaleManagementSystem.core.service;

import com.medicalSaleManagementSystem.core.model.VO.OutstockApplyVO;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.Warehouse;
import com.medicalSaleManagementSystem.util.message.Resp;

import java.util.List;

public interface OutstockService {

    /**
     * 生成出库申请单
     * @param outstockApplyRecord
     */
    void addOutstock(OutstockApplyRecord outstockApplyRecord);

    /**
     * 出库申请单列表
     * @return
     */
    List<OutstockApplyRecord> findAllOutstockApply();

    /**
     * 更改审核状态
     * @param outstockApplyVO
     * @return
     */
    Resp updateOutstockApplyValid(OutstockApplyVO outstockApplyVO);

    int updateValidByoutstockApplyId(Integer outstockApplyId,Integer valid);
}
