package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.InstockDtlMapper;
import com.medicalSaleManagementSystem.core.model.BO.InstockDtlBO;
import com.medicalSaleManagementSystem.core.model.entity.InstockDtl;
import com.medicalSaleManagementSystem.core.model.entity.OutstockDtl;
import com.medicalSaleManagementSystem.core.service.InstockDtlService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstockDtlServiceImpl implements InstockDtlService {

    @Autowired
    InstockDtlMapper instockDtlMapper;

    @Override
    public int insertSelective(InstockDtlBO record) {
        try {
            if ("".equals(record.getInstockNumber())||record.getInstockNumber()==null){
                return 0;//如果入库单的编号为空，返回0
            }
            InstockDtl instockDtl = new InstockDtl();
            BeanUtilEx.copyProperties(instockDtl,record);
            //生成入库项编号
            String  InstockDtlNumber= OrderCodeFactory.getOutstockDtlCode(TypeCastHelper.toLong(80000));
            instockDtl.setInstockDtlNumber(InstockDtlNumber);
            return instockDtlMapper.insertSelective(instockDtl);//生成入库项
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}
