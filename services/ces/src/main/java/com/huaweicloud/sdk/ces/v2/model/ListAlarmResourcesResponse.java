package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListAlarmResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resources")

    private List<List<Dimension>> resources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListAlarmResourcesResponse withResources(List<List<Dimension>> resources) {
        this.resources = resources;
        return this;
    }

    public ListAlarmResourcesResponse addResourcesItem(List<Dimension> resourcesItem) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        this.resources.add(resourcesItem);
        return this;
    }

    public ListAlarmResourcesResponse withResources(Consumer<List<List<Dimension>>> resourcesSetter) {
        if (this.resources == null) {
            this.resources = new ArrayList<>();
        }
        resourcesSetter.accept(this.resources);
        return this;
    }

    /** 资源信息
     * 
     * @return resources */
    public List<List<Dimension>> getResources() {
        return resources;
    }

    public void setResources(List<List<Dimension>> resources) {
        this.resources = resources;
    }

    public ListAlarmResourcesResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 资源总数
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAlarmResourcesResponse listAlarmResourcesResponse = (ListAlarmResourcesResponse) o;
        return Objects.equals(this.resources, listAlarmResourcesResponse.resources)
            && Objects.equals(this.count, listAlarmResourcesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmResourcesResponse {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
