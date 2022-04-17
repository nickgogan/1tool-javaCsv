package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paydex_Risk_3_Band",
        "db_Rating_3_Band",
        "paydex_3_Band",
        "failure_3_Band",
        "viability_Score_3_Band",
        "portfolio_Comparison_3_Band"
})
@Generated("jsonschema2pojo")
public class _3Band {
    @JsonProperty("paydex_Risk_3_Band")
    private String paydexRisk3Band;
    @JsonProperty("db_Rating_3_Band")
    private String dbRating3Band;
    @JsonProperty("paydex_3_Band")
    private String paydex3Band;
    @JsonProperty("failure_3_Band")
    private String failure3Band;
    @JsonProperty("viability_Score_3_Band")
    private String viabilityScore3Band;
    @JsonProperty("portfolio_Comparison_3_Band")
    private String portfolioComparison3Band;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paydex_Risk_3_Band")
    public String getPaydexRisk3Band() {
        return paydexRisk3Band;
    }

    @JsonProperty("paydex_Risk_3_Band")
    public void setPaydexRisk3Band(String paydexRisk3Band) {
        this.paydexRisk3Band = paydexRisk3Band;
    }

    @JsonProperty("db_Rating_3_Band")
    public String getDbRating3Band() {
        return dbRating3Band;
    }

    @JsonProperty("db_Rating_3_Band")
    public void setDbRating3Band(String dbRating3Band) {
        this.dbRating3Band = dbRating3Band;
    }

    @JsonProperty("paydex_3_Band")
    public String getPaydex3Band() {
        return paydex3Band;
    }

    @JsonProperty("paydex_3_Band")
    public void setPaydex3Band(String paydex3Band) {
        this.paydex3Band = paydex3Band;
    }

    @JsonProperty("failure_3_Band")
    public String getFailure3Band() {
        return failure3Band;
    }

    @JsonProperty("failure_3_Band")
    public void setFailure3Band(String failure3Band) {
        this.failure3Band = failure3Band;
    }

    @JsonProperty("viability_Score_3_Band")
    public String getViabilityScore3Band() {
        return viabilityScore3Band;
    }

    @JsonProperty("viability_Score_3_Band")
    public void setViabilityScore3Band(String viabilityScore3Band) {
        this.viabilityScore3Band = viabilityScore3Band;
    }

    @JsonProperty("portfolio_Comparison_3_Band")
    public String getPortfolioComparison3Band() {
        return portfolioComparison3Band;
    }

    @JsonProperty("portfolio_Comparison_3_Band")
    public void setPortfolioComparison3Band(String portfolioComparison3Band) {
        this.portfolioComparison3Band = portfolioComparison3Band;
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
        sb.append(com.ng.DataModels._3Band.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paydexRisk3Band");
        sb.append('=');
        sb.append(((this.paydexRisk3Band == null) ? "<null>" : this.paydexRisk3Band));
        sb.append(',');
        sb.append("dbRating3Band");
        sb.append('=');
        sb.append(((this.dbRating3Band == null) ? "<null>" : this.dbRating3Band));
        sb.append(',');
        sb.append("paydex3Band");
        sb.append('=');
        sb.append(((this.paydex3Band == null) ? "<null>" : this.paydex3Band));
        sb.append(',');
        sb.append("failure3Band");
        sb.append('=');
        sb.append(((this.failure3Band == null) ? "<null>" : this.failure3Band));
        sb.append(',');
        sb.append("viabilityScore3Band");
        sb.append('=');
        sb.append(((this.viabilityScore3Band == null) ? "<null>" : this.viabilityScore3Band));
        sb.append(',');
        sb.append("portfolioComparison3Band");
        sb.append('=');
        sb.append(((this.portfolioComparison3Band == null) ? "<null>" : this.portfolioComparison3Band));
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
