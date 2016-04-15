package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TLTLimitedFeatureKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_LIMITED_FEATURE.CASKEY
     *
     * @mbggenerated Fri Apr 15 18:05:33 CST 2016
     */
    private String caskey;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_LIMITED_FEATURE.CASKEY
     *
     * @return the value of TLT_LIMITED_FEATURE.CASKEY
     *
     * @mbggenerated Fri Apr 15 18:05:33 CST 2016
     */
    public String getCaskey() {
        return caskey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_LIMITED_FEATURE.CASKEY
     *
     * @param caskey the value for TLT_LIMITED_FEATURE.CASKEY
     *
     * @mbggenerated Fri Apr 15 18:05:33 CST 2016
     */
    public void setCaskey(String caskey) {
        this.caskey = caskey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_FEATURE
     *
     * @mbggenerated Fri Apr 15 18:05:33 CST 2016
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
        TLTLimitedFeatureKey other = (TLTLimitedFeatureKey) that;
        return (this.getCaskey() == null ? other.getCaskey() == null : this.getCaskey().equals(other.getCaskey()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_FEATURE
     *
     * @mbggenerated Fri Apr 15 18:05:33 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaskey() == null) ? 0 : getCaskey().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_LIMITED_FEATURE
     *
     * @mbggenerated Fri Apr 15 18:05:33 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caskey=").append(caskey);
        sb.append("]");
        return sb.toString();
    }
}