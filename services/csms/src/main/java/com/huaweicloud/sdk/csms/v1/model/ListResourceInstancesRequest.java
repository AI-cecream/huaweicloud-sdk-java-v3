package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListResourceInstancesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_instances")

    private String resourceInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_id")

    private String versionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListResourceInstancesRequestBody body;

    public ListResourceInstancesRequest withResourceInstances(String resourceInstances) {
        this.resourceInstances = resourceInstances;
        return this;
    }

    /** 定值为resource_instances。
     * 
     * @return resourceInstances */
    public String getResourceInstances() {
        return resourceInstances;
    }

    public void setResourceInstances(String resourceInstances) {
        this.resourceInstances = resourceInstances;
    }

    public ListResourceInstancesRequest withVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }

    /** API版本号
     * 
     * @return versionId */
    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public ListResourceInstancesRequest withBody(ListResourceInstancesRequestBody body) {
        this.body = body;
        return this;
    }

    public ListResourceInstancesRequest withBody(Consumer<ListResourceInstancesRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListResourceInstancesRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ListResourceInstancesRequestBody getBody() {
        return body;
    }

    public void setBody(ListResourceInstancesRequestBody body) {
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
        ListResourceInstancesRequest listResourceInstancesRequest = (ListResourceInstancesRequest) o;
        return Objects.equals(this.resourceInstances, listResourceInstancesRequest.resourceInstances)
            && Objects.equals(this.versionId, listResourceInstancesRequest.versionId)
            && Objects.equals(this.body, listResourceInstancesRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceInstances, versionId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourceInstancesRequest {\n");
        sb.append("    resourceInstances: ").append(toIndentedString(resourceInstances)).append("\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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