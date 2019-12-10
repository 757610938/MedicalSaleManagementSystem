package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class ReimburseDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReimburseDtlExample() {
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

        public Criteria andReimburseDtlIdIsNull() {
            addCriterion("reimburse_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdIsNotNull() {
            addCriterion("reimburse_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdEqualTo(Integer value) {
            addCriterion("reimburse_Dtl_id =", value, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdNotEqualTo(Integer value) {
            addCriterion("reimburse_Dtl_id <>", value, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdGreaterThan(Integer value) {
            addCriterion("reimburse_Dtl_id >", value, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reimburse_Dtl_id >=", value, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdLessThan(Integer value) {
            addCriterion("reimburse_Dtl_id <", value, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("reimburse_Dtl_id <=", value, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdIn(List<Integer> values) {
            addCriterion("reimburse_Dtl_id in", values, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdNotIn(List<Integer> values) {
            addCriterion("reimburse_Dtl_id not in", values, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("reimburse_Dtl_id between", value1, value2, "reimburseDtlId");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reimburse_Dtl_id not between", value1, value2, "reimburseDtlId");
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

        public Criteria andReimburseAmountIsNull() {
            addCriterion("reimburse_Amount is null");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountIsNotNull() {
            addCriterion("reimburse_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountEqualTo(Integer value) {
            addCriterion("reimburse_Amount =", value, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountNotEqualTo(Integer value) {
            addCriterion("reimburse_Amount <>", value, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountGreaterThan(Integer value) {
            addCriterion("reimburse_Amount >", value, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reimburse_Amount >=", value, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountLessThan(Integer value) {
            addCriterion("reimburse_Amount <", value, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountLessThanOrEqualTo(Integer value) {
            addCriterion("reimburse_Amount <=", value, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountIn(List<Integer> values) {
            addCriterion("reimburse_Amount in", values, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountNotIn(List<Integer> values) {
            addCriterion("reimburse_Amount not in", values, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountBetween(Integer value1, Integer value2) {
            addCriterion("reimburse_Amount between", value1, value2, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("reimburse_Amount not between", value1, value2, "reimburseAmount");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkIsNull() {
            addCriterion("reimburse_Dtl_Remark is null");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkIsNotNull() {
            addCriterion("reimburse_Dtl_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkEqualTo(String value) {
            addCriterion("reimburse_Dtl_Remark =", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkNotEqualTo(String value) {
            addCriterion("reimburse_Dtl_Remark <>", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkGreaterThan(String value) {
            addCriterion("reimburse_Dtl_Remark >", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("reimburse_Dtl_Remark >=", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkLessThan(String value) {
            addCriterion("reimburse_Dtl_Remark <", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkLessThanOrEqualTo(String value) {
            addCriterion("reimburse_Dtl_Remark <=", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkLike(String value) {
            addCriterion("reimburse_Dtl_Remark like", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkNotLike(String value) {
            addCriterion("reimburse_Dtl_Remark not like", value, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkIn(List<String> values) {
            addCriterion("reimburse_Dtl_Remark in", values, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkNotIn(List<String> values) {
            addCriterion("reimburse_Dtl_Remark not in", values, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkBetween(String value1, String value2) {
            addCriterion("reimburse_Dtl_Remark between", value1, value2, "reimburseDtlRemark");
            return (Criteria) this;
        }

        public Criteria andReimburseDtlRemarkNotBetween(String value1, String value2) {
            addCriterion("reimburse_Dtl_Remark not between", value1, value2, "reimburseDtlRemark");
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