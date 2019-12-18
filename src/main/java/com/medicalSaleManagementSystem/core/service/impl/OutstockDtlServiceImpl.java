package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.OutstockDtlMapper;
import com.medicalSaleManagementSystem.core.model.BO.OutstockDtlBO;
import com.medicalSaleManagementSystem.core.model.entity.OutstockDtl;
import com.medicalSaleManagementSystem.core.service.OutstockDtlService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutstockDtlServiceImpl implements OutstockDtlService {

    @Autowired
    OutstockDtlMapper outstockDtlMapper;

    @Override
    public int insertSelective(OutstockDtlBO record) {
        try {
            if ("".equals(record.getOutstockNumber())||record.getOutstockNumber()==null){
                return 0;//如果出库单的编号为空，返回0
            }
            OutstockDtl outstockDtl = new OutstockDtl();
            BeanUtilEx.copyProperties(outstockDtl,record);
            //生成出库项编号
            String  OutstockDtlNumber= OrderCodeFactory.getOutstockDtlCode(TypeCastHelper.toLong(80000));
            outstockDtl.setOutstockDtlNumber(OutstockDtlNumber);
            return outstockDtlMapper.insertSelective(outstockDtl);//生成出库项
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
