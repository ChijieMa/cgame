package onight.tfg.ordbgens.tlt.entity;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_BET_AUTO")
@AllArgsConstructor
@NoArgsConstructor
public class TLTBetAuto extends TLTBetAutoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.USER_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.LTYPE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.LNAME
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String lname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String playType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.LPG_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String lpgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.LP_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String lpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.CREATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.START_ISSUE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String startIssue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.ISSUE_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer issueNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.TOTAL_TICK_AMOUNTS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private BigDecimal totalTickAmounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.TOTAL_TICK_COUNTS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer totalTickCounts;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.COMPLETE_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer completeNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.CANCEL_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer cancelNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.BET_DATA
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String betData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.COMPLETE_COINS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Float completeCoins;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.CANCEL_COINS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Float cancelCoins;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.MODE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer mode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.TIMES
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer times;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.WIN_STOP
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer winStop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.STATUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BET_AUTO.TICK_NO
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    private String tickNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.USER_ID
     *
     * @return the value of TLT_BET_AUTO.USER_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.USER_ID
     *
     * @param userId the value for TLT_BET_AUTO.USER_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.LTYPE
     *
     * @return the value of TLT_BET_AUTO.LTYPE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.LTYPE
     *
     * @param ltype the value for TLT_BET_AUTO.LTYPE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.LNAME
     *
     * @return the value of TLT_BET_AUTO.LNAME
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getLname() {
        return lname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.LNAME
     *
     * @param lname the value for TLT_BET_AUTO.LNAME
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setLname(String lname) {
        this.lname = lname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.PLAY_TYPE
     *
     * @return the value of TLT_BET_AUTO.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getPlayType() {
        return playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.PLAY_TYPE
     *
     * @param playType the value for TLT_BET_AUTO.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setPlayType(String playType) {
        this.playType = playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.LPG_ID
     *
     * @return the value of TLT_BET_AUTO.LPG_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getLpgId() {
        return lpgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.LPG_ID
     *
     * @param lpgId the value for TLT_BET_AUTO.LPG_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setLpgId(String lpgId) {
        this.lpgId = lpgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.LP_ID
     *
     * @return the value of TLT_BET_AUTO.LP_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getLpId() {
        return lpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.LP_ID
     *
     * @param lpId the value for TLT_BET_AUTO.LP_ID
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setLpId(String lpId) {
        this.lpId = lpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.CREATE_TIME
     *
     * @return the value of TLT_BET_AUTO.CREATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.CREATE_TIME
     *
     * @param createTime the value for TLT_BET_AUTO.CREATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.START_ISSUE
     *
     * @return the value of TLT_BET_AUTO.START_ISSUE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getStartIssue() {
        return startIssue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.START_ISSUE
     *
     * @param startIssue the value for TLT_BET_AUTO.START_ISSUE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setStartIssue(String startIssue) {
        this.startIssue = startIssue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.ISSUE_NUM
     *
     * @return the value of TLT_BET_AUTO.ISSUE_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getIssueNum() {
        return issueNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.ISSUE_NUM
     *
     * @param issueNum the value for TLT_BET_AUTO.ISSUE_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setIssueNum(Integer issueNum) {
        this.issueNum = issueNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.TOTAL_TICK_AMOUNTS
     *
     * @return the value of TLT_BET_AUTO.TOTAL_TICK_AMOUNTS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public BigDecimal getTotalTickAmounts() {
        return totalTickAmounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.TOTAL_TICK_AMOUNTS
     *
     * @param totalTickAmounts the value for TLT_BET_AUTO.TOTAL_TICK_AMOUNTS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setTotalTickAmounts(BigDecimal totalTickAmounts) {
        this.totalTickAmounts = totalTickAmounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.TOTAL_TICK_COUNTS
     *
     * @return the value of TLT_BET_AUTO.TOTAL_TICK_COUNTS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getTotalTickCounts() {
        return totalTickCounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.TOTAL_TICK_COUNTS
     *
     * @param totalTickCounts the value for TLT_BET_AUTO.TOTAL_TICK_COUNTS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setTotalTickCounts(Integer totalTickCounts) {
        this.totalTickCounts = totalTickCounts;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.COMPLETE_NUM
     *
     * @return the value of TLT_BET_AUTO.COMPLETE_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getCompleteNum() {
        return completeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.COMPLETE_NUM
     *
     * @param completeNum the value for TLT_BET_AUTO.COMPLETE_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setCompleteNum(Integer completeNum) {
        this.completeNum = completeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.CANCEL_NUM
     *
     * @return the value of TLT_BET_AUTO.CANCEL_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getCancelNum() {
        return cancelNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.CANCEL_NUM
     *
     * @param cancelNum the value for TLT_BET_AUTO.CANCEL_NUM
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setCancelNum(Integer cancelNum) {
        this.cancelNum = cancelNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.BET_DATA
     *
     * @return the value of TLT_BET_AUTO.BET_DATA
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getBetData() {
        return betData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.BET_DATA
     *
     * @param betData the value for TLT_BET_AUTO.BET_DATA
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setBetData(String betData) {
        this.betData = betData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.COMPLETE_COINS
     *
     * @return the value of TLT_BET_AUTO.COMPLETE_COINS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Float getCompleteCoins() {
        return completeCoins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.COMPLETE_COINS
     *
     * @param completeCoins the value for TLT_BET_AUTO.COMPLETE_COINS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setCompleteCoins(Float completeCoins) {
        this.completeCoins = completeCoins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.CANCEL_COINS
     *
     * @return the value of TLT_BET_AUTO.CANCEL_COINS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Float getCancelCoins() {
        return cancelCoins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.CANCEL_COINS
     *
     * @param cancelCoins the value for TLT_BET_AUTO.CANCEL_COINS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setCancelCoins(Float cancelCoins) {
        this.cancelCoins = cancelCoins;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.MODE
     *
     * @return the value of TLT_BET_AUTO.MODE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getMode() {
        return mode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.MODE
     *
     * @param mode the value for TLT_BET_AUTO.MODE
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setMode(Integer mode) {
        this.mode = mode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.TIMES
     *
     * @return the value of TLT_BET_AUTO.TIMES
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.TIMES
     *
     * @param times the value for TLT_BET_AUTO.TIMES
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setTimes(Integer times) {
        this.times = times;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.WIN_STOP
     *
     * @return the value of TLT_BET_AUTO.WIN_STOP
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getWinStop() {
        return winStop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.WIN_STOP
     *
     * @param winStop the value for TLT_BET_AUTO.WIN_STOP
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setWinStop(Integer winStop) {
        this.winStop = winStop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.STATUS
     *
     * @return the value of TLT_BET_AUTO.STATUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.STATUS
     *
     * @param status the value for TLT_BET_AUTO.STATUS
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BET_AUTO.TICK_NO
     *
     * @return the value of TLT_BET_AUTO.TICK_NO
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public String getTickNo() {
        return tickNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BET_AUTO.TICK_NO
     *
     * @param tickNo the value for TLT_BET_AUTO.TICK_NO
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    public void setTickNo(String tickNo) {
        this.tickNo = tickNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BET_AUTO
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
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
        TLTBetAuto other = (TLTBetAuto) that;
        return (this.getAutobetNo() == null ? other.getAutobetNo() == null : this.getAutobetNo().equals(other.getAutobetNo()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getLname() == null ? other.getLname() == null : this.getLname().equals(other.getLname()))
            && (this.getPlayType() == null ? other.getPlayType() == null : this.getPlayType().equals(other.getPlayType()))
            && (this.getLpgId() == null ? other.getLpgId() == null : this.getLpgId().equals(other.getLpgId()))
            && (this.getLpId() == null ? other.getLpId() == null : this.getLpId().equals(other.getLpId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStartIssue() == null ? other.getStartIssue() == null : this.getStartIssue().equals(other.getStartIssue()))
            && (this.getIssueNum() == null ? other.getIssueNum() == null : this.getIssueNum().equals(other.getIssueNum()))
            && (this.getTotalTickAmounts() == null ? other.getTotalTickAmounts() == null : this.getTotalTickAmounts().equals(other.getTotalTickAmounts()))
            && (this.getTotalTickCounts() == null ? other.getTotalTickCounts() == null : this.getTotalTickCounts().equals(other.getTotalTickCounts()))
            && (this.getCompleteNum() == null ? other.getCompleteNum() == null : this.getCompleteNum().equals(other.getCompleteNum()))
            && (this.getCancelNum() == null ? other.getCancelNum() == null : this.getCancelNum().equals(other.getCancelNum()))
            && (this.getBetData() == null ? other.getBetData() == null : this.getBetData().equals(other.getBetData()))
            && (this.getCompleteCoins() == null ? other.getCompleteCoins() == null : this.getCompleteCoins().equals(other.getCompleteCoins()))
            && (this.getCancelCoins() == null ? other.getCancelCoins() == null : this.getCancelCoins().equals(other.getCancelCoins()))
            && (this.getMode() == null ? other.getMode() == null : this.getMode().equals(other.getMode()))
            && (this.getTimes() == null ? other.getTimes() == null : this.getTimes().equals(other.getTimes()))
            && (this.getWinStop() == null ? other.getWinStop() == null : this.getWinStop().equals(other.getWinStop()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTickNo() == null ? other.getTickNo() == null : this.getTickNo().equals(other.getTickNo()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BET_AUTO
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAutobetNo() == null) ? 0 : getAutobetNo().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getLname() == null) ? 0 : getLname().hashCode());
        result = prime * result + ((getPlayType() == null) ? 0 : getPlayType().hashCode());
        result = prime * result + ((getLpgId() == null) ? 0 : getLpgId().hashCode());
        result = prime * result + ((getLpId() == null) ? 0 : getLpId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStartIssue() == null) ? 0 : getStartIssue().hashCode());
        result = prime * result + ((getIssueNum() == null) ? 0 : getIssueNum().hashCode());
        result = prime * result + ((getTotalTickAmounts() == null) ? 0 : getTotalTickAmounts().hashCode());
        result = prime * result + ((getTotalTickCounts() == null) ? 0 : getTotalTickCounts().hashCode());
        result = prime * result + ((getCompleteNum() == null) ? 0 : getCompleteNum().hashCode());
        result = prime * result + ((getCancelNum() == null) ? 0 : getCancelNum().hashCode());
        result = prime * result + ((getBetData() == null) ? 0 : getBetData().hashCode());
        result = prime * result + ((getCompleteCoins() == null) ? 0 : getCompleteCoins().hashCode());
        result = prime * result + ((getCancelCoins() == null) ? 0 : getCancelCoins().hashCode());
        result = prime * result + ((getMode() == null) ? 0 : getMode().hashCode());
        result = prime * result + ((getTimes() == null) ? 0 : getTimes().hashCode());
        result = prime * result + ((getWinStop() == null) ? 0 : getWinStop().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTickNo() == null) ? 0 : getTickNo().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BET_AUTO
     *
     * @mbggenerated Thu Apr 14 00:04:40 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", ltype=").append(ltype);
        sb.append(", lname=").append(lname);
        sb.append(", playType=").append(playType);
        sb.append(", lpgId=").append(lpgId);
        sb.append(", lpId=").append(lpId);
        sb.append(", createTime=").append(createTime);
        sb.append(", startIssue=").append(startIssue);
        sb.append(", issueNum=").append(issueNum);
        sb.append(", totalTickAmounts=").append(totalTickAmounts);
        sb.append(", totalTickCounts=").append(totalTickCounts);
        sb.append(", completeNum=").append(completeNum);
        sb.append(", cancelNum=").append(cancelNum);
        sb.append(", betData=").append(betData);
        sb.append(", completeCoins=").append(completeCoins);
        sb.append(", cancelCoins=").append(cancelCoins);
        sb.append(", mode=").append(mode);
        sb.append(", times=").append(times);
        sb.append(", winStop=").append(winStop);
        sb.append(", status=").append(status);
        sb.append(", tickNo=").append(tickNo);
        sb.append("]");
        return sb.toString();
    }
}