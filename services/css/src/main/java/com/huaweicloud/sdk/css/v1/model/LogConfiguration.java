package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** LogConfiguration */
public class LogConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterId")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obsBucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateAt")

    private Long updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "basePath")

    private String basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoEnable")

    private Boolean autoEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period")

    private String period;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logSwitch")

    private Boolean logSwitch;

    public LogConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /** ID。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LogConfiguration withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /** 集群ID。
     * 
     * @return clusterId */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public LogConfiguration withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /** OBS桶。
     * 
     * @return obsBucket */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public LogConfiguration withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /** IAM 委托。
     * 
     * @return agency */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public LogConfiguration withUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /** 更新时间。
     * 
     * @return updateAt */
    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public LogConfiguration withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /** 备份路径。
     * 
     * @return basePath */
    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public LogConfiguration withAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
        return this;
    }

    /** 自动备份开关。
     * 
     * @return autoEnable */
    public Boolean getAutoEnable() {
        return autoEnable;
    }

    public void setAutoEnable(Boolean autoEnable) {
        this.autoEnable = autoEnable;
    }

    public LogConfiguration withPeriod(String period) {
        this.period = period;
        return this;
    }

    /** 备份开始时间。
     * 
     * @return period */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public LogConfiguration withLogSwitch(Boolean logSwitch) {
        this.logSwitch = logSwitch;
        return this;
    }

    /** 日志开关。
     * 
     * @return logSwitch */
    public Boolean getLogSwitch() {
        return logSwitch;
    }

    public void setLogSwitch(Boolean logSwitch) {
        this.logSwitch = logSwitch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LogConfiguration logConfiguration = (LogConfiguration) o;
        return Objects.equals(this.id, logConfiguration.id)
            && Objects.equals(this.clusterId, logConfiguration.clusterId)
            && Objects.equals(this.obsBucket, logConfiguration.obsBucket)
            && Objects.equals(this.agency, logConfiguration.agency)
            && Objects.equals(this.updateAt, logConfiguration.updateAt)
            && Objects.equals(this.basePath, logConfiguration.basePath)
            && Objects.equals(this.autoEnable, logConfiguration.autoEnable)
            && Objects.equals(this.period, logConfiguration.period)
            && Objects.equals(this.logSwitch, logConfiguration.logSwitch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clusterId, obsBucket, agency, updateAt, basePath, autoEnable, period, logSwitch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogConfiguration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    autoEnable: ").append(toIndentedString(autoEnable)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    logSwitch: ").append(toIndentedString(logSwitch)).append("\n");
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