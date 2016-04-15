package onight.tfg.ordbgens.tfc.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TFC_ORDER_DETAIL")
@AllArgsConstructor
@NoArgsConstructor
public class TFCOrderDetail extends TFCOrderDetailKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.USER_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.HANDLE_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Date handleTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.HANLDE_STATUS
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Integer hanldeStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.NUM_BEFORE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long numBefore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.CHANGE_NUM
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long changeNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.NUM_AFTER
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private Long numAfter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_ORDER_DETAIL.NOTE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.USER_ID
     *
     * @return the value of TFC_ORDER_DETAIL.USER_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.USER_ID
     *
     * @param userId the value for TFC_ORDER_DETAIL.USER_ID
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.HANDLE_TIME
     *
     * @return the value of TFC_ORDER_DETAIL.HANDLE_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Date getHandleTime() {
        return handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.HANDLE_TIME
     *
     * @param handleTime the value for TFC_ORDER_DETAIL.HANDLE_TIME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.HANLDE_STATUS
     *
     * @return the value of TFC_ORDER_DETAIL.HANLDE_STATUS
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Integer getHanldeStatus() {
        return hanldeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.HANLDE_STATUS
     *
     * @param hanldeStatus the value for TFC_ORDER_DETAIL.HANLDE_STATUS
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setHanldeStatus(Integer hanldeStatus) {
        this.hanldeStatus = hanldeStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.NUM_BEFORE
     *
     * @return the value of TFC_ORDER_DETAIL.NUM_BEFORE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getNumBefore() {
        return numBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.NUM_BEFORE
     *
     * @param numBefore the value for TFC_ORDER_DETAIL.NUM_BEFORE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setNumBefore(Long numBefore) {
        this.numBefore = numBefore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.CHANGE_NUM
     *
     * @return the value of TFC_ORDER_DETAIL.CHANGE_NUM
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getChangeNum() {
        return changeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.CHANGE_NUM
     *
     * @param changeNum the value for TFC_ORDER_DETAIL.CHANGE_NUM
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setChangeNum(Long changeNum) {
        this.changeNum = changeNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.NUM_AFTER
     *
     * @return the value of TFC_ORDER_DETAIL.NUM_AFTER
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public Long getNumAfter() {
        return numAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.NUM_AFTER
     *
     * @param numAfter the value for TFC_ORDER_DETAIL.NUM_AFTER
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setNumAfter(Long numAfter) {
        this.numAfter = numAfter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_ORDER_DETAIL.NOTE
     *
     * @return the value of TFC_ORDER_DETAIL.NOTE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_ORDER_DETAIL.NOTE
     *
     * @param note the value for TFC_ORDER_DETAIL.NOTE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
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
        TFCOrderDetail other = (TFCOrderDetail) that;
        return (this.getRowId() == null ? other.getRowId() == null : this.getRowId().equals(other.getRowId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getHandleTime() == null ? other.getHandleTime() == null : this.getHandleTime().equals(other.getHandleTime()))
            && (this.getHanldeStatus() == null ? other.getHanldeStatus() == null : this.getHanldeStatus().equals(other.getHanldeStatus()))
            && (this.getNumBefore() == null ? other.getNumBefore() == null : this.getNumBefore().equals(other.getNumBefore()))
            && (this.getChangeNum() == null ? other.getChangeNum() == null : this.getChangeNum().equals(other.getChangeNum()))
            && (this.getNumAfter() == null ? other.getNumAfter() == null : this.getNumAfter().equals(other.getNumAfter()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRowId() == null) ? 0 : getRowId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getHandleTime() == null) ? 0 : getHandleTime().hashCode());
        result = prime * result + ((getHanldeStatus() == null) ? 0 : getHanldeStatus().hashCode());
        result = prime * result + ((getNumBefore() == null) ? 0 : getNumBefore().hashCode());
        result = prime * result + ((getChangeNum() == null) ? 0 : getChangeNum().hashCode());
        result = prime * result + ((getNumAfter() == null) ? 0 : getNumAfter().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_ORDER_DETAIL
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", handleTime=").append(handleTime);
        sb.append(", hanldeStatus=").append(hanldeStatus);
        sb.append(", numBefore=").append(numBefore);
        sb.append(", changeNum=").append(changeNum);
        sb.append(", numAfter=").append(numAfter);
        sb.append(", note=").append(note);
        sb.append("]");
        return sb.toString();
    }
}