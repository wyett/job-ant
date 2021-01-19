package com.wyett.jobant.mbg.domain;

import java.util.ArrayList;
import java.util.List;

public class MailTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MailTemplateExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSendToIsNull() {
            addCriterion("send_to is null");
            return (Criteria) this;
        }

        public Criteria andSendToIsNotNull() {
            addCriterion("send_to is not null");
            return (Criteria) this;
        }

        public Criteria andSendToEqualTo(String value) {
            addCriterion("send_to =", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotEqualTo(String value) {
            addCriterion("send_to <>", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToGreaterThan(String value) {
            addCriterion("send_to >", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToGreaterThanOrEqualTo(String value) {
            addCriterion("send_to >=", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToLessThan(String value) {
            addCriterion("send_to <", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToLessThanOrEqualTo(String value) {
            addCriterion("send_to <=", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToLike(String value) {
            addCriterion("send_to like", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotLike(String value) {
            addCriterion("send_to not like", value, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToIn(List<String> values) {
            addCriterion("send_to in", values, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotIn(List<String> values) {
            addCriterion("send_to not in", values, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToBetween(String value1, String value2) {
            addCriterion("send_to between", value1, value2, "sendTo");
            return (Criteria) this;
        }

        public Criteria andSendToNotBetween(String value1, String value2) {
            addCriterion("send_to not between", value1, value2, "sendTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToIsNull() {
            addCriterion("duplicate_to is null");
            return (Criteria) this;
        }

        public Criteria andDuplicateToIsNotNull() {
            addCriterion("duplicate_to is not null");
            return (Criteria) this;
        }

        public Criteria andDuplicateToEqualTo(String value) {
            addCriterion("duplicate_to =", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToNotEqualTo(String value) {
            addCriterion("duplicate_to <>", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToGreaterThan(String value) {
            addCriterion("duplicate_to >", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToGreaterThanOrEqualTo(String value) {
            addCriterion("duplicate_to >=", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToLessThan(String value) {
            addCriterion("duplicate_to <", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToLessThanOrEqualTo(String value) {
            addCriterion("duplicate_to <=", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToLike(String value) {
            addCriterion("duplicate_to like", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToNotLike(String value) {
            addCriterion("duplicate_to not like", value, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToIn(List<String> values) {
            addCriterion("duplicate_to in", values, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToNotIn(List<String> values) {
            addCriterion("duplicate_to not in", values, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToBetween(String value1, String value2) {
            addCriterion("duplicate_to between", value1, value2, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andDuplicateToNotBetween(String value1, String value2) {
            addCriterion("duplicate_to not between", value1, value2, "duplicateTo");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNull() {
            addCriterion("mail_type is null");
            return (Criteria) this;
        }

        public Criteria andMailTypeIsNotNull() {
            addCriterion("mail_type is not null");
            return (Criteria) this;
        }

        public Criteria andMailTypeEqualTo(String value) {
            addCriterion("mail_type =", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotEqualTo(String value) {
            addCriterion("mail_type <>", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThan(String value) {
            addCriterion("mail_type >", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mail_type >=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThan(String value) {
            addCriterion("mail_type <", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLessThanOrEqualTo(String value) {
            addCriterion("mail_type <=", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeLike(String value) {
            addCriterion("mail_type like", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotLike(String value) {
            addCriterion("mail_type not like", value, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeIn(List<String> values) {
            addCriterion("mail_type in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotIn(List<String> values) {
            addCriterion("mail_type not in", values, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeBetween(String value1, String value2) {
            addCriterion("mail_type between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailTypeNotBetween(String value1, String value2) {
            addCriterion("mail_type not between", value1, value2, "mailType");
            return (Criteria) this;
        }

        public Criteria andMailStatusIsNull() {
            addCriterion("mail_status is null");
            return (Criteria) this;
        }

        public Criteria andMailStatusIsNotNull() {
            addCriterion("mail_status is not null");
            return (Criteria) this;
        }

        public Criteria andMailStatusEqualTo(Integer value) {
            addCriterion("mail_status =", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusNotEqualTo(Integer value) {
            addCriterion("mail_status <>", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusGreaterThan(Integer value) {
            addCriterion("mail_status >", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_status >=", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusLessThan(Integer value) {
            addCriterion("mail_status <", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("mail_status <=", value, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusIn(List<Integer> values) {
            addCriterion("mail_status in", values, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusNotIn(List<Integer> values) {
            addCriterion("mail_status not in", values, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusBetween(Integer value1, Integer value2) {
            addCriterion("mail_status between", value1, value2, "mailStatus");
            return (Criteria) this;
        }

        public Criteria andMailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_status not between", value1, value2, "mailStatus");
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