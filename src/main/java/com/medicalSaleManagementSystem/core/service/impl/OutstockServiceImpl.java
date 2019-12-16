package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.OutstockApplyRecordMapper;
import com.medicalSaleManagementSystem.core.model.VO.OutstockApplyVO;
import com.medicalSaleManagementSystem.core.model.VO.WarehouseVO;
import com.medicalSaleManagementSystem.core.model.entity.*;
import com.medicalSaleManagementSystem.core.service.OutstockService;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<OutstockApplyRecord> findAllOutstockApply() {
        return outstockApplyRecordMapper.selectAll(null);
    }

    @Override
    public Resp updateOutstockApplyValid(OutstockApplyVO outstockApplyVO) {
        try {
            if (outstockApplyVO.getOutstockApplyId() == null || outstockApplyVO.getOutstockApplyId() <= 0) {
                return Resp.fail("当前出库申请单ID为非法ID");
            }
            OutstockApplyRecord outstockApplyRecord = outstockApplyVOToEntity(outstockApplyVO);
            OutstockApplyRecordExample outstockApplyRecordExample = new OutstockApplyRecordExample();
            OutstockApplyRecordExample.Criteria criteria = outstockApplyRecordExample.createCriteria();
            criteria.andOutstockApplyIdEqualTo(outstockApplyRecord.getOutstockApplyId());
            List<OutstockApplyRecord> outstockApplyRecordList = outstockApplyRecordMapper.selectByExample(outstockApplyRecordExample);
            outstockApplyRecord.setOutstockApplyId(outstockApplyRecordList.get(0).getOutstockApplyId());
            outstockApplyRecordMapper.updateByPrimaryKeySelective(outstockApplyRecord);
        } catch (Exception e) {
            e.printStackTrace();
            return Resp.fail("审核失败，请重新再试一次");
        }

        return Resp.success("审核成功");
    }

    @Override
    public int updateValidByoutstockApplyId(Integer outstockApplyId, Integer valid) {
        if (valid==1){  //1为已审核状态
            return openValidByPrimaryKey(outstockApplyId);
        }
        else if (valid==0){ //0为未审核状态
            return closeValidByPrimaryKey(outstockApplyId);
        }
        return 0;
    }

    private int closeValidByPrimaryKey(Integer outstockApplyId){
        try{
            OutstockApplyRecord outstockApplyRecord = new OutstockApplyRecord();
            outstockApplyRecord.setOutstockApplyId(outstockApplyId);
            outstockApplyRecord.setValid(0);
            return outstockApplyRecordMapper.updateByPrimaryKeySelective(outstockApplyRecord);
        } catch (Exception e){
            e.printStackTrace();
        }
        return  0;
    }


    private int openValidByPrimaryKey(Integer outstockApplyId) {
        try{
            OutstockApplyRecord outstockApplyRecord = new OutstockApplyRecord();
            outstockApplyRecord.setOutstockApplyId(outstockApplyId);
            outstockApplyRecord.setValid(1);
            return outstockApplyRecordMapper.updateByPrimaryKeySelective(outstockApplyRecord);
        } catch (Exception e){
            e.printStackTrace();
        }
        return  0;
    }

    private OutstockApplyRecord outstockApplyVOToEntity(OutstockApplyVO outstockApplyVO) {
        OutstockApplyRecord outstockApplyRecord = new OutstockApplyRecord();
        if (outstockApplyVO.getOutstockApplyId() != null) {
            outstockApplyRecord.setOutstockApplyId(outstockApplyVO.getOutstockApplyId());
        }
        if (outstockApplyVO.getMedicineId() != null) {
            outstockApplyRecord.setMedicineId(outstockApplyVO.getMedicineId());
        }
        if (outstockApplyVO.getOutstockAmount() != null) {
            outstockApplyRecord.setOutstockAmount(outstockApplyVO.getOutstockAmount());
        }
        if (outstockApplyVO.getOutstockApplyCategory() != null) {
            outstockApplyRecord.setOutstockApplyCategory(outstockApplyVO.getOutstockApplyCategory());
        }
        if (outstockApplyVO.getOutstockApplyRemark() != null) {
            outstockApplyRecord.setOutstockApplyRemark(outstockApplyVO.getOutstockApplyRemark());
        }
        if (outstockApplyVO.getValid() != null) {
            outstockApplyRecord.setValid(outstockApplyVO.getValid());
        }
        if (outstockApplyVO.getOutstockDtlNumber() != null) {
            outstockApplyRecord.setOutstockDtlNumber(outstockApplyVO.getOutstockDtlNumber());
        }
        if (outstockApplyVO.getUserNumber() != null) {
            outstockApplyRecord.setUserNumber(outstockApplyVO.getUserNumber());
        }
        if (outstockApplyVO.getOutstockTime() != null) {
            outstockApplyRecord.setOutstockTime(outstockApplyVO.getOutstockTime());
        }



        return outstockApplyRecord;
    }
}
