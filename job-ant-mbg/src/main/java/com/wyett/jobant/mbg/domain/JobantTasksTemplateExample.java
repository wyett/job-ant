package com.wyett.jobant.mbg.domain;

import java.util.ArrayList;
import java.util.List;

public class JobantTasksTemplateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobantTasksTemplateExample() {
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

        public Criteria andSchedulerIdIsNull() {
            addCriterion("scheduler_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdIsNotNull() {
            addCriterion("scheduler_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdEqualTo(Long value) {
            addCriterion("scheduler_id =", value, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdNotEqualTo(Long value) {
            addCriterion("scheduler_id <>", value, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdGreaterThan(Long value) {
            addCriterion("scheduler_id >", value, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("scheduler_id >=", value, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdLessThan(Long value) {
            addCriterion("scheduler_id <", value, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdLessThanOrEqualTo(Long value) {
            addCriterion("scheduler_id <=", value, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdIn(List<Long> values) {
            addCriterion("scheduler_id in", values, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdNotIn(List<Long> values) {
            addCriterion("scheduler_id not in", values, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdBetween(Long value1, Long value2) {
            addCriterion("scheduler_id between", value1, value2, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andSchedulerIdNotBetween(Long value1, Long value2) {
            addCriterion("scheduler_id not between", value1, value2, "schedulerId");
            return (Criteria) this;
        }

        public Criteria andChildNameIsNull() {
            addCriterion("child_name is null");
            return (Criteria) this;
        }

        public Criteria andChildNameIsNotNull() {
            addCriterion("child_name is not null");
            return (Criteria) this;
        }

        public Criteria andChildNameEqualTo(Long value) {
            addCriterion("child_name =", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotEqualTo(Long value) {
            addCriterion("child_name <>", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameGreaterThan(Long value) {
            addCriterion("child_name >", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameGreaterThanOrEqualTo(Long value) {
            addCriterion("child_name >=", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLessThan(Long value) {
            addCriterion("child_name <", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameLessThanOrEqualTo(Long value) {
            addCriterion("child_name <=", value, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameIn(List<Long> values) {
            addCriterion("child_name in", values, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotIn(List<Long> values) {
            addCriterion("child_name not in", values, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameBetween(Long value1, Long value2) {
            addCriterion("child_name between", value1, value2, "childName");
            return (Criteria) this;
        }

        public Criteria andChildNameNotBetween(Long value1, Long value2) {
            addCriterion("child_name not between", value1, value2, "childName");
            return (Criteria) this;
        }

        public Criteria andTaskEnvIsNull() {
            addCriterion("task_env is null");
            return (Criteria) this;
        }

        public Criteria andTaskEnvIsNotNull() {
            addCriterion("task_env is not null");
            return (Criteria) this;
        }

        public Criteria andTaskEnvEqualTo(String value) {
            addCriterion("task_env =", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvNotEqualTo(String value) {
            addCriterion("task_env <>", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvGreaterThan(String value) {
            addCriterion("task_env >", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvGreaterThanOrEqualTo(String value) {
            addCriterion("task_env >=", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvLessThan(String value) {
            addCriterion("task_env <", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvLessThanOrEqualTo(String value) {
            addCriterion("task_env <=", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvLike(String value) {
            addCriterion("task_env like", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvNotLike(String value) {
            addCriterion("task_env not like", value, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvIn(List<String> values) {
            addCriterion("task_env in", values, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvNotIn(List<String> values) {
            addCriterion("task_env not in", values, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvBetween(String value1, String value2) {
            addCriterion("task_env between", value1, value2, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskEnvNotBetween(String value1, String value2) {
            addCriterion("task_env not between", value1, value2, "taskEnv");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIsNull() {
            addCriterion("task_info is null");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIsNotNull() {
            addCriterion("task_info is not null");
            return (Criteria) this;
        }

        public Criteria andTaskInfoEqualTo(String value) {
            addCriterion("task_info =", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotEqualTo(String value) {
            addCriterion("task_info <>", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoGreaterThan(String value) {
            addCriterion("task_info >", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoGreaterThanOrEqualTo(String value) {
            addCriterion("task_info >=", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLessThan(String value) {
            addCriterion("task_info <", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLessThanOrEqualTo(String value) {
            addCriterion("task_info <=", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoLike(String value) {
            addCriterion("task_info like", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotLike(String value) {
            addCriterion("task_info not like", value, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoIn(List<String> values) {
            addCriterion("task_info in", values, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotIn(List<String> values) {
            addCriterion("task_info not in", values, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoBetween(String value1, String value2) {
            addCriterion("task_info between", value1, value2, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskInfoNotBetween(String value1, String value2) {
            addCriterion("task_info not between", value1, value2, "taskInfo");
            return (Criteria) this;
        }

        public Criteria andTaskReturnIsNull() {
            addCriterion("task_return is null");
            return (Criteria) this;
        }

        public Criteria andTaskReturnIsNotNull() {
            addCriterion("task_return is not null");
            return (Criteria) this;
        }

        public Criteria andTaskReturnEqualTo(String value) {
            addCriterion("task_return =", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnNotEqualTo(String value) {
            addCriterion("task_return <>", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnGreaterThan(String value) {
            addCriterion("task_return >", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnGreaterThanOrEqualTo(String value) {
            addCriterion("task_return >=", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnLessThan(String value) {
            addCriterion("task_return <", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnLessThanOrEqualTo(String value) {
            addCriterion("task_return <=", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnLike(String value) {
            addCriterion("task_return like", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnNotLike(String value) {
            addCriterion("task_return not like", value, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnIn(List<String> values) {
            addCriterion("task_return in", values, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnNotIn(List<String> values) {
            addCriterion("task_return not in", values, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnBetween(String value1, String value2) {
            addCriterion("task_return between", value1, value2, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskReturnNotBetween(String value1, String value2) {
            addCriterion("task_return not between", value1, value2, "taskReturn");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallIsNull() {
            addCriterion("task_fail_call is null");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallIsNotNull() {
            addCriterion("task_fail_call is not null");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallEqualTo(String value) {
            addCriterion("task_fail_call =", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallNotEqualTo(String value) {
            addCriterion("task_fail_call <>", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallGreaterThan(String value) {
            addCriterion("task_fail_call >", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallGreaterThanOrEqualTo(String value) {
            addCriterion("task_fail_call >=", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallLessThan(String value) {
            addCriterion("task_fail_call <", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallLessThanOrEqualTo(String value) {
            addCriterion("task_fail_call <=", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallLike(String value) {
            addCriterion("task_fail_call like", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallNotLike(String value) {
            addCriterion("task_fail_call not like", value, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallIn(List<String> values) {
            addCriterion("task_fail_call in", values, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallNotIn(List<String> values) {
            addCriterion("task_fail_call not in", values, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallBetween(String value1, String value2) {
            addCriterion("task_fail_call between", value1, value2, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskFailCallNotBetween(String value1, String value2) {
            addCriterion("task_fail_call not between", value1, value2, "taskFailCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallIsNull() {
            addCriterion("task_success_call is null");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallIsNotNull() {
            addCriterion("task_success_call is not null");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallEqualTo(String value) {
            addCriterion("task_success_call =", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallNotEqualTo(String value) {
            addCriterion("task_success_call <>", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallGreaterThan(String value) {
            addCriterion("task_success_call >", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallGreaterThanOrEqualTo(String value) {
            addCriterion("task_success_call >=", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallLessThan(String value) {
            addCriterion("task_success_call <", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallLessThanOrEqualTo(String value) {
            addCriterion("task_success_call <=", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallLike(String value) {
            addCriterion("task_success_call like", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallNotLike(String value) {
            addCriterion("task_success_call not like", value, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallIn(List<String> values) {
            addCriterion("task_success_call in", values, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallNotIn(List<String> values) {
            addCriterion("task_success_call not in", values, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallBetween(String value1, String value2) {
            addCriterion("task_success_call between", value1, value2, "taskSuccessCall");
            return (Criteria) this;
        }

        public Criteria andTaskSuccessCallNotBetween(String value1, String value2) {
            addCriterion("task_success_call not between", value1, value2, "taskSuccessCall");
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