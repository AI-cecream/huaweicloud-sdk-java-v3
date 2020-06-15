package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.DownloadBackupFilesReq;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class ListBackupFileLinksRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="backup_id")
    
    private String backupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private DownloadBackupFilesReq body = null;

    public ListBackupFileLinksRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListBackupFileLinksRequest withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    


    /**
     * Get backupId
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    public ListBackupFileLinksRequest withBody(DownloadBackupFilesReq body) {
        this.body = body;
        return this;
    }

    public ListBackupFileLinksRequest withBody(Consumer<DownloadBackupFilesReq> bodySetter) {
        if(this.body == null ){
            this.body = new DownloadBackupFilesReq();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public DownloadBackupFilesReq getBody() {
        return body;
    }

    public void setBody(DownloadBackupFilesReq body) {
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
        ListBackupFileLinksRequest listBackupFileLinksRequest = (ListBackupFileLinksRequest) o;
        return Objects.equals(this.instanceId, listBackupFileLinksRequest.instanceId) &&
            Objects.equals(this.backupId, listBackupFileLinksRequest.backupId) &&
            Objects.equals(this.body, listBackupFileLinksRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, backupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackupFileLinksRequest {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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

