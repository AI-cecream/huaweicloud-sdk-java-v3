package com.huaweicloud.sdk.kms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateDatakeyWithoutPlaintextResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_id")
    
    private String keyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cipher_text")
    
    private String cipherText;

    public CreateDatakeyWithoutPlaintextResponse withKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    


    /**
     * 密钥ID。
     * @return keyId
     */
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public CreateDatakeyWithoutPlaintextResponse withCipherText(String cipherText) {
        this.cipherText = cipherText;
        return this;
    }

    


    /**
     * DEK密文16进制，两位表示1byte。
     * @return cipherText
     */
    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatakeyWithoutPlaintextResponse createDatakeyWithoutPlaintextResponse = (CreateDatakeyWithoutPlaintextResponse) o;
        return Objects.equals(this.keyId, createDatakeyWithoutPlaintextResponse.keyId) &&
            Objects.equals(this.cipherText, createDatakeyWithoutPlaintextResponse.cipherText);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keyId, cipherText);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatakeyWithoutPlaintextResponse {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    cipherText: ").append(toIndentedString(cipherText)).append("\n");
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
