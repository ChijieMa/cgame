package onight.tfg.ordbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="T_SYS_ROLE_ACTION")
@AllArgsConstructor
@NoArgsConstructor
public class TSysRoleAction extends TSysRoleActionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_ACTION.ACTION_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private Long actionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_ACTION.ROLE_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ROLE_ACTION.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private Long status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_ACTION.ACTION_ID
     *
     * @return the value of T_SYS_ROLE_ACTION.ACTION_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_ACTION.ACTION_ID
     *
     * @param actionId the value for T_SYS_ROLE_ACTION.ACTION_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_ACTION.ROLE_ID
     *
     * @return the value of T_SYS_ROLE_ACTION.ROLE_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_ACTION.ROLE_ID
     *
     * @param roleId the value for T_SYS_ROLE_ACTION.ROLE_ID
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ROLE_ACTION.STATUS
     *
     * @return the value of T_SYS_ROLE_ACTION.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ROLE_ACTION.STATUS
     *
     * @param status the value for T_SYS_ROLE_ACTION.STATUS
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
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
        TSysRoleAction other = (TSysRoleAction) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActionId() == null ? other.getActionId() == null : this.getActionId().equals(other.getActionId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActionId() == null) ? 0 : getActionId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ROLE_ACTION
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actionId=").append(actionId);
        sb.append(", roleId=").append(roleId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}