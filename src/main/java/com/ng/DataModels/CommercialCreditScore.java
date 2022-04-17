package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "commercial_Credit_Score_Current",
        "ccsscore_1monthsago",
        "ccsscore_2monthsago",
        "ccsscore_3monthsago",
        "ccsscore_4monthsago",
        "ccsscore_5monthsago",
        "ccsscore_6monthsago",
        "ccsscore_7monthsago",
        "ccsscore_8monthsago",
        "ccsscore_9monthsago",
        "ccsscore_10monthsago",
        "ccsscore_11monthsago",
        "ccsscore_12monthsago"
})
@Generated("jsonschema2pojo")
public class CommercialCreditScore {
    @JsonProperty("commercial_Credit_Score_Current")
    private String commercialCreditScoreCurrent;
    @JsonProperty("ccsscore_1monthsago")
    private String ccsscore1monthsago;
    @JsonProperty("ccsscore_2monthsago")
    private String ccsscore2monthsago;
    @JsonProperty("ccsscore_3monthsago")
    private String ccsscore3monthsago;
    @JsonProperty("ccsscore_4monthsago")
    private String ccsscore4monthsago;
    @JsonProperty("ccsscore_5monthsago")
    private String ccsscore5monthsago;
    @JsonProperty("ccsscore_6monthsago")
    private String ccsscore6monthsago;
    @JsonProperty("ccsscore_7monthsago")
    private String ccsscore7monthsago;
    @JsonProperty("ccsscore_8monthsago")
    private String ccsscore8monthsago;
    @JsonProperty("ccsscore_9monthsago")
    private String ccsscore9monthsago;
    @JsonProperty("ccsscore_10monthsago")
    private String ccsscore10monthsago;
    @JsonProperty("ccsscore_11monthsago")
    private String ccsscore11monthsago;
    @JsonProperty("ccsscore_12monthsago")
    private String ccsscore12monthsago;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("commercial_Credit_Score_Current")
    public String getCommercialCreditScoreCurrent() {
        return commercialCreditScoreCurrent;
    }

    @JsonProperty("commercial_Credit_Score_Current")
    public void setCommercialCreditScoreCurrent(String commercialCreditScoreCurrent) {
        this.commercialCreditScoreCurrent = commercialCreditScoreCurrent;
    }

    @JsonProperty("ccsscore_1monthsago")
    public String getCcsscore1monthsago() {
        return ccsscore1monthsago;
    }

    @JsonProperty("ccsscore_1monthsago")
    public void setCcsscore1monthsago(String ccsscore1monthsago) {
        this.ccsscore1monthsago = ccsscore1monthsago;
    }

    @JsonProperty("ccsscore_2monthsago")
    public String getCcsscore2monthsago() {
        return ccsscore2monthsago;
    }

    @JsonProperty("ccsscore_2monthsago")
    public void setCcsscore2monthsago(String ccsscore2monthsago) {
        this.ccsscore2monthsago = ccsscore2monthsago;
    }

    @JsonProperty("ccsscore_3monthsago")
    public String getCcsscore3monthsago() {
        return ccsscore3monthsago;
    }

    @JsonProperty("ccsscore_3monthsago")
    public void setCcsscore3monthsago(String ccsscore3monthsago) {
        this.ccsscore3monthsago = ccsscore3monthsago;
    }

    @JsonProperty("ccsscore_4monthsago")
    public String getCcsscore4monthsago() {
        return ccsscore4monthsago;
    }

    @JsonProperty("ccsscore_4monthsago")
    public void setCcsscore4monthsago(String ccsscore4monthsago) {
        this.ccsscore4monthsago = ccsscore4monthsago;
    }

    @JsonProperty("ccsscore_5monthsago")
    public String getCcsscore5monthsago() {
        return ccsscore5monthsago;
    }

    @JsonProperty("ccsscore_5monthsago")
    public void setCcsscore5monthsago(String ccsscore5monthsago) {
        this.ccsscore5monthsago = ccsscore5monthsago;
    }

    @JsonProperty("ccsscore_6monthsago")
    public String getCcsscore6monthsago() {
        return ccsscore6monthsago;
    }

    @JsonProperty("ccsscore_6monthsago")
    public void setCcsscore6monthsago(String ccsscore6monthsago) {
        this.ccsscore6monthsago = ccsscore6monthsago;
    }

    @JsonProperty("ccsscore_7monthsago")
    public String getCcsscore7monthsago() {
        return ccsscore7monthsago;
    }

