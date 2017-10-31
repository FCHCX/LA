package com.xiaohe.po;

import java.util.ArrayList;
import java.util.List;

public class SaleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SaleExample() {
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

        public Criteria andSoidIsNull() {
            addCriterion("Soid is null");
            return (Criteria) this;
        }

        public Criteria andSoidIsNotNull() {
            addCriterion("Soid is not null");
            return (Criteria) this;
        }

        public Criteria andSoidEqualTo(Integer value) {
            addCriterion("Soid =", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotEqualTo(Integer value) {
            addCriterion("Soid <>", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidGreaterThan(Integer value) {
            addCriterion("Soid >", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Soid >=", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidLessThan(Integer value) {
            addCriterion("Soid <", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidLessThanOrEqualTo(Integer value) {
            addCriterion("Soid <=", value, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidIn(List<Integer> values) {
            addCriterion("Soid in", values, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotIn(List<Integer> values) {
            addCriterion("Soid not in", values, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidBetween(Integer value1, Integer value2) {
            addCriterion("Soid between", value1, value2, "soid");
            return (Criteria) this;
        }

        public Criteria andSoidNotBetween(Integer value1, Integer value2) {
            addCriterion("Soid not between", value1, value2, "soid");
            return (Criteria) this;
        }

        public Criteria andSodidIsNull() {
            addCriterion("Sodid is null");
            return (Criteria) this;
        }

        public Criteria andSodidIsNotNull() {
            addCriterion("Sodid is not null");
            return (Criteria) this;
        }

        public Criteria andSodidEqualTo(Integer value) {
            addCriterion("Sodid =", value, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidNotEqualTo(Integer value) {
            addCriterion("Sodid <>", value, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidGreaterThan(Integer value) {
            addCriterion("Sodid >", value, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sodid >=", value, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidLessThan(Integer value) {
            addCriterion("Sodid <", value, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidLessThanOrEqualTo(Integer value) {
            addCriterion("Sodid <=", value, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidIn(List<Integer> values) {
            addCriterion("Sodid in", values, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidNotIn(List<Integer> values) {
            addCriterion("Sodid not in", values, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidBetween(Integer value1, Integer value2) {
            addCriterion("Sodid between", value1, value2, "sodid");
            return (Criteria) this;
        }

        public Criteria andSodidNotBetween(Integer value1, Integer value2) {
            addCriterion("Sodid not between", value1, value2, "sodid");
            return (Criteria) this;
        }

        public Criteria andSocountIsNull() {
            addCriterion("Socount is null");
            return (Criteria) this;
        }

        public Criteria andSocountIsNotNull() {
            addCriterion("Socount is not null");
            return (Criteria) this;
        }

        public Criteria andSocountEqualTo(Integer value) {
            addCriterion("Socount =", value, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountNotEqualTo(Integer value) {
            addCriterion("Socount <>", value, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountGreaterThan(Integer value) {
            addCriterion("Socount >", value, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Socount >=", value, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountLessThan(Integer value) {
            addCriterion("Socount <", value, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountLessThanOrEqualTo(Integer value) {
            addCriterion("Socount <=", value, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountIn(List<Integer> values) {
            addCriterion("Socount in", values, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountNotIn(List<Integer> values) {
            addCriterion("Socount not in", values, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountBetween(Integer value1, Integer value2) {
            addCriterion("Socount between", value1, value2, "socount");
            return (Criteria) this;
        }

        public Criteria andSocountNotBetween(Integer value1, Integer value2) {
            addCriterion("Socount not between", value1, value2, "socount");
            return (Criteria) this;
        }

        public Criteria andSsalesIsNull() {
            addCriterion("Ssales is null");
            return (Criteria) this;
        }

        public Criteria andSsalesIsNotNull() {
            addCriterion("Ssales is not null");
            return (Criteria) this;
        }

        public Criteria andSsalesEqualTo(Float value) {
            addCriterion("Ssales =", value, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesNotEqualTo(Float value) {
            addCriterion("Ssales <>", value, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesGreaterThan(Float value) {
            addCriterion("Ssales >", value, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesGreaterThanOrEqualTo(Float value) {
            addCriterion("Ssales >=", value, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesLessThan(Float value) {
            addCriterion("Ssales <", value, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesLessThanOrEqualTo(Float value) {
            addCriterion("Ssales <=", value, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesIn(List<Float> values) {
            addCriterion("Ssales in", values, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesNotIn(List<Float> values) {
            addCriterion("Ssales not in", values, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesBetween(Float value1, Float value2) {
            addCriterion("Ssales between", value1, value2, "ssales");
            return (Criteria) this;
        }

        public Criteria andSsalesNotBetween(Float value1, Float value2) {
            addCriterion("Ssales not between", value1, value2, "ssales");
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