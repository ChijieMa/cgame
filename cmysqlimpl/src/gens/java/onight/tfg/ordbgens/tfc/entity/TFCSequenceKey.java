package onight.tfg.ordbgens.tfc.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TFCSequenceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TFC_SEQUENCE.NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TFC_SEQUENCE.NAME
     *
     * @return the value of TFC_SEQUENCE.NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TFC_SEQUENCE.NAME
     *
     * @param name the value for TFC_SEQUENCE.NAME
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
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
        TFCSequenceKey other = (TFCSequenceKey) that;
        return (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TFC_SEQUENCE
     *
     * @mbggenerated Sat Apr 16 00:19:00 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }
}