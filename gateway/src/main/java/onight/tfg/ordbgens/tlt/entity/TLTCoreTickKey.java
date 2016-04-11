package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TLTCoreTickKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_TICK.TICK_NO
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String tickNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_TICK.TICK_NO
     *
     * @return the value of TLT_CORE_TICK.TICK_NO
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getTickNo() {
        return tickNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_TICK.TICK_NO
     *
     * @param tickNo the value for TLT_CORE_TICK.TICK_NO
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setTickNo(String tickNo) {
        this.tickNo = tickNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_TICK
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
        TLTCoreTickKey other = (TLTCoreTickKey) that;
        return (this.getTickNo() == null ? other.getTickNo() == null : this.getTickNo().equals(other.getTickNo()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_TICK
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTickNo() == null) ? 0 : getTickNo().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_TICK
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tickNo=").append(tickNo);
        sb.append("]");
        return sb.toString();
    }
}