package onight.tfg.ordbgens.sys.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import onight.tfw.ojpa.api.annotations.Tab;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@Tab(name="T_SYS_PARAM")
@AllArgsConstructor
@NoArgsConstructor
public class TSysParam extends TSysParamKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.PARAM_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String paramType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.PARAM_VALUE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String paramValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.DSC
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String dsc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.CRT_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String crtTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.FIELD1
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String field1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.FIELD2
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String field2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_SYS_PARAM.FIELD3
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    private String field3;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.PARAM_TYPE
     *
     * @return the value of T_SYS_PARAM.PARAM_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.PARAM_TYPE
     *
     * @param paramType the value for T_SYS_PARAM.PARAM_TYPE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setParamType(String paramType) {
        this.paramType = paramType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.PARAM_VALUE
     *
     * @return the value of T_SYS_PARAM.PARAM_VALUE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.PARAM_VALUE
     *
     * @param paramValue the value for T_SYS_PARAM.PARAM_VALUE
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.DSC
     *
     * @return the value of T_SYS_PARAM.DSC
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getDsc() {
        return dsc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.DSC
     *
     * @param dsc the value for T_SYS_PARAM.DSC
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setDsc(String dsc) {
        this.dsc = dsc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.CRT_TIME
     *
     * @return the value of T_SYS_PARAM.CRT_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getCrtTime() {
        return crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.CRT_TIME
     *
     * @param crtTime the value for T_SYS_PARAM.CRT_TIME
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setCrtTime(String crtTime) {
        this.crtTime = crtTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.FIELD1
     *
     * @return the value of T_SYS_PARAM.FIELD1
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getField1() {
        return field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.FIELD1
     *
     * @param field1 the value for T_SYS_PARAM.FIELD1
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setField1(String field1) {
        this.field1 = field1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.FIELD2
     *
     * @return the value of T_SYS_PARAM.FIELD2
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getField2() {
        return field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.FIELD2
     *
     * @param field2 the value for T_SYS_PARAM.FIELD2
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setField2(String field2) {
        this.field2 = field2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_SYS_PARAM.FIELD3
     *
     * @return the value of T_SYS_PARAM.FIELD3
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public String getField3() {
        return field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_SYS_PARAM.FIELD3
     *
     * @param field3 the value for T_SYS_PARAM.FIELD3
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    public void setField3(String field3) {
        this.field3 = field3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_PARAM
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
        TSysParam other = (TSysParam) that;
        return (this.getParamId() == null ? other.getParamId() == null : this.getParamId().equals(other.getParamId()))
            && (this.getParamType() == null ? other.getParamType() == null : this.getParamType().equals(other.getParamType()))
            && (this.getParamValue() == null ? other.getParamValue() == null : this.getParamValue().equals(other.getParamValue()))
            && (this.getDsc() == null ? other.getDsc() == null : this.getDsc().equals(other.getDsc()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getField1() == null ? other.getField1() == null : this.getField1().equals(other.getField1()))
            && (this.getField2() == null ? other.getField2() == null : this.getField2().equals(other.getField2()))
            && (this.getField3() == null ? other.getField3() == null : this.getField3().equals(other.getField3()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_PARAM
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getParamId() == null) ? 0 : getParamId().hashCode());
        result = prime * result + ((getParamType() == null) ? 0 : getParamType().hashCode());
        result = prime * result + ((getParamValue() == null) ? 0 : getParamValue().hashCode());
        result = prime * result + ((getDsc() == null) ? 0 : getDsc().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getField1() == null) ? 0 : getField1().hashCode());
        result = prime * result + ((getField2() == null) ? 0 : getField2().hashCode());
        result = prime * result + ((getField3() == null) ? 0 : getField3().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SYS_PARAM
     *
     * @mbggenerated Mon Apr 11 20:11:18 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", paramType=").append(paramType);
        sb.append(", paramValue=").append(paramValue);
        sb.append(", dsc=").append(dsc);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", field1=").append(field1);
        sb.append(", field2=").append(field2);
        sb.append(", field3=").append(field3);
        sb.append("]");
        return sb.toString();
    }
}