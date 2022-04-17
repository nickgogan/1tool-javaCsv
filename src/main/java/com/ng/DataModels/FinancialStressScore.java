package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "financial_Stress_Score_Current",
        "fssscore_1monthsago",
        "fssscore_2monthsago",
        "fssscore_3monthsago",
        "fssscore_4monthsago",
        "fssscore_5monthsago",
        "fssscore_6monthsago",
        "fssscore_7monthsago",
        "fssscore_8monthsago",
        "fssscore_9monthsago",
        "fssscore_10monthsago",
        "fssscore_11monthsago",
        "fssscore_12monthsago"
})
@Generated("jsonschema2pojo")
public class FinancialStressScore {
    @JsonProperty("financial_Stress_Score_Current")
    private String financialStressScoreCurrent;
    @JsonProperty("fssscore_1monthsago")
    private String fssscore1monthsago;
    @JsonProperty("fssscore_2monthsago")
    private String fssscore2monthsago;
    @JsonProperty("fssscore_3monthsago")
    private String fssscore3monthsago;
    @JsonProperty("fssscore_4monthsago")
    private String fssscore4monthsago;
    @JsonProperty("fssscore_5monthsago")
    private String fssscore5monthsago;
    @JsonProperty("fssscore_6monthsago")
    private String fssscore6monthsago;
    @JsonProperty("fssscore_7monthsago")
    private String fssscore7monthsago;
    @JsonProperty("fssscore_8monthsago")
    private String fssscore8monthsago;
    @JsonProperty("fssscore_9monthsago")
    private String fssscore9monthsago;
    @JsonProperty("fssscore_10monthsago")
    private String fssscore10monthsago;
    @JsonProperty("fssscore_11monthsago")
    private String fssscore11monthsago;
    @JsonProperty("fssscore_12monthsago")
    private String fssscore12monthsago;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("financial_Stress_Score_Current")
    public String getFinancialStressScoreCurrent() {
        return financialStressScoreCurrent;
    }

    @JsonProperty("financial_Stress_Score_Current")
    public void setFinancialStressScoreCurrent(String financialStressScoreCurrent) {
        this.financialStressScoreCurrent = financialStressScoreCurrent;
    }

    @JsonProperty("fssscore_1monthsago")
    public String getFssscore1monthsago() {
        return fssscore1monthsago;
    }

    @JsonProperty("fssscore_1monthsago")
    public void setFssscore1monthsago(String fssscore1monthsago) {
        this.fssscore1monthsago = fssscore1monthsago;
    }

    @JsonProperty("fssscore_2monthsago")
    public String getFssscore2monthsago() {
        return fssscore2monthsago;
    }

    @JsonProperty("fssscore_2monthsago")
    public void setFssscore2monthsago(String fssscore2monthsago) {
        this.fssscore2monthsago = fssscore2monthsago;
    }

    @JsonProperty("fssscore_3monthsago")
    public String getFssscore3monthsago() {
        return fssscore3monthsago;
    }

    @JsonProperty("fssscore_3monthsago")
    public void setFssscore3monthsago(String fssscore3monthsago) {
        this.fssscore3monthsago = fssscore3monthsago;
    }

    @JsonProperty("fssscore_4monthsago")
    public String getFssscore4monthsago() {
        return fssscore4monthsago;
    }

    @JsonProperty("fssscore_4monthsago")
    public void setFssscore4monthsago(String fssscore4monthsago) {
        this.fssscore4monthsago = fssscore4monthsago;
    }

    @JsonProperty("fssscore_5monthsago")
    public String getFssscore5monthsago() {
        return fssscore5monthsago;
    }

    @JsonProperty("fssscore_5monthsago")
    public void setFssscore5monthsago(String fssscore5monthsago) {
        this.fssscore5monthsago = fssscore5monthsago;
    }

    @JsonProperty("fssscore_6monthsago")
    public String getFssscore6monthsago() {
        return fssscore6monthsago;
    }

    @JsonProperty("fssscore_6monthsago")
    public void setFssscore6monthsago(String fssscore6monthsago) {
        this.fssscore6monthsago = fssscore6monthsago;
    }

    @JsonProperty("fssscore_7monthsago")
    public String getFssscore7monthsago() {
        return fssscore7monthsago;
    }

