package onight.tfg.ordbgens.tlt.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_BONUSGROUP")
@AllArgsConstructor
@NoArgsConstructor
public class TLTBonusgroup extends TLTBonusgroupKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.LTYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String ltype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String playType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.CN_NAME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String cnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.EN_NAME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.CREATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.UPDATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_BONUSGROUP.USER_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.LTYPE
     *
     * @return the value of TLT_BONUSGROUP.LTYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getLtype() {
        return ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.LTYPE
     *
     * @param ltype the value for TLT_BONUSGROUP.LTYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setLtype(String ltype) {
        this.ltype = ltype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.PLAY_TYPE
     *
     * @return the value of TLT_BONUSGROUP.PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getPlayType() {
        return playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.PLAY_TYPE
     *
     * @param playType the value for TLT_BONUSGROUP.PLAY_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setPlayType(String playType) {
        this.playType = playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.CN_NAME
     *
     * @return the value of TLT_BONUSGROUP.CN_NAME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.CN_NAME
     *
     * @param cnName the value for TLT_BONUSGROUP.CN_NAME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.EN_NAME
     *
     * @return the value of TLT_BONUSGROUP.EN_NAME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.EN_NAME
     *
     * @param enName the value for TLT_BONUSGROUP.EN_NAME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.STATUS
     *
     * @return the value of TLT_BONUSGROUP.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.STATUS
     *
     * @param status the value for TLT_BONUSGROUP.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.CREATE_TIME
     *
     * @return the value of TLT_BONUSGROUP.CREATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.CREATE_TIME
     *
     * @param createTime the value for TLT_BONUSGROUP.CREATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.UPDATE_TIME
     *
     * @return the value of TLT_BONUSGROUP.UPDATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.UPDATE_TIME
     *
     * @param updateTime the value for TLT_BONUSGROUP.UPDATE_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_BONUSGROUP.USER_ID
     *
     * @return the value of TLT_BONUSGROUP.USER_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_BONUSGROUP.USER_ID
     *
     * @param userId the value for TLT_BONUSGROUP.USER_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
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
        TLTBonusgroup other = (TLTBonusgroup) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLtype() == null ? other.getLtype() == null : this.getLtype().equals(other.getLtype()))
            && (this.getPlayType() == null ? other.getPlayType() == null : this.getPlayType().equals(other.getPlayType()))
            && (this.getCnName() == null ? other.getCnName() == null : this.getCnName().equals(other.getCnName()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLtype() == null) ? 0 : getLtype().hashCode());
        result = prime * result + ((getPlayType() == null) ? 0 : getPlayType().hashCode());
        result = prime * result + ((getCnName() == null) ? 0 : getCnName().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_BONUSGROUP
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ltype=").append(ltype);
        sb.append(", playType=").append(playType);
        sb.append(", cnName=").append(cnName);
        sb.append(", enName=").append(enName);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}