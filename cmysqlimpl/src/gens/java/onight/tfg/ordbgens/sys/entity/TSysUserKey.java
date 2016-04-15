package onight.tfg.ordbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TSysUserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    private String userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.USER_ID
     *
     * @return the value of T_SYS_USER.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.USER_ID
     *
     * @param userId the value for T_SYS_USER.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
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
        TSysUserKey other = (TSysUserKey) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append("]");
        return sb.toString();
    }
}