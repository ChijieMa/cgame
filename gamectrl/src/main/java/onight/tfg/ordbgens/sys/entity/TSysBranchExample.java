package onight.tfg.ordbgens.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class TSysBranchExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_SYS_BRANCH
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
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public TSysBranchExample() {
        oredCriteria = new ArrayList<Criteria>();
        offset = 0;
        limit = Integer.MAX_VALUE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
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
     * This method corresponds to the database table T_SYS_BRANCH
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
     * This method corresponds to the database table T_SYS_BRANCH
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_BRANCH
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
     * This class corresponds to the database table T_SYS_BRANCH
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNull() {
            addCriterion("BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andBranchIdIsNotNull() {
            addCriterion("BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBranchIdEqualTo(String value) {
            addCriterion("BRANCH_ID =", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotEqualTo(String value) {
            addCriterion("BRANCH_ID <>", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThan(String value) {
            addCriterion("BRANCH_ID >", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID >=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThan(String value) {
            addCriterion("BRANCH_ID <", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_ID <=", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdLike(String value) {
            addCriterion("BRANCH_ID like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotLike(String value) {
            addCriterion("BRANCH_ID not like", value, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdIn(List<String> values) {
            addCriterion("BRANCH_ID in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotIn(List<String> values) {
            addCriterion("BRANCH_ID not in", values, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdBetween(String value1, String value2) {
            addCriterion("BRANCH_ID between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchIdNotBetween(String value1, String value2) {
            addCriterion("BRANCH_ID not between", value1, value2, "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchDescIsNull() {
            addCriterion("BRANCH_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBranchDescIsNotNull() {
            addCriterion("BRANCH_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBranchDescEqualTo(String value) {
            addCriterion("BRANCH_DESC =", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescNotEqualTo(String value) {
            addCriterion("BRANCH_DESC <>", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescGreaterThan(String value) {
            addCriterion("BRANCH_DESC >", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_DESC >=", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescLessThan(String value) {
            addCriterion("BRANCH_DESC <", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_DESC <=", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescLike(String value) {
            addCriterion("BRANCH_DESC like", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescNotLike(String value) {
            addCriterion("BRANCH_DESC not like", value, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescIn(List<String> values) {
            addCriterion("BRANCH_DESC in", values, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescNotIn(List<String> values) {
            addCriterion("BRANCH_DESC not in", values, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescBetween(String value1, String value2) {
            addCriterion("BRANCH_DESC between", value1, value2, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchDescNotBetween(String value1, String value2) {
            addCriterion("BRANCH_DESC not between", value1, value2, "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("BRANCH_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("BRANCH_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("BRANCH_NAME =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("BRANCH_NAME <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("BRANCH_NAME >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("BRANCH_NAME <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_NAME <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("BRANCH_NAME like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("BRANCH_NAME not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("BRANCH_NAME in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("BRANCH_NAME not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("BRANCH_NAME not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchManagerIsNull() {
            addCriterion("BRANCH_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andBranchManagerIsNotNull() {
            addCriterion("BRANCH_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andBranchManagerEqualTo(String value) {
            addCriterion("BRANCH_MANAGER =", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerNotEqualTo(String value) {
            addCriterion("BRANCH_MANAGER <>", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerGreaterThan(String value) {
            addCriterion("BRANCH_MANAGER >", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_MANAGER >=", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerLessThan(String value) {
            addCriterion("BRANCH_MANAGER <", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_MANAGER <=", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerLike(String value) {
            addCriterion("BRANCH_MANAGER like", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerNotLike(String value) {
            addCriterion("BRANCH_MANAGER not like", value, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerIn(List<String> values) {
            addCriterion("BRANCH_MANAGER in", values, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerNotIn(List<String> values) {
            addCriterion("BRANCH_MANAGER not in", values, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerBetween(String value1, String value2) {
            addCriterion("BRANCH_MANAGER between", value1, value2, "branchManager");
            return (Criteria) this;
        }

        public Criteria andBranchManagerNotBetween(String value1, String value2) {
            addCriterion("BRANCH_MANAGER not between", value1, value2, "branchManager");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("BEGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("BEGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("BEGIN_TIME =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("BEGIN_TIME <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("BEGIN_TIME >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("BEGIN_TIME <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("BEGIN_TIME <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("BEGIN_TIME in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("BEGIN_TIME not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("BEGIN_TIME not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("PARENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("PARENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(String value) {
            addCriterion("PARENT_ID =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(String value) {
            addCriterion("PARENT_ID <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(String value) {
            addCriterion("PARENT_ID >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_ID >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(String value) {
            addCriterion("PARENT_ID <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_ID <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLike(String value) {
            addCriterion("PARENT_ID like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotLike(String value) {
            addCriterion("PARENT_ID not like", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<String> values) {
            addCriterion("PARENT_ID in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<String> values) {
            addCriterion("PARENT_ID not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(String value1, String value2) {
            addCriterion("PARENT_ID between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(String value1, String value2) {
            addCriterion("PARENT_ID not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLeafFlagIsNull() {
            addCriterion("LEAF_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andLeafFlagIsNotNull() {
            addCriterion("LEAF_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andLeafFlagEqualTo(Integer value) {
            addCriterion("LEAF_FLAG =", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagNotEqualTo(Integer value) {
            addCriterion("LEAF_FLAG <>", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagGreaterThan(Integer value) {
            addCriterion("LEAF_FLAG >", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEAF_FLAG >=", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagLessThan(Integer value) {
            addCriterion("LEAF_FLAG <", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagLessThanOrEqualTo(Integer value) {
            addCriterion("LEAF_FLAG <=", value, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagIn(List<Integer> values) {
            addCriterion("LEAF_FLAG in", values, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagNotIn(List<Integer> values) {
            addCriterion("LEAF_FLAG not in", values, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_FLAG between", value1, value2, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andLeafFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("LEAF_FLAG not between", value1, value2, "leafFlag");
            return (Criteria) this;
        }

        public Criteria andBranchSeqIsNull() {
            addCriterion("BRANCH_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andBranchSeqIsNotNull() {
            addCriterion("BRANCH_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andBranchSeqEqualTo(Integer value) {
            addCriterion("BRANCH_SEQ =", value, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqNotEqualTo(Integer value) {
            addCriterion("BRANCH_SEQ <>", value, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqGreaterThan(Integer value) {
            addCriterion("BRANCH_SEQ >", value, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRANCH_SEQ >=", value, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqLessThan(Integer value) {
            addCriterion("BRANCH_SEQ <", value, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqLessThanOrEqualTo(Integer value) {
            addCriterion("BRANCH_SEQ <=", value, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqIn(List<Integer> values) {
            addCriterion("BRANCH_SEQ in", values, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqNotIn(List<Integer> values) {
            addCriterion("BRANCH_SEQ not in", values, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH_SEQ between", value1, value2, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andBranchSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("BRANCH_SEQ not between", value1, value2, "branchSeq");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("LEVEL =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("LEVEL <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("LEVEL >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("LEVEL >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("LEVEL <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("LEVEL <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("LEVEL in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("LEVEL not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("LEVEL not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIdLikeInsensitive(String value) {
            addCriterion("upper(ID) like", value.toUpperCase(), "id");
            return (Criteria) this;
        }

        public Criteria andBranchIdLikeInsensitive(String value) {
            addCriterion("upper(BRANCH_ID) like", value.toUpperCase(), "branchId");
            return (Criteria) this;
        }

        public Criteria andBranchDescLikeInsensitive(String value) {
            addCriterion("upper(BRANCH_DESC) like", value.toUpperCase(), "branchDesc");
            return (Criteria) this;
        }

        public Criteria andBranchNameLikeInsensitive(String value) {
            addCriterion("upper(BRANCH_NAME) like", value.toUpperCase(), "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchManagerLikeInsensitive(String value) {
            addCriterion("upper(BRANCH_MANAGER) like", value.toUpperCase(), "branchManager");
            return (Criteria) this;
        }

        public Criteria andMobileLikeInsensitive(String value) {
            addCriterion("upper(MOBILE) like", value.toUpperCase(), "mobile");
            return (Criteria) this;
        }

        public Criteria andParentIdLikeInsensitive(String value) {
            addCriterion("upper(PARENT_ID) like", value.toUpperCase(), "parentId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_SYS_BRANCH
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
     * This class corresponds to the database table T_SYS_BRANCH
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