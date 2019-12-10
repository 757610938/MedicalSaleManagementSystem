package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class InstockDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstockDtlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andInstockDtlIdIsNull() {
            addCriterion("instock_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIsNotNull() {
            addCriterion("instock_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdEqualTo(Integer value) {
            addCriterion("instock_Dtl_id =", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotEqualTo(Integer value) {
            addCriterion("instock_Dtl_id <>", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdGreaterThan(Integer value) {
            addCriterion("instock_Dtl_id >", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_Dtl_id >=", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdLessThan(Integer value) {
            addCriterion("instock_Dtl_id <", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("instock_Dtl_id <=", value, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdIn(List<Integer> values) {
            addCriterion("instock_Dtl_id in", values, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotIn(List<Integer> values) {
            addCriterion("instock_Dtl_id not in", values, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("instock_Dtl_id between", value1, value2, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andInstockDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_Dtl_id not between", value1, value2, "instockDtlId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNull() {
            addCriterion("medicine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIsNotNull() {
            addCriterion("medicine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedicineIdEqualTo(Integer value) {
            addCriterion("medicine_id =", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotEqualTo(Integer value) {
            addCriterion("medicine_id <>", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThan(Integer value) {
            addCriterion("medicine_id >", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medicine_id >=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThan(Integer value) {
            addCriterion("medicine_id <", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdLessThanOrEqualTo(Integer value) {
            addCriterion("medicine_id <=", value, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdIn(List<Integer> values) {
            addCriterion("medicine_id in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotIn(List<Integer> values) {
            addCriterion("medicine_id not in", values, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andMedicineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medicine_id not between", value1, value2, "medicineId");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountIsNull() {
            addCriterion("check_Medicine_Amount is null");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountIsNotNull() {
            addCriterion("check_Medicine_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountEqualTo(Integer value) {
            addCriterion("check_Medicine_Amount =", value, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountNotEqualTo(Integer value) {
            addCriterion("check_Medicine_Amount <>", value, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountGreaterThan(Integer value) {
            addCriterion("check_Medicine_Amount >", value, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_Medicine_Amount >=", value, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountLessThan(Integer value) {
            addCriterion("check_Medicine_Amount <", value, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountLessThanOrEqualTo(Integer value) {
            addCriterion("check_Medicine_Amount <=", value, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountIn(List<Integer> values) {
            addCriterion("check_Medicine_Amount in", values, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountNotIn(List<Integer> values) {
            addCriterion("check_Medicine_Amount not in", values, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountBetween(Integer value1, Integer value2) {
            addCriterion("check_Medicine_Amount between", value1, value2, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckMedicineAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("check_Medicine_Amount not between", value1, value2, "checkMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountIsNull() {
            addCriterion("check_Pass_Amount is null");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountIsNotNull() {
            addCriterion("check_Pass_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountEqualTo(Integer value) {
            addCriterion("check_Pass_Amount =", value, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountNotEqualTo(Integer value) {
            addCriterion("check_Pass_Amount <>", value, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountGreaterThan(Integer value) {
            addCriterion("check_Pass_Amount >", value, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_Pass_Amount >=", value, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountLessThan(Integer value) {
            addCriterion("check_Pass_Amount <", value, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountLessThanOrEqualTo(Integer value) {
            addCriterion("check_Pass_Amount <=", value, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountIn(List<Integer> values) {
            addCriterion("check_Pass_Amount in", values, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountNotIn(List<Integer> values) {
            addCriterion("check_Pass_Amount not in", values, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountBetween(Integer value1, Integer value2) {
            addCriterion("check_Pass_Amount between", value1, value2, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckPassAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("check_Pass_Amount not between", value1, value2, "checkPassAmount");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNull() {
            addCriterion("check_Remark is null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIsNotNull() {
            addCriterion("check_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkEqualTo(String value) {
            addCriterion("check_Remark =", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotEqualTo(String value) {
            addCriterion("check_Remark <>", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThan(String value) {
            addCriterion("check_Remark >", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("check_Remark >=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThan(String value) {
            addCriterion("check_Remark <", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
            addCriterion("check_Remark <=", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkLike(String value) {
            addCriterion("check_Remark like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotLike(String value) {
            addCriterion("check_Remark not like", value, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkIn(List<String> values) {
            addCriterion("check_Remark in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotIn(List<String> values) {
            addCriterion("check_Remark not in", values, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkBetween(String value1, String value2) {
            addCriterion("check_Remark between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andCheckRemarkNotBetween(String value1, String value2) {
            addCriterion("check_Remark not between", value1, value2, "checkRemark");
            return (Criteria) this;
        }

        public Criteria andWhseIdIsNull() {
            addCriterion("whse_id is null");
            return (Criteria) this;
        }

        public Criteria andWhseIdIsNotNull() {
            addCriterion("whse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhseIdEqualTo(Integer value) {
            addCriterion("whse_id =", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdNotEqualTo(Integer value) {
            addCriterion("whse_id <>", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdGreaterThan(Integer value) {
            addCriterion("whse_id >", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("whse_id >=", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdLessThan(Integer value) {
            addCriterion("whse_id <", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdLessThanOrEqualTo(Integer value) {
            addCriterion("whse_id <=", value, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdIn(List<Integer> values) {
            addCriterion("whse_id in", values, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdNotIn(List<Integer> values) {
            addCriterion("whse_id not in", values, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdBetween(Integer value1, Integer value2) {
            addCriterion("whse_id between", value1, value2, "whseId");
            return (Criteria) this;
        }

        public Criteria andWhseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("whse_id not between", value1, value2, "whseId");
            return (Criteria) this;
        }

        public Criteria andInstockAmountIsNull() {
            addCriterion("instock_Amount is null");
            return (Criteria) this;
        }

        public Criteria andInstockAmountIsNotNull() {
            addCriterion("instock_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andInstockAmountEqualTo(Integer value) {
            addCriterion("instock_Amount =", value, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountNotEqualTo(Integer value) {
            addCriterion("instock_Amount <>", value, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountGreaterThan(Integer value) {
            addCriterion("instock_Amount >", value, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("instock_Amount >=", value, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountLessThan(Integer value) {
            addCriterion("instock_Amount <", value, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountLessThanOrEqualTo(Integer value) {
            addCriterion("instock_Amount <=", value, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountIn(List<Integer> values) {
            addCriterion("instock_Amount in", values, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountNotIn(List<Integer> values) {
            addCriterion("instock_Amount not in", values, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountBetween(Integer value1, Integer value2) {
            addCriterion("instock_Amount between", value1, value2, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("instock_Amount not between", value1, value2, "instockAmount");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIsNull() {
            addCriterion("instock_Remark is null");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIsNotNull() {
            addCriterion("instock_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkEqualTo(String value) {
            addCriterion("instock_Remark =", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotEqualTo(String value) {
            addCriterion("instock_Remark <>", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkGreaterThan(String value) {
            addCriterion("instock_Remark >", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("instock_Remark >=", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLessThan(String value) {
            addCriterion("instock_Remark <", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLessThanOrEqualTo(String value) {
            addCriterion("instock_Remark <=", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkLike(String value) {
            addCriterion("instock_Remark like", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotLike(String value) {
            addCriterion("instock_Remark not like", value, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkIn(List<String> values) {
            addCriterion("instock_Remark in", values, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotIn(List<String> values) {
            addCriterion("instock_Remark not in", values, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkBetween(String value1, String value2) {
            addCriterion("instock_Remark between", value1, value2, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andInstockRemarkNotBetween(String value1, String value2) {
            addCriterion("instock_Remark not between", value1, value2, "instockRemark");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNull() {
            addCriterion("apply_Amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNotNull() {
            addCriterion("apply_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountEqualTo(Integer value) {
            addCriterion("apply_Amount =", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotEqualTo(Integer value) {
            addCriterion("apply_Amount <>", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThan(Integer value) {
            addCriterion("apply_Amount >", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_Amount >=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThan(Integer value) {
            addCriterion("apply_Amount <", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThanOrEqualTo(Integer value) {
            addCriterion("apply_Amount <=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIn(List<Integer> values) {
            addCriterion("apply_Amount in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotIn(List<Integer> values) {
            addCriterion("apply_Amount not in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountBetween(Integer value1, Integer value2) {
            addCriterion("apply_Amount between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_Amount not between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkIsNull() {
            addCriterion("apply_Remark is null");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkIsNotNull() {
            addCriterion("apply_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkEqualTo(String value) {
            addCriterion("apply_Remark =", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotEqualTo(String value) {
            addCriterion("apply_Remark <>", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkGreaterThan(String value) {
            addCriterion("apply_Remark >", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("apply_Remark >=", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkLessThan(String value) {
            addCriterion("apply_Remark <", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkLessThanOrEqualTo(String value) {
            addCriterion("apply_Remark <=", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkLike(String value) {
            addCriterion("apply_Remark like", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotLike(String value) {
            addCriterion("apply_Remark not like", value, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkIn(List<String> values) {
            addCriterion("apply_Remark in", values, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotIn(List<String> values) {
            addCriterion("apply_Remark not in", values, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkBetween(String value1, String value2) {
            addCriterion("apply_Remark between", value1, value2, "applyRemark");
            return (Criteria) this;
        }

        public Criteria andApplyRemarkNotBetween(String value1, String value2) {
            addCriterion("apply_Remark not between", value1, value2, "applyRemark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}