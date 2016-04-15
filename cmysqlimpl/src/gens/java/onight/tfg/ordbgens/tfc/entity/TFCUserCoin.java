package onight.tfg.ordbgens.tfc.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TFC_USER_COIN")
@AllArgsConstructor
@NoArgsConstructor
public class TFCUserCoin extends TFCUserCoinKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.COIN_TYPE_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String coinTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.USER_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.START_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.EXPIRE_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Date expireTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.COIN_NUM
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long coinNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.LOCK_COUNT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long lockCount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN.SHOW_CHILD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer showChild;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.COIN_TYPE_ID
     *
     * @return the value of TFC_USER_COIN.COIN_TYPE_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getCoinTypeId() {
        return coinTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.COIN_TYPE_ID
     *
     * @param coinTypeId the value for TFC_USER_COIN.COIN_TYPE_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCoinTypeId(String coinTypeId) {
        this.coinTypeId = coinTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.USER_ID
     *
     * @return the value of TFC_USER_COIN.USER_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.USER_ID
     *
     * @param userId the value for TFC_USER_COIN.USER_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.START_TIME
     *
     * @return the value of TFC_USER_COIN.START_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.START_TIME
     *
     * @param startTime the value for TFC_USER_COIN.START_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.EXPIRE_TIME
     *
     * @return the value of TFC_USER_COIN.EXPIRE_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.EXPIRE_TIME
     *
     * @param expireTime the value for TFC_USER_COIN.EXPIRE_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.COIN_NUM
     *
     * @return the value of TFC_USER_COIN.COIN_NUM
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getCoinNum() {
        return coinNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.COIN_NUM
     *
     * @param coinNum the value for TFC_USER_COIN.COIN_NUM
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setCoinNum(Long coinNum) {
        this.coinNum = coinNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.LOCK_COUNT
     *
     * @return the value of TFC_USER_COIN.LOCK_COUNT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getLockCount() {
        return lockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.LOCK_COUNT
     *
     * @param lockCount the value for TFC_USER_COIN.LOCK_COUNT
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setLockCount(Long lockCount) {
        this.lockCount = lockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN.SHOW_CHILD
     *
     * @return the value of TFC_USER_COIN.SHOW_CHILD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getShowChild() {
        return showChild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN.SHOW_CHILD
     *
     * @param showChild the value for TFC_USER_COIN.SHOW_CHILD
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setShowChild(Integer showChild) {
        this.showChild = showChild;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
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
        TFCUserCoin other = (TFCUserCoin) that;
        return (this.getCoinRowid() == null ? other.getCoinRowid() == null : this.getCoinRowid().equals(other.getCoinRowid()))
            && (this.getCoinTypeId() == null ? other.getCoinTypeId() == null : this.getCoinTypeId().equals(other.getCoinTypeId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getExpireTime() == null ? other.getExpireTime() == null : this.getExpireTime().equals(other.getExpireTime()))
            && (this.getCoinNum() == null ? other.getCoinNum() == null : this.getCoinNum().equals(other.getCoinNum()))
            && (this.getLockCount() == null ? other.getLockCount() == null : this.getLockCount().equals(other.getLockCount()))
            && (this.getShowChild() == null ? other.getShowChild() == null : this.getShowChild().equals(other.getShowChild()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCoinRowid() == null) ? 0 : getCoinRowid().hashCode());
        result = prime * result + ((getCoinTypeId() == null) ? 0 : getCoinTypeId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getExpireTime() == null) ? 0 : getExpireTime().hashCode());
        result = prime * result + ((getCoinNum() == null) ? 0 : getCoinNum().hashCode());
        result = prime * result + ((getLockCount() == null) ? 0 : getLockCount().hashCode());
        result = prime * result + ((getShowChild() == null) ? 0 : getShowChild().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coinTypeId=").append(coinTypeId);
        sb.append(", userId=").append(userId);
        sb.append(", startTime=").append(startTime);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", coinNum=").append(coinNum);
        sb.append(", lockCount=").append(lockCount);
        sb.append(", showChild=").append(showChild);
        sb.append("]");
        return sb.toString();
    }
}