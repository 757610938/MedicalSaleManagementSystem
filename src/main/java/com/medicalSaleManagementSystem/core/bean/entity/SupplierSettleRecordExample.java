package com.medicalSaleManagementSystem.core.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SupplierSettleRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupplierSettleRecordExample() {
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

        public Criteria andSupplierSettleIdIsNull() {
            addCriterion("supplier_Settle_Id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdIsNotNull() {
            addCriterion("supplier_Settle_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdEqualTo(Integer value) {
            addCriterion("supplier_Settle_Id =", value, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdNotEqualTo(Integer value) {
            addCriterion("supplier_Settle_Id <>", value, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdGreaterThan(Integer value) {
            addCriterion("supplier_Settle_Id >", value, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_Settle_Id >=", value, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdLessThan(Integer value) {
            addCriterion("supplier_Settle_Id <", value, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_Settle_Id <=", value, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdIn(List<Integer> values) {
            addCriterion("supplier_Settle_Id in", values, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdNotIn(List<Integer> values) {
            addCriterion("supplier_Settle_Id not in", values, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_Settle_Id between", value1, value2, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_Settle_Id not between", value1, value2, "supplierSettleId");
            return (Criteria) this;
        }

        public Criteria andPurIdIsNull() {
            addCriterion("pur_id is null");
            return (Criteria) this;
        }

        public Criteria andPurIdIsNotNull() {
            addCriterion("pur_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurIdEqualTo(Integer value) {
            addCriterion("pur_id =", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdNotEqualTo(Integer value) {
            addCriterion("pur_id <>", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdGreaterThan(Integer value) {
            addCriterion("pur_id >", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pur_id >=", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdLessThan(Integer value) {
            addCriterion("pur_id <", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdLessThanOrEqualTo(Integer value) {
            addCriterion("pur_id <=", value, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdIn(List<Integer> values) {
            addCriterion("pur_id in", values, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdNotIn(List<Integer> values) {
            addCriterion("pur_id not in", values, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdBetween(Integer value1, Integer value2) {
            addCriterion("pur_id between", value1, value2, "purId");
            return (Criteria) this;
        }

        public Criteria andPurIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pur_id not between", value1, value2, "purId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Integer value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Integer value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Integer value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Integer value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Integer value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Integer> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Integer> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateIsNull() {
            addCriterion("supplier_Settle_Date is null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateIsNotNull() {
            addCriterion("supplier_Settle_Date is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateEqualTo(Date value) {
            addCriterion("supplier_Settle_Date =", value, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateNotEqualTo(Date value) {
            addCriterion("supplier_Settle_Date <>", value, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateGreaterThan(Date value) {
            addCriterion("supplier_Settle_Date >", value, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("supplier_Settle_Date >=", value, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateLessThan(Date value) {
            addCriterion("supplier_Settle_Date <", value, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateLessThanOrEqualTo(Date value) {
            addCriterion("supplier_Settle_Date <=", value, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateIn(List<Date> values) {
            addCriterion("supplier_Settle_Date in", values, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateNotIn(List<Date> values) {
            addCriterion("supplier_Settle_Date not in", values, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateBetween(Date value1, Date value2) {
            addCriterion("supplier_Settle_Date between", value1, value2, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleDateNotBetween(Date value1, Date value2) {
            addCriterion("supplier_Settle_Date not between", value1, value2, "supplierSettleDate");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyIsNull() {
            addCriterion("supplier_Settle_Money is null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyIsNotNull() {
            addCriterion("supplier_Settle_Money is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyEqualTo(Double value) {
            addCriterion("supplier_Settle_Money =", value, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyNotEqualTo(Double value) {
            addCriterion("supplier_Settle_Money <>", value, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyGreaterThan(Double value) {
            addCriterion("supplier_Settle_Money >", value, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("supplier_Settle_Money >=", value, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyLessThan(Double value) {
            addCriterion("supplier_Settle_Money <", value, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyLessThanOrEqualTo(Double value) {
            addCriterion("supplier_Settle_Money <=", value, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyIn(List<Double> values) {
            addCriterion("supplier_Settle_Money in", values, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyNotIn(List<Double> values) {
            addCriterion("supplier_Settle_Money not in", values, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyBetween(Double value1, Double value2) {
            addCriterion("supplier_Settle_Money between", value1, value2, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleMoneyNotBetween(Double value1, Double value2) {
            addCriterion("supplier_Settle_Money not between", value1, value2, "supplierSettleMoney");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkIsNull() {
            addCriterion("supplier_settle_remark is null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkIsNotNull() {
            addCriterion("supplier_settle_remark is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkEqualTo(String value) {
            addCriterion("supplier_settle_remark =", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkNotEqualTo(String value) {
            addCriterion("supplier_settle_remark <>", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkGreaterThan(String value) {
            addCriterion("supplier_settle_remark >", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_settle_remark >=", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkLessThan(String value) {
            addCriterion("supplier_settle_remark <", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkLessThanOrEqualTo(String value) {
            addCriterion("supplier_settle_remark <=", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkLike(String value) {
            addCriterion("supplier_settle_remark like", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkNotLike(String value) {
            addCriterion("supplier_settle_remark not like", value, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkIn(List<String> values) {
            addCriterion("supplier_settle_remark in", values, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkNotIn(List<String> values) {
            addCriterion("supplier_settle_remark not in", values, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkBetween(String value1, String value2) {
            addCriterion("supplier_settle_remark between", value1, value2, "supplierSettleRemark");
            return (Criteria) this;
        }

        public Criteria andSupplierSettleRemarkNotBetween(String value1, String value2) {
            addCriterion("supplier_settle_remark not between", value1, value2, "supplierSettleRemark");
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