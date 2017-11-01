package com.xiaohe.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ItemdiscountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemdiscountExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDisidIsNull() {
            addCriterion("Disid is null");
            return (Criteria) this;
        }

        public Criteria andDisidIsNotNull() {
            addCriterion("Disid is not null");
            return (Criteria) this;
        }

        public Criteria andDisidEqualTo(Integer value) {
            addCriterion("Disid =", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotEqualTo(Integer value) {
            addCriterion("Disid <>", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidGreaterThan(Integer value) {
            addCriterion("Disid >", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Disid >=", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidLessThan(Integer value) {
            addCriterion("Disid <", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidLessThanOrEqualTo(Integer value) {
            addCriterion("Disid <=", value, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidIn(List<Integer> values) {
            addCriterion("Disid in", values, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotIn(List<Integer> values) {
            addCriterion("Disid not in", values, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidBetween(Integer value1, Integer value2) {
            addCriterion("Disid between", value1, value2, "disid");
            return (Criteria) this;
        }

        public Criteria andDisidNotBetween(Integer value1, Integer value2) {
            addCriterion("Disid not between", value1, value2, "disid");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("Did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("Did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("Did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("Did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("Did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("Did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("Did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("Did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("Did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("Did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("Did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDiscIsNull() {
            addCriterion("Disc is null");
            return (Criteria) this;
        }

        public Criteria andDiscIsNotNull() {
            addCriterion("Disc is not null");
            return (Criteria) this;
        }

        public Criteria andDiscEqualTo(Float value) {
            addCriterion("Disc =", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotEqualTo(Float value) {
            addCriterion("Disc <>", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscGreaterThan(Float value) {
            addCriterion("Disc >", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscGreaterThanOrEqualTo(Float value) {
            addCriterion("Disc >=", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLessThan(Float value) {
            addCriterion("Disc <", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscLessThanOrEqualTo(Float value) {
            addCriterion("Disc <=", value, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscIn(List<Float> values) {
            addCriterion("Disc in", values, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotIn(List<Float> values) {
            addCriterion("Disc not in", values, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscBetween(Float value1, Float value2) {
            addCriterion("Disc between", value1, value2, "disc");
            return (Criteria) this;
        }

        public Criteria andDiscNotBetween(Float value1, Float value2) {
            addCriterion("Disc not between", value1, value2, "disc");
            return (Criteria) this;
        }

        public Criteria andDstartIsNull() {
            addCriterion("Dstart is null");
            return (Criteria) this;
        }

        public Criteria andDstartIsNotNull() {
            addCriterion("Dstart is not null");
            return (Criteria) this;
        }

        public Criteria andDstartEqualTo(Date value) {
            addCriterionForJDBCDate("Dstart =", value, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartNotEqualTo(Date value) {
            addCriterionForJDBCDate("Dstart <>", value, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartGreaterThan(Date value) {
            addCriterionForJDBCDate("Dstart >", value, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Dstart >=", value, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartLessThan(Date value) {
            addCriterionForJDBCDate("Dstart <", value, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Dstart <=", value, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartIn(List<Date> values) {
            addCriterionForJDBCDate("Dstart in", values, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartNotIn(List<Date> values) {
            addCriterionForJDBCDate("Dstart not in", values, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Dstart between", value1, value2, "dstart");
            return (Criteria) this;
        }

        public Criteria andDstartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Dstart not between", value1, value2, "dstart");
            return (Criteria) this;
        }

        public Criteria andDendIsNull() {
            addCriterion("Dend is null");
            return (Criteria) this;
        }

        public Criteria andDendIsNotNull() {
            addCriterion("Dend is not null");
            return (Criteria) this;
        }

        public Criteria andDendEqualTo(Date value) {
            addCriterionForJDBCDate("Dend =", value, "dend");
            return (Criteria) this;
        }

        public Criteria andDendNotEqualTo(Date value) {
            addCriterionForJDBCDate("Dend <>", value, "dend");
            return (Criteria) this;
        }

        public Criteria andDendGreaterThan(Date value) {
            addCriterionForJDBCDate("Dend >", value, "dend");
            return (Criteria) this;
        }

        public Criteria andDendGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Dend >=", value, "dend");
            return (Criteria) this;
        }

        public Criteria andDendLessThan(Date value) {
            addCriterionForJDBCDate("Dend <", value, "dend");
            return (Criteria) this;
        }

        public Criteria andDendLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Dend <=", value, "dend");
            return (Criteria) this;
        }

        public Criteria andDendIn(List<Date> values) {
            addCriterionForJDBCDate("Dend in", values, "dend");
            return (Criteria) this;
        }

        public Criteria andDendNotIn(List<Date> values) {
            addCriterionForJDBCDate("Dend not in", values, "dend");
            return (Criteria) this;
        }

        public Criteria andDendBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Dend between", value1, value2, "dend");
            return (Criteria) this;
        }

        public Criteria andDendNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Dend not between", value1, value2, "dend");
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