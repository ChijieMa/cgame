package onight.tfg.ordbgens.tlt.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TLTIssueFlowsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public TLTIssueFlowsExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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
     * This class corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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

        public Criteria andGenIdIsNull() {
            addCriterion("GEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andGenIdIsNotNull() {
            addCriterion("GEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGenIdEqualTo(Long value) {
            addCriterion("GEN_ID =", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotEqualTo(Long value) {
            addCriterion("GEN_ID <>", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdGreaterThan(Long value) {
            addCriterion("GEN_ID >", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdGreaterThanOrEqualTo(Long value) {
            addCriterion("GEN_ID >=", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLessThan(Long value) {
            addCriterion("GEN_ID <", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdLessThanOrEqualTo(Long value) {
            addCriterion("GEN_ID <=", value, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdIn(List<Long> values) {
            addCriterion("GEN_ID in", values, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotIn(List<Long> values) {
            addCriterion("GEN_ID not in", values, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdBetween(Long value1, Long value2) {
            addCriterion("GEN_ID between", value1, value2, "genId");
            return (Criteria) this;
        }

        public Criteria andGenIdNotBetween(Long value1, Long value2) {
            addCriterion("GEN_ID not between", value1, value2, "genId");
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

        public Criteria andGsEcodeIsNull() {
            addCriterion("GS_ECODE is null");
            return (Criteria) this;
        }

        public Criteria andGsEcodeIsNotNull() {
            addCriterion("GS_ECODE is not null");
            return (Criteria) this;
        }

        public Criteria andGsEcodeEqualTo(String value) {
            addCriterion("GS_ECODE =", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeNotEqualTo(String value) {
            addCriterion("GS_ECODE <>", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeGreaterThan(String value) {
            addCriterion("GS_ECODE >", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GS_ECODE >=", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeLessThan(String value) {
            addCriterion("GS_ECODE <", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeLessThanOrEqualTo(String value) {
            addCriterion("GS_ECODE <=", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeLike(String value) {
            addCriterion("GS_ECODE like", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeNotLike(String value) {
            addCriterion("GS_ECODE not like", value, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeIn(List<String> values) {
            addCriterion("GS_ECODE in", values, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeNotIn(List<String> values) {
            addCriterion("GS_ECODE not in", values, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeBetween(String value1, String value2) {
            addCriterion("GS_ECODE between", value1, value2, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsEcodeNotBetween(String value1, String value2) {
            addCriterion("GS_ECODE not between", value1, value2, "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeIsNull() {
            addCriterion("GS_CHCODE is null");
            return (Criteria) this;
        }

        public Criteria andGsChcodeIsNotNull() {
            addCriterion("GS_CHCODE is not null");
            return (Criteria) this;
        }

        public Criteria andGsChcodeEqualTo(String value) {
            addCriterion("GS_CHCODE =", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeNotEqualTo(String value) {
            addCriterion("GS_CHCODE <>", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeGreaterThan(String value) {
            addCriterion("GS_CHCODE >", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeGreaterThanOrEqualTo(String value) {
            addCriterion("GS_CHCODE >=", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeLessThan(String value) {
            addCriterion("GS_CHCODE <", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeLessThanOrEqualTo(String value) {
            addCriterion("GS_CHCODE <=", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeLike(String value) {
            addCriterion("GS_CHCODE like", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeNotLike(String value) {
            addCriterion("GS_CHCODE not like", value, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeIn(List<String> values) {
            addCriterion("GS_CHCODE in", values, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeNotIn(List<String> values) {
            addCriterion("GS_CHCODE not in", values, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeBetween(String value1, String value2) {
            addCriterion("GS_CHCODE between", value1, value2, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeNotBetween(String value1, String value2) {
            addCriterion("GS_CHCODE not between", value1, value2, "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsDescIsNull() {
            addCriterion("GS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andGsDescIsNotNull() {
            addCriterion("GS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andGsDescEqualTo(String value) {
            addCriterion("GS_DESC =", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescNotEqualTo(String value) {
            addCriterion("GS_DESC <>", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescGreaterThan(String value) {
            addCriterion("GS_DESC >", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescGreaterThanOrEqualTo(String value) {
            addCriterion("GS_DESC >=", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescLessThan(String value) {
            addCriterion("GS_DESC <", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescLessThanOrEqualTo(String value) {
            addCriterion("GS_DESC <=", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescLike(String value) {
            addCriterion("GS_DESC like", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescNotLike(String value) {
            addCriterion("GS_DESC not like", value, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescIn(List<String> values) {
            addCriterion("GS_DESC in", values, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescNotIn(List<String> values) {
            addCriterion("GS_DESC not in", values, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescBetween(String value1, String value2) {
            addCriterion("GS_DESC between", value1, value2, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsDescNotBetween(String value1, String value2) {
            addCriterion("GS_DESC not between", value1, value2, "gsDesc");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetIsNull() {
            addCriterion("TIMESEC_OFFSET is null");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetIsNotNull() {
            addCriterion("TIMESEC_OFFSET is not null");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetEqualTo(Integer value) {
            addCriterion("TIMESEC_OFFSET =", value, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetNotEqualTo(Integer value) {
            addCriterion("TIMESEC_OFFSET <>", value, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetGreaterThan(Integer value) {
            addCriterion("TIMESEC_OFFSET >", value, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetGreaterThanOrEqualTo(Integer value) {
            addCriterion("TIMESEC_OFFSET >=", value, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetLessThan(Integer value) {
            addCriterion("TIMESEC_OFFSET <", value, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetLessThanOrEqualTo(Integer value) {
            addCriterion("TIMESEC_OFFSET <=", value, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetIn(List<Integer> values) {
            addCriterion("TIMESEC_OFFSET in", values, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetNotIn(List<Integer> values) {
            addCriterion("TIMESEC_OFFSET not in", values, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetBetween(Integer value1, Integer value2) {
            addCriterion("TIMESEC_OFFSET between", value1, value2, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andTimesecOffsetNotBetween(Integer value1, Integer value2) {
            addCriterion("TIMESEC_OFFSET not between", value1, value2, "timesecOffset");
            return (Criteria) this;
        }

        public Criteria andGsOrderIsNull() {
            addCriterion("GS_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andGsOrderIsNotNull() {
            addCriterion("GS_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andGsOrderEqualTo(String value) {
            addCriterion("GS_ORDER =", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderNotEqualTo(String value) {
            addCriterion("GS_ORDER <>", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderGreaterThan(String value) {
            addCriterion("GS_ORDER >", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderGreaterThanOrEqualTo(String value) {
            addCriterion("GS_ORDER >=", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderLessThan(String value) {
            addCriterion("GS_ORDER <", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderLessThanOrEqualTo(String value) {
            addCriterion("GS_ORDER <=", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderLike(String value) {
            addCriterion("GS_ORDER like", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderNotLike(String value) {
            addCriterion("GS_ORDER not like", value, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderIn(List<String> values) {
            addCriterion("GS_ORDER in", values, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderNotIn(List<String> values) {
            addCriterion("GS_ORDER not in", values, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderBetween(String value1, String value2) {
            addCriterion("GS_ORDER between", value1, value2, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andGsOrderNotBetween(String value1, String value2) {
            addCriterion("GS_ORDER not between", value1, value2, "gsOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrdersIsNull() {
            addCriterion("NEXT_ORDERS is null");
            return (Criteria) this;
        }

        public Criteria andNextOrdersIsNotNull() {
            addCriterion("NEXT_ORDERS is not null");
            return (Criteria) this;
        }

        public Criteria andNextOrdersEqualTo(String value) {
            addCriterion("NEXT_ORDERS =", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersNotEqualTo(String value) {
            addCriterion("NEXT_ORDERS <>", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersGreaterThan(String value) {
            addCriterion("NEXT_ORDERS >", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersGreaterThanOrEqualTo(String value) {
            addCriterion("NEXT_ORDERS >=", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersLessThan(String value) {
            addCriterion("NEXT_ORDERS <", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersLessThanOrEqualTo(String value) {
            addCriterion("NEXT_ORDERS <=", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersLike(String value) {
            addCriterion("NEXT_ORDERS like", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersNotLike(String value) {
            addCriterion("NEXT_ORDERS not like", value, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersIn(List<String> values) {
            addCriterion("NEXT_ORDERS in", values, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersNotIn(List<String> values) {
            addCriterion("NEXT_ORDERS not in", values, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersBetween(String value1, String value2) {
            addCriterion("NEXT_ORDERS between", value1, value2, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andNextOrdersNotBetween(String value1, String value2) {
            addCriterion("NEXT_ORDERS not between", value1, value2, "nextOrders");
            return (Criteria) this;
        }

        public Criteria andAutoGonextIsNull() {
            addCriterion("AUTO_GONEXT is null");
            return (Criteria) this;
        }

        public Criteria andAutoGonextIsNotNull() {
            addCriterion("AUTO_GONEXT is not null");
            return (Criteria) this;
        }

        public Criteria andAutoGonextEqualTo(String value) {
            addCriterion("AUTO_GONEXT =", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextNotEqualTo(String value) {
            addCriterion("AUTO_GONEXT <>", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextGreaterThan(String value) {
            addCriterion("AUTO_GONEXT >", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextGreaterThanOrEqualTo(String value) {
            addCriterion("AUTO_GONEXT >=", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextLessThan(String value) {
            addCriterion("AUTO_GONEXT <", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextLessThanOrEqualTo(String value) {
            addCriterion("AUTO_GONEXT <=", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextLike(String value) {
            addCriterion("AUTO_GONEXT like", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextNotLike(String value) {
            addCriterion("AUTO_GONEXT not like", value, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextIn(List<String> values) {
            addCriterion("AUTO_GONEXT in", values, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextNotIn(List<String> values) {
            addCriterion("AUTO_GONEXT not in", values, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextBetween(String value1, String value2) {
            addCriterion("AUTO_GONEXT between", value1, value2, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andAutoGonextNotBetween(String value1, String value2) {
            addCriterion("AUTO_GONEXT not between", value1, value2, "autoGonext");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLtypeLikeInsensitive(String value) {
            addCriterion("upper(LTYPE) like", value.toUpperCase(), "ltype");
            return (Criteria) this;
        }

        public Criteria andGsEcodeLikeInsensitive(String value) {
            addCriterion("upper(GS_ECODE) like", value.toUpperCase(), "gsEcode");
            return (Criteria) this;
        }

        public Criteria andGsChcodeLikeInsensitive(String value) {
            addCriterion("upper(GS_CHCODE) like", value.toUpperCase(), "gsChcode");
            return (Criteria) this;
        }

        public Criteria andGsDescLikeInsensitive(String value) {
            addCriterion("upper(GS_DESC) like", value.toUpperCase(), "gsDesc");
            return (Criteria) this;
        }

        public Criteria andGsOrderLikeInsensitive(String value) {
            addCriterion("upper(GS_ORDER) like", value.toUpperCase(), "gsOrder");
            return (Criteria) this;
        }

        public Criteria andNextOrdersLikeInsensitive(String value) {
            addCriterion("upper(NEXT_ORDERS) like", value.toUpperCase(), "nextOrders");
            return (Criteria) this;
        }

        public Criteria andAutoGonextLikeInsensitive(String value) {
            addCriterion("upper(AUTO_GONEXT) like", value.toUpperCase(), "autoGonext");
            return (Criteria) this;
        }

        public Criteria andStatusLikeInsensitive(String value) {
            addCriterion("upper(STATUS) like", value.toUpperCase(), "status");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated do_not_delete_during_merge Mon Apr 11 14:17:27 CST 2016
     */
    public static class Criteria extends GeneratedCriteria {

        public Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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