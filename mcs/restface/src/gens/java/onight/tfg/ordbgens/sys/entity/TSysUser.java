package onight.tfg.ordbgens.sys.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="T_SYS_USER")
@AllArgsConstructor
@NoArgsConstructor
public class TSysUser extends TSysUserKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.BRANCH_ID
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String branchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.LOGIN_NAME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.USER_NAME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.MOBILE
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.USER_WORKADDRESS
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String userWorkaddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.STATUS
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.PASSWORD
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.UPDATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.CREATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.CREATED_BY
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String createdBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.MODIFIED_BY
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String modifiedBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.EMAIL
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.DATA_ENVIRON
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private Integer dataEnviron;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_USER.ICON
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    private String icon;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.BRANCH_ID
     *
     * @return the value of T_SYS_USER.BRANCH_ID
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.BRANCH_ID
     *
     * @param branchId the value for T_SYS_USER.BRANCH_ID
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.LOGIN_NAME
     *
     * @return the value of T_SYS_USER.LOGIN_NAME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.LOGIN_NAME
     *
     * @param loginName the value for T_SYS_USER.LOGIN_NAME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.USER_NAME
     *
     * @return the value of T_SYS_USER.USER_NAME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.USER_NAME
     *
     * @param userName the value for T_SYS_USER.USER_NAME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.MOBILE
     *
     * @return the value of T_SYS_USER.MOBILE
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.MOBILE
     *
     * @param mobile the value for T_SYS_USER.MOBILE
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.USER_WORKADDRESS
     *
     * @return the value of T_SYS_USER.USER_WORKADDRESS
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getUserWorkaddress() {
        return userWorkaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.USER_WORKADDRESS
     *
     * @param userWorkaddress the value for T_SYS_USER.USER_WORKADDRESS
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setUserWorkaddress(String userWorkaddress) {
        this.userWorkaddress = userWorkaddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.STATUS
     *
     * @return the value of T_SYS_USER.STATUS
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.STATUS
     *
     * @param status the value for T_SYS_USER.STATUS
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.PASSWORD
     *
     * @return the value of T_SYS_USER.PASSWORD
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.PASSWORD
     *
     * @param password the value for T_SYS_USER.PASSWORD
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.UPDATE_TIME
     *
     * @return the value of T_SYS_USER.UPDATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.UPDATE_TIME
     *
     * @param updateTime the value for T_SYS_USER.UPDATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.CREATE_TIME
     *
     * @return the value of T_SYS_USER.CREATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.CREATE_TIME
     *
     * @param createTime the value for T_SYS_USER.CREATE_TIME
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.CREATED_BY
     *
     * @return the value of T_SYS_USER.CREATED_BY
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.CREATED_BY
     *
     * @param createdBy the value for T_SYS_USER.CREATED_BY
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.MODIFIED_BY
     *
     * @return the value of T_SYS_USER.MODIFIED_BY
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getModifiedBy() {
        return modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.MODIFIED_BY
     *
     * @param modifiedBy the value for T_SYS_USER.MODIFIED_BY
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.EMAIL
     *
     * @return the value of T_SYS_USER.EMAIL
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.EMAIL
     *
     * @param email the value for T_SYS_USER.EMAIL
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.DATA_ENVIRON
     *
     * @return the value of T_SYS_USER.DATA_ENVIRON
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public Integer getDataEnviron() {
        return dataEnviron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.DATA_ENVIRON
     *
     * @param dataEnviron the value for T_SYS_USER.DATA_ENVIRON
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setDataEnviron(Integer dataEnviron) {
        this.dataEnviron = dataEnviron;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_USER.ICON
     *
     * @return the value of T_SYS_USER.ICON
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_USER.ICON
     *
     * @param icon the value for T_SYS_USER.ICON
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
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
        TSysUser other = (TSysUser) that;
        return (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBranchId() == null ? other.getBranchId() == null : this.getBranchId().equals(other.getBranchId()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getUserWorkaddress() == null ? other.getUserWorkaddress() == null : this.getUserWorkaddress().equals(other.getUserWorkaddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getModifiedBy() == null ? other.getModifiedBy() == null : this.getModifiedBy().equals(other.getModifiedBy()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getDataEnviron() == null ? other.getDataEnviron() == null : this.getDataEnviron().equals(other.getDataEnviron()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBranchId() == null) ? 0 : getBranchId().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getUserWorkaddress() == null) ? 0 : getUserWorkaddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getModifiedBy() == null) ? 0 : getModifiedBy().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getDataEnviron() == null) ? 0 : getDataEnviron().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_USER
     *
     * @mbggenerated Thu Apr 14 00:04:39 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", branchId=").append(branchId);
        sb.append(", loginName=").append(loginName);
        sb.append(", userName=").append(userName);
        sb.append(", mobile=").append(mobile);
        sb.append(", userWorkaddress=").append(userWorkaddress);
        sb.append(", status=").append(status);
        sb.append(", password=").append(password);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", modifiedBy=").append(modifiedBy);
        sb.append(", email=").append(email);
        sb.append(", dataEnviron=").append(dataEnviron);
        sb.append(", icon=").append(icon);
        sb.append("]");
        return sb.toString();
    }
}