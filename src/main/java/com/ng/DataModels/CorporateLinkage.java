package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "global_Ultim_Duns_Number",
        "global_Ultim_Name",
        "global_Ultimate_Country",
        "head_Duns_Number",
        "head_Name",
        "headqtr_Country_Code"
})
@Generated("jsonschema2pojo")
public class CorporateLinkage {
    @JsonProperty("global_Ultim_Duns_Number")
    private String globalUltimDunsNumber;
    @JsonProperty("global_Ultim_Name")
    private String globalUltimName;
    @JsonProperty("global_Ultimate_Country")
    private String globalUltimateCountry;
    @JsonProperty("head_Duns_Number")
    private String headDunsNumber;
    @JsonProperty("head_Name")
    private String headName;
    @JsonProperty("headqtr_Country_Code")
    private String headqtrCountryCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("global_Ultim_Duns_Number")
    public String getGlobalUltimDunsNumber() {
        return globalUltimDunsNumber;
    }

    @JsonProperty("global_Ultim_Duns_Number")
    public void setGlobalUltimDunsNumber(String globalUltimDunsNumber) {
        this.globalUltimDunsNumber = globalUltimDunsNumber;
    }

    @JsonProperty("global_Ultim_Name")
    public String getGlobalUltimName() {
        return globalUltimName;
    }

    @JsonProperty("global_Ultim_Name")
    public void setGlobalUltimName(String globalUltimName) {
        this.globalUltimName = globalUltimName;
    }

    @JsonProperty("global_Ultimate_Country")
    public String getGlobalUltimateCountry() {
        return globalUltimateCountry;
    }

    @JsonProperty("global_Ultimate_Country")
    public void setGlobalUltimateCountry(String globalUltimateCountry) {
        this.globalUltimateCountry = globalUltimateCountry;
    }

    @JsonProperty("head_Duns_Number")
    public String getHeadDunsNumber() {
        return headDunsNumber;
    }

    @JsonProperty("head_Duns_Number")
    public void setHeadDunsNumber(String headDunsNumber) {
        this.headDunsNumber = headDunsNumber;
    }

    @JsonProperty("head_Name")
    public String getHeadName() {
        return headName;
    }

    @JsonProperty("head_Name")
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @JsonProperty("headqtr_Country_Code")
    public String getHeadqtrCountryCode() {
        return headqtrCountryCode;
    }

    @JsonProperty("headqtr_Country_Code")
    public void setHeadqtrCountryCode(String headqtrCountryCode) {
        this.headqtrCountryCode = headqtrCountryCode;
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
        sb.append(com.ng.DataModels.CorporateLinkage.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("globalUltimDunsNumber");
        sb.append('=');
        sb.append(((this.globalUltimDunsNumber == null) ? "<null>" : this.globalUltimDunsNumber));
        sb.append(',');
        sb.append("globalUltimName");
        sb.append('=');
        sb.append(((this.globalUltimName == null) ? "<null>" : this.globalUltimName));
        sb.append(',');
        sb.append("globalUltimateCountry");
        sb.append('=');
        sb.append(((this.globalUltimateCountry == null) ? "<null>" : this.globalUltimateCountry));
        sb.append(',');
        sb.append("headDunsNumber");
        sb.append('=');
        sb.append(((this.headDunsNumber == null) ? "<null>" : this.headDunsNumber));
        sb.append(',');
        sb.append("headName");
        sb.append('=');
        sb.append(((this.headName == null) ? "<null>" : this.headName));
        sb.append(',');
        sb.append("headqtrCountryCode");
        sb.append('=');
        sb.append(((this.headqtrCountryCode == null) ? "<null>" : this.headqtrCountryCode));
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
