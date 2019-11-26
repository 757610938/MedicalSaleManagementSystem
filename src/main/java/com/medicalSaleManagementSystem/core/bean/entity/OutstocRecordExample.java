package com.medicalSaleManagementSystem.core.bean.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OutstocRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutstocRecordExample() {
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

        public Criteria andOutstockIdIsNull() {
            addCriterion("outstock_id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockIdIsNotNull() {
            addCriterion("outstock_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockIdEqualTo(Integer value) {
            addCriterion("outstock_id =", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotEqualTo(Integer value) {
            addCriterion("outstock_id <>", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdGreaterThan(Integer value) {
            addCriterion("outstock_id >", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_id >=", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdLessThan(Integer value) {
            addCriterion("outstock_id <", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_id <=", value, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdIn(List<Integer> values) {
            addCriterion("outstock_id in", values, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotIn(List<Integer> values) {
            addCriterion("outstock_id not in", values, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdBetween(Integer value1, Integer value2) {
            addCriterion("outstock_id between", value1, value2, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_id not between", value1, value2, "outstockId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdIsNull() {
            addCriterion("outstock_List_Id is null");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdIsNotNull() {
            addCriterion("outstock_List_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdEqualTo(String value) {
            addCriterion("outstock_List_Id =", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdNotEqualTo(String value) {
            addCriterion("outstock_List_Id <>", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdGreaterThan(String value) {
            addCriterion("outstock_List_Id >", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_List_Id >=", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdLessThan(String value) {
            addCriterion("outstock_List_Id <", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdLessThanOrEqualTo(String value) {
            addCriterion("outstock_List_Id <=", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdLike(String value) {
            addCriterion("outstock_List_Id like", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdNotLike(String value) {
            addCriterion("outstock_List_Id not like", value, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdIn(List<String> values) {
            addCriterion("outstock_List_Id in", values, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdNotIn(List<String> values) {
            addCriterion("outstock_List_Id not in", values, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdBetween(String value1, String value2) {
            addCriterion("outstock_List_Id between", value1, value2, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockListIdNotBetween(String value1, String value2) {
            addCriterion("outstock_List_Id not between", value1, value2, "outstockListId");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryIsNull() {
            addCriterion("outstock_Category is null");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryIsNotNull() {
            addCriterion("outstock_Category is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryEqualTo(String value) {
            addCriterion("outstock_Category =", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotEqualTo(String value) {
            addCriterion("outstock_Category <>", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryGreaterThan(String value) {
            addCriterion("outstock_Category >", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Category >=", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryLessThan(String value) {
            addCriterion("outstock_Category <", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryLessThanOrEqualTo(String value) {
            addCriterion("outstock_Category <=", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryLike(String value) {
            addCriterion("outstock_Category like", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotLike(String value) {
            addCriterion("outstock_Category not like", value, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryIn(List<String> values) {
            addCriterion("outstock_Category in", values, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotIn(List<String> values) {
            addCriterion("outstock_Category not in", values, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryBetween(String value1, String value2) {
            addCriterion("outstock_Category between", value1, value2, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockCategoryNotBetween(String value1, String value2) {
            addCriterion("outstock_Category not between", value1, value2, "outstockCategory");
            return (Criteria) this;
        }

        public Criteria andOutstockDateIsNull() {
            addCriterion("outstock_Date is null");
            return (Criteria) this;
        }

        public Criteria andOutstockDateIsNotNull() {
            addCriterion("outstock_Date is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockDateEqualTo(Date value) {
            addCriterion("outstock_Date =", value, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateNotEqualTo(Date value) {
            addCriterion("outstock_Date <>", value, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateGreaterThan(Date value) {
            addCriterion("outstock_Date >", value, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateGreaterThanOrEqualTo(Date value) {
            addCriterion("outstock_Date >=", value, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateLessThan(Date value) {
            addCriterion("outstock_Date <", value, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateLessThanOrEqualTo(Date value) {
            addCriterion("outstock_Date <=", value, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateIn(List<Date> values) {
            addCriterion("outstock_Date in", values, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateNotIn(List<Date> values) {
            addCriterion("outstock_Date not in", values, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateBetween(Date value1, Date value2) {
            addCriterion("outstock_Date between", value1, value2, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andOutstockDateNotBetween(Date value1, Date value2) {
            addCriterion("outstock_Date not between", value1, value2, "outstockDate");
            return (Criteria) this;
        }

        public Criteria andMedincineIdIsNull() {
            addCriterion("medincine_id is null");
            return (Criteria) this;
        }

        public Criteria andMedincineIdIsNotNull() {
            addCriterion("medincine_id is not null");
            return (Criteria) this;
        }

        public Criteria andMedincineIdEqualTo(Integer value) {
            addCriterion("medincine_id =", value, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdNotEqualTo(Integer value) {
            addCriterion("medincine_id <>", value, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdGreaterThan(Integer value) {
            addCriterion("medincine_id >", value, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medincine_id >=", value, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdLessThan(Integer value) {
            addCriterion("medincine_id <", value, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdLessThanOrEqualTo(Integer value) {
            addCriterion("medincine_id <=", value, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdIn(List<Integer> values) {
            addCriterion("medincine_id in", values, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdNotIn(List<Integer> values) {
            addCriterion("medincine_id not in", values, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdBetween(Integer value1, Integer value2) {
            addCriterion("medincine_id between", value1, value2, "medincineId");
            return (Criteria) this;
        }

        public Criteria andMedincineIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medincine_id not between", value1, value2, "medincineId");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberIsNull() {
            addCriterion("outstock_Number is null");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberIsNotNull() {
            addCriterion("outstock_Number is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberEqualTo(Integer value) {
            addCriterion("outstock_Number =", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotEqualTo(Integer value) {
            addCriterion("outstock_Number <>", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberGreaterThan(Integer value) {
            addCriterion("outstock_Number >", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("outstock_Number >=", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberLessThan(Integer value) {
            addCriterion("outstock_Number <", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberLessThanOrEqualTo(Integer value) {
            addCriterion("outstock_Number <=", value, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberIn(List<Integer> values) {
            addCriterion("outstock_Number in", values, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotIn(List<Integer> values) {
            addCriterion("outstock_Number not in", values, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Number between", value1, value2, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andOutstockNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("outstock_Number not between", value1, value2, "outstockNumber");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(Integer value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(Integer value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(Integer value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(Integer value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(Integer value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<Integer> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<Integer> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(Integer value1, Integer value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIsNull() {
            addCriterion("outstock_Remark is null");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIsNotNull() {
            addCriterion("outstock_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkEqualTo(String value) {
            addCriterion("outstock_Remark =", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotEqualTo(String value) {
            addCriterion("outstock_Remark <>", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkGreaterThan(String value) {
            addCriterion("outstock_Remark >", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("outstock_Remark >=", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLessThan(String value) {
            addCriterion("outstock_Remark <", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLessThanOrEqualTo(String value) {
            addCriterion("outstock_Remark <=", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkLike(String value) {
            addCriterion("outstock_Remark like", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotLike(String value) {
            addCriterion("outstock_Remark not like", value, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkIn(List<String> values) {
            addCriterion("outstock_Remark in", values, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotIn(List<String> values) {
            addCriterion("outstock_Remark not in", values, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkBetween(String value1, String value2) {
            addCriterion("outstock_Remark between", value1, value2, "outstockRemark");
            return (Criteria) this;
        }

        public Criteria andOutstockRemarkNotBetween(String value1, String value2) {
            addCriterion("outstock_Remark not between", value1, value2, "outstockRemark");
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