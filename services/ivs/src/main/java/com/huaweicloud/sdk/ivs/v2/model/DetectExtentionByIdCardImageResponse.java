package com.huaweicloud.sdk.ivs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DetectExtentionByIdCardImageResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private Meta meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private IvsExtentionByIdCardImageResponseBodyResult result;

    public DetectExtentionByIdCardImageResponse withMeta(Meta meta) {
        this.meta = meta;
        return this;
    }

    public DetectExtentionByIdCardImageResponse withMeta(Consumer<Meta> metaSetter) {
        if (this.meta == null) {
            this.meta = new Meta();
            metaSetter.accept(this.meta);
        }

        return this;
    }

    /**
     * Get meta
     * @return meta
     */
    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public DetectExtentionByIdCardImageResponse withResult(IvsExtentionByIdCardImageResponseBodyResult result) {
        this.result = result;
        return this;
    }

    public DetectExtentionByIdCardImageResponse withResult(
        Consumer<IvsExtentionByIdCardImageResponseBodyResult> resultSetter) {
        if (this.result == null) {
            this.result = new IvsExtentionByIdCardImageResponseBodyResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public IvsExtentionByIdCardImageResponseBodyResult getResult() {
        return result;
    }

    public void setResult(IvsExtentionByIdCardImageResponseBodyResult result) {
        this.result = result;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetectExtentionByIdCardImageResponse detectExtentionByIdCardImageResponse =
            (DetectExtentionByIdCardImageResponse) o;
        return Objects.equals(this.meta, detectExtentionByIdCardImageResponse.meta)
            && Objects.equals(this.result, detectExtentionByIdCardImageResponse.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meta, result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectExtentionByIdCardImageResponse {\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
