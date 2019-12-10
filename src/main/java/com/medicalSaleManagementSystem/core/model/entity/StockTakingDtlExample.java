package com.medicalSaleManagementSystem.core.model.entity;

import java.util.ArrayList;
import java.util.List;

public class StockTakingDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockTakingDtlExample() {
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

        public Criteria andStockTakingDtlIdIsNull() {
            addCriterion("stock_Taking_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdIsNotNull() {
            addCriterion("stock_Taking_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_id =", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_id <>", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdGreaterThan(Integer value) {
            addCriterion("stock_Taking_Dtl_id >", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_id >=", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdLessThan(Integer value) {
            addCriterion("stock_Taking_Dtl_id <", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_id <=", value, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdIn(List<Integer> values) {
            addCriterion("stock_Taking_Dtl_id in", values, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotIn(List<Integer> values) {
            addCriterion("stock_Taking_Dtl_id not in", values, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_Taking_Dtl_id between", value1, value2, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_Taking_Dtl_id not between", value1, value2, "stockTakingDtlId");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberIsNull() {
            addCriterion("stock_Taking_Dtl_Number is null");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberIsNotNull() {
            addCriterion("stock_Taking_Dtl_Number is not null");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_Number =", value, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberNotEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_Number <>", value, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberGreaterThan(Integer value) {
            addCriterion("stock_Taking_Dtl_Number >", value, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_Number >=", value, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberLessThan(Integer value) {
            addCriterion("stock_Taking_Dtl_Number <", value, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberLessThanOrEqualTo(Integer value) {
            addCriterion("stock_Taking_Dtl_Number <=", value, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberIn(List<Integer> values) {
            addCriterion("stock_Taking_Dtl_Number in", values, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberNotIn(List<Integer> values) {
            addCriterion("stock_Taking_Dtl_Number not in", values, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberBetween(Integer value1, Integer value2) {
            addCriterion("stock_Taking_Dtl_Number between", value1, value2, "stockTakingDtlNumber");
            return (Criteria) this;
        }

        public Criteria andStockTakingDtlNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_Taking_Dtl_Number not between", value1, value2, "stockTakingDtlNumber");
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

        public Criteria andTakingMedicineAmountIsNull() {
            addCriterion("taking_Medicine_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountIsNotNull() {
            addCriterion("taking_Medicine_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountEqualTo(Integer value) {
            addCriterion("taking_Medicine_Amount =", value, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountNotEqualTo(Integer value) {
            addCriterion("taking_Medicine_Amount <>", value, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountGreaterThan(Integer value) {
            addCriterion("taking_Medicine_Amount >", value, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("taking_Medicine_Amount >=", value, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountLessThan(Integer value) {
            addCriterion("taking_Medicine_Amount <", value, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountLessThanOrEqualTo(Integer value) {
            addCriterion("taking_Medicine_Amount <=", value, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountIn(List<Integer> values) {
            addCriterion("taking_Medicine_Amount in", values, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountNotIn(List<Integer> values) {
            addCriterion("taking_Medicine_Amount not in", values, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountBetween(Integer value1, Integer value2) {
            addCriterion("taking_Medicine_Amount between", value1, value2, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingMedicineAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("taking_Medicine_Amount not between", value1, value2, "takingMedicineAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountIsNull() {
            addCriterion("taking_Update_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountIsNotNull() {
            addCriterion("taking_Update_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountEqualTo(Integer value) {
            addCriterion("taking_Update_Amount =", value, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountNotEqualTo(Integer value) {
            addCriterion("taking_Update_Amount <>", value, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountGreaterThan(Integer value) {
            addCriterion("taking_Update_Amount >", value, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("taking_Update_Amount >=", value, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountLessThan(Integer value) {
            addCriterion("taking_Update_Amount <", value, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountLessThanOrEqualTo(Integer value) {
            addCriterion("taking_Update_Amount <=", value, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountIn(List<Integer> values) {
            addCriterion("taking_Update_Amount in", values, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountNotIn(List<Integer> values) {
            addCriterion("taking_Update_Amount not in", values, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountBetween(Integer value1, Integer value2) {
            addCriterion("taking_Update_Amount between", value1, value2, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingUpdateAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("taking_Update_Amount not between", value1, value2, "takingUpdateAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountIsNull() {
            addCriterion("taking_Reimburse_Amount is null");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountIsNotNull() {
            addCriterion("taking_Reimburse_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountEqualTo(Integer value) {
            addCriterion("taking_Reimburse_Amount =", value, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountNotEqualTo(Integer value) {
            addCriterion("taking_Reimburse_Amount <>", value, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountGreaterThan(Integer value) {
            addCriterion("taking_Reimburse_Amount >", value, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("taking_Reimburse_Amount >=", value, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountLessThan(Integer value) {
            addCriterion("taking_Reimburse_Amount <", value, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountLessThanOrEqualTo(Integer value) {
            addCriterion("taking_Reimburse_Amount <=", value, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountIn(List<Integer> values) {
            addCriterion("taking_Reimburse_Amount in", values, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountNotIn(List<Integer> values) {
            addCriterion("taking_Reimburse_Amount not in", values, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountBetween(Integer value1, Integer value2) {
            addCriterion("taking_Reimburse_Amount between", value1, value2, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingReimburseAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("taking_Reimburse_Amount not between", value1, value2, "takingReimburseAmount");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkIsNull() {
            addCriterion("taking_Remark is null");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkIsNotNull() {
            addCriterion("taking_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkEqualTo(String value) {
            addCriterion("taking_Remark =", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotEqualTo(String value) {
            addCriterion("taking_Remark <>", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkGreaterThan(String value) {
            addCriterion("taking_Remark >", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("taking_Remark >=", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkLessThan(String value) {
            addCriterion("taking_Remark <", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkLessThanOrEqualTo(String value) {
            addCriterion("taking_Remark <=", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkLike(String value) {
            addCriterion("taking_Remark like", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotLike(String value) {
            addCriterion("taking_Remark not like", value, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkIn(List<String> values) {
            addCriterion("taking_Remark in", values, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotIn(List<String> values) {
            addCriterion("taking_Remark not in", values, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkBetween(String value1, String value2) {
            addCriterion("taking_Remark between", value1, value2, "takingRemark");
            return (Criteria) this;
        }

        public Criteria andTakingRemarkNotBetween(String value1, String value2) {
            addCriterion("taking_Remark not between", value1, value2, "takingRemark");
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