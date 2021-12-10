package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** FlashScoreResult */
public class FlashScoreResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Double score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "word_info")

    private List<WordInfo> wordInfo = null;

    public FlashScoreResult withText(String text) {
        this.text = text;
        return this;
    }

    /** 调用成功表示识别出的内容。
     * 
     * @return text */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public FlashScoreResult withScore(Double score) {
        this.score = score;
        return this;
    }

    /** 调用成功表示识别出的置信度，取值范围：0~1。
     * 
     * @return score */
    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public FlashScoreResult withWordInfo(List<WordInfo> wordInfo) {
        this.wordInfo = wordInfo;
        return this;
    }

    public FlashScoreResult addWordInfoItem(WordInfo wordInfoItem) {
        if (this.wordInfo == null) {
            this.wordInfo = new ArrayList<>();
        }
        this.wordInfo.add(wordInfoItem);
        return this;
    }

    public FlashScoreResult withWordInfo(Consumer<List<WordInfo>> wordInfoSetter) {
        if (this.wordInfo == null) {
            this.wordInfo = new ArrayList<>();
        }
        wordInfoSetter.accept(this.wordInfo);
        return this;
    }

    /** 分词信息列表
     * 
     * @return wordInfo */
    public List<WordInfo> getWordInfo() {
        return wordInfo;
    }

    public void setWordInfo(List<WordInfo> wordInfo) {
        this.wordInfo = wordInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlashScoreResult flashScoreResult = (FlashScoreResult) o;
        return Objects.equals(this.text, flashScoreResult.text) && Objects.equals(this.score, flashScoreResult.score)
            && Objects.equals(this.wordInfo, flashScoreResult.wordInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, score, wordInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlashScoreResult {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    wordInfo: ").append(toIndentedString(wordInfo)).append("\n");
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