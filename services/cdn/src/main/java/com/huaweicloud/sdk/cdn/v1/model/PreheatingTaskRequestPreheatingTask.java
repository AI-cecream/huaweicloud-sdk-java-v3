package com.huaweicloud.sdk.cdn.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * request
 */
public class PreheatingTaskRequestPreheatingTask  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="urls")
    
    private List<String> urls = null;
    
    public PreheatingTaskRequestPreheatingTask withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    
    public PreheatingTaskRequestPreheatingTask addUrlsItem(String urlsItem) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public PreheatingTaskRequestPreheatingTask withUrls(Consumer<List<String>> urlsSetter) {
        if(this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 预热urls
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PreheatingTaskRequestPreheatingTask preheatingTaskRequestPreheatingTask = (PreheatingTaskRequestPreheatingTask) o;
        return Objects.equals(this.urls, preheatingTaskRequestPreheatingTask.urls);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urls);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreheatingTaskRequestPreheatingTask {\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
