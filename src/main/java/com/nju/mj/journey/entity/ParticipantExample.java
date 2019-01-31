package com.nju.mj.journey.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParticipantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ParticipantExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJourneyidIsNull() {
            addCriterion("journeyId is null");
            return (Criteria) this;
        }

        public Criteria andJourneyidIsNotNull() {
            addCriterion("journeyId is not null");
            return (Criteria) this;
        }

        public Criteria andJourneyidEqualTo(String value) {
            addCriterion("journeyId =", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidNotEqualTo(String value) {
            addCriterion("journeyId <>", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidGreaterThan(String value) {
            addCriterion("journeyId >", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidGreaterThanOrEqualTo(String value) {
            addCriterion("journeyId >=", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidLessThan(String value) {
            addCriterion("journeyId <", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidLessThanOrEqualTo(String value) {
            addCriterion("journeyId <=", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidLike(String value) {
            addCriterion("journeyId like", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidNotLike(String value) {
            addCriterion("journeyId not like", value, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidIn(List<String> values) {
            addCriterion("journeyId in", values, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidNotIn(List<String> values) {
            addCriterion("journeyId not in", values, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidBetween(String value1, String value2) {
            addCriterion("journeyId between", value1, value2, "journeyid");
            return (Criteria) this;
        }

        public Criteria andJourneyidNotBetween(String value1, String value2) {
            addCriterion("journeyId not between", value1, value2, "journeyid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andIsarrivedIsNull() {
            addCriterion("isArrived is null");
            return (Criteria) this;
        }

        public Criteria andIsarrivedIsNotNull() {
            addCriterion("isArrived is not null");
            return (Criteria) this;
        }

        public Criteria andIsarrivedEqualTo(Integer value) {
            addCriterion("isArrived =", value, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedNotEqualTo(Integer value) {
            addCriterion("isArrived <>", value, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedGreaterThan(Integer value) {
            addCriterion("isArrived >", value, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isArrived >=", value, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedLessThan(Integer value) {
            addCriterion("isArrived <", value, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedLessThanOrEqualTo(Integer value) {
            addCriterion("isArrived <=", value, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedIn(List<Integer> values) {
            addCriterion("isArrived in", values, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedNotIn(List<Integer> values) {
            addCriterion("isArrived not in", values, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedBetween(Integer value1, Integer value2) {
            addCriterion("isArrived between", value1, value2, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIsarrivedNotBetween(Integer value1, Integer value2) {
            addCriterion("isArrived not between", value1, value2, "isarrived");
            return (Criteria) this;
        }

        public Criteria andIshomeIsNull() {
            addCriterion("isHome is null");
            return (Criteria) this;
        }

        public Criteria andIshomeIsNotNull() {
            addCriterion("isHome is not null");
            return (Criteria) this;
        }

        public Criteria andIshomeEqualTo(Integer value) {
            addCriterion("isHome =", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeNotEqualTo(Integer value) {
            addCriterion("isHome <>", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeGreaterThan(Integer value) {
            addCriterion("isHome >", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeGreaterThanOrEqualTo(Integer value) {
            addCriterion("isHome >=", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeLessThan(Integer value) {
            addCriterion("isHome <", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeLessThanOrEqualTo(Integer value) {
            addCriterion("isHome <=", value, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeIn(List<Integer> values) {
            addCriterion("isHome in", values, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeNotIn(List<Integer> values) {
            addCriterion("isHome not in", values, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeBetween(Integer value1, Integer value2) {
            addCriterion("isHome between", value1, value2, "ishome");
            return (Criteria) this;
        }

        public Criteria andIshomeNotBetween(Integer value1, Integer value2) {
            addCriterion("isHome not between", value1, value2, "ishome");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedIsNull() {
            addCriterion("isConfirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedIsNotNull() {
            addCriterion("isConfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedEqualTo(Integer value) {
            addCriterion("isConfirmed =", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedNotEqualTo(Integer value) {
            addCriterion("isConfirmed <>", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedGreaterThan(Integer value) {
            addCriterion("isConfirmed >", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isConfirmed >=", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedLessThan(Integer value) {
            addCriterion("isConfirmed <", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedLessThanOrEqualTo(Integer value) {
            addCriterion("isConfirmed <=", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedIn(List<Integer> values) {
            addCriterion("isConfirmed in", values, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedNotIn(List<Integer> values) {
            addCriterion("isConfirmed not in", values, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedBetween(Integer value1, Integer value2) {
            addCriterion("isConfirmed between", value1, value2, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedNotBetween(Integer value1, Integer value2) {
            addCriterion("isConfirmed not between", value1, value2, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsinvitedIsNull() {
            addCriterion("isInvited is null");
            return (Criteria) this;
        }

        public Criteria andIsinvitedIsNotNull() {
            addCriterion("isInvited is not null");
            return (Criteria) this;
        }

        public Criteria andIsinvitedEqualTo(Integer value) {
            addCriterion("isInvited =", value, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedNotEqualTo(Integer value) {
            addCriterion("isInvited <>", value, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedGreaterThan(Integer value) {
            addCriterion("isInvited >", value, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedGreaterThanOrEqualTo(Integer value) {
            addCriterion("isInvited >=", value, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedLessThan(Integer value) {
            addCriterion("isInvited <", value, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedLessThanOrEqualTo(Integer value) {
            addCriterion("isInvited <=", value, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedIn(List<Integer> values) {
            addCriterion("isInvited in", values, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedNotIn(List<Integer> values) {
            addCriterion("isInvited not in", values, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedBetween(Integer value1, Integer value2) {
            addCriterion("isInvited between", value1, value2, "isinvited");
            return (Criteria) this;
        }

        public Criteria andIsinvitedNotBetween(Integer value1, Integer value2) {
            addCriterion("isInvited not between", value1, value2, "isinvited");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNull() {
            addCriterion("createAt is null");
            return (Criteria) this;
        }

        public Criteria andCreateatIsNotNull() {
            addCriterion("createAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateatEqualTo(Date value) {
            addCriterion("createAt =", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotEqualTo(Date value) {
            addCriterion("createAt <>", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThan(Date value) {
            addCriterion("createAt >", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatGreaterThanOrEqualTo(Date value) {
            addCriterion("createAt >=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThan(Date value) {
            addCriterion("createAt <", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatLessThanOrEqualTo(Date value) {
            addCriterion("createAt <=", value, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatIn(List<Date> values) {
            addCriterion("createAt in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotIn(List<Date> values) {
            addCriterion("createAt not in", values, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatBetween(Date value1, Date value2) {
            addCriterion("createAt between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andCreateatNotBetween(Date value1, Date value2) {
            addCriterion("createAt not between", value1, value2, "createat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNull() {
            addCriterion("updatedAt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIsNotNull() {
            addCriterion("updatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedatEqualTo(Date value) {
            addCriterion("updatedAt =", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotEqualTo(Date value) {
            addCriterion("updatedAt <>", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThan(Date value) {
            addCriterion("updatedAt >", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatGreaterThanOrEqualTo(Date value) {
            addCriterion("updatedAt >=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThan(Date value) {
            addCriterion("updatedAt <", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatLessThanOrEqualTo(Date value) {
            addCriterion("updatedAt <=", value, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatIn(List<Date> values) {
            addCriterion("updatedAt in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotIn(List<Date> values) {
            addCriterion("updatedAt not in", values, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatBetween(Date value1, Date value2) {
            addCriterion("updatedAt between", value1, value2, "updatedat");
            return (Criteria) this;
        }

        public Criteria andUpdatedatNotBetween(Date value1, Date value2) {
            addCriterion("updatedAt not between", value1, value2, "updatedat");
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