package starstart.cgame.flows.mysqlgens.trade.entity;

import cn.msec.ojpa.api.annotations.Tab;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import startstarts.cgame.mysql.CustomDateSerializer;

@Tab(name="T_LAND_MSCS207")
@AllArgsConstructor
@NoArgsConstructor
public class LandMscs207 extends LandMscs207Key {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.RSP_MSG_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String rspMsgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String resultCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String resultDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String actNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.SND_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String sndMchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.PRODUCT_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.OPEN_FLAG
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private String openFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.INV_AMT
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private BigDecimal invAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.PRD_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private BigDecimal prdServiceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private Date recvTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_LAND_MSCS207.UPDATE_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.RSP_MSG_ID
     *
     * @return the value of T_LAND_MSCS207.RSP_MSG_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getRspMsgId() {
        return rspMsgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.RSP_MSG_ID
     *
     * @param rspMsgId the value for T_LAND_MSCS207.RSP_MSG_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setRspMsgId(String rspMsgId) {
        this.rspMsgId = rspMsgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.RESULT_CODE
     *
     * @return the value of T_LAND_MSCS207.RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.RESULT_CODE
     *
     * @param resultCode the value for T_LAND_MSCS207.RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.RESULT_DESC
     *
     * @return the value of T_LAND_MSCS207.RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.RESULT_DESC
     *
     * @param resultDesc the value for T_LAND_MSCS207.RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.ACT_NO
     *
     * @return the value of T_LAND_MSCS207.ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.ACT_NO
     *
     * @param actNo the value for T_LAND_MSCS207.ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.SND_MCH_ID
     *
     * @return the value of T_LAND_MSCS207.SND_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getSndMchId() {
        return sndMchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.SND_MCH_ID
     *
     * @param sndMchId the value for T_LAND_MSCS207.SND_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setSndMchId(String sndMchId) {
        this.sndMchId = sndMchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.PRODUCT_ID
     *
     * @return the value of T_LAND_MSCS207.PRODUCT_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.PRODUCT_ID
     *
     * @param productId the value for T_LAND_MSCS207.PRODUCT_ID
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.OPEN_FLAG
     *
     * @return the value of T_LAND_MSCS207.OPEN_FLAG
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public String getOpenFlag() {
        return openFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.OPEN_FLAG
     *
     * @param openFlag the value for T_LAND_MSCS207.OPEN_FLAG
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.INV_AMT
     *
     * @return the value of T_LAND_MSCS207.INV_AMT
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public BigDecimal getInvAmt() {
        return invAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.INV_AMT
     *
     * @param invAmt the value for T_LAND_MSCS207.INV_AMT
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.PRD_SERVICE_FEE
     *
     * @return the value of T_LAND_MSCS207.PRD_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public BigDecimal getPrdServiceFee() {
        return prdServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.PRD_SERVICE_FEE
     *
     * @param prdServiceFee the value for T_LAND_MSCS207.PRD_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setPrdServiceFee(BigDecimal prdServiceFee) {
        this.prdServiceFee = prdServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.RECV_TIME
     *
     * @return the value of T_LAND_MSCS207.RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getRecvTime() {
        return recvTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.RECV_TIME
     *
     * @param recvTime the value for T_LAND_MSCS207.RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setRecvTime(Date recvTime) {
        this.recvTime = recvTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_LAND_MSCS207.UPDATE_TIME
     *
     * @return the value of T_LAND_MSCS207.UPDATE_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_LAND_MSCS207.UPDATE_TIME
     *
     * @param updateTime the value for T_LAND_MSCS207.UPDATE_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_LAND_MSCS207
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
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
        LandMscs207 other = (LandMscs207) that;
        return (this.getMsgId() == null ? other.getMsgId() == null : this.getMsgId().equals(other.getMsgId()))
            && (this.getRspMsgId() == null ? other.getRspMsgId() == null : this.getRspMsgId().equals(other.getRspMsgId()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getResultDesc() == null ? other.getResultDesc() == null : this.getResultDesc().equals(other.getResultDesc()))
            && (this.getActNo() == null ? other.getActNo() == null : this.getActNo().equals(other.getActNo()))
            && (this.getSndMchId() == null ? other.getSndMchId() == null : this.getSndMchId().equals(other.getSndMchId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getOpenFlag() == null ? other.getOpenFlag() == null : this.getOpenFlag().equals(other.getOpenFlag()))
            && (this.getInvAmt() == null ? other.getInvAmt() == null : this.getInvAmt().equals(other.getInvAmt()))
            && (this.getPrdServiceFee() == null ? other.getPrdServiceFee() == null : this.getPrdServiceFee().equals(other.getPrdServiceFee()))
            && (this.getRecvTime() == null ? other.getRecvTime() == null : this.getRecvTime().equals(other.getRecvTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_LAND_MSCS207
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMsgId() == null) ? 0 : getMsgId().hashCode());
        result = prime * result + ((getRspMsgId() == null) ? 0 : getRspMsgId().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getResultDesc() == null) ? 0 : getResultDesc().hashCode());
        result = prime * result + ((getActNo() == null) ? 0 : getActNo().hashCode());
        result = prime * result + ((getSndMchId() == null) ? 0 : getSndMchId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getOpenFlag() == null) ? 0 : getOpenFlag().hashCode());
        result = prime * result + ((getInvAmt() == null) ? 0 : getInvAmt().hashCode());
        result = prime * result + ((getPrdServiceFee() == null) ? 0 : getPrdServiceFee().hashCode());
        result = prime * result + ((getRecvTime() == null) ? 0 : getRecvTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_LAND_MSCS207
     *
     * @mbggenerated Mon Jun 08 20:40:13 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rspMsgId=").append(rspMsgId);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", resultDesc=").append(resultDesc);
        sb.append(", actNo=").append(actNo);
        sb.append(", sndMchId=").append(sndMchId);
        sb.append(", productId=").append(productId);
        sb.append(", openFlag=").append(openFlag);
        sb.append(", invAmt=").append(invAmt);
        sb.append(", prdServiceFee=").append(prdServiceFee);
        sb.append(", recvTime=").append(recvTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}