package onight.tfg.ordbgens.tfc.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TFCUseLockDetailKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_USE_LOCK_DETAIL.ROW_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String rowId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_USE_LOCK_DETAIL.ROW_ID
     *
     * @return the value of TFC_USE_LOCK_DETAIL.ROW_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getRowId() {
        return rowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_USE_LOCK_DETAIL.ROW_ID
     *
     * @param rowId the value for TFC_USE_LOCK_DETAIL.ROW_ID
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
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
        TFCUseLockDetailKey other = (TFCUseLockDetailKey) that;
        return (this.getRowId() == null ? other.getRowId() == null : this.getRowId().equals(other.getRowId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRowId() == null) ? 0 : getRowId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_USE_LOCK_DETAIL
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rowId=").append(rowId);
        sb.append("]");
        return sb.toString();
    }
}