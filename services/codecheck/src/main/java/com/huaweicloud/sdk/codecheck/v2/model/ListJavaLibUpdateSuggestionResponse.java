package com.huaweicloud.sdk.codecheck.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.codecheck.v2.model.JavaReplaceLibInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListJavaLibUpdateSuggestionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<JavaReplaceLibInfo> body = null;
    
    public ListJavaLibUpdateSuggestionResponse withBody(List<JavaReplaceLibInfo> body) {
        this.body = body;
        return this;
    }

    
    public ListJavaLibUpdateSuggestionResponse addBodyItem(JavaReplaceLibInfo bodyItem) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public ListJavaLibUpdateSuggestionResponse withBody(Consumer<List<JavaReplaceLibInfo>> bodySetter) {
        if(this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    public List<JavaReplaceLibInfo> getBody() {
        return body;
    }

    public void setBody(List<JavaReplaceLibInfo> body) {
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
        ListJavaLibUpdateSuggestionResponse listJavaLibUpdateSuggestionResponse = (ListJavaLibUpdateSuggestionResponse) o;
        return Objects.equals(this.body, listJavaLibUpdateSuggestionResponse.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListJavaLibUpdateSuggestionResponse {\n");
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
