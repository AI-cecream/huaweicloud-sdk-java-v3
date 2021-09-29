package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateMixJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Authorization")

    private String authorization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")

    private String xSdkDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateMixJobReq body;

    public UpdateMixJobRequest withAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /** 使用AK/SK方式认证时必选，携带的鉴权信息。
     * 
     * @return authorization */
    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public UpdateMixJobRequest withXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
        return this;
    }

    /** 使用AK/SK方式认证时必选，请求的发生时间。
     * 
     * @return xSdkDate */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Sdk-Date")
    public String getXSdkDate() {
        return xSdkDate;
    }

    public void setXSdkDate(String xSdkDate) {
        this.xSdkDate = xSdkDate;
    }

    public UpdateMixJobRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /** 使用AK/SK方式认证时必选，携带项目ID信息。
     * 
     * @return xProjectId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public UpdateMixJobRequest withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /** 应用id
     * 
     * @return appId */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public UpdateMixJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务编号
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public UpdateMixJobRequest withBody(UpdateMixJobReq body) {
        this.body = body;
        return this;
    }

    public UpdateMixJobRequest withBody(Consumer<UpdateMixJobReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateMixJobReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public UpdateMixJobReq getBody() {
        return body;
    }

    public void setBody(UpdateMixJobReq body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateMixJobRequest updateMixJobRequest = (UpdateMixJobRequest) o;
        return Objects.equals(this.authorization, updateMixJobRequest.authorization)
            && Objects.equals(this.xSdkDate, updateMixJobRequest.xSdkDate)
            && Objects.equals(this.xProjectId, updateMixJobRequest.xProjectId)
            && Objects.equals(this.appId, updateMixJobRequest.appId)
            && Objects.equals(this.jobId, updateMixJobRequest.jobId)
            && Objects.equals(this.body, updateMixJobRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorization, xSdkDate, xProjectId, appId, jobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMixJobRequest {\n");
        sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
        sb.append("    xSdkDate: ").append(toIndentedString(xSdkDate)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}