package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_ISSUE_FLOWS")
@AllArgsConstructor
@NoArgsConstructor
public class TLTIssueFlows extends TLTIssueFlowsKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.LTYPE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.GS_ECODE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String gsEcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.GS_CHCODE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String gsChcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.GS_DESC
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String gsDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.TIMESEC_OFFSET
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private Integer timesecOffset;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.GS_ORDER
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String gsOrder;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.NEXT_ORDERS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String nextOrders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.WAIT_ORDERS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String waitOrders;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.NODE_TYPE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String nodeType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.AUTO_GONEXT
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String autoGonext;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE_FLOWS.STATUS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.LTYPE
     *
     * @return the value of TLT_ISSUE_FLOWS.LTYPE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.LTYPE
     *
     * @param ltype the value for TLT_ISSUE_FLOWS.LTYPE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.GS_ECODE
     *
     * @return the value of TLT_ISSUE_FLOWS.GS_ECODE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getGsEcode() {
        return gsEcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.GS_ECODE
     *
     * @param gsEcode the value for TLT_ISSUE_FLOWS.GS_ECODE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setGsEcode(String gsEcode) {
        this.gsEcode = gsEcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.GS_CHCODE
     *
     * @return the value of TLT_ISSUE_FLOWS.GS_CHCODE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getGsChcode() {
        return gsChcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.GS_CHCODE
     *
     * @param gsChcode the value for TLT_ISSUE_FLOWS.GS_CHCODE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setGsChcode(String gsChcode) {
        this.gsChcode = gsChcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.GS_DESC
     *
     * @return the value of TLT_ISSUE_FLOWS.GS_DESC
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getGsDesc() {
        return gsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.GS_DESC
     *
     * @param gsDesc the value for TLT_ISSUE_FLOWS.GS_DESC
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setGsDesc(String gsDesc) {
        this.gsDesc = gsDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.TIMESEC_OFFSET
     *
     * @return the value of TLT_ISSUE_FLOWS.TIMESEC_OFFSET
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public Integer getTimesecOffset() {
        return timesecOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.TIMESEC_OFFSET
     *
     * @param timesecOffset the value for TLT_ISSUE_FLOWS.TIMESEC_OFFSET
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setTimesecOffset(Integer timesecOffset) {
        this.timesecOffset = timesecOffset;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.GS_ORDER
     *
     * @return the value of TLT_ISSUE_FLOWS.GS_ORDER
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getGsOrder() {
        return gsOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.GS_ORDER
     *
     * @param gsOrder the value for TLT_ISSUE_FLOWS.GS_ORDER
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setGsOrder(String gsOrder) {
        this.gsOrder = gsOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.NEXT_ORDERS
     *
     * @return the value of TLT_ISSUE_FLOWS.NEXT_ORDERS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getNextOrders() {
        return nextOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.NEXT_ORDERS
     *
     * @param nextOrders the value for TLT_ISSUE_FLOWS.NEXT_ORDERS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setNextOrders(String nextOrders) {
        this.nextOrders = nextOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.WAIT_ORDERS
     *
     * @return the value of TLT_ISSUE_FLOWS.WAIT_ORDERS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getWaitOrders() {
        return waitOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.WAIT_ORDERS
     *
     * @param waitOrders the value for TLT_ISSUE_FLOWS.WAIT_ORDERS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setWaitOrders(String waitOrders) {
        this.waitOrders = waitOrders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.NODE_TYPE
     *
     * @return the value of TLT_ISSUE_FLOWS.NODE_TYPE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getNodeType() {
        return nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.NODE_TYPE
     *
     * @param nodeType the value for TLT_ISSUE_FLOWS.NODE_TYPE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.AUTO_GONEXT
     *
     * @return the value of TLT_ISSUE_FLOWS.AUTO_GONEXT
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getAutoGonext() {
        return autoGonext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.AUTO_GONEXT
     *
     * @param autoGonext the value for TLT_ISSUE_FLOWS.AUTO_GONEXT
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setAutoGonext(String autoGonext) {
        this.autoGonext = autoGonext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE_FLOWS.STATUS
     *
     * @return the value of TLT_ISSUE_FLOWS.STATUS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE_FLOWS.STATUS
     *
     * @param status the value for TLT_ISSUE_FLOWS.STATUS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
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
        TLTIssueFlows other = (TLTIssueFlows) that;
        return (this.getGenId() == null ? other.getGenId() == null : this.getGenId().equals(other.getGenId()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getGsEcode() == null ? other.getGsEcode() == null : this.getGsEcode().equals(other.getGsEcode()))
            && (this.getGsChcode() == null ? other.getGsChcode() == null : this.getGsChcode().equals(other.getGsChcode()))
            && (this.getGsDesc() == null ? other.getGsDesc() == null : this.getGsDesc().equals(other.getGsDesc()))
            && (this.getTimesecOffset() == null ? other.getTimesecOffset() == null : this.getTimesecOffset().equals(other.getTimesecOffset()))
            && (this.getGsOrder() == null ? other.getGsOrder() == null : this.getGsOrder().equals(other.getGsOrder()))
            && (this.getNextOrders() == null ? other.getNextOrders() == null : this.getNextOrders().equals(other.getNextOrders()))
            && (this.getWaitOrders() == null ? other.getWaitOrders() == null : this.getWaitOrders().equals(other.getWaitOrders()))
            && (this.getNodeType() == null ? other.getNodeType() == null : this.getNodeType().equals(other.getNodeType()))
            && (this.getAutoGonext() == null ? other.getAutoGonext() == null : this.getAutoGonext().equals(other.getAutoGonext()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGenId() == null) ? 0 : getGenId().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getGsEcode() == null) ? 0 : getGsEcode().hashCode());
        result = prime * result + ((getGsChcode() == null) ? 0 : getGsChcode().hashCode());
        result = prime * result + ((getGsDesc() == null) ? 0 : getGsDesc().hashCode());
        result = prime * result + ((getTimesecOffset() == null) ? 0 : getTimesecOffset().hashCode());
        result = prime * result + ((getGsOrder() == null) ? 0 : getGsOrder().hashCode());
        result = prime * result + ((getNextOrders() == null) ? 0 : getNextOrders().hashCode());
        result = prime * result + ((getWaitOrders() == null) ? 0 : getWaitOrders().hashCode());
        result = prime * result + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        result = prime * result + ((getAutoGonext() == null) ? 0 : getAutoGonext().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE_FLOWS
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ltype=").append(ltype);
        sb.append(", gsEcode=").append(gsEcode);
        sb.append(", gsChcode=").append(gsChcode);
        sb.append(", gsDesc=").append(gsDesc);
        sb.append(", timesecOffset=").append(timesecOffset);
        sb.append(", gsOrder=").append(gsOrder);
        sb.append(", nextOrders=").append(nextOrders);
        sb.append(", waitOrders=").append(waitOrders);
        sb.append(", nodeType=").append(nodeType);
        sb.append(", autoGonext=").append(autoGonext);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}