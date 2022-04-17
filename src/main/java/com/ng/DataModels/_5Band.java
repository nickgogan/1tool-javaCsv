package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paydex_Risk_5_Band",
        "db_Rating_5_Band",
        "paydex_5_Band",
        "failure_5_Band",
        "viability_Score_5_Band",
        "portfolio_Comparison_5_Band",
        "obr_5_Band"
})
@Generated("jsonschema2pojo")
public class _5Band {
    @JsonProperty("paydex_Risk_5_Band")
    private String paydexRisk5Band;
    @JsonProperty("db_Rating_5_Band")
    private String dbRating5Band;
    @JsonProperty("paydex_5_Band")
    private String paydex5Band;
    @JsonProperty("failure_5_Band")
    private String failure5Band;
    @JsonProperty("viability_Score_5_Band")
    private String viabilityScore5Band;
    @JsonProperty("portfolio_Comparison_5_Band")
    private String portfolioComparison5Band;
    @JsonProperty("obr_5_Band")
    private String obr5Band;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paydex_Risk_5_Band")
    public String getPaydexRisk5Band() {
        return paydexRisk5Band;
    }

    @JsonProperty("paydex_Risk_5_Band")
    public void setPaydexRisk5Band(String paydexRisk5Band) {
        this.paydexRisk5Band = paydexRisk5Band;
    }

    @JsonProperty("db_Rating_5_Band")
    public String getDbRating5Band() {
        return dbRating5Band;
    }

    @JsonProperty("db_Rating_5_Band")
    public void setDbRating5Band(String dbRating5Band) {
        this.dbRating5Band = dbRating5Band;
    }

    @JsonProperty("paydex_5_Band")
    public String getPaydex5Band() {
        return paydex5Band;
    }

    @JsonProperty("paydex_5_Band")
    public void setPaydex5Band(String paydex5Band) {
        this.paydex5Band = paydex5Band;
    }

    @JsonProperty("failure_5_Band")
    public String getFailure5Band() {
        return failure5Band;
    }

    @JsonProperty("failure_5_Band")
    public void setFailure5Band(String failure5Band) {
        this.failure5Band = failure5Band;
    }

    @JsonProperty("viability_Score_5_Band")
    public String getViabilityScore5Band() {
        return viabilityScore5Band;
    }

    @JsonProperty("viability_Score_5_Band")
    public void setViabilityScore5Band(String viabilityScore5Band) {
        this.viabilityScore5Band = viabilityScore5Band;
    }

    @JsonProperty("portfolio_Comparison_5_Band")
    public String getPortfolioComparison5Band() {
        return portfolioComparison5Band;
    }

    @JsonProperty("portfolio_Comparison_5_Band")
    public void setPortfolioComparison5Band(String portfolioComparison5Band) {
        this.portfolioComparison5Band = portfolioComparison5Band;
    }

    @JsonProperty("obr_5_Band")
    public String getObr5Band() {
        return obr5Band;
    }

    @JsonProperty("obr_5_Band")
    public void setObr5Band(String obr5Band) {
        this.obr5Band = obr5Band;
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
        sb.append(com.ng.DataModels._5Band.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paydexRisk5Band");
        sb.append('=');
        sb.append(((this.paydexRisk5Band == null) ? "<null>" : this.paydexRisk5Band));
        sb.append(',');
        sb.append("dbRating5Band");
        sb.append('=');
        sb.append(((this.dbRating5Band == null) ? "<null>" : this.dbRating5Band));
        sb.append(',');
        sb.append("paydex5Band");
        sb.append('=');
        sb.append(((this.paydex5Band == null) ? "<null>" : this.paydex5Band));
        sb.append(',');
        sb.append("failure5Band");
        sb.append('=');
        sb.append(((this.failure5Band == null) ? "<null>" : this.failure5Band));
        sb.append(',');
        sb.append("viabilityScore5Band");
        sb.append('=');
        sb.append(((this.viabilityScore5Band == null) ? "<null>" : this.viabilityScore5Band));
        sb.append(',');
        sb.append("portfolioComparison5Band");
        sb.append('=');
        sb.append(((this.portfolioComparison5Band == null) ? "<null>" : this.portfolioComparison5Band));
        sb.append(',');
        sb.append("obr5Band");
        sb.append('=');
        sb.append(((this.obr5Band == null) ? "<null>" : this.obr5Band));
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
