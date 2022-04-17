package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "addressType",
        "street1",
        "street2",
        "city",
        "zip",
        "state",
        "business_Country",
        "duns_Business_Name",
        "duns_Street1",
        "duns_City",
        "duns_Zip",
        "duns_State",
        "duns_Country"
})
@Generated("jsonschema2pojo")
public class Address {
    @JsonProperty("addressType")
    private String addressType;
    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("state")
    private String state;
    @JsonProperty("business_Country")
    private String businessCountry;
    @JsonProperty("duns_Business_Name")
    private String dunsBusinessName;
    @JsonProperty("duns_Street1")
    private String dunsStreet1;
    @JsonProperty("duns_City")
    private String dunsCity;
    @JsonProperty("duns_Zip")
    private String dunsZip;
    @JsonProperty("duns_State")
    private String dunsState;
    @JsonProperty("duns_Country")
    private String dunsCountry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("addressType")
    public String getAddressType() {
        return addressType;
    }

    @JsonProperty("addressType")
    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("business_Country")
    public String getBusinessCountry() {
        return businessCountry;
    }

    @JsonProperty("business_Country")
    public void setBusinessCountry(String businessCountry) {
        this.businessCountry = businessCountry;
    }

    @JsonProperty("duns_Business_Name")
    public String getDunsBusinessName() {
        return dunsBusinessName;
    }

    @JsonProperty("duns_Business_Name")
    public void setDunsBusinessName(String dunsBusinessName) {
        this.dunsBusinessName = dunsBusinessName;
    }

    @JsonProperty("duns_Street1")
    public String getDunsStreet1() {
        return dunsStreet1;
    }

    @JsonProperty("duns_Street1")
    public void setDunsStreet1(String dunsStreet1) {
        this.dunsStreet1 = dunsStreet1;
    }

    @JsonProperty("duns_City")
    public String getDunsCity() {
        return dunsCity;
    }

    @JsonProperty("duns_City")
    public void setDunsCity(String dunsCity) {
        this.dunsCity = dunsCity;
    }

    @JsonProperty("duns_Zip")
    public String getDunsZip() {
        return dunsZip;
    }

    @JsonProperty("duns_Zip")
    public void setDunsZip(String dunsZip) {
        this.dunsZip = dunsZip;
    }

    @JsonProperty("duns_State")
    public String getDunsState() {
        return dunsState;
    }

    @JsonProperty("duns_State")
    public void setDunsState(String dunsState) {
        this.dunsState = dunsState;
    }

    @JsonProperty("duns_Country")
    public String getDunsCountry() {
        return dunsCountry;
    }

    @JsonProperty("duns_Country")
    public void setDunsCountry(String dunsCountry) {
        this.dunsCountry = dunsCountry;
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
        sb.append(com.ng.DataModels.Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("addressType");
        sb.append('=');
        sb.append(((this.addressType == null) ? "<null>" : this.addressType));
        sb.append(',');
        sb.append("street1");
        sb.append('=');
        sb.append(((this.street1 == null) ? "<null>" : this.street1));
        sb.append(',');
        sb.append("street2");
        sb.append('=');
        sb.append(((this.street2 == null) ? "<null>" : this.street2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null) ? "<null>" : this.city));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null) ? "<null>" : this.zip));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null) ? "<null>" : this.state));
        sb.append(',');
        sb.append("businessCountry");
        sb.append('=');
        sb.append(((this.businessCountry == null) ? "<null>" : this.businessCountry));
        sb.append(',');
        sb.append("dunsBusinessName");
        sb.append('=');
        sb.append(((this.dunsBusinessName == null) ? "<null>" : this.dunsBusinessName));
        sb.append(',');
        sb.append("dunsStreet1");
        sb.append('=');
        sb.append(((this.dunsStreet1 == null) ? "<null>" : this.dunsStreet1));
        sb.append(',');
        sb.append("dunsCity");
        sb.append('=');
        sb.append(((this.dunsCity == null) ? "<null>" : this.dunsCity));
        sb.append(',');
        sb.append("dunsZip");
        sb.append('=');
        sb.append(((this.dunsZip == null) ? "<null>" : this.dunsZip));
        sb.append(',');
        sb.append("dunsState");
        sb.append('=');
        sb.append(((this.dunsState == null) ? "<null>" : this.dunsState));
        sb.append(',');
        sb.append("dunsCountry");
        sb.append('=');
        sb.append(((this.dunsCountry == null) ? "<null>" : this.dunsCountry));
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
