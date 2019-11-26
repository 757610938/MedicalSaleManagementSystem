package com.medicalSaleManagementSystem.core.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurchaseDtlStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PurchaseDtlStatusExample() {
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

        public Criteria andPurDtlStatusIdIsNull() {
            addCriterion("pur_Dtl_Status_id is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdIsNotNull() {
            addCriterion("pur_Dtl_Status_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_id =", value, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdNotEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_id <>", value, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdGreaterThan(Integer value) {
            addCriterion("pur_Dtl_Status_id >", value, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_id >=", value, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdLessThan(Integer value) {
            addCriterion("pur_Dtl_Status_id <", value, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_id <=", value, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdIn(List<Integer> values) {
            addCriterion("pur_Dtl_Status_id in", values, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdNotIn(List<Integer> values) {
            addCriterion("pur_Dtl_Status_id not in", values, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Status_id between", value1, value2, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Status_id not between", value1, value2, "purDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameIsNull() {
            addCriterion("pur_Dtl_Status_Name is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameIsNotNull() {
            addCriterion("pur_Dtl_Status_Name is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Name =", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameNotEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Name <>", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameGreaterThan(String value) {
            addCriterion("pur_Dtl_Status_Name >", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Name >=", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameLessThan(String value) {
            addCriterion("pur_Dtl_Status_Name <", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Name <=", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameLike(String value) {
            addCriterion("pur_Dtl_Status_Name like", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameNotLike(String value) {
            addCriterion("pur_Dtl_Status_Name not like", value, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameIn(List<String> values) {
            addCriterion("pur_Dtl_Status_Name in", values, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameNotIn(List<String> values) {
            addCriterion("pur_Dtl_Status_Name not in", values, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Status_Name between", value1, value2, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusNameNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Status_Name not between", value1, value2, "purDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountIsNull() {
            addCriterion("pur_Dtl_Status_Amount is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountIsNotNull() {
            addCriterion("pur_Dtl_Status_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_Amount =", value, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountNotEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_Amount <>", value, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountGreaterThan(Integer value) {
            addCriterion("pur_Dtl_Status_Amount >", value, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_Amount >=", value, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountLessThan(Integer value) {
            addCriterion("pur_Dtl_Status_Amount <", value, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountLessThanOrEqualTo(Integer value) {
            addCriterion("pur_Dtl_Status_Amount <=", value, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountIn(List<Integer> values) {
            addCriterion("pur_Dtl_Status_Amount in", values, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountNotIn(List<Integer> values) {
            addCriterion("pur_Dtl_Status_Amount not in", values, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Status_Amount between", value1, value2, "purDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_Dtl_Status_Amount not between", value1, value2, "purDtlStatusAmount");
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

        public Criteria andPurDtlStatusDateIsNull() {
            addCriterion("pur_Dtl_Status_Date is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateIsNotNull() {
            addCriterion("pur_Dtl_Status_Date is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateEqualTo(Date value) {
            addCriterion("pur_Dtl_Status_Date =", value, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateNotEqualTo(Date value) {
            addCriterion("pur_Dtl_Status_Date <>", value, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateGreaterThan(Date value) {
            addCriterion("pur_Dtl_Status_Date >", value, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pur_Dtl_Status_Date >=", value, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateLessThan(Date value) {
            addCriterion("pur_Dtl_Status_Date <", value, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateLessThanOrEqualTo(Date value) {
            addCriterion("pur_Dtl_Status_Date <=", value, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateIn(List<Date> values) {
            addCriterion("pur_Dtl_Status_Date in", values, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateNotIn(List<Date> values) {
            addCriterion("pur_Dtl_Status_Date not in", values, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateBetween(Date value1, Date value2) {
            addCriterion("pur_Dtl_Status_Date between", value1, value2, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusDateNotBetween(Date value1, Date value2) {
            addCriterion("pur_Dtl_Status_Date not between", value1, value2, "purDtlStatusDate");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalIsNull() {
            addCriterion("pur_Dtl_Status_Subtotal is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalIsNotNull() {
            addCriterion("pur_Dtl_Status_Subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalEqualTo(Double value) {
            addCriterion("pur_Dtl_Status_Subtotal =", value, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalNotEqualTo(Double value) {
            addCriterion("pur_Dtl_Status_Subtotal <>", value, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalGreaterThan(Double value) {
            addCriterion("pur_Dtl_Status_Subtotal >", value, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("pur_Dtl_Status_Subtotal >=", value, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalLessThan(Double value) {
            addCriterion("pur_Dtl_Status_Subtotal <", value, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalLessThanOrEqualTo(Double value) {
            addCriterion("pur_Dtl_Status_Subtotal <=", value, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalIn(List<Double> values) {
            addCriterion("pur_Dtl_Status_Subtotal in", values, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalNotIn(List<Double> values) {
            addCriterion("pur_Dtl_Status_Subtotal not in", values, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalBetween(Double value1, Double value2) {
            addCriterion("pur_Dtl_Status_Subtotal between", value1, value2, "purDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusSubtotalNotBetween(Double value1, Double value2) {
            addCriterion("pur_Dtl_Status_Subtotal not between", value1, value2, "purDtlStatusSubtotal");
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

        public Criteria andPurDtlStatusRemarkIsNull() {
            addCriterion("pur_Dtl_Status_Remark is null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkIsNotNull() {
            addCriterion("pur_Dtl_Status_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Remark =", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkNotEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Remark <>", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkGreaterThan(String value) {
            addCriterion("pur_Dtl_Status_Remark >", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Remark >=", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkLessThan(String value) {
            addCriterion("pur_Dtl_Status_Remark <", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkLessThanOrEqualTo(String value) {
            addCriterion("pur_Dtl_Status_Remark <=", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkLike(String value) {
            addCriterion("pur_Dtl_Status_Remark like", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkNotLike(String value) {
            addCriterion("pur_Dtl_Status_Remark not like", value, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkIn(List<String> values) {
            addCriterion("pur_Dtl_Status_Remark in", values, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkNotIn(List<String> values) {
            addCriterion("pur_Dtl_Status_Remark not in", values, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Status_Remark between", value1, value2, "purDtlStatusRemark");
            return (Criteria) this;
        }

        public Criteria andPurDtlStatusRemarkNotBetween(String value1, String value2) {
            addCriterion("pur_Dtl_Status_Remark not between", value1, value2, "purDtlStatusRemark");
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