    @JsonProperty("fssscore_7monthsago")
    public void setFssscore7monthsago(String fssscore7monthsago) {
        this.fssscore7monthsago = fssscore7monthsago;
    }

    @JsonProperty("fssscore_8monthsago")
    public String getFssscore8monthsago() {
        return fssscore8monthsago;
    }

    @JsonProperty("fssscore_8monthsago")
    public void setFssscore8monthsago(String fssscore8monthsago) {
        this.fssscore8monthsago = fssscore8monthsago;
    }

    @JsonProperty("fssscore_9monthsago")
    public String getFssscore9monthsago() {
        return fssscore9monthsago;
    }

    @JsonProperty("fssscore_9monthsago")
    public void setFssscore9monthsago(String fssscore9monthsago) {
        this.fssscore9monthsago = fssscore9monthsago;
    }

    @JsonProperty("fssscore_10monthsago")
    public String getFssscore10monthsago() {
        return fssscore10monthsago;
    }

    @JsonProperty("fssscore_10monthsago")
    public void setFssscore10monthsago(String fssscore10monthsago) {
        this.fssscore10monthsago = fssscore10monthsago;
    }

    @JsonProperty("fssscore_11monthsago")
    public String getFssscore11monthsago() {
        return fssscore11monthsago;
    }

    @JsonProperty("fssscore_11monthsago")
    public void setFssscore11monthsago(String fssscore11monthsago) {
        this.fssscore11monthsago = fssscore11monthsago;
    }

    @JsonProperty("fssscore_12monthsago")
    public String getFssscore12monthsago() {
        return fssscore12monthsago;
    }

    @JsonProperty("fssscore_12monthsago")
    public void setFssscore12monthsago(String fssscore12monthsago) {
        this.fssscore12monthsago = fssscore12monthsago;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(com.ng.DataModels.FinancialStressScore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("financialStressScoreCurrent");
        sb.append('=');
        sb.append(((this.financialStressScoreCurrent == null) ? "<null>" : this.financialStressScoreCurrent));
        sb.append(',');
        sb.append("fssscore1monthsago");
        sb.append('=');
        sb.append(((this.fssscore1monthsago == null) ? "<null>" : this.fssscore1monthsago));
        sb.append(',');
        sb.append("fssscore2monthsago");
        sb.append('=');
        sb.append(((this.fssscore2monthsago == null) ? "<null>" : this.fssscore2monthsago));
        sb.append(',');
        sb.append("fssscore3monthsago");
        sb.append('=');
        sb.append(((this.fssscore3monthsago == null) ? "<null>" : this.fssscore3monthsago));
        sb.append(',');
        sb.append("fssscore4monthsago");
        sb.append('=');
        sb.append(((this.fssscore4monthsago == null) ? "<null>" : this.fssscore4monthsago));
        sb.append(',');
        sb.append("fssscore5monthsago");
        sb.append('=');
        sb.append(((this.fssscore5monthsago == null) ? "<null>" : this.fssscore5monthsago));
        sb.append(',');
        sb.append("fssscore6monthsago");
        sb.append('=');
        sb.append(((this.fssscore6monthsago == null) ? "<null>" : this.fssscore6monthsago));
        sb.append(',');
        sb.append("fssscore7monthsago");
        sb.append('=');
        sb.append(((this.fssscore7monthsago == null) ? "<null>" : this.fssscore7monthsago));
        sb.append(',');
        sb.append("fssscore8monthsago");
        sb.append('=');
        sb.append(((this.fssscore8monthsago == null) ? "<null>" : this.fssscore8monthsago));
        sb.append(',');
        sb.append("fssscore9monthsago");
        sb.append('=');
        sb.append(((this.fssscore9monthsago == null) ? "<null>" : this.fssscore9monthsago));
        sb.append(',');
        sb.append("fssscore10monthsago");
        sb.append('=');
        sb.append(((this.fssscore10monthsago == null) ? "<null>" : this.fssscore10monthsago));
        sb.append(',');
        sb.append("fssscore11monthsago");
        sb.append('=');
        sb.append(((this.fssscore11monthsago == null) ? "<null>" : this.fssscore11monthsago));
        sb.append(',');
        sb.append("fssscore12monthsago");
        sb.append('=');
        sb.append(((this.fssscore12monthsago == null) ? "<null>" : this.fssscore12monthsago));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
