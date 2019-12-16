package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.OutstockApplyRecordMapper;
import com.medicalSaleManagementSystem.core.model.entity.OutstockApplyRecord;
import com.medicalSaleManagementSystem.core.service.OutstockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutstockServiceImpl implements OutstockService {

    @Autowired
    OutstockApplyRecordMapper outstockApplyRecordMapper;

    /**
     * 生成出库申请单
     * @param outstockApplyRecord
     */
    @Override
    public void addOutstock(OutstockApplyRecord outstockApplyRecord) {
        outstockApplyRecordMapper.insertSelective(outstockApplyRecord);
    }
}
