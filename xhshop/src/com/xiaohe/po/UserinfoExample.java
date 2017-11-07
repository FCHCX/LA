package com.xiaohe.po;

import java.util.ArrayList;
import java.util.List;

public class UserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserinfoExample() {
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

        public Criteria andUfunameIsNull() {
            addCriterion("Ufuname is null");
            return (Criteria) this;
        }

        public Criteria andUfunameIsNotNull() {
            addCriterion("Ufuname is not null");
            return (Criteria) this;
        }

        public Criteria andUfunameEqualTo(String value) {
            addCriterion("Ufuname =", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameNotEqualTo(String value) {
            addCriterion("Ufuname <>", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameGreaterThan(String value) {
            addCriterion("Ufuname >", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameGreaterThanOrEqualTo(String value) {
            addCriterion("Ufuname >=", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameLessThan(String value) {
            addCriterion("Ufuname <", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameLessThanOrEqualTo(String value) {
            addCriterion("Ufuname <=", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameLike(String value) {
            addCriterion("Ufuname like", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameNotLike(String value) {
            addCriterion("Ufuname not like", value, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameIn(List<String> values) {
            addCriterion("Ufuname in", values, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameNotIn(List<String> values) {
            addCriterion("Ufuname not in", values, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameBetween(String value1, String value2) {
            addCriterion("Ufuname between", value1, value2, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfunameNotBetween(String value1, String value2) {
            addCriterion("Ufuname not between", value1, value2, "ufuname");
            return (Criteria) this;
        }

        public Criteria andUfsexIsNull() {
            addCriterion("Ufsex is null");
            return (Criteria) this;
        }

        public Criteria andUfsexIsNotNull() {
            addCriterion("Ufsex is not null");
            return (Criteria) this;
        }

        public Criteria andUfsexEqualTo(String value) {
            addCriterion("Ufsex =", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexNotEqualTo(String value) {
            addCriterion("Ufsex <>", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexGreaterThan(String value) {
            addCriterion("Ufsex >", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexGreaterThanOrEqualTo(String value) {
            addCriterion("Ufsex >=", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexLessThan(String value) {
            addCriterion("Ufsex <", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexLessThanOrEqualTo(String value) {
            addCriterion("Ufsex <=", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexLike(String value) {
            addCriterion("Ufsex like", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexNotLike(String value) {
            addCriterion("Ufsex not like", value, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexIn(List<String> values) {
            addCriterion("Ufsex in", values, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexNotIn(List<String> values) {
            addCriterion("Ufsex not in", values, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexBetween(String value1, String value2) {
            addCriterion("Ufsex between", value1, value2, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfsexNotBetween(String value1, String value2) {
            addCriterion("Ufsex not between", value1, value2, "ufsex");
            return (Criteria) this;
        }

        public Criteria andUfshengIsNull() {
            addCriterion("Ufsheng is null");
            return (Criteria) this;
        }

        public Criteria andUfshengIsNotNull() {
            addCriterion("Ufsheng is not null");
            return (Criteria) this;
        }

        public Criteria andUfshengEqualTo(String value) {
            addCriterion("Ufsheng =", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengNotEqualTo(String value) {
            addCriterion("Ufsheng <>", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengGreaterThan(String value) {
            addCriterion("Ufsheng >", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengGreaterThanOrEqualTo(String value) {
            addCriterion("Ufsheng >=", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengLessThan(String value) {
            addCriterion("Ufsheng <", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengLessThanOrEqualTo(String value) {
            addCriterion("Ufsheng <=", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengLike(String value) {
            addCriterion("Ufsheng like", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengNotLike(String value) {
            addCriterion("Ufsheng not like", value, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengIn(List<String> values) {
            addCriterion("Ufsheng in", values, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengNotIn(List<String> values) {
            addCriterion("Ufsheng not in", values, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengBetween(String value1, String value2) {
            addCriterion("Ufsheng between", value1, value2, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshengNotBetween(String value1, String value2) {
            addCriterion("Ufsheng not between", value1, value2, "ufsheng");
            return (Criteria) this;
        }

        public Criteria andUfshiIsNull() {
            addCriterion("Ufshi is null");
            return (Criteria) this;
        }

        public Criteria andUfshiIsNotNull() {
            addCriterion("Ufshi is not null");
            return (Criteria) this;
        }

        public Criteria andUfshiEqualTo(String value) {
            addCriterion("Ufshi =", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiNotEqualTo(String value) {
            addCriterion("Ufshi <>", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiGreaterThan(String value) {
            addCriterion("Ufshi >", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiGreaterThanOrEqualTo(String value) {
            addCriterion("Ufshi >=", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiLessThan(String value) {
            addCriterion("Ufshi <", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiLessThanOrEqualTo(String value) {
            addCriterion("Ufshi <=", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiLike(String value) {
            addCriterion("Ufshi like", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiNotLike(String value) {
            addCriterion("Ufshi not like", value, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiIn(List<String> values) {
            addCriterion("Ufshi in", values, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiNotIn(List<String> values) {
            addCriterion("Ufshi not in", values, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiBetween(String value1, String value2) {
            addCriterion("Ufshi between", value1, value2, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfshiNotBetween(String value1, String value2) {
            addCriterion("Ufshi not between", value1, value2, "ufshi");
            return (Criteria) this;
        }

        public Criteria andUfphoneIsNull() {
            addCriterion("ufphone is null");
            return (Criteria) this;
        }

        public Criteria andUfphoneIsNotNull() {
            addCriterion("ufphone is not null");
            return (Criteria) this;
        }

        public Criteria andUfphoneEqualTo(String value) {
            addCriterion("ufphone =", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneNotEqualTo(String value) {
            addCriterion("ufphone <>", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneGreaterThan(String value) {
            addCriterion("ufphone >", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneGreaterThanOrEqualTo(String value) {
            addCriterion("ufphone >=", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneLessThan(String value) {
            addCriterion("ufphone <", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneLessThanOrEqualTo(String value) {
            addCriterion("ufphone <=", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneLike(String value) {
            addCriterion("ufphone like", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneNotLike(String value) {
            addCriterion("ufphone not like", value, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneIn(List<String> values) {
            addCriterion("ufphone in", values, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneNotIn(List<String> values) {
            addCriterion("ufphone not in", values, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneBetween(String value1, String value2) {
            addCriterion("ufphone between", value1, value2, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfphoneNotBetween(String value1, String value2) {
            addCriterion("ufphone not between", value1, value2, "ufphone");
            return (Criteria) this;
        }

        public Criteria andUfnameIsNull() {
            addCriterion("Ufname is null");
            return (Criteria) this;
        }

        public Criteria andUfnameIsNotNull() {
            addCriterion("Ufname is not null");
            return (Criteria) this;
        }

        public Criteria andUfnameEqualTo(String value) {
            addCriterion("Ufname =", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotEqualTo(String value) {
            addCriterion("Ufname <>", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameGreaterThan(String value) {
            addCriterion("Ufname >", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameGreaterThanOrEqualTo(String value) {
            addCriterion("Ufname >=", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameLessThan(String value) {
            addCriterion("Ufname <", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameLessThanOrEqualTo(String value) {
            addCriterion("Ufname <=", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameLike(String value) {
            addCriterion("Ufname like", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotLike(String value) {
            addCriterion("Ufname not like", value, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameIn(List<String> values) {
            addCriterion("Ufname in", values, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotIn(List<String> values) {
            addCriterion("Ufname not in", values, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameBetween(String value1, String value2) {
            addCriterion("Ufname between", value1, value2, "ufname");
            return (Criteria) this;
        }

        public Criteria andUfnameNotBetween(String value1, String value2) {
            addCriterion("Ufname not between", value1, value2, "ufname");
            return (Criteria) this;
        }

        public Criteria andUqustionIsNull() {
            addCriterion("Uqustion is null");
            return (Criteria) this;
        }

        public Criteria andUqustionIsNotNull() {
            addCriterion("Uqustion is not null");
            return (Criteria) this;
        }

        public Criteria andUqustionEqualTo(String value) {
            addCriterion("Uqustion =", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionNotEqualTo(String value) {
            addCriterion("Uqustion <>", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionGreaterThan(String value) {
            addCriterion("Uqustion >", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionGreaterThanOrEqualTo(String value) {
            addCriterion("Uqustion >=", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionLessThan(String value) {
            addCriterion("Uqustion <", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionLessThanOrEqualTo(String value) {
            addCriterion("Uqustion <=", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionLike(String value) {
            addCriterion("Uqustion like", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionNotLike(String value) {
            addCriterion("Uqustion not like", value, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionIn(List<String> values) {
            addCriterion("Uqustion in", values, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionNotIn(List<String> values) {
            addCriterion("Uqustion not in", values, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionBetween(String value1, String value2) {
            addCriterion("Uqustion between", value1, value2, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUqustionNotBetween(String value1, String value2) {
            addCriterion("Uqustion not between", value1, value2, "uqustion");
            return (Criteria) this;
        }

        public Criteria andUanswerIsNull() {
            addCriterion("Uanswer is null");
            return (Criteria) this;
        }

        public Criteria andUanswerIsNotNull() {
            addCriterion("Uanswer is not null");
            return (Criteria) this;
        }

        public Criteria andUanswerEqualTo(String value) {
            addCriterion("Uanswer =", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotEqualTo(String value) {
            addCriterion("Uanswer <>", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerGreaterThan(String value) {
            addCriterion("Uanswer >", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerGreaterThanOrEqualTo(String value) {
            addCriterion("Uanswer >=", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerLessThan(String value) {
            addCriterion("Uanswer <", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerLessThanOrEqualTo(String value) {
            addCriterion("Uanswer <=", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerLike(String value) {
            addCriterion("Uanswer like", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotLike(String value) {
            addCriterion("Uanswer not like", value, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerIn(List<String> values) {
            addCriterion("Uanswer in", values, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotIn(List<String> values) {
            addCriterion("Uanswer not in", values, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerBetween(String value1, String value2) {
            addCriterion("Uanswer between", value1, value2, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUanswerNotBetween(String value1, String value2) {
            addCriterion("Uanswer not between", value1, value2, "uanswer");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNull() {
            addCriterion("Uaddress is null");
            return (Criteria) this;
        }

        public Criteria andUaddressIsNotNull() {
            addCriterion("Uaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUaddressEqualTo(Integer value) {
            addCriterion("Uaddress =", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotEqualTo(Integer value) {
            addCriterion("Uaddress <>", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThan(Integer value) {
            addCriterion("Uaddress >", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("Uaddress >=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThan(Integer value) {
            addCriterion("Uaddress <", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressLessThanOrEqualTo(Integer value) {
            addCriterion("Uaddress <=", value, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressIn(List<Integer> values) {
            addCriterion("Uaddress in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotIn(List<Integer> values) {
            addCriterion("Uaddress not in", values, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressBetween(Integer value1, Integer value2) {
            addCriterion("Uaddress between", value1, value2, "uaddress");
            return (Criteria) this;
        }

        public Criteria andUaddressNotBetween(Integer value1, Integer value2) {
            addCriterion("Uaddress not between", value1, value2, "uaddress");
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