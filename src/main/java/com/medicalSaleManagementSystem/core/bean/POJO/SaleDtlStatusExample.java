package com.medicalSaleManagementSystem.core.bean.POJO;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleDtlStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleDtlStatusExample() {
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

        public Criteria andSaleDtlStatusIdIsNull() {
            addCriterion("sale_Dtl_status_Id is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdIsNotNull() {
            addCriterion("sale_Dtl_status_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdEqualTo(Integer value) {
            addCriterion("sale_Dtl_status_Id =", value, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdNotEqualTo(Integer value) {
            addCriterion("sale_Dtl_status_Id <>", value, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdGreaterThan(Integer value) {
            addCriterion("sale_Dtl_status_Id >", value, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_status_Id >=", value, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdLessThan(Integer value) {
            addCriterion("sale_Dtl_status_Id <", value, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_status_Id <=", value, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdIn(List<Integer> values) {
            addCriterion("sale_Dtl_status_Id in", values, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdNotIn(List<Integer> values) {
            addCriterion("sale_Dtl_status_Id not in", values, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_status_Id between", value1, value2, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_status_Id not between", value1, value2, "saleDtlStatusId");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameIsNull() {
            addCriterion("sale_Dtl_Status_Name is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameIsNotNull() {
            addCriterion("sale_Dtl_Status_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameEqualTo(String value) {
            addCriterion("sale_Dtl_Status_Name =", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameNotEqualTo(String value) {
            addCriterion("sale_Dtl_Status_Name <>", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameGreaterThan(String value) {
            addCriterion("sale_Dtl_Status_Name >", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Status_Name >=", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameLessThan(String value) {
            addCriterion("sale_Dtl_Status_Name <", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameLessThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_Status_Name <=", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameLike(String value) {
            addCriterion("sale_Dtl_Status_Name like", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameNotLike(String value) {
            addCriterion("sale_Dtl_Status_Name not like", value, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameIn(List<String> values) {
            addCriterion("sale_Dtl_Status_Name in", values, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameNotIn(List<String> values) {
            addCriterion("sale_Dtl_Status_Name not in", values, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Status_Name between", value1, value2, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusNameNotBetween(String value1, String value2) {
            addCriterion("sale_Dtl_Status_Name not between", value1, value2, "saleDtlStatusName");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidIsNull() {
            addCriterion("sale_Dtl_OrderId is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidIsNotNull() {
            addCriterion("sale_Dtl_OrderId is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId =", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId <>", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidGreaterThan(String value) {
            addCriterion("sale_Dtl_OrderId >", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId >=", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidLessThan(String value) {
            addCriterion("sale_Dtl_OrderId <", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidLessThanOrEqualTo(String value) {
            addCriterion("sale_Dtl_OrderId <=", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidLike(String value) {
            addCriterion("sale_Dtl_OrderId like", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotLike(String value) {
            addCriterion("sale_Dtl_OrderId not like", value, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidIn(List<String> values) {
            addCriterion("sale_Dtl_OrderId in", values, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotIn(List<String> values) {
            addCriterion("sale_Dtl_OrderId not in", values, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidBetween(String value1, String value2) {
            addCriterion("sale_Dtl_OrderId between", value1, value2, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlOrderidNotBetween(String value1, String value2) {
            addCriterion("sale_Dtl_OrderId not between", value1, value2, "saleDtlOrderid");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountIsNull() {
            addCriterion("sale_Dtl_Status_Amount is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountIsNotNull() {
            addCriterion("sale_Dtl_Status_Amount is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountEqualTo(Integer value) {
            addCriterion("sale_Dtl_Status_Amount =", value, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountNotEqualTo(Integer value) {
            addCriterion("sale_Dtl_Status_Amount <>", value, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountGreaterThan(Integer value) {
            addCriterion("sale_Dtl_Status_Amount >", value, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_Status_Amount >=", value, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountLessThan(Integer value) {
            addCriterion("sale_Dtl_Status_Amount <", value, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountLessThanOrEqualTo(Integer value) {
            addCriterion("sale_Dtl_Status_Amount <=", value, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountIn(List<Integer> values) {
            addCriterion("sale_Dtl_Status_Amount in", values, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountNotIn(List<Integer> values) {
            addCriterion("sale_Dtl_Status_Amount not in", values, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_Status_Amount between", value1, value2, "saleDtlStatusAmount");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_Dtl_Status_Amount not between", value1, value2, "saleDtlStatusAmount");
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

        public Criteria andSaleDtlStatusSubtotalIsNull() {
            addCriterion("sale_Dtl_Status_Subtotal is null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalIsNotNull() {
            addCriterion("sale_Dtl_Status_Subtotal is not null");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalEqualTo(Double value) {
            addCriterion("sale_Dtl_Status_Subtotal =", value, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalNotEqualTo(Double value) {
            addCriterion("sale_Dtl_Status_Subtotal <>", value, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalGreaterThan(Double value) {
            addCriterion("sale_Dtl_Status_Subtotal >", value, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalGreaterThanOrEqualTo(Double value) {
            addCriterion("sale_Dtl_Status_Subtotal >=", value, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalLessThan(Double value) {
            addCriterion("sale_Dtl_Status_Subtotal <", value, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalLessThanOrEqualTo(Double value) {
            addCriterion("sale_Dtl_Status_Subtotal <=", value, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalIn(List<Double> values) {
            addCriterion("sale_Dtl_Status_Subtotal in", values, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalNotIn(List<Double> values) {
            addCriterion("sale_Dtl_Status_Subtotal not in", values, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalBetween(Double value1, Double value2) {
            addCriterion("sale_Dtl_Status_Subtotal between", value1, value2, "saleDtlStatusSubtotal");
            return (Criteria) this;
        }

        public Criteria andSaleDtlStatusSubtotalNotBetween(Double value1, Double value2) {
            addCriterion("sale_Dtl_Status_Subtotal not between", value1, value2, "saleDtlStatusSubtotal");
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