package onight.tfg.ordbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TSysActionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_ACTION.ACTION_ID
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    private Long actionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_ACTION.ACTION_ID
     *
     * @return the value of T_SYS_ACTION.ACTION_ID
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public Long getActionId() {
        return actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_ACTION.ACTION_ID
     *
     * @param actionId the value for T_SYS_ACTION.ACTION_ID
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    public void setActionId(Long actionId) {
        this.actionId = actionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
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
        TSysActionKey other = (TSysActionKey) that;
        return (this.getActionId() == null ? other.getActionId() == null : this.getActionId().equals(other.getActionId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getActionId() == null) ? 0 : getActionId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_ACTION
     *
     * @mbggenerated Sat Apr 16 13:41:11 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", actionId=").append(actionId);
        sb.append("]");
        return sb.toString();
    }
}