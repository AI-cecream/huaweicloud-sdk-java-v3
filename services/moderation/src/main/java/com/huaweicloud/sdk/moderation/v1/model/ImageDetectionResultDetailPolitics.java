package com.huaweicloud.sdk.moderation.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.ImageDetectionResultDetailFaceDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ImageDetectionResultDetailPolitics
 */
public class ImageDetectionResultDetailPolitics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="confidence")
    
    private Object confidence;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="label")
    
    private String label;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="face_detail")
    
    private ImageDetectionResultDetailFaceDetail faceDetail;

    public ImageDetectionResultDetailPolitics withConfidence(Object confidence) {
        this.confidence = confidence;
        return this;
    }

    


    /**
     * Get confidence
     * @return confidence
     */
    public Object getConfidence() {
        return confidence;
    }

    public void setConfidence(Object confidence) {
        this.confidence = confidence;
    }

    

    public ImageDetectionResultDetailPolitics withLabel(String label) {
        this.label = label;
        return this;
    }

    


    /**
     * Get label
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    

    public ImageDetectionResultDetailPolitics withFaceDetail(ImageDetectionResultDetailFaceDetail faceDetail) {
        this.faceDetail = faceDetail;
        return this;
    }

    public ImageDetectionResultDetailPolitics withFaceDetail(Consumer<ImageDetectionResultDetailFaceDetail> faceDetailSetter) {
        if(this.faceDetail == null ){
            this.faceDetail = new ImageDetectionResultDetailFaceDetail();
            faceDetailSetter.accept(this.faceDetail);
        }
        
        return this;
    }


    /**
     * Get faceDetail
     * @return faceDetail
     */
    public ImageDetectionResultDetailFaceDetail getFaceDetail() {
        return faceDetail;
    }

    public void setFaceDetail(ImageDetectionResultDetailFaceDetail faceDetail) {
        this.faceDetail = faceDetail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultDetailPolitics imageDetectionResultDetailPolitics = (ImageDetectionResultDetailPolitics) o;
        return Objects.equals(this.confidence, imageDetectionResultDetailPolitics.confidence) &&
            Objects.equals(this.label, imageDetectionResultDetailPolitics.label) &&
            Objects.equals(this.faceDetail, imageDetectionResultDetailPolitics.faceDetail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(confidence, label, faceDetail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultDetailPolitics {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    faceDetail: ").append(toIndentedString(faceDetail)).append("\n");
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

