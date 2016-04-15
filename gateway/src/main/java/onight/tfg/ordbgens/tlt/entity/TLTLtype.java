package onight.tfg.ordbgens.tlt.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_LTYPE")
@AllArgsConstructor
@NoArgsConstructor
public class TLTLtype extends TLTLtypeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.GROUP_TYPE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String groupType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CN_NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String cnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.EN_NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CODE_LIST
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String codeList;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CODE_LEN
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer codeLen;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.SORT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.ENABLE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.REMARK
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.DELAY_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer delayTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CATCH_CODE_COUNT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer catchCodeCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CATCH_CODE_INTERVAL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer catchCodeInterval;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.MIN_LEFT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Float minLeft;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.MIN_SPREAD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Float minSpread;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.ISSUE_NO_FMT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String issueNoFmt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CLEAR_YMD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String clearYmd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.LOTTERY_CYCLE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String lotteryCycle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CLOSE_STIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Date closeStime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.CLOSE_ETIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Date closeEtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.REBATE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Float rebate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LTYPE.DELO_REBATE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Float deloRebate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.GROUP_TYPE
     *
     * @return the value of TLT_LTYPE.GROUP_TYPE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getGroupType() {
        return groupType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.GROUP_TYPE
     *
     * @param groupType the value for TLT_LTYPE.GROUP_TYPE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CN_NAME
     *
     * @return the value of TLT_LTYPE.CN_NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CN_NAME
     *
     * @param cnName the value for TLT_LTYPE.CN_NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.EN_NAME
     *
     * @return the value of TLT_LTYPE.EN_NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.EN_NAME
     *
     * @param enName the value for TLT_LTYPE.EN_NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CODE_LIST
     *
     * @return the value of TLT_LTYPE.CODE_LIST
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getCodeList() {
        return codeList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CODE_LIST
     *
     * @param codeList the value for TLT_LTYPE.CODE_LIST
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCodeList(String codeList) {
        this.codeList = codeList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CODE_LEN
     *
     * @return the value of TLT_LTYPE.CODE_LEN
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getCodeLen() {
        return codeLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CODE_LEN
     *
     * @param codeLen the value for TLT_LTYPE.CODE_LEN
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCodeLen(Integer codeLen) {
        this.codeLen = codeLen;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.SORT
     *
     * @return the value of TLT_LTYPE.SORT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.SORT
     *
     * @param sort the value for TLT_LTYPE.SORT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.ENABLE
     *
     * @return the value of TLT_LTYPE.ENABLE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.ENABLE
     *
     * @param enable the value for TLT_LTYPE.ENABLE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.REMARK
     *
     * @return the value of TLT_LTYPE.REMARK
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.REMARK
     *
     * @param remark the value for TLT_LTYPE.REMARK
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.DELAY_TIME
     *
     * @return the value of TLT_LTYPE.DELAY_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getDelayTime() {
        return delayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.DELAY_TIME
     *
     * @param delayTime the value for TLT_LTYPE.DELAY_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CATCH_CODE_COUNT
     *
     * @return the value of TLT_LTYPE.CATCH_CODE_COUNT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getCatchCodeCount() {
        return catchCodeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CATCH_CODE_COUNT
     *
     * @param catchCodeCount the value for TLT_LTYPE.CATCH_CODE_COUNT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCatchCodeCount(Integer catchCodeCount) {
        this.catchCodeCount = catchCodeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CATCH_CODE_INTERVAL
     *
     * @return the value of TLT_LTYPE.CATCH_CODE_INTERVAL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getCatchCodeInterval() {
        return catchCodeInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CATCH_CODE_INTERVAL
     *
     * @param catchCodeInterval the value for TLT_LTYPE.CATCH_CODE_INTERVAL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCatchCodeInterval(Integer catchCodeInterval) {
        this.catchCodeInterval = catchCodeInterval;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.MIN_LEFT
     *
     * @return the value of TLT_LTYPE.MIN_LEFT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Float getMinLeft() {
        return minLeft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.MIN_LEFT
     *
     * @param minLeft the value for TLT_LTYPE.MIN_LEFT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setMinLeft(Float minLeft) {
        this.minLeft = minLeft;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.MIN_SPREAD
     *
     * @return the value of TLT_LTYPE.MIN_SPREAD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Float getMinSpread() {
        return minSpread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.MIN_SPREAD
     *
     * @param minSpread the value for TLT_LTYPE.MIN_SPREAD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setMinSpread(Float minSpread) {
        this.minSpread = minSpread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.ISSUE_NO_FMT
     *
     * @return the value of TLT_LTYPE.ISSUE_NO_FMT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getIssueNoFmt() {
        return issueNoFmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.ISSUE_NO_FMT
     *
     * @param issueNoFmt the value for TLT_LTYPE.ISSUE_NO_FMT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setIssueNoFmt(String issueNoFmt) {
        this.issueNoFmt = issueNoFmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CLEAR_YMD
     *
     * @return the value of TLT_LTYPE.CLEAR_YMD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getClearYmd() {
        return clearYmd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CLEAR_YMD
     *
     * @param clearYmd the value for TLT_LTYPE.CLEAR_YMD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setClearYmd(String clearYmd) {
        this.clearYmd = clearYmd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.LOTTERY_CYCLE
     *
     * @return the value of TLT_LTYPE.LOTTERY_CYCLE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getLotteryCycle() {
        return lotteryCycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.LOTTERY_CYCLE
     *
     * @param lotteryCycle the value for TLT_LTYPE.LOTTERY_CYCLE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setLotteryCycle(String lotteryCycle) {
        this.lotteryCycle = lotteryCycle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CLOSE_STIME
     *
     * @return the value of TLT_LTYPE.CLOSE_STIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Date getCloseStime() {
        return closeStime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CLOSE_STIME
     *
     * @param closeStime the value for TLT_LTYPE.CLOSE_STIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCloseStime(Date closeStime) {
        this.closeStime = closeStime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.CLOSE_ETIME
     *
     * @return the value of TLT_LTYPE.CLOSE_ETIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Date getCloseEtime() {
        return closeEtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.CLOSE_ETIME
     *
     * @param closeEtime the value for TLT_LTYPE.CLOSE_ETIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCloseEtime(Date closeEtime) {
        this.closeEtime = closeEtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.REBATE
     *
     * @return the value of TLT_LTYPE.REBATE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Float getRebate() {
        return rebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.REBATE
     *
     * @param rebate the value for TLT_LTYPE.REBATE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setRebate(Float rebate) {
        this.rebate = rebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LTYPE.DELO_REBATE
     *
     * @return the value of TLT_LTYPE.DELO_REBATE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Float getDeloRebate() {
        return deloRebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LTYPE.DELO_REBATE
     *
     * @param deloRebate the value for TLT_LTYPE.DELO_REBATE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setDeloRebate(Float deloRebate) {
        this.deloRebate = deloRebate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LTYPE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
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
        TLTLtype other = (TLTLtype) that;
        return (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getGroupType() == null ? other.getGroupType() == null : this.getGroupType().equals(other.getGroupType()))
            && (this.getCnName() == null ? other.getCnName() == null : this.getCnName().equals(other.getCnName()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getCodeList() == null ? other.getCodeList() == null : this.getCodeList().equals(other.getCodeList()))
            && (this.getCodeLen() == null ? other.getCodeLen() == null : this.getCodeLen().equals(other.getCodeLen()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDelayTime() == null ? other.getDelayTime() == null : this.getDelayTime().equals(other.getDelayTime()))
            && (this.getCatchCodeCount() == null ? other.getCatchCodeCount() == null : this.getCatchCodeCount().equals(other.getCatchCodeCount()))
            && (this.getCatchCodeInterval() == null ? other.getCatchCodeInterval() == null : this.getCatchCodeInterval().equals(other.getCatchCodeInterval()))
            && (this.getMinLeft() == null ? other.getMinLeft() == null : this.getMinLeft().equals(other.getMinLeft()))
            && (this.getMinSpread() == null ? other.getMinSpread() == null : this.getMinSpread().equals(other.getMinSpread()))
            && (this.getIssueNoFmt() == null ? other.getIssueNoFmt() == null : this.getIssueNoFmt().equals(other.getIssueNoFmt()))
            && (this.getClearYmd() == null ? other.getClearYmd() == null : this.getClearYmd().equals(other.getClearYmd()))
            && (this.getLotteryCycle() == null ? other.getLotteryCycle() == null : this.getLotteryCycle().equals(other.getLotteryCycle()))
            && (this.getCloseStime() == null ? other.getCloseStime() == null : this.getCloseStime().equals(other.getCloseStime()))
            && (this.getCloseEtime() == null ? other.getCloseEtime() == null : this.getCloseEtime().equals(other.getCloseEtime()))
            && (this.getRebate() == null ? other.getRebate() == null : this.getRebate().equals(other.getRebate()))
            && (this.getDeloRebate() == null ? other.getDeloRebate() == null : this.getDeloRebate().equals(other.getDeloRebate()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LTYPE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getGroupType() == null) ? 0 : getGroupType().hashCode());
        result = prime * result + ((getCnName() == null) ? 0 : getCnName().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getCodeList() == null) ? 0 : getCodeList().hashCode());
        result = prime * result + ((getCodeLen() == null) ? 0 : getCodeLen().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDelayTime() == null) ? 0 : getDelayTime().hashCode());
        result = prime * result + ((getCatchCodeCount() == null) ? 0 : getCatchCodeCount().hashCode());
        result = prime * result + ((getCatchCodeInterval() == null) ? 0 : getCatchCodeInterval().hashCode());
        result = prime * result + ((getMinLeft() == null) ? 0 : getMinLeft().hashCode());
        result = prime * result + ((getMinSpread() == null) ? 0 : getMinSpread().hashCode());
        result = prime * result + ((getIssueNoFmt() == null) ? 0 : getIssueNoFmt().hashCode());
        result = prime * result + ((getClearYmd() == null) ? 0 : getClearYmd().hashCode());
        result = prime * result + ((getLotteryCycle() == null) ? 0 : getLotteryCycle().hashCode());
        result = prime * result + ((getCloseStime() == null) ? 0 : getCloseStime().hashCode());
        result = prime * result + ((getCloseEtime() == null) ? 0 : getCloseEtime().hashCode());
        result = prime * result + ((getRebate() == null) ? 0 : getRebate().hashCode());
        result = prime * result + ((getDeloRebate() == null) ? 0 : getDeloRebate().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LTYPE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupType=").append(groupType);
        sb.append(", cnName=").append(cnName);
        sb.append(", enName=").append(enName);
        sb.append(", codeList=").append(codeList);
        sb.append(", codeLen=").append(codeLen);
        sb.append(", sort=").append(sort);
        sb.append(", enable=").append(enable);
        sb.append(", remark=").append(remark);
        sb.append(", delayTime=").append(delayTime);
        sb.append(", catchCodeCount=").append(catchCodeCount);
        sb.append(", catchCodeInterval=").append(catchCodeInterval);
        sb.append(", minLeft=").append(minLeft);
        sb.append(", minSpread=").append(minSpread);
        sb.append(", issueNoFmt=").append(issueNoFmt);
        sb.append(", clearYmd=").append(clearYmd);
        sb.append(", lotteryCycle=").append(lotteryCycle);
        sb.append(", closeStime=").append(closeStime);
        sb.append(", closeEtime=").append(closeEtime);
        sb.append(", rebate=").append(rebate);
        sb.append(", deloRebate=").append(deloRebate);
        sb.append("]");
        return sb.toString();
    }
}