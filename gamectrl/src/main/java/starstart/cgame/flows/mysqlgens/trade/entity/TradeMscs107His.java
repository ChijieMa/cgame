package starstart.cgame.flows.mysqlgens.trade.entity;

import cn.msec.ojpa.api.annotations.Tab;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import startstarts.cgame.mysql.CustomDateSerializer;

@Tab(name="T_TRADE_MSCS107_HIS")
@AllArgsConstructor
@NoArgsConstructor
public class TradeMscs107His extends TradeMscs107HisKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PROD_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String prodOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PROD_ORG_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String prodOrgOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String actNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.OUT_ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String outActNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PRODUCT_ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String productActNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.SND_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String sndMchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RCV_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String rcvMchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RCV_CHN_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String rcvChnId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.CURRENCY
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.TRANS_TYPE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String transType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.MCH_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private BigDecimal mchServiceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.STTL_AMT
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private BigDecimal sttlAmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.MSC_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private BigDecimal mscServiceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PRODUCT_AMOUNT
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private BigDecimal productAmount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PRD_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private BigDecimal prdServiceFee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RSP_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String rspOrderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String resultCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String resultDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PROD_RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String prodResultCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.PROD_RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String prodResultDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.TRANS_DATE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String transDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.INTEREST
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private BigDecimal interest;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.STTL_DATE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private String sttlDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private Date recvTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.RSP_RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private Date rspRecvTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_TRADE_MSCS107_HIS.UPDATE_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PROD_ORDER_ID
     *
     * @return the value of T_TRADE_MSCS107_HIS.PROD_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getProdOrderId() {
        return prodOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PROD_ORDER_ID
     *
     * @param prodOrderId the value for T_TRADE_MSCS107_HIS.PROD_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setProdOrderId(String prodOrderId) {
        this.prodOrderId = prodOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PROD_ORG_ORDER_ID
     *
     * @return the value of T_TRADE_MSCS107_HIS.PROD_ORG_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getProdOrgOrderId() {
        return prodOrgOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PROD_ORG_ORDER_ID
     *
     * @param prodOrgOrderId the value for T_TRADE_MSCS107_HIS.PROD_ORG_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setProdOrgOrderId(String prodOrgOrderId) {
        this.prodOrgOrderId = prodOrgOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.ACT_NO
     *
     * @return the value of T_TRADE_MSCS107_HIS.ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getActNo() {
        return actNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.ACT_NO
     *
     * @param actNo the value for T_TRADE_MSCS107_HIS.ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.OUT_ACT_NO
     *
     * @return the value of T_TRADE_MSCS107_HIS.OUT_ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getOutActNo() {
        return outActNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.OUT_ACT_NO
     *
     * @param outActNo the value for T_TRADE_MSCS107_HIS.OUT_ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setOutActNo(String outActNo) {
        this.outActNo = outActNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PRODUCT_ACT_NO
     *
     * @return the value of T_TRADE_MSCS107_HIS.PRODUCT_ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getProductActNo() {
        return productActNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PRODUCT_ACT_NO
     *
     * @param productActNo the value for T_TRADE_MSCS107_HIS.PRODUCT_ACT_NO
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setProductActNo(String productActNo) {
        this.productActNo = productActNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.SND_MCH_ID
     *
     * @return the value of T_TRADE_MSCS107_HIS.SND_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getSndMchId() {
        return sndMchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.SND_MCH_ID
     *
     * @param sndMchId the value for T_TRADE_MSCS107_HIS.SND_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setSndMchId(String sndMchId) {
        this.sndMchId = sndMchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RCV_MCH_ID
     *
     * @return the value of T_TRADE_MSCS107_HIS.RCV_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getRcvMchId() {
        return rcvMchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RCV_MCH_ID
     *
     * @param rcvMchId the value for T_TRADE_MSCS107_HIS.RCV_MCH_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setRcvMchId(String rcvMchId) {
        this.rcvMchId = rcvMchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RCV_CHN_ID
     *
     * @return the value of T_TRADE_MSCS107_HIS.RCV_CHN_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getRcvChnId() {
        return rcvChnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RCV_CHN_ID
     *
     * @param rcvChnId the value for T_TRADE_MSCS107_HIS.RCV_CHN_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setRcvChnId(String rcvChnId) {
        this.rcvChnId = rcvChnId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.CURRENCY
     *
     * @return the value of T_TRADE_MSCS107_HIS.CURRENCY
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.CURRENCY
     *
     * @param currency the value for T_TRADE_MSCS107_HIS.CURRENCY
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.TRANS_TYPE
     *
     * @return the value of T_TRADE_MSCS107_HIS.TRANS_TYPE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getTransType() {
        return transType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.TRANS_TYPE
     *
     * @param transType the value for T_TRADE_MSCS107_HIS.TRANS_TYPE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setTransType(String transType) {
        this.transType = transType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.MCH_SERVICE_FEE
     *
     * @return the value of T_TRADE_MSCS107_HIS.MCH_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public BigDecimal getMchServiceFee() {
        return mchServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.MCH_SERVICE_FEE
     *
     * @param mchServiceFee the value for T_TRADE_MSCS107_HIS.MCH_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setMchServiceFee(BigDecimal mchServiceFee) {
        this.mchServiceFee = mchServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.STTL_AMT
     *
     * @return the value of T_TRADE_MSCS107_HIS.STTL_AMT
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public BigDecimal getSttlAmt() {
        return sttlAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.STTL_AMT
     *
     * @param sttlAmt the value for T_TRADE_MSCS107_HIS.STTL_AMT
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setSttlAmt(BigDecimal sttlAmt) {
        this.sttlAmt = sttlAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.MSC_SERVICE_FEE
     *
     * @return the value of T_TRADE_MSCS107_HIS.MSC_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public BigDecimal getMscServiceFee() {
        return mscServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.MSC_SERVICE_FEE
     *
     * @param mscServiceFee the value for T_TRADE_MSCS107_HIS.MSC_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setMscServiceFee(BigDecimal mscServiceFee) {
        this.mscServiceFee = mscServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PRODUCT_AMOUNT
     *
     * @return the value of T_TRADE_MSCS107_HIS.PRODUCT_AMOUNT
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public BigDecimal getProductAmount() {
        return productAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PRODUCT_AMOUNT
     *
     * @param productAmount the value for T_TRADE_MSCS107_HIS.PRODUCT_AMOUNT
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PRD_SERVICE_FEE
     *
     * @return the value of T_TRADE_MSCS107_HIS.PRD_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public BigDecimal getPrdServiceFee() {
        return prdServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PRD_SERVICE_FEE
     *
     * @param prdServiceFee the value for T_TRADE_MSCS107_HIS.PRD_SERVICE_FEE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setPrdServiceFee(BigDecimal prdServiceFee) {
        this.prdServiceFee = prdServiceFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RSP_ORDER_ID
     *
     * @return the value of T_TRADE_MSCS107_HIS.RSP_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getRspOrderId() {
        return rspOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RSP_ORDER_ID
     *
     * @param rspOrderId the value for T_TRADE_MSCS107_HIS.RSP_ORDER_ID
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setRspOrderId(String rspOrderId) {
        this.rspOrderId = rspOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RESULT_CODE
     *
     * @return the value of T_TRADE_MSCS107_HIS.RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RESULT_CODE
     *
     * @param resultCode the value for T_TRADE_MSCS107_HIS.RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RESULT_DESC
     *
     * @return the value of T_TRADE_MSCS107_HIS.RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getResultDesc() {
        return resultDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RESULT_DESC
     *
     * @param resultDesc the value for T_TRADE_MSCS107_HIS.RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PROD_RESULT_CODE
     *
     * @return the value of T_TRADE_MSCS107_HIS.PROD_RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getProdResultCode() {
        return prodResultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PROD_RESULT_CODE
     *
     * @param prodResultCode the value for T_TRADE_MSCS107_HIS.PROD_RESULT_CODE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setProdResultCode(String prodResultCode) {
        this.prodResultCode = prodResultCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.PROD_RESULT_DESC
     *
     * @return the value of T_TRADE_MSCS107_HIS.PROD_RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getProdResultDesc() {
        return prodResultDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.PROD_RESULT_DESC
     *
     * @param prodResultDesc the value for T_TRADE_MSCS107_HIS.PROD_RESULT_DESC
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setProdResultDesc(String prodResultDesc) {
        this.prodResultDesc = prodResultDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.TRANS_DATE
     *
     * @return the value of T_TRADE_MSCS107_HIS.TRANS_DATE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.TRANS_DATE
     *
     * @param transDate the value for T_TRADE_MSCS107_HIS.TRANS_DATE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.INTEREST
     *
     * @return the value of T_TRADE_MSCS107_HIS.INTEREST
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public BigDecimal getInterest() {
        return interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.INTEREST
     *
     * @param interest the value for T_TRADE_MSCS107_HIS.INTEREST
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.STTL_DATE
     *
     * @return the value of T_TRADE_MSCS107_HIS.STTL_DATE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public String getSttlDate() {
        return sttlDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.STTL_DATE
     *
     * @param sttlDate the value for T_TRADE_MSCS107_HIS.STTL_DATE
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setSttlDate(String sttlDate) {
        this.sttlDate = sttlDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RECV_TIME
     *
     * @return the value of T_TRADE_MSCS107_HIS.RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getRecvTime() {
        return recvTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RECV_TIME
     *
     * @param recvTime the value for T_TRADE_MSCS107_HIS.RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setRecvTime(Date recvTime) {
        this.recvTime = recvTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.RSP_RECV_TIME
     *
     * @return the value of T_TRADE_MSCS107_HIS.RSP_RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getRspRecvTime() {
        return rspRecvTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.RSP_RECV_TIME
     *
     * @param rspRecvTime the value for T_TRADE_MSCS107_HIS.RSP_RECV_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setRspRecvTime(Date rspRecvTime) {
        this.rspRecvTime = rspRecvTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_TRADE_MSCS107_HIS.UPDATE_TIME
     *
     * @return the value of T_TRADE_MSCS107_HIS.UPDATE_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    @JsonSerialize(using = CustomDateSerializer.class)
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_TRADE_MSCS107_HIS.UPDATE_TIME
     *
     * @param updateTime the value for T_TRADE_MSCS107_HIS.UPDATE_TIME
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_MSCS107_HIS
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
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
        TradeMscs107His other = (TradeMscs107His) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getProdOrderId() == null ? other.getProdOrderId() == null : this.getProdOrderId().equals(other.getProdOrderId()))
            && (this.getProdOrgOrderId() == null ? other.getProdOrgOrderId() == null : this.getProdOrgOrderId().equals(other.getProdOrgOrderId()))
            && (this.getActNo() == null ? other.getActNo() == null : this.getActNo().equals(other.getActNo()))
            && (this.getOutActNo() == null ? other.getOutActNo() == null : this.getOutActNo().equals(other.getOutActNo()))
            && (this.getProductActNo() == null ? other.getProductActNo() == null : this.getProductActNo().equals(other.getProductActNo()))
            && (this.getSndMchId() == null ? other.getSndMchId() == null : this.getSndMchId().equals(other.getSndMchId()))
            && (this.getRcvMchId() == null ? other.getRcvMchId() == null : this.getRcvMchId().equals(other.getRcvMchId()))
            && (this.getRcvChnId() == null ? other.getRcvChnId() == null : this.getRcvChnId().equals(other.getRcvChnId()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getTransType() == null ? other.getTransType() == null : this.getTransType().equals(other.getTransType()))
            && (this.getMchServiceFee() == null ? other.getMchServiceFee() == null : this.getMchServiceFee().equals(other.getMchServiceFee()))
            && (this.getSttlAmt() == null ? other.getSttlAmt() == null : this.getSttlAmt().equals(other.getSttlAmt()))
            && (this.getMscServiceFee() == null ? other.getMscServiceFee() == null : this.getMscServiceFee().equals(other.getMscServiceFee()))
            && (this.getProductAmount() == null ? other.getProductAmount() == null : this.getProductAmount().equals(other.getProductAmount()))
            && (this.getPrdServiceFee() == null ? other.getPrdServiceFee() == null : this.getPrdServiceFee().equals(other.getPrdServiceFee()))
            && (this.getRspOrderId() == null ? other.getRspOrderId() == null : this.getRspOrderId().equals(other.getRspOrderId()))
            && (this.getResultCode() == null ? other.getResultCode() == null : this.getResultCode().equals(other.getResultCode()))
            && (this.getResultDesc() == null ? other.getResultDesc() == null : this.getResultDesc().equals(other.getResultDesc()))
            && (this.getProdResultCode() == null ? other.getProdResultCode() == null : this.getProdResultCode().equals(other.getProdResultCode()))
            && (this.getProdResultDesc() == null ? other.getProdResultDesc() == null : this.getProdResultDesc().equals(other.getProdResultDesc()))
            && (this.getTransDate() == null ? other.getTransDate() == null : this.getTransDate().equals(other.getTransDate()))
            && (this.getInterest() == null ? other.getInterest() == null : this.getInterest().equals(other.getInterest()))
            && (this.getSttlDate() == null ? other.getSttlDate() == null : this.getSttlDate().equals(other.getSttlDate()))
            && (this.getRecvTime() == null ? other.getRecvTime() == null : this.getRecvTime().equals(other.getRecvTime()))
            && (this.getRspRecvTime() == null ? other.getRspRecvTime() == null : this.getRspRecvTime().equals(other.getRspRecvTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_MSCS107_HIS
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProdOrderId() == null) ? 0 : getProdOrderId().hashCode());
        result = prime * result + ((getProdOrgOrderId() == null) ? 0 : getProdOrgOrderId().hashCode());
        result = prime * result + ((getActNo() == null) ? 0 : getActNo().hashCode());
        result = prime * result + ((getOutActNo() == null) ? 0 : getOutActNo().hashCode());
        result = prime * result + ((getProductActNo() == null) ? 0 : getProductActNo().hashCode());
        result = prime * result + ((getSndMchId() == null) ? 0 : getSndMchId().hashCode());
        result = prime * result + ((getRcvMchId() == null) ? 0 : getRcvMchId().hashCode());
        result = prime * result + ((getRcvChnId() == null) ? 0 : getRcvChnId().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getTransType() == null) ? 0 : getTransType().hashCode());
        result = prime * result + ((getMchServiceFee() == null) ? 0 : getMchServiceFee().hashCode());
        result = prime * result + ((getSttlAmt() == null) ? 0 : getSttlAmt().hashCode());
        result = prime * result + ((getMscServiceFee() == null) ? 0 : getMscServiceFee().hashCode());
        result = prime * result + ((getProductAmount() == null) ? 0 : getProductAmount().hashCode());
        result = prime * result + ((getPrdServiceFee() == null) ? 0 : getPrdServiceFee().hashCode());
        result = prime * result + ((getRspOrderId() == null) ? 0 : getRspOrderId().hashCode());
        result = prime * result + ((getResultCode() == null) ? 0 : getResultCode().hashCode());
        result = prime * result + ((getResultDesc() == null) ? 0 : getResultDesc().hashCode());
        result = prime * result + ((getProdResultCode() == null) ? 0 : getProdResultCode().hashCode());
        result = prime * result + ((getProdResultDesc() == null) ? 0 : getProdResultDesc().hashCode());
        result = prime * result + ((getTransDate() == null) ? 0 : getTransDate().hashCode());
        result = prime * result + ((getInterest() == null) ? 0 : getInterest().hashCode());
        result = prime * result + ((getSttlDate() == null) ? 0 : getSttlDate().hashCode());
        result = prime * result + ((getRecvTime() == null) ? 0 : getRecvTime().hashCode());
        result = prime * result + ((getRspRecvTime() == null) ? 0 : getRspRecvTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_TRADE_MSCS107_HIS
     *
     * @mbggenerated Mon Jun 08 20:40:14 CST 2015
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodOrderId=").append(prodOrderId);
        sb.append(", prodOrgOrderId=").append(prodOrgOrderId);
        sb.append(", actNo=").append(actNo);
        sb.append(", outActNo=").append(outActNo);
        sb.append(", productActNo=").append(productActNo);
        sb.append(", sndMchId=").append(sndMchId);
        sb.append(", rcvMchId=").append(rcvMchId);
        sb.append(", rcvChnId=").append(rcvChnId);
        sb.append(", currency=").append(currency);
        sb.append(", transType=").append(transType);
        sb.append(", mchServiceFee=").append(mchServiceFee);
        sb.append(", sttlAmt=").append(sttlAmt);
        sb.append(", mscServiceFee=").append(mscServiceFee);
        sb.append(", productAmount=").append(productAmount);
        sb.append(", prdServiceFee=").append(prdServiceFee);
        sb.append(", rspOrderId=").append(rspOrderId);
        sb.append(", resultCode=").append(resultCode);
        sb.append(", resultDesc=").append(resultDesc);
        sb.append(", prodResultCode=").append(prodResultCode);
        sb.append(", prodResultDesc=").append(prodResultDesc);
        sb.append(", transDate=").append(transDate);
        sb.append(", interest=").append(interest);
        sb.append(", sttlDate=").append(sttlDate);
        sb.append(", recvTime=").append(recvTime);
        sb.append(", rspRecvTime=").append(rspRecvTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}