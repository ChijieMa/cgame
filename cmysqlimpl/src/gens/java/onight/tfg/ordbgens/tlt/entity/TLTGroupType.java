package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="TLT_GROUP_TYPE")
@AllArgsConstructor
@NoArgsConstructor
public class TLTGroupType extends TLTGroupTypeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_GROUP_TYPE.CN_NAME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String cnName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_GROUP_TYPE.EN_NAME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String enName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_GROUP_TYPE.REMARK
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_GROUP_TYPE.CN_NAME
     *
     * @return the value of TLT_GROUP_TYPE.CN_NAME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getCnName() {
        return cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_GROUP_TYPE.CN_NAME
     *
     * @param cnName the value for TLT_GROUP_TYPE.CN_NAME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_GROUP_TYPE.EN_NAME
     *
     * @return the value of TLT_GROUP_TYPE.EN_NAME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getEnName() {
        return enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_GROUP_TYPE.EN_NAME
     *
     * @param enName the value for TLT_GROUP_TYPE.EN_NAME
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setEnName(String enName) {
        this.enName = enName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_GROUP_TYPE.REMARK
     *
     * @return the value of TLT_GROUP_TYPE.REMARK
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_GROUP_TYPE.REMARK
     *
     * @param remark the value for TLT_GROUP_TYPE.REMARK
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_GROUP_TYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
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
        TLTGroupType other = (TLTGroupType) that;
        return (this.getGroupType() == null ? other.getGroupType() == null : this.getGroupType().equals(other.getGroupType()))
            && (this.getCnName() == null ? other.getCnName() == null : this.getCnName().equals(other.getCnName()))
            && (this.getEnName() == null ? other.getEnName() == null : this.getEnName().equals(other.getEnName()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_GROUP_TYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupType() == null) ? 0 : getGroupType().hashCode());
        result = prime * result + ((getCnName() == null) ? 0 : getCnName().hashCode());
        result = prime * result + ((getEnName() == null) ? 0 : getEnName().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_GROUP_TYPE
     *
     * @mbggenerated Fri Apr 15 21:03:14 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cnName=").append(cnName);
        sb.append(", enName=").append(enName);
        sb.append(", remark=").append(remark);
        sb.append("]");
        return sb.toString();
    }
}