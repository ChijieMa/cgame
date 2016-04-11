package onight.tfg.ordbgens.tlt.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class TLTIssueKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TLT_ISSUE.ISSUE_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    private Long issueId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TLT_ISSUE.ISSUE_ID
     *
     * @return the value of TLT_ISSUE.ISSUE_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public Long getIssueId() {
        return issueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TLT_ISSUE.ISSUE_ID
     *
     * @param issueId the value for TLT_ISSUE.ISSUE_ID
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
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
        TLTIssueKey other = (TLTIssueKey) that;
        return (this.getIssueId() == null ? other.getIssueId() == null : this.getIssueId().equals(other.getIssueId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIssueId() == null) ? 0 : getIssueId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TLT_ISSUE
     *
     * @mbggenerated Mon Apr 11 14:17:27 CST 2016
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", issueId=").append(issueId);
        sb.append("]");
        return sb.toString();
    }
}