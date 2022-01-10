package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateDeploymentsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Deployment body;

    public CreateDeploymentsRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public CreateDeploymentsRequest withBody(Deployment body) {
        this.body = body;
        return this;
    }

    public CreateDeploymentsRequest withBody(Consumer<Deployment> bodySetter) {
        if (this.body == null) {
            this.body = new Deployment();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public Deployment getBody() {
        return body;
    }

    public void setBody(Deployment body) {
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
        CreateDeploymentsRequest createDeploymentsRequest = (CreateDeploymentsRequest) o;
        return Objects.equals(this.iefInstanceId, createDeploymentsRequest.iefInstanceId)
            && Objects.equals(this.body, createDeploymentsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iefInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentsRequest {\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
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