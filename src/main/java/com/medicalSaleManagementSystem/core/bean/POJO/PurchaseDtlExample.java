package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.List;

public class PurchaseDtlExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseDtlExample() {
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

        public Criteria andPurDtlIdIsNull() {
            addCriterion("pur_Dtl_id is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdIsNotNull() {
            addCriterion("pur_Dtl_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdEqualTo(Integer value) {
            addCriterion("pur_Dtl_id =", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdNotEqualTo(Integer value) {
            addCriterion("pur_Dtl_id <>", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdGreaterThan(Integer value) {
            addCriterion("pur_Dtl_id >", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_id >=", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdLessThan(Integer value) {
            addCriterion("pur_Dtl_id <", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdLessThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_id <=", value, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdIn(List<Integer> values) {
            addCriterion("pur_Dtl_id in", values, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdNotIn(List<Integer> values) {
            addCriterion("pur_Dtl_id not in", values, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_id between", value1, value2, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_id not between", value1, value2, "purDtlId");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidIsNull() {
            addCriterion("pur_Dtl_OrderId is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidIsNotNull() {
            addCriterion("pur_Dtl_OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidEqualTo(String value) {
            addCriterion("pur_Dtl_OrderId =", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidNotEqualTo(String value) {
            addCriterion("pur_Dtl_OrderId <>", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidGreaterThan(String value) {
            addCriterion("pur_Dtl_OrderId >", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_OrderId >=", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidLessThan(String value) {
            addCriterion("pur_Dtl_OrderId <", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_OrderId <=", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidLike(String value) {
            addCriterion("pur_Dtl_OrderId like", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidNotLike(String value) {
            addCriterion("pur_Dtl_OrderId not like", value, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidIn(List<String> values) {
            addCriterion("pur_Dtl_OrderId in", values, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidNotIn(List<String> values) {
            addCriterion("pur_Dtl_OrderId not in", values, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidBetween(String value1, String value2) {
            addCriterion("pur_Dtl_OrderId between", value1, value2, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurDtlOrderidNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_OrderId not between", value1, value2, "purDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidIsNull() {
            addCriterion("pur_OrderId is null");
            return (Criteria) this;
        }

        public Criteria andPurOrderidIsNotNull() {
            addCriterion("pur_OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andPurOrderidEqualTo(String value) {
            addCriterion("pur_OrderId =", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotEqualTo(String value) {
            addCriterion("pur_OrderId <>", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidGreaterThan(String value) {
            addCriterion("pur_OrderId >", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("pur_OrderId >=", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidLessThan(String value) {
            addCriterion("pur_OrderId <", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidLessThanOrEqualTo(String value) {
            addCriterion("pur_OrderId <=", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidLike(String value) {
            addCriterion("pur_OrderId like", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotLike(String value) {
            addCriterion("pur_OrderId not like", value, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidIn(List<String> values) {
            addCriterion("pur_OrderId in", values, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotIn(List<String> values) {
            addCriterion("pur_OrderId not in", values, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidBetween(String value1, String value2) {
            addCriterion("pur_OrderId between", value1, value2, "purOrderid");
            return (Criteria) this;
        }

        public Criteria andPurOrderidNotBetween(String value1, String value2) {
            addCriterion("pur_OrderId not between", value1, value2, "purOrderid");
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

        public Criteria andPurDtlTotalAmountIsNull() {
            addCriterion("pur_Dtl_Total_Amount is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountIsNotNull() {
            addCriterion("pur_Dtl_Total_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountEqualTo(Integer value) {
            addCriterion("pur_Dtl_Total_Amount =", value, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountNotEqualTo(Integer value) {
            addCriterion("pur_Dtl_Total_Amount <>", value, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountGreaterThan(Integer value) {
            addCriterion("pur_Dtl_Total_Amount >", value, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Total_Amount >=", value, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountLessThan(Integer value) {
            addCriterion("pur_Dtl_Total_Amount <", value, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Total_Amount <=", value, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountIn(List<Integer> values) {
            addCriterion("pur_Dtl_Total_Amount in", values, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountNotIn(List<Integer> values) {
            addCriterion("pur_Dtl_Total_Amount not in", values, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Total_Amount between", value1, value2, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlTotalAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Total_Amount not between", value1, value2, "purDtlTotalAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkIsNull() {
            addCriterion("pur_Dtl_Remark is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkIsNotNull() {
            addCriterion("pur_Dtl_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkEqualTo(String value) {
            addCriterion("pur_Dtl_Remark =", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotEqualTo(String value) {
            addCriterion("pur_Dtl_Remark <>", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkGreaterThan(String value) {
            addCriterion("pur_Dtl_Remark >", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Remark >=", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkLessThan(String value) {
            addCriterion("pur_Dtl_Remark <", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Remark <=", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkLike(String value) {
            addCriterion("pur_Dtl_Remark like", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotLike(String value) {
            addCriterion("pur_Dtl_Remark not like", value, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkIn(List<String> values) {
            addCriterion("pur_Dtl_Remark in", values, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotIn(List<String> values) {
            addCriterion("pur_Dtl_Remark not in", values, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Remark between", value1, value2, "purDtlRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlRemarkNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Remark not between", value1, value2, "purDtlRemark");
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