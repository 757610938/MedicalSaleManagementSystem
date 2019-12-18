package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.InstockDtlMapper;
import com.medicalSaleManagementSystem.core.dao.InstockRecordMapper;
import com.medicalSaleManagementSystem.core.model.BO.InstockBO;
import com.medicalSaleManagementSystem.core.model.BO.InstockDtlBO;
import com.medicalSaleManagementSystem.core.model.BO.OutstockBO;
import com.medicalSaleManagementSystem.core.model.entity.InstockApplyRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockCheckRecord;
import com.medicalSaleManagementSystem.core.model.entity.InstockRecord;
import com.medicalSaleManagementSystem.core.model.entity.OutstockRecord;
import com.medicalSaleManagementSystem.core.service.InstockDtlService;
import com.medicalSaleManagementSystem.core.service.InstockService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstockServiceImpl implements InstockService {

    @Autowired
    InstockDtlService instockDtlService;

    @Autowired
    InstockService instockService;

    @Autowired
    InstockRecordMapper instockRecordMapper;

    @Autowired
    InstockDtlMapper instockDtlMapper;

    @Override
    public void addInstockApply(InstockApplyRecord instockApplyRecord) {

    }

    @Override
    public void addInstockCheck(InstockCheckRecord instockCheckRecord) {

    }

    @Override
    public void addInstock(InstockRecord instockRecord) {

    }

    @Override
    public List<InstockApplyRecord> findAllInstockApply() {
        return null;
    }

    @Override
    public List<InstockCheckRecord> findAllInstockCheck() {
        return null;
    }

    @Override
    public List<InstockRecord> findAllInstock() {
        return null;
    }

    @Override
    public String addInstockDtl(InstockBO record) {
        try {
            //创建入库单
            String result = insertSelective(record);

            if (result==null||"".equals(result)||result=="400"||result=="500"){
                return  result;//出库单存入错误
            }
            System.out.println(result);
            //遍历record.getOutstockDtlBOList()
            for (InstockDtlBO instockDtlBO : record.getInstockDtlList()) {
                //为每一项添加入库单编号
                instockDtlBO.setInstockNumber(result);
                //添加入库详细项
                int i = instockDtlService.insertSelective(instockDtlBO);
                if (i==0){
                    return "400";
                }
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "500";
    }

    @Override
    public String insertSelective(InstockBO record) {
        try {

            InstockRecord instockRecord = new InstockRecord();
            BeanUtilEx.copyProperties(instockRecord,record);
            String instockNumber= OrderCodeFactory.getPurchaseCode(TypeCastHelper.toLong(70000));
            instockRecord.setInstockNumber(instockNumber);//生成单号

            int i = instockRecordMapper.insertSelective(instockRecord);
            if (i==0){
                return  "400";
            }
            return instockNumber;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "500";
    }

    @Override
    public InstockBO selectInstockAndDtlByInstockNumber(String instockNumber) {
        try{
            InstockBO instockBO = instockRecordMapper.selectInstockAndDtlByInstockNumber(instockNumber);
            if (instockBO==null){
                return selectInstockByInstockNumber(instockNumber);
            }
            return instockBO;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据instockNumber查询入库单
     * @param instockNumber
     * @return
     */
    @Override
    public InstockBO selectInstockByInstockNumber(String instockNumber) {
        try{
            return instockRecordMapper.selectInstockByInstockNumber(instockNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<InstockRecord> selectAllInstock() {
        return instockRecordMapper.selectAllInstock();
    }
}
