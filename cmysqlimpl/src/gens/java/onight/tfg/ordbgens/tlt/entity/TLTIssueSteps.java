package onight.tfg.ordbgens.tlt.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_ISSUE_STEPS")
@AllArgsConstructor
@NoArgsConstructor
public class TLTIssueSteps extends TLTIssueStepsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.LTYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.ISSUE_NO
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String issueNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.STEP_STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String stepStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.CREATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.MODIFY_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.OPERATOR_ID
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String operatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.GS_ECODE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String gsEcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.GS_CHCODE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String gsChcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.TIMESEC_OFFSET
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private Integer timesecOffset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.GS_ORDER
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String gsOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.NEXT_ORDERS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String nextOrders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.WAIT_ORDERS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String waitOrders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.NODE_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String nodeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.REF_PARAM_GEN_ID
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private Long refParamGenId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.AUTO_GONEXT
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String autoGonext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.RETRY_TIMES
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private Integer retryTimes;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_STEPS.FAILED_REASON
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    private String failedReason;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.LTYPE
     *
     * @return the value of TLT_ISSUE_STEPS.LTYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.LTYPE
     *
     * @param ltype the value for TLT_ISSUE_STEPS.LTYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.ISSUE_NO
     *
     * @return the value of TLT_ISSUE_STEPS.ISSUE_NO
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.ISSUE_NO
     *
     * @param issueNo the value for TLT_ISSUE_STEPS.ISSUE_NO
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.STEP_STATUS
     *
     * @return the value of TLT_ISSUE_STEPS.STEP_STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getStepStatus() {
        return stepStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.STEP_STATUS
     *
     * @param stepStatus the value for TLT_ISSUE_STEPS.STEP_STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setStepStatus(String stepStatus) {
        this.stepStatus = stepStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.CREATE_TIME
     *
     * @return the value of TLT_ISSUE_STEPS.CREATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.CREATE_TIME
     *
     * @param createTime the value for TLT_ISSUE_STEPS.CREATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.MODIFY_TIME
     *
     * @return the value of TLT_ISSUE_STEPS.MODIFY_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.MODIFY_TIME
     *
     * @param modifyTime the value for TLT_ISSUE_STEPS.MODIFY_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.OPERATOR_ID
     *
     * @return the value of TLT_ISSUE_STEPS.OPERATOR_ID
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getOperatorId() {
        return operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.OPERATOR_ID
     *
     * @param operatorId the value for TLT_ISSUE_STEPS.OPERATOR_ID
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setOperatorId(String operatorId) {
        this.operatorId = operatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.GS_ECODE
     *
     * @return the value of TLT_ISSUE_STEPS.GS_ECODE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getGsEcode() {
        return gsEcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.GS_ECODE
     *
     * @param gsEcode the value for TLT_ISSUE_STEPS.GS_ECODE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setGsEcode(String gsEcode) {
        this.gsEcode = gsEcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.GS_CHCODE
     *
     * @return the value of TLT_ISSUE_STEPS.GS_CHCODE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getGsChcode() {
        return gsChcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.GS_CHCODE
     *
     * @param gsChcode the value for TLT_ISSUE_STEPS.GS_CHCODE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setGsChcode(String gsChcode) {
        this.gsChcode = gsChcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.TIMESEC_OFFSET
     *
     * @return the value of TLT_ISSUE_STEPS.TIMESEC_OFFSET
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public Integer getTimesecOffset() {
        return timesecOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.TIMESEC_OFFSET
     *
     * @param timesecOffset the value for TLT_ISSUE_STEPS.TIMESEC_OFFSET
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setTimesecOffset(Integer timesecOffset) {
        this.timesecOffset = timesecOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.GS_ORDER
     *
     * @return the value of TLT_ISSUE_STEPS.GS_ORDER
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getGsOrder() {
        return gsOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.GS_ORDER
     *
     * @param gsOrder the value for TLT_ISSUE_STEPS.GS_ORDER
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setGsOrder(String gsOrder) {
        this.gsOrder = gsOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.NEXT_ORDERS
     *
     * @return the value of TLT_ISSUE_STEPS.NEXT_ORDERS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getNextOrders() {
        return nextOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.NEXT_ORDERS
     *
     * @param nextOrders the value for TLT_ISSUE_STEPS.NEXT_ORDERS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setNextOrders(String nextOrders) {
        this.nextOrders = nextOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.WAIT_ORDERS
     *
     * @return the value of TLT_ISSUE_STEPS.WAIT_ORDERS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getWaitOrders() {
        return waitOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.WAIT_ORDERS
     *
     * @param waitOrders the value for TLT_ISSUE_STEPS.WAIT_ORDERS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setWaitOrders(String waitOrders) {
        this.waitOrders = waitOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.NODE_TYPE
     *
     * @return the value of TLT_ISSUE_STEPS.NODE_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.NODE_TYPE
     *
     * @param nodeType the value for TLT_ISSUE_STEPS.NODE_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.REF_PARAM_GEN_ID
     *
     * @return the value of TLT_ISSUE_STEPS.REF_PARAM_GEN_ID
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public Long getRefParamGenId() {
        return refParamGenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.REF_PARAM_GEN_ID
     *
     * @param refParamGenId the value for TLT_ISSUE_STEPS.REF_PARAM_GEN_ID
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setRefParamGenId(Long refParamGenId) {
        this.refParamGenId = refParamGenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.AUTO_GONEXT
     *
     * @return the value of TLT_ISSUE_STEPS.AUTO_GONEXT
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getAutoGonext() {
        return autoGonext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.AUTO_GONEXT
     *
     * @param autoGonext the value for TLT_ISSUE_STEPS.AUTO_GONEXT
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setAutoGonext(String autoGonext) {
        this.autoGonext = autoGonext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.RETRY_TIMES
     *
     * @return the value of TLT_ISSUE_STEPS.RETRY_TIMES
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public Integer getRetryTimes() {
        return retryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.RETRY_TIMES
     *
     * @param retryTimes the value for TLT_ISSUE_STEPS.RETRY_TIMES
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_STEPS.FAILED_REASON
     *
     * @return the value of TLT_ISSUE_STEPS.FAILED_REASON
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public String getFailedReason() {
        return failedReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_STEPS.FAILED_REASON
     *
     * @param failedReason the value for TLT_ISSUE_STEPS.FAILED_REASON
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TLTIssueSteps other = (TLTIssueSteps) that;
        return (this.getIssueStepId() == null ? other.getIssueStepId() == null : this.getIssueStepId().equals(other.getIssueStepId()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getIssueNo() == null ? other.getIssueNo() == null : this.getIssueNo().equals(other.getIssueNo()))
            && (this.getStepStatus() == null ? other.getStepStatus() == null : this.getStepStatus().equals(other.getStepStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getOperatorId() == null ? other.getOperatorId() == null : this.getOperatorId().equals(other.getOperatorId()))
            && (this.getGsEcode() == null ? other.getGsEcode() == null : this.getGsEcode().equals(other.getGsEcode()))
            && (this.getGsChcode() == null ? other.getGsChcode() == null : this.getGsChcode().equals(other.getGsChcode()))
            && (this.getTimesecOffset() == null ? other.getTimesecOffset() == null : this.getTimesecOffset().equals(other.getTimesecOffset()))
            && (this.getGsOrder() == null ? other.getGsOrder() == null : this.getGsOrder().equals(other.getGsOrder()))
            && (this.getNextOrders() == null ? other.getNextOrders() == null : this.getNextOrders().equals(other.getNextOrders()))
            && (this.getWaitOrders() == null ? other.getWaitOrders() == null : this.getWaitOrders().equals(other.getWaitOrders()))
            && (this.getNodeType() == null ? other.getNodeType() == null : this.getNodeType().equals(other.getNodeType()))
            && (this.getRefParamGenId() == null ? other.getRefParamGenId() == null : this.getRefParamGenId().equals(other.getRefParamGenId()))
            && (this.getAutoGonext() == null ? other.getAutoGonext() == null : this.getAutoGonext().equals(other.getAutoGonext()))
            && (this.getRetryTimes() == null ? other.getRetryTimes() == null : this.getRetryTimes().equals(other.getRetryTimes()))
            && (this.getFailedReason() == null ? other.getFailedReason() == null : this.getFailedReason().equals(other.getFailedReason()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIssueStepId() == null) ? 0 : getIssueStepId().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getIssueNo() == null) ? 0 : getIssueNo().hashCode());
        result = prime * result + ((getStepStatus() == null) ? 0 : getStepStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getOperatorId() == null) ? 0 : getOperatorId().hashCode());
        result = prime * result + ((getGsEcode() == null) ? 0 : getGsEcode().hashCode());
        result = prime * result + ((getGsChcode() == null) ? 0 : getGsChcode().hashCode());
        result = prime * result + ((getTimesecOffset() == null) ? 0 : getTimesecOffset().hashCode());
        result = prime * result + ((getGsOrder() == null) ? 0 : getGsOrder().hashCode());
        result = prime * result + ((getNextOrders() == null) ? 0 : getNextOrders().hashCode());
        result = prime * result + ((getWaitOrders() == null) ? 0 : getWaitOrders().hashCode());
        result = prime * result + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        result = prime * result + ((getRefParamGenId() == null) ? 0 : getRefParamGenId().hashCode());
        result = prime * result + ((getAutoGonext() == null) ? 0 : getAutoGonext().hashCode());
        result = prime * result + ((getRetryTimes() == null) ? 0 : getRetryTimes().hashCode());
        result = prime * result + ((getFailedReason() == null) ? 0 : getFailedReason().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_STEPS
     *
     * @mbggenerated Mon Apr 11 20:11:19 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ltype=").append(ltype);
        sb.append(", issueNo=").append(issueNo);
        sb.append(", stepStatus=").append(stepStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", operatorId=").append(operatorId);
        sb.append(", gsEcode=").append(gsEcode);
        sb.append(", gsChcode=").append(gsChcode);
        sb.append(", timesecOffset=").append(timesecOffset);
        sb.append(", gsOrder=").append(gsOrder);
        sb.append(", nextOrders=").append(nextOrders);
        sb.append(", waitOrders=").append(waitOrders);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", refParamGenId=").append(refParamGenId);
        sb.append(", autoGonext=").append(autoGonext);
        sb.append(", retryTimes=").append(retryTimes);
        sb.append(", failedReason=").append(failedReason);
        sb.append("]");
        return sb.toString();
    }
}