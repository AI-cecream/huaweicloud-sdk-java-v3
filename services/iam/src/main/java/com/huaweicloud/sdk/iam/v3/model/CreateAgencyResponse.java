package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private AgencyResult agency;

    public CreateAgencyResponse withAgency(AgencyResult agency) {
        this.agency = agency;
        return this;
    }

    public CreateAgencyResponse withAgency(Consumer<AgencyResult> agencySetter) {
        if (this.agency == null) {
            this.agency = new AgencyResult();
            agencySetter.accept(this.agency);
        }

        return this;
    }

    /**
     * Get agency
     * @return agency
     */
    public AgencyResult getAgency() {
        return agency;
    }

    public void setAgency(AgencyResult agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAgencyResponse createAgencyResponse = (CreateAgencyResponse) o;
        return Objects.equals(this.agency, createAgencyResponse.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAgencyResponse {\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
