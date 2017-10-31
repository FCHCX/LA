package com.xiaohe.po;

import java.util.ArrayList;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
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

        public Criteria andStidIsNull() {
            addCriterion("Stid is null");
            return (Criteria) this;
        }

        public Criteria andStidIsNotNull() {
            addCriterion("Stid is not null");
            return (Criteria) this;
        }

        public Criteria andStidEqualTo(Integer value) {
            addCriterion("Stid =", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotEqualTo(Integer value) {
            addCriterion("Stid <>", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThan(Integer value) {
            addCriterion("Stid >", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Stid >=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThan(Integer value) {
            addCriterion("Stid <", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidLessThanOrEqualTo(Integer value) {
            addCriterion("Stid <=", value, "stid");
            return (Criteria) this;
        }

        public Criteria andStidIn(List<Integer> values) {
            addCriterion("Stid in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotIn(List<Integer> values) {
            addCriterion("Stid not in", values, "stid");
            return (Criteria) this;
        }

        public Criteria andStidBetween(Integer value1, Integer value2) {
            addCriterion("Stid between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andStidNotBetween(Integer value1, Integer value2) {
            addCriterion("Stid not between", value1, value2, "stid");
            return (Criteria) this;
        }

        public Criteria andSplaceIsNull() {
            addCriterion("Splace is null");
            return (Criteria) this;
        }

        public Criteria andSplaceIsNotNull() {
            addCriterion("Splace is not null");
            return (Criteria) this;
        }

        public Criteria andSplaceEqualTo(String value) {
            addCriterion("Splace =", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotEqualTo(String value) {
            addCriterion("Splace <>", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceGreaterThan(String value) {
            addCriterion("Splace >", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceGreaterThanOrEqualTo(String value) {
            addCriterion("Splace >=", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceLessThan(String value) {
            addCriterion("Splace <", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceLessThanOrEqualTo(String value) {
            addCriterion("Splace <=", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceLike(String value) {
            addCriterion("Splace like", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotLike(String value) {
            addCriterion("Splace not like", value, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceIn(List<String> values) {
            addCriterion("Splace in", values, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotIn(List<String> values) {
            addCriterion("Splace not in", values, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceBetween(String value1, String value2) {
            addCriterion("Splace between", value1, value2, "splace");
            return (Criteria) this;
        }

        public Criteria andSplaceNotBetween(String value1, String value2) {
            addCriterion("Splace not between", value1, value2, "splace");
            return (Criteria) this;
        }

        public Criteria andSmountIsNull() {
            addCriterion("Smount is null");
            return (Criteria) this;
        }

        public Criteria andSmountIsNotNull() {
            addCriterion("Smount is not null");
            return (Criteria) this;
        }

        public Criteria andSmountEqualTo(Integer value) {
            addCriterion("Smount =", value, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountNotEqualTo(Integer value) {
            addCriterion("Smount <>", value, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountGreaterThan(Integer value) {
            addCriterion("Smount >", value, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Smount >=", value, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountLessThan(Integer value) {
            addCriterion("Smount <", value, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountLessThanOrEqualTo(Integer value) {
            addCriterion("Smount <=", value, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountIn(List<Integer> values) {
            addCriterion("Smount in", values, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountNotIn(List<Integer> values) {
            addCriterion("Smount not in", values, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountBetween(Integer value1, Integer value2) {
            addCriterion("Smount between", value1, value2, "smount");
            return (Criteria) this;
        }

        public Criteria andSmountNotBetween(Integer value1, Integer value2) {
            addCriterion("Smount not between", value1, value2, "smount");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("Sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("Sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(Integer value) {
            addCriterion("Sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(Integer value) {
            addCriterion("Sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(Integer value) {
            addCriterion("Sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(Integer value) {
            addCriterion("Sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(Integer value) {
            addCriterion("Sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<Integer> values) {
            addCriterion("Sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<Integer> values) {
            addCriterion("Sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(Integer value1, Integer value2) {
            addCriterion("Sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(Integer value1, Integer value2) {
            addCriterion("Sid not between", value1, value2, "sid");
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