    @JsonProperty("ccsscore_7monthsago")
    public void setCcsscore7monthsago(String ccsscore7monthsago) {
        this.ccsscore7monthsago = ccsscore7monthsago;
    }

    @JsonProperty("ccsscore_8monthsago")
    public String getCcsscore8monthsago() {
        return ccsscore8monthsago;
    }

    @JsonProperty("ccsscore_8monthsago")
    public void setCcsscore8monthsago(String ccsscore8monthsago) {
        this.ccsscore8monthsago = ccsscore8monthsago;
    }

    @JsonProperty("ccsscore_9monthsago")
    public String getCcsscore9monthsago() {
        return ccsscore9monthsago;
    }

    @JsonProperty("ccsscore_9monthsago")
    public void setCcsscore9monthsago(String ccsscore9monthsago) {
        this.ccsscore9monthsago = ccsscore9monthsago;
    }

    @JsonProperty("ccsscore_10monthsago")
    public String getCcsscore10monthsago() {
        return ccsscore10monthsago;
    }

    @JsonProperty("ccsscore_10monthsago")
    public void setCcsscore10monthsago(String ccsscore10monthsago) {
        this.ccsscore10monthsago = ccsscore10monthsago;
    }

    @JsonProperty("ccsscore_11monthsago")
    public String getCcsscore11monthsago() {
        return ccsscore11monthsago;
    }

    @JsonProperty("ccsscore_11monthsago")
    public void setCcsscore11monthsago(String ccsscore11monthsago) {
        this.ccsscore11monthsago = ccsscore11monthsago;
    }

    @JsonProperty("ccsscore_12monthsago")
    public String getCcsscore12monthsago() {
        return ccsscore12monthsago;
    }

    @JsonProperty("ccsscore_12monthsago")
    public void setCcsscore12monthsago(String ccsscore12monthsago) {
        this.ccsscore12monthsago = ccsscore12monthsago;
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
        sb.append(com.ng.DataModels.CommercialCreditScore.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("commercialCreditScoreCurrent");
        sb.append('=');
        sb.append(((this.commercialCreditScoreCurrent == null) ? "<null>" : this.commercialCreditScoreCurrent));
        sb.append(',');
        sb.append("ccsscore1monthsago");
        sb.append('=');
        sb.append(((this.ccsscore1monthsago == null) ? "<null>" : this.ccsscore1monthsago));
        sb.append(',');
        sb.append("ccsscore2monthsago");
        sb.append('=');
        sb.append(((this.ccsscore2monthsago == null) ? "<null>" : this.ccsscore2monthsago));
        sb.append(',');
        sb.append("ccsscore3monthsago");
        sb.append('=');
        sb.append(((this.ccsscore3monthsago == null) ? "<null>" : this.ccsscore3monthsago));
        sb.append(',');
        sb.append("ccsscore4monthsago");
        sb.append('=');
        sb.append(((this.ccsscore4monthsago == null) ? "<null>" : this.ccsscore4monthsago));
        sb.append(',');
        sb.append("ccsscore5monthsago");
        sb.append('=');
        sb.append(((this.ccsscore5monthsago == null) ? "<null>" : this.ccsscore5monthsago));
        sb.append(',');
        sb.append("ccsscore6monthsago");
        sb.append('=');
        sb.append(((this.ccsscore6monthsago == null) ? "<null>" : this.ccsscore6monthsago));
        sb.append(',');
        sb.append("ccsscore7monthsago");
        sb.append('=');
        sb.append(((this.ccsscore7monthsago == null) ? "<null>" : this.ccsscore7monthsago));
        sb.append(',');
        sb.append("ccsscore8monthsago");
        sb.append('=');
        sb.append(((this.ccsscore8monthsago == null) ? "<null>" : this.ccsscore8monthsago));
        sb.append(',');
        sb.append("ccsscore9monthsago");
        sb.append('=');
        sb.append(((this.ccsscore9monthsago == null) ? "<null>" : this.ccsscore9monthsago));
        sb.append(',');
        sb.append("ccsscore10monthsago");
        sb.append('=');
        sb.append(((this.ccsscore10monthsago == null) ? "<null>" : this.ccsscore10monthsago));
        sb.append(',');
        sb.append("ccsscore11monthsago");
        sb.append('=');
        sb.append(((this.ccsscore11monthsago == null) ? "<null>" : this.ccsscore11monthsago));
        sb.append(',');
        sb.append("ccsscore12monthsago");
        sb.append('=');
        sb.append(((this.ccsscore12monthsago == null) ? "<null>" : this.ccsscore12monthsago));
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
