package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskinfo")

    private TaskInfo taskinfo;

    public UpdateTaskResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /** code
     * 
     * @return code */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public UpdateTaskResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /** message
     * 
     * @return message */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UpdateTaskResponse withTaskinfo(TaskInfo taskinfo) {
        this.taskinfo = taskinfo;
        return this;
    }

    public UpdateTaskResponse withTaskinfo(Consumer<TaskInfo> taskinfoSetter) {
        if (this.taskinfo == null) {
            this.taskinfo = new TaskInfo();
            taskinfoSetter.accept(this.taskinfo);
        }

        return this;
    }

    /** Get taskinfo
     * 
     * @return taskinfo */
    public TaskInfo getTaskinfo() {
        return taskinfo;
    }

    public void setTaskinfo(TaskInfo taskinfo) {
        this.taskinfo = taskinfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskResponse updateTaskResponse = (UpdateTaskResponse) o;
        return Objects.equals(this.code, updateTaskResponse.code)
            && Objects.equals(this.message, updateTaskResponse.message)
            && Objects.equals(this.taskinfo, updateTaskResponse.taskinfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, taskinfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    taskinfo: ").append(toIndentedString(taskinfo)).append("\n");
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