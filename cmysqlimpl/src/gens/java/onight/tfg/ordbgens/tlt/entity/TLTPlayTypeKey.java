package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TLTPlayTypeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_PLAY_TYPE.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:43 CST 2016
     */
    private String playType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_PLAY_TYPE.PLAY_TYPE
     *
     * @return the value of TLT_PLAY_TYPE.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:43 CST 2016
     */
    public String getPlayType() {
        return playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_PLAY_TYPE.PLAY_TYPE
     *
     * @param playType the value for TLT_PLAY_TYPE.PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:43 CST 2016
     */
    public void setPlayType(String playType) {
        this.playType = playType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:43 CST 2016
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
        TLTPlayTypeKey other = (TLTPlayTypeKey) that;
        return (this.getPlayType() == null ? other.getPlayType() == null : this.getPlayType().equals(other.getPlayType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:43 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlayType() == null) ? 0 : getPlayType().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_PLAY_TYPE
     *
     * @mbggenerated Thu Apr 14 00:04:43 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", playType=").append(playType);
        sb.append("]");
        return sb.toString();
    }
}