package com.huaweicloud.sdk.classroom.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListMemberJobRecordsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exercise_id")

    private String exerciseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_id")

    private String memberId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListMemberJobRecordsRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListMemberJobRecordsRequest withExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
        return this;
    }

    /**
     * 习题ID
     * @return exerciseId
     */
    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public ListMemberJobRecordsRequest withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    /**
     * 用户ID
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ListMemberJobRecordsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 信息记录的起始编号
     * minimum: 1
     * maximum: 1000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListMemberJobRecordsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页包含的信息记录数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMemberJobRecordsRequest listMemberJobRecordsRequest = (ListMemberJobRecordsRequest) o;
        return Objects.equals(this.jobId, listMemberJobRecordsRequest.jobId)
            && Objects.equals(this.exerciseId, listMemberJobRecordsRequest.exerciseId)
            && Objects.equals(this.memberId, listMemberJobRecordsRequest.memberId)
            && Objects.equals(this.offset, listMemberJobRecordsRequest.offset)
            && Objects.equals(this.limit, listMemberJobRecordsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, exerciseId, memberId, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMemberJobRecordsRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    exerciseId: ").append(toIndentedString(exerciseId)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
