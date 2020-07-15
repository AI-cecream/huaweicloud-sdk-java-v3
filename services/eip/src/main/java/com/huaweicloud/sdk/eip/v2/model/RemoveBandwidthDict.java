package com.huaweicloud.sdk.eip.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.eip.v2.model.RemovePublicipInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 带宽对象
 */
public class RemoveBandwidthDict  {

    /**
     * 弹性公网IP从共享带宽移除后，会为此弹性公网IP创建独占带宽进行计费。  此参数表示弹性公网IP从共享带宽移除后，使用的独占带宽的计费类型。（bandwidth/traffic）
     */
    public static class ChargeModeEnum {

        
        /**
         * Enum BANDWIDTH for value: "bandwidth"
         */
        public static final ChargeModeEnum BANDWIDTH = new ChargeModeEnum("bandwidth");
        
        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final ChargeModeEnum TRAFFIC = new ChargeModeEnum("traffic");
        

        public static final Map<String, ChargeModeEnum> staticFields = new HashMap<String, ChargeModeEnum>() {
            { 
                put("bandwidth", BANDWIDTH);
                put("traffic", TRAFFIC);
            }
        };

        private String value;

        ChargeModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChargeModeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ChargeModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ChargeModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ChargeModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ChargeModeEnum) {
                return this.value.equals(((ChargeModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="charge_mode")
    
    private ChargeModeEnum chargeMode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publicip_info")
    
    private List<RemovePublicipInfo> publicipInfo = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;

    public RemoveBandwidthDict withChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
        return this;
    }

    


    /**
     * 弹性公网IP从共享带宽移除后，会为此弹性公网IP创建独占带宽进行计费。  此参数表示弹性公网IP从共享带宽移除后，使用的独占带宽的计费类型。（bandwidth/traffic）
     * @return chargeMode
     */
    public ChargeModeEnum getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(ChargeModeEnum chargeMode) {
        this.chargeMode = chargeMode;
    }

    public RemoveBandwidthDict withPublicipInfo(List<RemovePublicipInfo> publicipInfo) {
        this.publicipInfo = publicipInfo;
        return this;
    }

    
    public RemoveBandwidthDict addPublicipInfoItem(RemovePublicipInfo publicipInfoItem) {
        this.publicipInfo.add(publicipInfoItem);
        return this;
    }

    public RemoveBandwidthDict withPublicipInfo(Consumer<List<RemovePublicipInfo>> publicipInfoSetter) {
        if(this.publicipInfo == null ){
            this.publicipInfo = new ArrayList<>();
        }
        publicipInfoSetter.accept(this.publicipInfo);
        return this;
    }

    /**
     * 功能说明：要从共享带宽中移除的弹性公网IP或者IPv6端口信息  约束：WHOLE类型的带宽支持多个弹性公网IP或者IPv6端口，跟租户的配额相关，默认一个共享带宽的配额为20
     * @return publicipInfo
     */
    public List<RemovePublicipInfo> getPublicipInfo() {
        return publicipInfo;
    }

    public void setPublicipInfo(List<RemovePublicipInfo> publicipInfo) {
        this.publicipInfo = publicipInfo;
    }

    public RemoveBandwidthDict withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 弹性公网IP从共享带宽移除后，会为此弹性公网IP创建独占带宽进行计费。  此参数表示弹性公网IP从共享带宽移除后，使用的独占带宽的带宽大小。（M）取值范围：默认为1~2000Mbit/s. 可能因为局点配置不同而不同。也跟带宽的计费模式（bandwidth/traffic）相关。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RemoveBandwidthDict removeBandwidthDict = (RemoveBandwidthDict) o;
        return Objects.equals(this.chargeMode, removeBandwidthDict.chargeMode) &&
            Objects.equals(this.publicipInfo, removeBandwidthDict.publicipInfo) &&
            Objects.equals(this.size, removeBandwidthDict.size);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chargeMode, publicipInfo, size);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemoveBandwidthDict {\n");
        sb.append("    chargeMode: ").append(toIndentedString(chargeMode)).append("\n");
        sb.append("    publicipInfo: ").append(toIndentedString(publicipInfo)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
