package onight.tfg.ordbgens.tlt.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_LIMITED_NUM")
@AllArgsConstructor
@NoArgsConstructor
public class TLTLimitedNum extends TLTLimitedNumKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.ISSUE_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String issueNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.LIMITED_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String limitedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.LTYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.PLAY_TYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String playType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.EXTRAFIELD1
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String extrafield1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.EXTRAFIELD2
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String extrafield2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.EXTRAFIELD3
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private Integer extrafield3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.EXTRAFIELD4
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private BigDecimal extrafield4;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_NUM.EXTRAFIELD5
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private Long extrafield5;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.ISSUE_NO
     *
     * @return the value of TLT_LIMITED_NUM.ISSUE_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getIssueNo() {
        return issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.ISSUE_NO
     *
     * @param issueNo the value for TLT_LIMITED_NUM.ISSUE_NO
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setIssueNo(String issueNo) {
        this.issueNo = issueNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.LIMITED_NUM
     *
     * @return the value of TLT_LIMITED_NUM.LIMITED_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getLimitedNum() {
        return limitedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.LIMITED_NUM
     *
     * @param limitedNum the value for TLT_LIMITED_NUM.LIMITED_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setLimitedNum(String limitedNum) {
        this.limitedNum = limitedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.LTYPE
     *
     * @return the value of TLT_LIMITED_NUM.LTYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.LTYPE
     *
     * @param ltype the value for TLT_LIMITED_NUM.LTYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.PLAY_TYPE
     *
     * @return the value of TLT_LIMITED_NUM.PLAY_TYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getPlayType() {
        return playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.PLAY_TYPE
     *
     * @param playType the value for TLT_LIMITED_NUM.PLAY_TYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setPlayType(String playType) {
        this.playType = playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.EXTRAFIELD1
     *
     * @return the value of TLT_LIMITED_NUM.EXTRAFIELD1
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getExtrafield1() {
        return extrafield1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.EXTRAFIELD1
     *
     * @param extrafield1 the value for TLT_LIMITED_NUM.EXTRAFIELD1
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setExtrafield1(String extrafield1) {
        this.extrafield1 = extrafield1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.EXTRAFIELD2
     *
     * @return the value of TLT_LIMITED_NUM.EXTRAFIELD2
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getExtrafield2() {
        return extrafield2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.EXTRAFIELD2
     *
     * @param extrafield2 the value for TLT_LIMITED_NUM.EXTRAFIELD2
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setExtrafield2(String extrafield2) {
        this.extrafield2 = extrafield2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.EXTRAFIELD3
     *
     * @return the value of TLT_LIMITED_NUM.EXTRAFIELD3
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public Integer getExtrafield3() {
        return extrafield3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.EXTRAFIELD3
     *
     * @param extrafield3 the value for TLT_LIMITED_NUM.EXTRAFIELD3
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setExtrafield3(Integer extrafield3) {
        this.extrafield3 = extrafield3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.EXTRAFIELD4
     *
     * @return the value of TLT_LIMITED_NUM.EXTRAFIELD4
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public BigDecimal getExtrafield4() {
        return extrafield4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.EXTRAFIELD4
     *
     * @param extrafield4 the value for TLT_LIMITED_NUM.EXTRAFIELD4
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setExtrafield4(BigDecimal extrafield4) {
        this.extrafield4 = extrafield4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_NUM.EXTRAFIELD5
     *
     * @return the value of TLT_LIMITED_NUM.EXTRAFIELD5
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public Long getExtrafield5() {
        return extrafield5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_NUM.EXTRAFIELD5
     *
     * @param extrafield5 the value for TLT_LIMITED_NUM.EXTRAFIELD5
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setExtrafield5(Long extrafield5) {
        this.extrafield5 = extrafield5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
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
        TLTLimitedNum other = (TLTLimitedNum) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()))
            && (this.getIssueNo() == null ? other.getIssueNo() == null : this.getIssueNo().equals(other.getIssueNo()))
            && (this.getLimitedNum() == null ? other.getLimitedNum() == null : this.getLimitedNum().equals(other.getLimitedNum()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getPlayType() == null ? other.getPlayType() == null : this.getPlayType().equals(other.getPlayType()))
            && (this.getExtrafield1() == null ? other.getExtrafield1() == null : this.getExtrafield1().equals(other.getExtrafield1()))
            && (this.getExtrafield2() == null ? other.getExtrafield2() == null : this.getExtrafield2().equals(other.getExtrafield2()))
            && (this.getExtrafield3() == null ? other.getExtrafield3() == null : this.getExtrafield3().equals(other.getExtrafield3()))
            && (this.getExtrafield4() == null ? other.getExtrafield4() == null : this.getExtrafield4().equals(other.getExtrafield4()))
            && (this.getExtrafield5() == null ? other.getExtrafield5() == null : this.getExtrafield5().equals(other.getExtrafield5()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getIssueNo() == null) ? 0 : getIssueNo().hashCode());
        result = prime * result + ((getLimitedNum() == null) ? 0 : getLimitedNum().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getPlayType() == null) ? 0 : getPlayType().hashCode());
        result = prime * result + ((getExtrafield1() == null) ? 0 : getExtrafield1().hashCode());
        result = prime * result + ((getExtrafield2() == null) ? 0 : getExtrafield2().hashCode());
        result = prime * result + ((getExtrafield3() == null) ? 0 : getExtrafield3().hashCode());
        result = prime * result + ((getExtrafield4() == null) ? 0 : getExtrafield4().hashCode());
        result = prime * result + ((getExtrafield5() == null) ? 0 : getExtrafield5().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_NUM
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", issueNo=").append(issueNo);
        sb.append(", limitedNum=").append(limitedNum);
        sb.append(", ltype=").append(ltype);
        sb.append(", playType=").append(playType);
        sb.append(", extrafield1=").append(extrafield1);
        sb.append(", extrafield2=").append(extrafield2);
        sb.append(", extrafield3=").append(extrafield3);
        sb.append(", extrafield4=").append(extrafield4);
        sb.append(", extrafield5=").append(extrafield5);
        sb.append("]");
        return sb.toString();
    }
}