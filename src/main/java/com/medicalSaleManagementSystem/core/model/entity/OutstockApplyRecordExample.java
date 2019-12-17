package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutstockApplyRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstockApplyRecordExample() {
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

        public Criteria andOutstockApplyIdIsNull() {
            addCriterion("outstock_apply_id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdIsNotNull() {
            addCriterion("outstock_apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdEqualTo(Integer value) {
            addCriterion("outstock_apply_id =", value, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdNotEqualTo(Integer value) {
            addCriterion("outstock_apply_id <>", value, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdGreaterThan(Integer value) {
            addCriterion("outstock_apply_id >", value, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_apply_id >=", value, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdLessThan(Integer value) {
            addCriterion("outstock_apply_id <", value, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_apply_id <=", value, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdIn(List<Integer> values) {
            addCriterion("outstock_apply_id in", values, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdNotIn(List<Integer> values) {
            addCriterion("outstock_apply_id not in", values, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdBetween(Integer value1, Integer value2) {
            addCriterion("outstock_apply_id between", value1, value2, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_apply_id not between", value1, value2, "outstockApplyId");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberIsNull() {
            addCriterion("outstock_Dtl_Number is null");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberIsNotNull() {
            addCriterion("outstock_Dtl_Number is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberEqualTo(String value) {
            addCriterion("outstock_Dtl_Number =", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotEqualTo(String value) {
            addCriterion("outstock_Dtl_Number <>", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberGreaterThan(String value) {
            addCriterion("outstock_Dtl_Number >", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Dtl_Number >=", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberLessThan(String value) {
            addCriterion("outstock_Dtl_Number <", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberLessThanOrEqualTo(String value) {
            addCriterion("outstock_Dtl_Number <=", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberLike(String value) {
            addCriterion("outstock_Dtl_Number like", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotLike(String value) {
            addCriterion("outstock_Dtl_Number not like", value, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberIn(List<String> values) {
            addCriterion("outstock_Dtl_Number in", values, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotIn(List<String> values) {
            addCriterion("outstock_Dtl_Number not in", values, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberBetween(String value1, String value2) {
            addCriterion("outstock_Dtl_Number between", value1, value2, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockDtlNumberNotBetween(String value1, String value2) {
            addCriterion("outstock_Dtl_Number not between", value1, value2, "outstockDtlNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeIsNull() {
            addCriterion("outstock_time is null");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeIsNotNull() {
            addCriterion("outstock_time is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeEqualTo(Date value) {
            addCriterion("outstock_time =", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeNotEqualTo(Date value) {
            addCriterion("outstock_time <>", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeGreaterThan(Date value) {
            addCriterion("outstock_time >", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("outstock_time >=", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeLessThan(Date value) {
            addCriterion("outstock_time <", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeLessThanOrEqualTo(Date value) {
            addCriterion("outstock_time <=", value, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeIn(List<Date> values) {
            addCriterion("outstock_time in", values, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeNotIn(List<Date> values) {
            addCriterion("outstock_time not in", values, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeBetween(Date value1, Date value2) {
            addCriterion("outstock_time between", value1, value2, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andOutstockTimeNotBetween(Date value1, Date value2) {
            addCriterion("outstock_time not between", value1, value2, "outstockTime");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNull() {
            addCriterion("user_Number is null");
            return (Criteria) this;
        }

        public Criteria andUserNumberIsNotNull() {
            addCriterion("user_Number is not null");
            return (Criteria) this;
        }

        public Criteria andUserNumberEqualTo(Integer value) {
            addCriterion("user_Number =", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotEqualTo(Integer value) {
            addCriterion("user_Number <>", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThan(Integer value) {
            addCriterion("user_Number >", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Number >=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThan(Integer value) {
            addCriterion("user_Number <", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberLessThanOrEqualTo(Integer value) {
            addCriterion("user_Number <=", value, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberIn(List<Integer> values) {
            addCriterion("user_Number in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotIn(List<Integer> values) {
            addCriterion("user_Number not in", values, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberBetween(Integer value1, Integer value2) {
            addCriterion("user_Number between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andUserNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Number not between", value1, value2, "userNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryIsNull() {
            addCriterion("outstock_Apply_Category is null");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryIsNotNull() {
            addCriterion("outstock_Apply_Category is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryEqualTo(String value) {
            addCriterion("outstock_Apply_Category =", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryNotEqualTo(String value) {
            addCriterion("outstock_Apply_Category <>", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryGreaterThan(String value) {
            addCriterion("outstock_Apply_Category >", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Apply_Category >=", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryLessThan(String value) {
            addCriterion("outstock_Apply_Category <", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryLessThanOrEqualTo(String value) {
            addCriterion("outstock_Apply_Category <=", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryLike(String value) {
            addCriterion("outstock_Apply_Category like", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryNotLike(String value) {
            addCriterion("outstock_Apply_Category not like", value, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryIn(List<String> values) {
            addCriterion("outstock_Apply_Category in", values, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryNotIn(List<String> values) {
            addCriterion("outstock_Apply_Category not in", values, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryBetween(String value1, String value2) {
            addCriterion("outstock_Apply_Category between", value1, value2, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyCategoryNotBetween(String value1, String value2) {
            addCriterion("outstock_Apply_Category not between", value1, value2, "outstockApplyCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkIsNull() {
            addCriterion("outstock_Apply_Remark is null");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkIsNotNull() {
            addCriterion("outstock_Apply_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkEqualTo(String value) {
            addCriterion("outstock_Apply_Remark =", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkNotEqualTo(String value) {
            addCriterion("outstock_Apply_Remark <>", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkGreaterThan(String value) {
            addCriterion("outstock_Apply_Remark >", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Apply_Remark >=", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkLessThan(String value) {
            addCriterion("outstock_Apply_Remark <", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkLessThanOrEqualTo(String value) {
            addCriterion("outstock_Apply_Remark <=", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkLike(String value) {
            addCriterion("outstock_Apply_Remark like", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkNotLike(String value) {
            addCriterion("outstock_Apply_Remark not like", value, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkIn(List<String> values) {
            addCriterion("outstock_Apply_Remark in", values, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkNotIn(List<String> values) {
            addCriterion("outstock_Apply_Remark not in", values, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkBetween(String value1, String value2) {
            addCriterion("outstock_Apply_Remark between", value1, value2, "outstockApplyRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockApplyRemarkNotBetween(String value1, String value2) {
            addCriterion("outstock_Apply_Remark not between", value1, value2, "outstockApplyRemark");
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

        public Criteria andOutstockAmountIsNull() {
            addCriterion("outstock_Amount is null");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountIsNotNull() {
            addCriterion("outstock_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountEqualTo(Integer value) {
            addCriterion("outstock_Amount =", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountNotEqualTo(Integer value) {
            addCriterion("outstock_Amount <>", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountGreaterThan(Integer value) {
            addCriterion("outstock_Amount >", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_Amount >=", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountLessThan(Integer value) {
            addCriterion("outstock_Amount <", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_Amount <=", value, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountIn(List<Integer> values) {
            addCriterion("outstock_Amount in", values, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountNotIn(List<Integer> values) {
            addCriterion("outstock_Amount not in", values, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Amount between", value1, value2, "outstockAmount");
            return (Criteria) this;
        }

        public Criteria andOutstockAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Amount not between", value1, value2, "outstockAmount");
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