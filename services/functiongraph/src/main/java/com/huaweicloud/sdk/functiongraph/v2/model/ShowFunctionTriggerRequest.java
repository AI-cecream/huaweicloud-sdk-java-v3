package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowFunctionTriggerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "function_urn")

    private String functionUrn;

    /**
     * Gets or Sets triggerTypeCode
     */
    public static final class TriggerTypeCodeEnum {

        /**
         * Enum TIMER for value: "TIMER"
         */
        public static final TriggerTypeCodeEnum TIMER = new TriggerTypeCodeEnum("TIMER");

        /**
         * Enum APIG for value: "APIG"
         */
        public static final TriggerTypeCodeEnum APIG = new TriggerTypeCodeEnum("APIG");

        /**
         * Enum CTS for value: "CTS"
         */
        public static final TriggerTypeCodeEnum CTS = new TriggerTypeCodeEnum("CTS");

        /**
         * Enum DDS for value: "DDS"
         */
        public static final TriggerTypeCodeEnum DDS = new TriggerTypeCodeEnum("DDS");

        /**
         * Enum DMS for value: "DMS"
         */
        public static final TriggerTypeCodeEnum DMS = new TriggerTypeCodeEnum("DMS");

        /**
         * Enum DIS for value: "DIS"
         */
        public static final TriggerTypeCodeEnum DIS = new TriggerTypeCodeEnum("DIS");

        /**
         * Enum LTS for value: "LTS"
         */
        public static final TriggerTypeCodeEnum LTS = new TriggerTypeCodeEnum("LTS");

        /**
         * Enum OBS for value: "OBS"
         */
        public static final TriggerTypeCodeEnum OBS = new TriggerTypeCodeEnum("OBS");

        /**
         * Enum SMN for value: "SMN"
         */
        public static final TriggerTypeCodeEnum SMN = new TriggerTypeCodeEnum("SMN");

        /**
         * Enum KAFKA for value: "KAFKA"
         */
        public static final TriggerTypeCodeEnum KAFKA = new TriggerTypeCodeEnum("KAFKA");

        private static final Map<String, TriggerTypeCodeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TriggerTypeCodeEnum> createStaticFields() {
            Map<String, TriggerTypeCodeEnum> map = new HashMap<>();
            map.put("TIMER", TIMER);
            map.put("APIG", APIG);
            map.put("CTS", CTS);
            map.put("DDS", DDS);
            map.put("DMS", DMS);
            map.put("DIS", DIS);
            map.put("LTS", LTS);
            map.put("OBS", OBS);
            map.put("SMN", SMN);
            map.put("KAFKA", KAFKA);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TriggerTypeCodeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TriggerTypeCodeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeCodeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TriggerTypeCodeEnum(value);
            }
            return result;
        }

        public static TriggerTypeCodeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TriggerTypeCodeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TriggerTypeCodeEnum) {
                return this.value.equals(((TriggerTypeCodeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type_code")

    private TriggerTypeCodeEnum triggerTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_id")

    private String triggerId;

    public ShowFunctionTriggerRequest withFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
        return this;
    }

    /**
     * 函数的URN，详细解释见FunctionGraph函数模型的描述。
     * @return functionUrn
     */
    public String getFunctionUrn() {
        return functionUrn;
    }

    public void setFunctionUrn(String functionUrn) {
        this.functionUrn = functionUrn;
    }

    public ShowFunctionTriggerRequest withTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
        return this;
    }

    /**
     * Get triggerTypeCode
     * @return triggerTypeCode
     */
    public TriggerTypeCodeEnum getTriggerTypeCode() {
        return triggerTypeCode;
    }

    public void setTriggerTypeCode(TriggerTypeCodeEnum triggerTypeCode) {
        this.triggerTypeCode = triggerTypeCode;
    }

    public ShowFunctionTriggerRequest withTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }

    /**
     * Get triggerId
     * @return triggerId
     */
    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowFunctionTriggerRequest showFunctionTriggerRequest = (ShowFunctionTriggerRequest) o;
        return Objects.equals(this.functionUrn, showFunctionTriggerRequest.functionUrn)
            && Objects.equals(this.triggerTypeCode, showFunctionTriggerRequest.triggerTypeCode)
            && Objects.equals(this.triggerId, showFunctionTriggerRequest.triggerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionUrn, triggerTypeCode, triggerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFunctionTriggerRequest {\n");
        sb.append("    functionUrn: ").append(toIndentedString(functionUrn)).append("\n");
        sb.append("    triggerTypeCode: ").append(toIndentedString(triggerTypeCode)).append("\n");
        sb.append("    triggerId: ").append(toIndentedString(triggerId)).append("\n");
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
