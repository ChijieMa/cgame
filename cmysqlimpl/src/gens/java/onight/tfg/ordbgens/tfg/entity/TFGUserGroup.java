package onight.tfg.ordbgens.tfg.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TFG_USER_GROUP")
@AllArgsConstructor
@NoArgsConstructor
public class TFGUserGroup extends TFGUserGroupKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFG_USER_GROUP.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFG_USER_GROUP.GROUP_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    private String groupId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFG_USER_GROUP.STATUS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    private String status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFG_USER_GROUP.USER_ID
     *
     * @return the value of TFG_USER_GROUP.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFG_USER_GROUP.USER_ID
     *
     * @param userId the value for TFG_USER_GROUP.USER_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFG_USER_GROUP.GROUP_ID
     *
     * @return the value of TFG_USER_GROUP.GROUP_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFG_USER_GROUP.GROUP_ID
     *
     * @param groupId the value for TFG_USER_GROUP.GROUP_ID
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFG_USER_GROUP.STATUS
     *
     * @return the value of TFG_USER_GROUP.STATUS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFG_USER_GROUP.STATUS
     *
     * @param status the value for TFG_USER_GROUP.STATUS
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_GROUP
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
        TFGUserGroup other = (TFGUserGroup) that;
        return (this.getUserGroupId() == null ? other.getUserGroupId() == null : this.getUserGroupId().equals(other.getUserGroupId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_GROUP
     *
     * @mbggenerated Fri Apr 15 21:03:13 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserGroupId() == null) ? 0 : getUserGroupId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFG_USER_GROUP
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
        sb.append(", groupId=").append(groupId);
        sb.append(", status=").append(status);
        sb.append("]");
        return sb.toString();
    }
}