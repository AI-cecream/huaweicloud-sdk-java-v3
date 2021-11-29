package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class DeleteMemberGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_id")

    private String memberGroupId;

    public DeleteMemberGroupRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteMemberGroupRequest withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /** VPC通道的编号
     * 
     * @return vpcChannelId */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    public DeleteMemberGroupRequest withMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
        return this;
    }

    /** VPC通道后端服务器组编号
     * 
     * @return memberGroupId */
    public String getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteMemberGroupRequest deleteMemberGroupRequest = (DeleteMemberGroupRequest) o;
        return Objects.equals(this.instanceId, deleteMemberGroupRequest.instanceId)
            && Objects.equals(this.vpcChannelId, deleteMemberGroupRequest.vpcChannelId)
            && Objects.equals(this.memberGroupId, deleteMemberGroupRequest.memberGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, vpcChannelId, memberGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMemberGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    memberGroupId: ").append(toIndentedString(memberGroupId)).append("\n");
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
