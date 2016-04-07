package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_USER_BANK")
@AllArgsConstructor
@NoArgsConstructor
public class TLTUserBank extends TLTUserBankKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.USER_ID
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.BANK_CODE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private String bankCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.BANK_NAME
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private String bankName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.USERNAME
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.ACCOUNT
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private String account;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.MOBILE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.PASSWORD
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_USER_BANK.ENABLE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    private Boolean enable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.USER_ID
     *
     * @return the value of TLT_USER_BANK.USER_ID
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.USER_ID
     *
     * @param userId the value for TLT_USER_BANK.USER_ID
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.BANK_CODE
     *
     * @return the value of TLT_USER_BANK.BANK_CODE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.BANK_CODE
     *
     * @param bankCode the value for TLT_USER_BANK.BANK_CODE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.BANK_NAME
     *
     * @return the value of TLT_USER_BANK.BANK_NAME
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.BANK_NAME
     *
     * @param bankName the value for TLT_USER_BANK.BANK_NAME
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.USERNAME
     *
     * @return the value of TLT_USER_BANK.USERNAME
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.USERNAME
     *
     * @param username the value for TLT_USER_BANK.USERNAME
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.ACCOUNT
     *
     * @return the value of TLT_USER_BANK.ACCOUNT
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.ACCOUNT
     *
     * @param account the value for TLT_USER_BANK.ACCOUNT
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.MOBILE
     *
     * @return the value of TLT_USER_BANK.MOBILE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.MOBILE
     *
     * @param mobile the value for TLT_USER_BANK.MOBILE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.PASSWORD
     *
     * @return the value of TLT_USER_BANK.PASSWORD
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.PASSWORD
     *
     * @param password the value for TLT_USER_BANK.PASSWORD
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_USER_BANK.ENABLE
     *
     * @return the value of TLT_USER_BANK.ENABLE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_USER_BANK.ENABLE
     *
     * @param enable the value for TLT_USER_BANK.ENABLE
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
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
        TLTUserBank other = (TLTUserBank) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBankCode() == null ? other.getBankCode() == null : this.getBankCode().equals(other.getBankCode()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBankCode() == null) ? 0 : getBankCode().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_USER_BANK
     *
     * @mbggenerated Thu Apr 07 10:12:36 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", bankCode=").append(bankCode);
        sb.append(", bankName=").append(bankName);
        sb.append(", username=").append(username);
        sb.append(", account=").append(account);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", enable=").append(enable);
        sb.append("]");
        return sb.toString();
    }
}