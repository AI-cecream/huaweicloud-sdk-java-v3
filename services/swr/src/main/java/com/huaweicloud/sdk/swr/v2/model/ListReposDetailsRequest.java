package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListReposDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    public ListReposDetailsRequest withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 组织名称。小写字母开头，后面跟小写字母、数字、小数点、下划线或中划线（其中下划线最多允许连续两个，小数点、下划线、中划线不能直接相连），小写字母或数字结尾，1-64个字符。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ListReposDetailsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 镜像仓库名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListReposDetailsRequest withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 镜像仓库分类，可设置为app_server, linux, framework_app, database, lang, other, windows, arm。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ListReposDetailsRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 注意：至少要传递一个filter参数。其中{center}为self或thirdparty，自己的镜像或第三方镜像，默认值为self。{namespace}为组织名称，模糊匹配。 {name}为镜像仓库名称，模糊匹配。{category}为镜像仓库分类，可设置为app_server、linux、framework_app、database、lang、other、windows、arm。 {limit}为返回条数,{offset}为起始索引，注意：offset和limit参数需要配套使用。{order_column}为按列排序，可设置为name、updated_time、tag_count,{order_type}为排序类型， 可设置为desc（降序）、asc（升序），注意：order_column和order_type参数需要配套使用。
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListReposDetailsRequest listReposDetailsRequest = (ListReposDetailsRequest) o;
        return Objects.equals(this.namespace, listReposDetailsRequest.namespace)
            && Objects.equals(this.name, listReposDetailsRequest.name)
            && Objects.equals(this.category, listReposDetailsRequest.category)
            && Objects.equals(this.filter, listReposDetailsRequest.filter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, name, category, filter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListReposDetailsRequest {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
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
