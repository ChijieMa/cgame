package onight.tfg.ordbgens.tfg.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TFGUserRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFG_USER_ROLE.USER_ROLE_ID
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    private String userRoleId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFG_USER_ROLE.USER_ROLE_ID
     *
     * @return the value of TFG_USER_ROLE.USER_ROLE_ID
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    public String getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFG_USER_ROLE.USER_ROLE_ID
     *
     * @param userRoleId the value for TFG_USER_ROLE.USER_ROLE_ID
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
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
        TFGUserRoleKey other = (TFGUserRoleKey) that;
        return (this.getUserRoleId() == null ? other.getUserRoleId() == null : this.getUserRoleId().equals(other.getUserRoleId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRoleId() == null) ? 0 : getUserRoleId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_ROLE
     *
     * @mbggenerated Fri Apr 15 21:03:11 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRoleId=").append(userRoleId);
        sb.append("]");
        return sb.toString();
    }
}