package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateWatermarkTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private Integer templateId;

    public CreateWatermarkTemplateResponse withTemplateId(Integer templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 水印模板Id
     * minimum: 0
     * maximum: 2147483647
     * @return templateId
     */
    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateWatermarkTemplateResponse createWatermarkTemplateResponse = (CreateWatermarkTemplateResponse) o;
        return Objects.equals(this.templateId, createWatermarkTemplateResponse.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateWatermarkTemplateResponse {\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
