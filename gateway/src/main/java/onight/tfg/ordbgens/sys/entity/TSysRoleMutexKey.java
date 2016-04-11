package onight.tfg.ordbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TSysRoleMutexKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_MUTEX.ROLE_MUTEX_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private String roleMutexId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_MUTEX.ROLE_MUTEX_ID
     *
     * @return the value of T_SYS_ROLE_MUTEX.ROLE_MUTEX_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public String getRoleMutexId() {
        return roleMutexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_MUTEX.ROLE_MUTEX_ID
     *
     * @param roleMutexId the value for T_SYS_ROLE_MUTEX.ROLE_MUTEX_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setRoleMutexId(String roleMutexId) {
        this.roleMutexId = roleMutexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_MUTEX
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
        TSysRoleMutexKey other = (TSysRoleMutexKey) that;
        return (this.getRoleMutexId() == null ? other.getRoleMutexId() == null : this.getRoleMutexId().equals(other.getRoleMutexId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_MUTEX
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleMutexId() == null) ? 0 : getRoleMutexId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_MUTEX
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleMutexId=").append(roleMutexId);
        sb.append("]");
        return sb.toString();
    }
}