package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TLTCoreUseridPrizeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_CORE_USERID_PRIZE.UUID
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    private String uuid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_CORE_USERID_PRIZE.UUID
     *
     * @return the value of TLT_CORE_USERID_PRIZE.UUID
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_CORE_USERID_PRIZE.UUID
     *
     * @param uuid the value for TLT_CORE_USERID_PRIZE.UUID
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_USERID_PRIZE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
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
        TLTCoreUseridPrizeKey other = (TLTCoreUseridPrizeKey) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals(other.getUuid()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_USERID_PRIZE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_CORE_USERID_PRIZE
     *
     * @mbggenerated Sat Apr 16 00:18:58 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uuid=").append(uuid);
        sb.append("]");
        return sb.toString();
    }
}