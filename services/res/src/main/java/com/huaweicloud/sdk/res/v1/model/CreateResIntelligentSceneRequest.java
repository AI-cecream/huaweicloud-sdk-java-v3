package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateResIntelligentSceneRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateResIntelligentSceneRequestNBody body;

    public CreateResIntelligentSceneRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public CreateResIntelligentSceneRequest withBody(CreateResIntelligentSceneRequestNBody body) {
        this.body = body;
        return this;
    }

    public CreateResIntelligentSceneRequest withBody(Consumer<CreateResIntelligentSceneRequestNBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateResIntelligentSceneRequestNBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateResIntelligentSceneRequestNBody getBody() {
        return body;
    }

    public void setBody(CreateResIntelligentSceneRequestNBody body) {
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
        CreateResIntelligentSceneRequest createResIntelligentSceneRequest = (CreateResIntelligentSceneRequest) o;
        return Objects.equals(this.workspaceId, createResIntelligentSceneRequest.workspaceId)
            && Objects.equals(this.body, createResIntelligentSceneRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspaceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateResIntelligentSceneRequest {\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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