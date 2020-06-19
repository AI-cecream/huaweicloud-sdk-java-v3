package com.huaweicloud.sdk.evs.v2.model;


import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.evs.v2.model.SnapshotDetails;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateSnapshotResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snapshot")
    
    private SnapshotDetails snapshot = null;

    public UpdateSnapshotResponse withSnapshot(SnapshotDetails snapshot) {
        this.snapshot = snapshot;
        return this;
    }

    public UpdateSnapshotResponse withSnapshot(Consumer<SnapshotDetails> snapshotSetter) {
        if(this.snapshot == null ){
            this.snapshot = new SnapshotDetails();
        }
        snapshotSetter.accept(this.snapshot);
        return this;
    }


    /**
     * Get snapshot
     * @return snapshot
     */
    public SnapshotDetails getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(SnapshotDetails snapshot) {
        this.snapshot = snapshot;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSnapshotResponse updateSnapshotResponse = (UpdateSnapshotResponse) o;
        return Objects.equals(this.snapshot, updateSnapshotResponse.snapshot);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snapshot);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSnapshotResponse {\n");
        sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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

