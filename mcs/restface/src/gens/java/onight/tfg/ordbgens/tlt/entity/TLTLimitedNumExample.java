package onight.tfg.ordbgens.tlt.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TLTLimitedNumExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    protected List<Criteria> oredCriteria;

    protected int offset;

    protected int limit;

    protected String sumCol;

    protected String groupSelClause;

    protected boolean forUpdate;

    protected String groupByClause;

    String selectCols;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public TLTLimitedNumExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
        this.offset= 0;
        this.limit= Integer.MAX_VALUE;
        this.sumCol=null;
        this.groupSelClause=null;
        this.groupByClause=null;
        this.forUpdate=false;
    }

    public void setOffset(int offset) {
         this.offset = offset;
    }

    public int getOffset() {
          return offset;
    }

    public void setLimit(int limit) {
         this.limit = limit;
    }

    public int getLimit() {
          return limit;
    }

    public void setSumCol(String sumCol) {
         this.sumCol = sumCol;
    }

    public String getSumCol() {
          return sumCol;
    }

    public void setGroupSelClause(String groupSelClause) {
         this.groupSelClause = groupSelClause;
    }

    public String getGroupSelClause() {
          return groupSelClause;
    }

    public void setForUpdate(boolean forUpdate) {
         this.forUpdate = forUpdate;
    }

    public boolean isForUpdate() {
          return forUpdate;
    }

    public void setGroupByClause(String groupByClause) {
         this.groupByClause = groupByClause;
    }

    public String getGroupByClause() {
          return groupByClause;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    @Data
    public abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        public GeneratedCriteria() {
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

        public void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        public void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        public void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNull() {
            addCriterion("ISSUE_NO is null");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNotNull() {
            addCriterion("ISSUE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNoEqualTo(String value) {
            addCriterion("ISSUE_NO =", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotEqualTo(String value) {
            addCriterion("ISSUE_NO <>", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThan(String value) {
            addCriterion("ISSUE_NO >", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThanOrEqualTo(String value) {
            addCriterion("ISSUE_NO >=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThan(String value) {
            addCriterion("ISSUE_NO <", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThanOrEqualTo(String value) {
            addCriterion("ISSUE_NO <=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLike(String value) {
            addCriterion("ISSUE_NO like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotLike(String value) {
            addCriterion("ISSUE_NO not like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoIn(List<String> values) {
            addCriterion("ISSUE_NO in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotIn(List<String> values) {
            addCriterion("ISSUE_NO not in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoBetween(String value1, String value2) {
            addCriterion("ISSUE_NO between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotBetween(String value1, String value2) {
            addCriterion("ISSUE_NO not between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andLimitedNumIsNull() {
            addCriterion("LIMITED_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLimitedNumIsNotNull() {
            addCriterion("LIMITED_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLimitedNumEqualTo(String value) {
            addCriterion("LIMITED_NUM =", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumNotEqualTo(String value) {
            addCriterion("LIMITED_NUM <>", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumGreaterThan(String value) {
            addCriterion("LIMITED_NUM >", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumGreaterThanOrEqualTo(String value) {
            addCriterion("LIMITED_NUM >=", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumLessThan(String value) {
            addCriterion("LIMITED_NUM <", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumLessThanOrEqualTo(String value) {
            addCriterion("LIMITED_NUM <=", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumLike(String value) {
            addCriterion("LIMITED_NUM like", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumNotLike(String value) {
            addCriterion("LIMITED_NUM not like", value, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumIn(List<String> values) {
            addCriterion("LIMITED_NUM in", values, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumNotIn(List<String> values) {
            addCriterion("LIMITED_NUM not in", values, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumBetween(String value1, String value2) {
            addCriterion("LIMITED_NUM between", value1, value2, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLimitedNumNotBetween(String value1, String value2) {
            addCriterion("LIMITED_NUM not between", value1, value2, "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLtypeIsNull() {
            addCriterion("LTYPE is null");
            return (Criteria) this;
        }

        public Criteria andLtypeIsNotNull() {
            addCriterion("LTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLtypeEqualTo(String value) {
            addCriterion("LTYPE =", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotEqualTo(String value) {
            addCriterion("LTYPE <>", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeGreaterThan(String value) {
            addCriterion("LTYPE >", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeGreaterThanOrEqualTo(String value) {
            addCriterion("LTYPE >=", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLessThan(String value) {
            addCriterion("LTYPE <", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLessThanOrEqualTo(String value) {
            addCriterion("LTYPE <=", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeLike(String value) {
            addCriterion("LTYPE like", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotLike(String value) {
            addCriterion("LTYPE not like", value, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeIn(List<String> values) {
            addCriterion("LTYPE in", values, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotIn(List<String> values) {
            addCriterion("LTYPE not in", values, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeBetween(String value1, String value2) {
            addCriterion("LTYPE between", value1, value2, "ltype");
            return (Criteria) this;
        }

        public Criteria andLtypeNotBetween(String value1, String value2) {
            addCriterion("LTYPE not between", value1, value2, "ltype");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNull() {
            addCriterion("PLAY_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIsNotNull() {
            addCriterion("PLAY_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPlayTypeEqualTo(String value) {
            addCriterion("PLAY_TYPE =", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotEqualTo(String value) {
            addCriterion("PLAY_TYPE <>", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThan(String value) {
            addCriterion("PLAY_TYPE >", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PLAY_TYPE >=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThan(String value) {
            addCriterion("PLAY_TYPE <", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLessThanOrEqualTo(String value) {
            addCriterion("PLAY_TYPE <=", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLike(String value) {
            addCriterion("PLAY_TYPE like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotLike(String value) {
            addCriterion("PLAY_TYPE not like", value, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeIn(List<String> values) {
            addCriterion("PLAY_TYPE in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotIn(List<String> values) {
            addCriterion("PLAY_TYPE not in", values, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeBetween(String value1, String value2) {
            addCriterion("PLAY_TYPE between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andPlayTypeNotBetween(String value1, String value2) {
            addCriterion("PLAY_TYPE not between", value1, value2, "playType");
            return (Criteria) this;
        }

        public Criteria andExtrafield1IsNull() {
            addCriterion("EXTRAFIELD1 is null");
            return (Criteria) this;
        }

        public Criteria andExtrafield1IsNotNull() {
            addCriterion("EXTRAFIELD1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtrafield1EqualTo(String value) {
            addCriterion("EXTRAFIELD1 =", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1NotEqualTo(String value) {
            addCriterion("EXTRAFIELD1 <>", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1GreaterThan(String value) {
            addCriterion("EXTRAFIELD1 >", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRAFIELD1 >=", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1LessThan(String value) {
            addCriterion("EXTRAFIELD1 <", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1LessThanOrEqualTo(String value) {
            addCriterion("EXTRAFIELD1 <=", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1Like(String value) {
            addCriterion("EXTRAFIELD1 like", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1NotLike(String value) {
            addCriterion("EXTRAFIELD1 not like", value, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1In(List<String> values) {
            addCriterion("EXTRAFIELD1 in", values, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1NotIn(List<String> values) {
            addCriterion("EXTRAFIELD1 not in", values, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1Between(String value1, String value2) {
            addCriterion("EXTRAFIELD1 between", value1, value2, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield1NotBetween(String value1, String value2) {
            addCriterion("EXTRAFIELD1 not between", value1, value2, "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield2IsNull() {
            addCriterion("EXTRAFIELD2 is null");
            return (Criteria) this;
        }

        public Criteria andExtrafield2IsNotNull() {
            addCriterion("EXTRAFIELD2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtrafield2EqualTo(String value) {
            addCriterion("EXTRAFIELD2 =", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2NotEqualTo(String value) {
            addCriterion("EXTRAFIELD2 <>", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2GreaterThan(String value) {
            addCriterion("EXTRAFIELD2 >", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTRAFIELD2 >=", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2LessThan(String value) {
            addCriterion("EXTRAFIELD2 <", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2LessThanOrEqualTo(String value) {
            addCriterion("EXTRAFIELD2 <=", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2Like(String value) {
            addCriterion("EXTRAFIELD2 like", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2NotLike(String value) {
            addCriterion("EXTRAFIELD2 not like", value, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2In(List<String> values) {
            addCriterion("EXTRAFIELD2 in", values, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2NotIn(List<String> values) {
            addCriterion("EXTRAFIELD2 not in", values, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2Between(String value1, String value2) {
            addCriterion("EXTRAFIELD2 between", value1, value2, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield2NotBetween(String value1, String value2) {
            addCriterion("EXTRAFIELD2 not between", value1, value2, "extrafield2");
            return (Criteria) this;
        }

        public Criteria andExtrafield3IsNull() {
            addCriterion("EXTRAFIELD3 is null");
            return (Criteria) this;
        }

        public Criteria andExtrafield3IsNotNull() {
            addCriterion("EXTRAFIELD3 is not null");
            return (Criteria) this;
        }

        public Criteria andExtrafield3EqualTo(Integer value) {
            addCriterion("EXTRAFIELD3 =", value, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3NotEqualTo(Integer value) {
            addCriterion("EXTRAFIELD3 <>", value, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3GreaterThan(Integer value) {
            addCriterion("EXTRAFIELD3 >", value, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3GreaterThanOrEqualTo(Integer value) {
            addCriterion("EXTRAFIELD3 >=", value, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3LessThan(Integer value) {
            addCriterion("EXTRAFIELD3 <", value, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3LessThanOrEqualTo(Integer value) {
            addCriterion("EXTRAFIELD3 <=", value, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3In(List<Integer> values) {
            addCriterion("EXTRAFIELD3 in", values, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3NotIn(List<Integer> values) {
            addCriterion("EXTRAFIELD3 not in", values, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3Between(Integer value1, Integer value2) {
            addCriterion("EXTRAFIELD3 between", value1, value2, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield3NotBetween(Integer value1, Integer value2) {
            addCriterion("EXTRAFIELD3 not between", value1, value2, "extrafield3");
            return (Criteria) this;
        }

        public Criteria andExtrafield4IsNull() {
            addCriterion("EXTRAFIELD4 is null");
            return (Criteria) this;
        }

        public Criteria andExtrafield4IsNotNull() {
            addCriterion("EXTRAFIELD4 is not null");
            return (Criteria) this;
        }

        public Criteria andExtrafield4EqualTo(BigDecimal value) {
            addCriterion("EXTRAFIELD4 =", value, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4NotEqualTo(BigDecimal value) {
            addCriterion("EXTRAFIELD4 <>", value, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4GreaterThan(BigDecimal value) {
            addCriterion("EXTRAFIELD4 >", value, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAFIELD4 >=", value, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4LessThan(BigDecimal value) {
            addCriterion("EXTRAFIELD4 <", value, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAFIELD4 <=", value, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4In(List<BigDecimal> values) {
            addCriterion("EXTRAFIELD4 in", values, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4NotIn(List<BigDecimal> values) {
            addCriterion("EXTRAFIELD4 not in", values, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAFIELD4 between", value1, value2, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAFIELD4 not between", value1, value2, "extrafield4");
            return (Criteria) this;
        }

        public Criteria andExtrafield5IsNull() {
            addCriterion("EXTRAFIELD5 is null");
            return (Criteria) this;
        }

        public Criteria andExtrafield5IsNotNull() {
            addCriterion("EXTRAFIELD5 is not null");
            return (Criteria) this;
        }

        public Criteria andExtrafield5EqualTo(Long value) {
            addCriterion("EXTRAFIELD5 =", value, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5NotEqualTo(Long value) {
            addCriterion("EXTRAFIELD5 <>", value, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5GreaterThan(Long value) {
            addCriterion("EXTRAFIELD5 >", value, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5GreaterThanOrEqualTo(Long value) {
            addCriterion("EXTRAFIELD5 >=", value, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5LessThan(Long value) {
            addCriterion("EXTRAFIELD5 <", value, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5LessThanOrEqualTo(Long value) {
            addCriterion("EXTRAFIELD5 <=", value, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5In(List<Long> values) {
            addCriterion("EXTRAFIELD5 in", values, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5NotIn(List<Long> values) {
            addCriterion("EXTRAFIELD5 not in", values, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5Between(Long value1, Long value2) {
            addCriterion("EXTRAFIELD5 between", value1, value2, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andExtrafield5NotBetween(Long value1, Long value2) {
            addCriterion("EXTRAFIELD5 not between", value1, value2, "extrafield5");
            return (Criteria) this;
        }

        public Criteria andUuidLikeInsensitive(String value) {
            addCriterion("upper(UUID) like", value.toUpperCase(), "uuid");
            return (Criteria) this;
        }

        public Criteria andIssueNoLikeInsensitive(String value) {
            addCriterion("upper(ISSUE_NO) like", value.toUpperCase(), "issueNo");
            return (Criteria) this;
        }

        public Criteria andLimitedNumLikeInsensitive(String value) {
            addCriterion("upper(LIMITED_NUM) like", value.toUpperCase(), "limitedNum");
            return (Criteria) this;
        }

        public Criteria andLtypeLikeInsensitive(String value) {
            addCriterion("upper(LTYPE) like", value.toUpperCase(), "ltype");
            return (Criteria) this;
        }

        public Criteria andPlayTypeLikeInsensitive(String value) {
            addCriterion("upper(PLAY_TYPE) like", value.toUpperCase(), "playType");
            return (Criteria) this;
        }

        public Criteria andExtrafield1LikeInsensitive(String value) {
            addCriterion("upper(EXTRAFIELD1) like", value.toUpperCase(), "extrafield1");
            return (Criteria) this;
        }

        public Criteria andExtrafield2LikeInsensitive(String value) {
            addCriterion("upper(EXTRAFIELD2) like", value.toUpperCase(), "extrafield2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated do_not_delete_during_merge Sat Apr 16 00:18:58 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    @Data
    @NoArgsConstructor
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

        public Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        public Criterion(String condition, Object value, String typeHandler) {
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

        public Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        public Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        public Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}