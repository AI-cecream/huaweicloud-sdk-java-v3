package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 后端服务器监听器粒度的健康检查结果
 */
public class ListenerMemberInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

    private String operatingStatus;

    public ListenerMemberInfo withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 后端服务器关联的监听器id。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public ListenerMemberInfo withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    /**
     * 后端云服务器的健康状态。取值：  ONLINE：后端云服务器正常。 NO_MONITOR：后端云服务器所在的服务器组没有健康检查器。 OFFLINE：后端云服务器关联的ECS服务器不存在或已关机或服务异常。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListenerMemberInfo listenerMemberInfo = (ListenerMemberInfo) o;
        return Objects.equals(this.listenerId, listenerMemberInfo.listenerId)
            && Objects.equals(this.operatingStatus, listenerMemberInfo.operatingStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerId, operatingStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerMemberInfo {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
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
