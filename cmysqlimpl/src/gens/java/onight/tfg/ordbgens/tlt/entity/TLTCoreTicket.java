package onight.tfg.ordbgens.tlt.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_CORE_TICKET")
@AllArgsConstructor
@NoArgsConstructor
public class TLTCoreTicket extends TLTCoreTicketKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.LTYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.MERCHANTID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String merchantid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.SERIAL_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String serialNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.TICK_AMOUNTS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private BigDecimal tickAmounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.TICK_BET_COUNTS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private Integer tickBetCounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.ISSUE_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String issueNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.BET_DATETIME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private Date betDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.BET_IP
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String betIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.PRINT_TIME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private Date printTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.TICK_STATUS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String tickStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.NOTIFYSTATUS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String notifystatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.REGION
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String region;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.FAILREASON
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String failreason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.MERCHANTUSERID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String merchantuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.AUTOBET_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String autobetNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.IS_AUTO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String isAuto;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.AUTO_REF_TICKNO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String autoRefTickno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.COST_FUND0
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private BigDecimal costFund0;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.COST_FUND1
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private BigDecimal costFund1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.COST_FUND2
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private BigDecimal costFund2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.COST_FUND3
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private BigDecimal costFund3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.FUND_REF_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String fundRefId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICKET.ISSUE_LOCK
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String issueLock;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.LTYPE
     *
     * @return the value of TLT_CORE_TICKET.LTYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.LTYPE
     *
     * @param ltype the value for TLT_CORE_TICKET.LTYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.MERCHANTID
     *
     * @return the value of TLT_CORE_TICKET.MERCHANTID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getMerchantid() {
        return merchantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.MERCHANTID
     *
     * @param merchantid the value for TLT_CORE_TICKET.MERCHANTID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setMerchantid(String merchantid) {
        this.merchantid = merchantid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.SERIAL_NUM
     *
     * @return the value of TLT_CORE_TICKET.SERIAL_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getSerialNum() {
        return serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.SERIAL_NUM
     *
     * @param serialNum the value for TLT_CORE_TICKET.SERIAL_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.TICK_AMOUNTS
     *
     * @return the value of TLT_CORE_TICKET.TICK_AMOUNTS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public BigDecimal getTickAmounts() {
        return tickAmounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.TICK_AMOUNTS
     *
     * @param tickAmounts the value for TLT_CORE_TICKET.TICK_AMOUNTS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setTickAmounts(BigDecimal tickAmounts) {
        this.tickAmounts = tickAmounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.TICK_BET_COUNTS
     *
     * @return the value of TLT_CORE_TICKET.TICK_BET_COUNTS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public Integer getTickBetCounts() {
        return tickBetCounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.TICK_BET_COUNTS
     *
     * @param tickBetCounts the value for TLT_CORE_TICKET.TICK_BET_COUNTS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setTickBetCounts(Integer tickBetCounts) {
        this.tickBetCounts = tickBetCounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.ISSUE_NO
     *
     * @return the value of TLT_CORE_TICKET.ISSUE_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.ISSUE_NO
     *
     * @param issueNo the value for TLT_CORE_TICKET.ISSUE_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.BET_DATETIME
     *
     * @return the value of TLT_CORE_TICKET.BET_DATETIME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public Date getBetDatetime() {
        return betDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.BET_DATETIME
     *
     * @param betDatetime the value for TLT_CORE_TICKET.BET_DATETIME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setBetDatetime(Date betDatetime) {
        this.betDatetime = betDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.BET_IP
     *
     * @return the value of TLT_CORE_TICKET.BET_IP
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getBetIp() {
        return betIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.BET_IP
     *
     * @param betIp the value for TLT_CORE_TICKET.BET_IP
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setBetIp(String betIp) {
        this.betIp = betIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.PRINT_TIME
     *
     * @return the value of TLT_CORE_TICKET.PRINT_TIME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public Date getPrintTime() {
        return printTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.PRINT_TIME
     *
     * @param printTime the value for TLT_CORE_TICKET.PRINT_TIME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setPrintTime(Date printTime) {
        this.printTime = printTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.TICK_STATUS
     *
     * @return the value of TLT_CORE_TICKET.TICK_STATUS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getTickStatus() {
        return tickStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.TICK_STATUS
     *
     * @param tickStatus the value for TLT_CORE_TICKET.TICK_STATUS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setTickStatus(String tickStatus) {
        this.tickStatus = tickStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.NOTIFYSTATUS
     *
     * @return the value of TLT_CORE_TICKET.NOTIFYSTATUS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getNotifystatus() {
        return notifystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.NOTIFYSTATUS
     *
     * @param notifystatus the value for TLT_CORE_TICKET.NOTIFYSTATUS
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setNotifystatus(String notifystatus) {
        this.notifystatus = notifystatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.REGION
     *
     * @return the value of TLT_CORE_TICKET.REGION
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getRegion() {
        return region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.REGION
     *
     * @param region the value for TLT_CORE_TICKET.REGION
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.FAILREASON
     *
     * @return the value of TLT_CORE_TICKET.FAILREASON
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getFailreason() {
        return failreason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.FAILREASON
     *
     * @param failreason the value for TLT_CORE_TICKET.FAILREASON
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setFailreason(String failreason) {
        this.failreason = failreason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.MERCHANTUSERID
     *
     * @return the value of TLT_CORE_TICKET.MERCHANTUSERID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getMerchantuserid() {
        return merchantuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.MERCHANTUSERID
     *
     * @param merchantuserid the value for TLT_CORE_TICKET.MERCHANTUSERID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setMerchantuserid(String merchantuserid) {
        this.merchantuserid = merchantuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.USER_ID
     *
     * @return the value of TLT_CORE_TICKET.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.USER_ID
     *
     * @param userId the value for TLT_CORE_TICKET.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.AUTOBET_NO
     *
     * @return the value of TLT_CORE_TICKET.AUTOBET_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getAutobetNo() {
        return autobetNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.AUTOBET_NO
     *
     * @param autobetNo the value for TLT_CORE_TICKET.AUTOBET_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setAutobetNo(String autobetNo) {
        this.autobetNo = autobetNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.IS_AUTO
     *
     * @return the value of TLT_CORE_TICKET.IS_AUTO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getIsAuto() {
        return isAuto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.IS_AUTO
     *
     * @param isAuto the value for TLT_CORE_TICKET.IS_AUTO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setIsAuto(String isAuto) {
        this.isAuto = isAuto;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.AUTO_REF_TICKNO
     *
     * @return the value of TLT_CORE_TICKET.AUTO_REF_TICKNO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getAutoRefTickno() {
        return autoRefTickno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.AUTO_REF_TICKNO
     *
     * @param autoRefTickno the value for TLT_CORE_TICKET.AUTO_REF_TICKNO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setAutoRefTickno(String autoRefTickno) {
        this.autoRefTickno = autoRefTickno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.COST_FUND0
     *
     * @return the value of TLT_CORE_TICKET.COST_FUND0
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public BigDecimal getCostFund0() {
        return costFund0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.COST_FUND0
     *
     * @param costFund0 the value for TLT_CORE_TICKET.COST_FUND0
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setCostFund0(BigDecimal costFund0) {
        this.costFund0 = costFund0;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.COST_FUND1
     *
     * @return the value of TLT_CORE_TICKET.COST_FUND1
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public BigDecimal getCostFund1() {
        return costFund1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.COST_FUND1
     *
     * @param costFund1 the value for TLT_CORE_TICKET.COST_FUND1
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setCostFund1(BigDecimal costFund1) {
        this.costFund1 = costFund1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.COST_FUND2
     *
     * @return the value of TLT_CORE_TICKET.COST_FUND2
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public BigDecimal getCostFund2() {
        return costFund2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.COST_FUND2
     *
     * @param costFund2 the value for TLT_CORE_TICKET.COST_FUND2
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setCostFund2(BigDecimal costFund2) {
        this.costFund2 = costFund2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.COST_FUND3
     *
     * @return the value of TLT_CORE_TICKET.COST_FUND3
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public BigDecimal getCostFund3() {
        return costFund3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.COST_FUND3
     *
     * @param costFund3 the value for TLT_CORE_TICKET.COST_FUND3
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setCostFund3(BigDecimal costFund3) {
        this.costFund3 = costFund3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.FUND_REF_ID
     *
     * @return the value of TLT_CORE_TICKET.FUND_REF_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getFundRefId() {
        return fundRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.FUND_REF_ID
     *
     * @param fundRefId the value for TLT_CORE_TICKET.FUND_REF_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setFundRefId(String fundRefId) {
        this.fundRefId = fundRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICKET.ISSUE_LOCK
     *
     * @return the value of TLT_CORE_TICKET.ISSUE_LOCK
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getIssueLock() {
        return issueLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICKET.ISSUE_LOCK
     *
     * @param issueLock the value for TLT_CORE_TICKET.ISSUE_LOCK
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setIssueLock(String issueLock) {
        this.issueLock = issueLock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_TICKET
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
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
        TLTCoreTicket other = (TLTCoreTicket) that;
        return (this.getTickNo() == null ? other.getTickNo() == null : this.getTickNo().equals(other.getTickNo()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getSerialNum() == null ? other.getSerialNum() == null : this.getSerialNum().equals(other.getSerialNum()))
            && (this.getTickAmounts() == null ? other.getTickAmounts() == null : this.getTickAmounts().equals(other.getTickAmounts()))
            && (this.getTickBetCounts() == null ? other.getTickBetCounts() == null : this.getTickBetCounts().equals(other.getTickBetCounts()))
            && (this.getIssueNo() == null ? other.getIssueNo() == null : this.getIssueNo().equals(other.getIssueNo()))
            && (this.getBetDatetime() == null ? other.getBetDatetime() == null : this.getBetDatetime().equals(other.getBetDatetime()))
            && (this.getBetIp() == null ? other.getBetIp() == null : this.getBetIp().equals(other.getBetIp()))
            && (this.getPrintTime() == null ? other.getPrintTime() == null : this.getPrintTime().equals(other.getPrintTime()))
            && (this.getTickStatus() == null ? other.getTickStatus() == null : this.getTickStatus().equals(other.getTickStatus()))
            && (this.getNotifystatus() == null ? other.getNotifystatus() == null : this.getNotifystatus().equals(other.getNotifystatus()))
            && (this.getRegion() == null ? other.getRegion() == null : this.getRegion().equals(other.getRegion()))
            && (this.getFailreason() == null ? other.getFailreason() == null : this.getFailreason().equals(other.getFailreason()))
            && (this.getMerchantuserid() == null ? other.getMerchantuserid() == null : this.getMerchantuserid().equals(other.getMerchantuserid()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAutobetNo() == null ? other.getAutobetNo() == null : this.getAutobetNo().equals(other.getAutobetNo()))
            && (this.getIsAuto() == null ? other.getIsAuto() == null : this.getIsAuto().equals(other.getIsAuto()))
            && (this.getAutoRefTickno() == null ? other.getAutoRefTickno() == null : this.getAutoRefTickno().equals(other.getAutoRefTickno()))
            && (this.getCostFund0() == null ? other.getCostFund0() == null : this.getCostFund0().equals(other.getCostFund0()))
            && (this.getCostFund1() == null ? other.getCostFund1() == null : this.getCostFund1().equals(other.getCostFund1()))
            && (this.getCostFund2() == null ? other.getCostFund2() == null : this.getCostFund2().equals(other.getCostFund2()))
            && (this.getCostFund3() == null ? other.getCostFund3() == null : this.getCostFund3().equals(other.getCostFund3()))
            && (this.getFundRefId() == null ? other.getFundRefId() == null : this.getFundRefId().equals(other.getFundRefId()))
            && (this.getIssueLock() == null ? other.getIssueLock() == null : this.getIssueLock().equals(other.getIssueLock()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_TICKET
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTickNo() == null) ? 0 : getTickNo().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getSerialNum() == null) ? 0 : getSerialNum().hashCode());
        result = prime * result + ((getTickAmounts() == null) ? 0 : getTickAmounts().hashCode());
        result = prime * result + ((getTickBetCounts() == null) ? 0 : getTickBetCounts().hashCode());
        result = prime * result + ((getIssueNo() == null) ? 0 : getIssueNo().hashCode());
        result = prime * result + ((getBetDatetime() == null) ? 0 : getBetDatetime().hashCode());
        result = prime * result + ((getBetIp() == null) ? 0 : getBetIp().hashCode());
        result = prime * result + ((getPrintTime() == null) ? 0 : getPrintTime().hashCode());
        result = prime * result + ((getTickStatus() == null) ? 0 : getTickStatus().hashCode());
        result = prime * result + ((getNotifystatus() == null) ? 0 : getNotifystatus().hashCode());
        result = prime * result + ((getRegion() == null) ? 0 : getRegion().hashCode());
        result = prime * result + ((getFailreason() == null) ? 0 : getFailreason().hashCode());
        result = prime * result + ((getMerchantuserid() == null) ? 0 : getMerchantuserid().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAutobetNo() == null) ? 0 : getAutobetNo().hashCode());
        result = prime * result + ((getIsAuto() == null) ? 0 : getIsAuto().hashCode());
        result = prime * result + ((getAutoRefTickno() == null) ? 0 : getAutoRefTickno().hashCode());
        result = prime * result + ((getCostFund0() == null) ? 0 : getCostFund0().hashCode());
        result = prime * result + ((getCostFund1() == null) ? 0 : getCostFund1().hashCode());
        result = prime * result + ((getCostFund2() == null) ? 0 : getCostFund2().hashCode());
        result = prime * result + ((getCostFund3() == null) ? 0 : getCostFund3().hashCode());
        result = prime * result + ((getFundRefId() == null) ? 0 : getFundRefId().hashCode());
        result = prime * result + ((getIssueLock() == null) ? 0 : getIssueLock().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_TICKET
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ltype=").append(ltype);
        sb.append(", merchantid=").append(merchantid);
        sb.append(", serialNum=").append(serialNum);
        sb.append(", tickAmounts=").append(tickAmounts);
        sb.append(", tickBetCounts=").append(tickBetCounts);
        sb.append(", issueNo=").append(issueNo);
        sb.append(", betDatetime=").append(betDatetime);
        sb.append(", betIp=").append(betIp);
        sb.append(", printTime=").append(printTime);
        sb.append(", tickStatus=").append(tickStatus);
        sb.append(", notifystatus=").append(notifystatus);
        sb.append(", region=").append(region);
        sb.append(", failreason=").append(failreason);
        sb.append(", merchantuserid=").append(merchantuserid);
        sb.append(", userId=").append(userId);
        sb.append(", autobetNo=").append(autobetNo);
        sb.append(", isAuto=").append(isAuto);
        sb.append(", autoRefTickno=").append(autoRefTickno);
        sb.append(", costFund0=").append(costFund0);
        sb.append(", costFund1=").append(costFund1);
        sb.append(", costFund2=").append(costFund2);
        sb.append(", costFund3=").append(costFund3);
        sb.append(", fundRefId=").append(fundRefId);
        sb.append(", issueLock=").append(issueLock);
        sb.append("]");
        return sb.toString();
    }
}