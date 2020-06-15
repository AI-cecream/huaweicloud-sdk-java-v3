package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.Whitelist;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 设置IP白名单结构体
 */
public class ModifyIpWhitelistBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enable_whitelist")
    
    private Boolean enableWhitelist;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="whitelist")
    
    private List<Whitelist> whitelist = new ArrayList<>();
    
    public ModifyIpWhitelistBody withEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
        return this;
    }

    


    /**
     * 是否启用白名单（true/false）。
     * @return enableWhitelist
     */
    public Boolean getEnableWhitelist() {
        return enableWhitelist;
    }

    public void setEnableWhitelist(Boolean enableWhitelist) {
        this.enableWhitelist = enableWhitelist;
    }

    public ModifyIpWhitelistBody withWhitelist(List<Whitelist> whitelist) {
        this.whitelist = whitelist;
        return this;
    }

    
    public ModifyIpWhitelistBody addWhitelistItem(Whitelist whitelistItem) {
        this.whitelist.add(whitelistItem);
        return this;
    }

    public ModifyIpWhitelistBody withWhitelist(Consumer<List<Whitelist>> whitelistSetter) {
        if(this.whitelist == null ){
            this.whitelist = new ArrayList<>();
        }
        whitelistSetter.accept(this.whitelist);
        return this;
    }

    /**
     * IP白名单分组列表。
     * @return whitelist
     */
    public List<Whitelist> getWhitelist() {
        return whitelist;
    }

    public void setWhitelist(List<Whitelist> whitelist) {
        this.whitelist = whitelist;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyIpWhitelistBody modifyIpWhitelistBody = (ModifyIpWhitelistBody) o;
        return Objects.equals(this.enableWhitelist, modifyIpWhitelistBody.enableWhitelist) &&
            Objects.equals(this.whitelist, modifyIpWhitelistBody.whitelist);
    }
    @Override
    public int hashCode() {
        return Objects.hash(enableWhitelist, whitelist);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyIpWhitelistBody {\n");
            sb.append("    enableWhitelist: ").append(toIndentedString(enableWhitelist)).append("\n");
            sb.append("    whitelist: ").append(toIndentedString(whitelist)).append("\n");
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

