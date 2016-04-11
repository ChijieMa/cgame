package onight.tfg.ordbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="T_SYS_USER_ROLE")
@AllArgsConstructor
@NoArgsConstructor
public class TSysUserRole extends TSysUserRoleKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER_ROLE.USER_ID
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER_ROLE.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER_ROLE.ROLE_ID
     *
     * @return the value of T_SYS_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER_ROLE.ROLE_ID
     *
     * @param roleId the value for T_SYS_USER_ROLE.ROLE_ID
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER_ROLE.USER_ID
     *
     * @return the value of T_SYS_USER_ROLE.USER_ID
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER_ROLE.USER_ID
     *
     * @param userId the value for T_SYS_USER_ROLE.USER_ID
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER_ROLE.STATUS
     *
     * @return the value of T_SYS_USER_ROLE.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER_ROLE.STATUS
     *
     * @param status the value for T_SYS_USER_ROLE.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:15 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER_ROLE
     *
     * @mbggenerated Mon Apr 11 20:11:16 CST 2016
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
        TSysUserRole other = (TSysUserRole) that;
        return (this.getUserRoleId() == null ? other.getUserRoleId() == null : this.getUserRoleId().equals(other.getUserRoleId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER_ROLE
     *
     * @mbggenerated Mon Apr 11 20:11:16 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRoleId() == null) ? 0 : getUserRoleId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER_ROLE
     *
     * @mbggenerated Mon Apr 11 20:11:16 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", userId=").append(userId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}