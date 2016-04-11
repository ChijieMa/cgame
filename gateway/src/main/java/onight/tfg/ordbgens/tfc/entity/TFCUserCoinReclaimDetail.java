package onight.tfg.ordbgens.tfc.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TFC_USER_COIN_RECLAIM_DETAIL")
@AllArgsConstructor
@NoArgsConstructor
public class TFCUserCoinReclaimDetail extends TFCUserCoinReclaimDetailKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.COIN_TYPE_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String coinTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.REC_TIME
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private Date recTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.USER_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.RECLAIM_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private Long reclaimNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.REQ_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private Long reqNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.CHANGED_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private Long changedNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.LOCK_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String lockId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.CHANNEL_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String channelId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.PRODUCT_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String productId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.FLOW_NUMBER
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String flowNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.USER_IP
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String userIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.SERVER_IP
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String serverIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USER_COIN_RECLAIM_DETAIL.GAME_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String gameId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.COIN_TYPE_ID
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.COIN_TYPE_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getCoinTypeId() {
        return coinTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.COIN_TYPE_ID
     *
     * @param coinTypeId the value for TFC_USER_COIN_RECLAIM_DETAIL.COIN_TYPE_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setCoinTypeId(String coinTypeId) {
        this.coinTypeId = coinTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.REC_TIME
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.REC_TIME
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Date getRecTime() {
        return recTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.REC_TIME
     *
     * @param recTime the value for TFC_USER_COIN_RECLAIM_DETAIL.REC_TIME
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setRecTime(Date recTime) {
        this.recTime = recTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.USER_ID
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.USER_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.USER_ID
     *
     * @param userId the value for TFC_USER_COIN_RECLAIM_DETAIL.USER_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.RECLAIM_NUM
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.RECLAIM_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Long getReclaimNum() {
        return reclaimNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.RECLAIM_NUM
     *
     * @param reclaimNum the value for TFC_USER_COIN_RECLAIM_DETAIL.RECLAIM_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setReclaimNum(Long reclaimNum) {
        this.reclaimNum = reclaimNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.REQ_NUM
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.REQ_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Long getReqNum() {
        return reqNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.REQ_NUM
     *
     * @param reqNum the value for TFC_USER_COIN_RECLAIM_DETAIL.REQ_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setReqNum(Long reqNum) {
        this.reqNum = reqNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.CHANGED_NUM
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.CHANGED_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Long getChangedNum() {
        return changedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.CHANGED_NUM
     *
     * @param changedNum the value for TFC_USER_COIN_RECLAIM_DETAIL.CHANGED_NUM
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setChangedNum(Long changedNum) {
        this.changedNum = changedNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.LOCK_ID
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.LOCK_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getLockId() {
        return lockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.LOCK_ID
     *
     * @param lockId the value for TFC_USER_COIN_RECLAIM_DETAIL.LOCK_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setLockId(String lockId) {
        this.lockId = lockId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.CHANNEL_ID
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.CHANNEL_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.CHANNEL_ID
     *
     * @param channelId the value for TFC_USER_COIN_RECLAIM_DETAIL.CHANNEL_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.PRODUCT_ID
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.PRODUCT_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.PRODUCT_ID
     *
     * @param productId the value for TFC_USER_COIN_RECLAIM_DETAIL.PRODUCT_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.FLOW_NUMBER
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.FLOW_NUMBER
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getFlowNumber() {
        return flowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.FLOW_NUMBER
     *
     * @param flowNumber the value for TFC_USER_COIN_RECLAIM_DETAIL.FLOW_NUMBER
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setFlowNumber(String flowNumber) {
        this.flowNumber = flowNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.USER_IP
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.USER_IP
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.USER_IP
     *
     * @param userIp the value for TFC_USER_COIN_RECLAIM_DETAIL.USER_IP
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.SERVER_IP
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.SERVER_IP
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getServerIp() {
        return serverIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.SERVER_IP
     *
     * @param serverIp the value for TFC_USER_COIN_RECLAIM_DETAIL.SERVER_IP
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.GAME_ID
     *
     * @return the value of TFC_USER_COIN_RECLAIM_DETAIL.GAME_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USER_COIN_RECLAIM_DETAIL.GAME_ID
     *
     * @param gameId the value for TFC_USER_COIN_RECLAIM_DETAIL.GAME_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_RECLAIM_DETAIL
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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
        TFCUserCoinReclaimDetail other = (TFCUserCoinReclaimDetail) that;
        return (this.getRowId() == null ? other.getRowId() == null : this.getRowId().equals(other.getRowId()))
            && (this.getCoinTypeId() == null ? other.getCoinTypeId() == null : this.getCoinTypeId().equals(other.getCoinTypeId()))
            && (this.getRecTime() == null ? other.getRecTime() == null : this.getRecTime().equals(other.getRecTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getReclaimNum() == null ? other.getReclaimNum() == null : this.getReclaimNum().equals(other.getReclaimNum()))
            && (this.getReqNum() == null ? other.getReqNum() == null : this.getReqNum().equals(other.getReqNum()))
            && (this.getChangedNum() == null ? other.getChangedNum() == null : this.getChangedNum().equals(other.getChangedNum()))
            && (this.getLockId() == null ? other.getLockId() == null : this.getLockId().equals(other.getLockId()))
            && (this.getChannelId() == null ? other.getChannelId() == null : this.getChannelId().equals(other.getChannelId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getFlowNumber() == null ? other.getFlowNumber() == null : this.getFlowNumber().equals(other.getFlowNumber()))
            && (this.getUserIp() == null ? other.getUserIp() == null : this.getUserIp().equals(other.getUserIp()))
            && (this.getServerIp() == null ? other.getServerIp() == null : this.getServerIp().equals(other.getServerIp()))
            && (this.getGameId() == null ? other.getGameId() == null : this.getGameId().equals(other.getGameId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_RECLAIM_DETAIL
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRowId() == null) ? 0 : getRowId().hashCode());
        result = prime * result + ((getCoinTypeId() == null) ? 0 : getCoinTypeId().hashCode());
        result = prime * result + ((getRecTime() == null) ? 0 : getRecTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getReclaimNum() == null) ? 0 : getReclaimNum().hashCode());
        result = prime * result + ((getReqNum() == null) ? 0 : getReqNum().hashCode());
        result = prime * result + ((getChangedNum() == null) ? 0 : getChangedNum().hashCode());
        result = prime * result + ((getLockId() == null) ? 0 : getLockId().hashCode());
        result = prime * result + ((getChannelId() == null) ? 0 : getChannelId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getFlowNumber() == null) ? 0 : getFlowNumber().hashCode());
        result = prime * result + ((getUserIp() == null) ? 0 : getUserIp().hashCode());
        result = prime * result + ((getServerIp() == null) ? 0 : getServerIp().hashCode());
        result = prime * result + ((getGameId() == null) ? 0 : getGameId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USER_COIN_RECLAIM_DETAIL
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", coinTypeId=").append(coinTypeId);
        sb.append(", recTime=").append(recTime);
        sb.append(", userId=").append(userId);
        sb.append(", reclaimNum=").append(reclaimNum);
        sb.append(", reqNum=").append(reqNum);
        sb.append(", changedNum=").append(changedNum);
        sb.append(", lockId=").append(lockId);
        sb.append(", channelId=").append(channelId);
        sb.append(", productId=").append(productId);
        sb.append(", flowNumber=").append(flowNumber);
        sb.append(", userIp=").append(userIp);
        sb.append(", serverIp=").append(serverIp);
        sb.append(", gameId=").append(gameId);
        sb.append("]");
        return sb.toString();
    }
}