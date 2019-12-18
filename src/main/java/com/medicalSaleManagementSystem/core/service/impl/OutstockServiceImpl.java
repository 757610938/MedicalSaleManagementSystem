package com.medicalSaleManagementSystem.core.service.impl;

import com.medicalSaleManagementSystem.core.dao.OutstockDtlMapper;
import com.medicalSaleManagementSystem.core.dao.OutstockApplyRecordMapper;
import com.medicalSaleManagementSystem.core.dao.OutstockRecordMapper;
import com.medicalSaleManagementSystem.core.model.BO.OutstockBO;
import com.medicalSaleManagementSystem.core.model.BO.OutstockDtlBO;
import com.medicalSaleManagementSystem.core.model.VO.OutstockApplyVO;
import com.medicalSaleManagementSystem.core.model.entity.*;
import com.medicalSaleManagementSystem.core.service.OutstockDtlService;
import com.medicalSaleManagementSystem.core.service.OutstockService;
import com.medicalSaleManagementSystem.util.BeanUtilEx;
import com.medicalSaleManagementSystem.util.OrderCodeFactory;
import com.medicalSaleManagementSystem.util.TypeCastHelper;
import com.medicalSaleManagementSystem.util.message.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OutstockServiceImpl implements OutstockService {

    @Autowired
    OutstockApplyRecordMapper outstockApplyRecordMapper;

    @Autowired
    OutstockRecordMapper outstockRecordMapper;

    @Autowired
    OutstockDtlMapper outstockDtlMapper;

    @Autowired
    OutstockService outstockService;

    @Autowired
    OutstockDtlService outstockDtlService;


    /**
     * 生成出库申请单
     *
     * @param outstockApplyRecord
     */
    @Override
    public void addOutstock(OutstockApplyRecord outstockApplyRecord) {
        outstockApplyRecordMapper.insertSelective(outstockApplyRecord);
    }

    /**
     * 生成出库单
     * @param outstocRecord
     */
    public void addOutstockRecord(OutstockRecord outstocRecord){
        outstockRecordMapper.insertSelective(outstocRecord);
    }

    /**
     * 查询所有的出库申请单记录
     * @return
     */
    @Override
    public List<OutstockApplyRecord> findAllOutstockApply() {
        return outstockApplyRecordMapper.selectAll(null);
    }

    /**
     * 修改出库申请单审核状态
     * @param outstockApplyVO
     * @return
     */
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
        if (valid == 1) {  //1为已审核状态
            return openValidByPrimaryKey(outstockApplyId);
        } else if (valid == 0) { //0为未审核状态
            return closeValidByPrimaryKey(outstockApplyId);
        }
        return 0;
    }

    /**
     * 添加出库详细项
     * @param record
     * @return
     */
    @Override
    public String addOutstockDtl(OutstockBO record) {
        try {
            //创建出库单
            String result = insertSelective(record);

            if (result==null||"".equals(result)||result=="400"||result=="500"){
                return  result;//出库单存入错误
            }
            System.out.println(result);
            //遍历record.getOutstockDtlBOList()
            for (OutstockDtlBO outstockDtlBO : record.getOutstockDtlBOList()) {
                //为每一项添加出库单编号
                outstockDtlBO.setOutstockNumber(result);
                //添加出库详细项
                int i = outstockDtlService.insertSelective(outstockDtlBO);
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
    public String insertSelective(OutstockBO record) {
        try {

            OutstockRecord outstockRecord = new OutstockRecord();
            BeanUtilEx.copyProperties(outstockRecord,record);
            String outstockNumber= OrderCodeFactory.getPurchaseCode(TypeCastHelper.toLong(70000));
            outstockRecord.setOutstockNumber(outstockNumber);//生成单号

            int i = outstockRecordMapper.insertSelective(outstockRecord);
            if (i==0){
                return  "400";
            }
            return outstockNumber;
        }catch (Exception e){
            e.printStackTrace();
        }
        return "500";
    }

    /**
     * 根据outstockNumber查询出库单和出库单详细项
     * @param outstockNumber
     * @return
     */
    @Override
    public OutstockBO selectOutstockAndDtlByOutstockNumber(String outstockNumber) {
        try{
            OutstockBO outstockBO = outstockRecordMapper.selectOutstockAndDtlByOutstockNumber(outstockNumber);
            if (outstockBO==null){
                return selectOutstockByOutstockNumber(outstockNumber);
            }
            return outstockBO;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据outstockNumber查询出库单
     * @param outstockNumber
     * @return
     */
    @Override
    public OutstockBO selectOutstockByOutstockNumber(String outstockNumber) {
        try{
            return outstockRecordMapper.selectOutstockByOutstockNumber(outstockNumber);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 查询所有的出库单记录
     * @return
     */
    @Override
    public List<OutstockRecord> selectAllOutstock() {
        return outstockRecordMapper.selectAllOutstock();
    }

    /**
     * 获取所有出库单编号
     * @return
     */
    @Override
    public List<Integer> selectAllOutstockNumber() {
        return outstockRecordMapper.selectAllOutstockNumber();
    }

    /**
     * 通过outstockApplyId查询出库申请单
     * @param outstockApplyId
     * @return
     */
    public OutstockApplyRecord findOutstockApplyById(Integer outstockApplyId) {
        return outstockApplyRecordMapper.selectByPrimaryKey(outstockApplyId);
    }


    private int closeValidByPrimaryKey(Integer outstockApplyId) {
        try {
            OutstockApplyRecord outstockApplyRecord = new OutstockApplyRecord();
            outstockApplyRecord.setOutstockApplyId(outstockApplyId);
            outstockApplyRecord.setValid(0);
            return outstockApplyRecordMapper.updateByPrimaryKeySelective(outstockApplyRecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private int openValidByPrimaryKey(Integer outstockApplyId) {
        try {
            OutstockApplyRecord outstockApplyRecord = new OutstockApplyRecord();
            outstockApplyRecord.setOutstockApplyId(outstockApplyId);
            outstockApplyRecord.setValid(1);
            return outstockApplyRecordMapper.updateByPrimaryKeySelective(outstockApplyRecord);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
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
