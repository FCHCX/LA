package com.xiaohe.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BackstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackstockExample() {
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

        public Criteria andBsidIsNull() {
            addCriterion("Bsid is null");
            return (Criteria) this;
        }

        public Criteria andBsidIsNotNull() {
            addCriterion("Bsid is not null");
            return (Criteria) this;
        }

        public Criteria andBsidEqualTo(Integer value) {
            addCriterion("Bsid =", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotEqualTo(Integer value) {
            addCriterion("Bsid <>", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThan(Integer value) {
            addCriterion("Bsid >", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Bsid >=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThan(Integer value) {
            addCriterion("Bsid <", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidLessThanOrEqualTo(Integer value) {
            addCriterion("Bsid <=", value, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidIn(List<Integer> values) {
            addCriterion("Bsid in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotIn(List<Integer> values) {
            addCriterion("Bsid not in", values, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidBetween(Integer value1, Integer value2) {
            addCriterion("Bsid between", value1, value2, "bsid");
            return (Criteria) this;
        }

        public Criteria andBsidNotBetween(Integer value1, Integer value2) {
            addCriterion("Bsid not between", value1, value2, "bsid");
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

        public Criteria andIidIsNull() {
            addCriterion("Iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("Iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("Iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("Iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("Iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("Iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("Iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("Iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("Iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("Iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("Iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("Uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("Uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("Uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("Uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("Uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("Uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("Uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("Uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("Uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("Uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("Uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("Uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("Uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("Uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andBsresonIsNull() {
            addCriterion("Bsreson is null");
            return (Criteria) this;
        }

        public Criteria andBsresonIsNotNull() {
            addCriterion("Bsreson is not null");
            return (Criteria) this;
        }

        public Criteria andBsresonEqualTo(String value) {
            addCriterion("Bsreson =", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonNotEqualTo(String value) {
            addCriterion("Bsreson <>", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonGreaterThan(String value) {
            addCriterion("Bsreson >", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonGreaterThanOrEqualTo(String value) {
            addCriterion("Bsreson >=", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonLessThan(String value) {
            addCriterion("Bsreson <", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonLessThanOrEqualTo(String value) {
            addCriterion("Bsreson <=", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonLike(String value) {
            addCriterion("Bsreson like", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonNotLike(String value) {
            addCriterion("Bsreson not like", value, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonIn(List<String> values) {
            addCriterion("Bsreson in", values, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonNotIn(List<String> values) {
            addCriterion("Bsreson not in", values, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonBetween(String value1, String value2) {
            addCriterion("Bsreson between", value1, value2, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBsresonNotBetween(String value1, String value2) {
            addCriterion("Bsreson not between", value1, value2, "bsreson");
            return (Criteria) this;
        }

        public Criteria andBstimeIsNull() {
            addCriterion("Bstime is null");
            return (Criteria) this;
        }

        public Criteria andBstimeIsNotNull() {
            addCriterion("Bstime is not null");
            return (Criteria) this;
        }

        public Criteria andBstimeEqualTo(Date value) {
            addCriterionForJDBCDate("Bstime =", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Bstime <>", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Bstime >", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Bstime >=", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeLessThan(Date value) {
            addCriterionForJDBCDate("Bstime <", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Bstime <=", value, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeIn(List<Date> values) {
            addCriterionForJDBCDate("Bstime in", values, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Bstime not in", values, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Bstime between", value1, value2, "bstime");
            return (Criteria) this;
        }

        public Criteria andBstimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Bstime not between", value1, value2, "bstime");
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