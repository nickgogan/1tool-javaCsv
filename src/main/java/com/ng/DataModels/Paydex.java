package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paydex_Current",
        "paydex_1monthsago",
        "paydex_2monthsago",
        "paydex_3monthsago",
        "paydex_4monthsago",
        "paydex_5monthsago",
        "paydex_6monthsago",
        "paydex_7monthsago",
        "paydex_8monthsago",
        "paydex_9monthsago",
        "paydex_10monthsago",
        "paydex_11monthsago",
        "paydex_12monthsago"
})
@Generated("jsonschema2pojo")
public class Paydex {
    @JsonProperty("paydex_Current")
    private String paydexCurrent;
    @JsonProperty("paydex_1monthsago")
    private String paydex1monthsago;
    @JsonProperty("paydex_2monthsago")
    private String paydex2monthsago;
    @JsonProperty("paydex_3monthsago")
    private String paydex3monthsago;
    @JsonProperty("paydex_4monthsago")
    private String paydex4monthsago;
    @JsonProperty("paydex_5monthsago")
    private String paydex5monthsago;
    @JsonProperty("paydex_6monthsago")
    private String paydex6monthsago;
    @JsonProperty("paydex_7monthsago")
    private String paydex7monthsago;
    @JsonProperty("paydex_8monthsago")
    private String paydex8monthsago;
    @JsonProperty("paydex_9monthsago")
    private String paydex9monthsago;
    @JsonProperty("paydex_10monthsago")
    private String paydex10monthsago;
    @JsonProperty("paydex_11monthsago")
    private String paydex11monthsago;
    @JsonProperty("paydex_12monthsago")
    private String paydex12monthsago;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paydex_Current")
    public String getPaydexCurrent() {
        return paydexCurrent;
    }

    @JsonProperty("paydex_Current")
    public void setPaydexCurrent(String paydexCurrent) {
        this.paydexCurrent = paydexCurrent;
    }

    @JsonProperty("paydex_1monthsago")
    public String getPaydex1monthsago() {
        return paydex1monthsago;
    }

    @JsonProperty("paydex_1monthsago")
    public void setPaydex1monthsago(String paydex1monthsago) {
        this.paydex1monthsago = paydex1monthsago;
    }

    @JsonProperty("paydex_2monthsago")
    public String getPaydex2monthsago() {
        return paydex2monthsago;
    }

    @JsonProperty("paydex_2monthsago")
    public void setPaydex2monthsago(String paydex2monthsago) {
        this.paydex2monthsago = paydex2monthsago;
    }

    @JsonProperty("paydex_3monthsago")
    public String getPaydex3monthsago() {
        return paydex3monthsago;
    }

    @JsonProperty("paydex_3monthsago")
    public void setPaydex3monthsago(String paydex3monthsago) {
        this.paydex3monthsago = paydex3monthsago;
    }

    @JsonProperty("paydex_4monthsago")
    public String getPaydex4monthsago() {
        return paydex4monthsago;
    }

    @JsonProperty("paydex_4monthsago")
    public void setPaydex4monthsago(String paydex4monthsago) {
        this.paydex4monthsago = paydex4monthsago;
    }

    @JsonProperty("paydex_5monthsago")
    public String getPaydex5monthsago() {
        return paydex5monthsago;
    }

    @JsonProperty("paydex_5monthsago")
    public void setPaydex5monthsago(String paydex5monthsago) {
        this.paydex5monthsago = paydex5monthsago;
    }

    @JsonProperty("paydex_6monthsago")
    public String getPaydex6monthsago() {
        return paydex6monthsago;
    }

    @JsonProperty("paydex_6monthsago")
    public void setPaydex6monthsago(String paydex6monthsago) {
        this.paydex6monthsago = paydex6monthsago;
    }

    @JsonProperty("paydex_7monthsago")
    public String getPaydex7monthsago() {
        return paydex7monthsago;
    }

    @JsonProperty("paydex_7monthsago")
    public void setPaydex7monthsago(String paydex7monthsago) {
        this.paydex7monthsago = paydex7monthsago;
    }

    @JsonProperty("paydex_8monthsago")
    public String getPaydex8monthsago() {
        return paydex8monthsago;
    }

    @JsonProperty("paydex_8monthsago")
    public void setPaydex8monthsago(String paydex8monthsago) {
        this.paydex8monthsago = paydex8monthsago;
    }

    @JsonProperty("paydex_9monthsago")
    public String getPaydex9monthsago() {
        return paydex9monthsago;
    }

    @JsonProperty("paydex_9monthsago")
    public void setPaydex9monthsago(String paydex9monthsago) {
        this.paydex9monthsago = paydex9monthsago;
    }

    @JsonProperty("paydex_10monthsago")
    public String getPaydex10monthsago() {
        return paydex10monthsago;
    }

    @JsonProperty("paydex_10monthsago")
    public void setPaydex10monthsago(String paydex10monthsago) {
        this.paydex10monthsago = paydex10monthsago;
    }

    @JsonProperty("paydex_11monthsago")
    public String getPaydex11monthsago() {
        return paydex11monthsago;
    }

    @JsonProperty("paydex_11monthsago")
    public void setPaydex11monthsago(String paydex11monthsago) {
        this.paydex11monthsago = paydex11monthsago;
    }

    @JsonProperty("paydex_12monthsago")
    public String getPaydex12monthsago() {
        return paydex12monthsago;
    }

    @JsonProperty("paydex_12monthsago")
    public void setPaydex12monthsago(String paydex12monthsago) {
        this.paydex12monthsago = paydex12monthsago;
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
        sb.append(com.ng.DataModels.Paydex.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paydexCurrent");
        sb.append('=');
        sb.append(((this.paydexCurrent == null) ? "<null>" : this.paydexCurrent));
        sb.append(',');
        sb.append("paydex1monthsago");
        sb.append('=');
        sb.append(((this.paydex1monthsago == null) ? "<null>" : this.paydex1monthsago));
        sb.append(',');
        sb.append("paydex2monthsago");
        sb.append('=');
        sb.append(((this.paydex2monthsago == null) ? "<null>" : this.paydex2monthsago));
        sb.append(',');
        sb.append("paydex3monthsago");
        sb.append('=');
        sb.append(((this.paydex3monthsago == null) ? "<null>" : this.paydex3monthsago));
        sb.append(',');
        sb.append("paydex4monthsago");
        sb.append('=');
        sb.append(((this.paydex4monthsago == null) ? "<null>" : this.paydex4monthsago));
        sb.append(',');
        sb.append("paydex5monthsago");
        sb.append('=');
        sb.append(((this.paydex5monthsago == null) ? "<null>" : this.paydex5monthsago));
        sb.append(',');
        sb.append("paydex6monthsago");
        sb.append('=');
        sb.append(((this.paydex6monthsago == null) ? "<null>" : this.paydex6monthsago));
        sb.append(',');
        sb.append("paydex7monthsago");
        sb.append('=');
        sb.append(((this.paydex7monthsago == null) ? "<null>" : this.paydex7monthsago));
        sb.append(',');
        sb.append("paydex8monthsago");
        sb.append('=');
        sb.append(((this.paydex8monthsago == null) ? "<null>" : this.paydex8monthsago));
        sb.append(',');
        sb.append("paydex9monthsago");
        sb.append('=');
        sb.append(((this.paydex9monthsago == null) ? "<null>" : this.paydex9monthsago));
        sb.append(',');
        sb.append("paydex10monthsago");
        sb.append('=');
        sb.append(((this.paydex10monthsago == null) ? "<null>" : this.paydex10monthsago));
        sb.append(',');
        sb.append("paydex11monthsago");
        sb.append('=');
        sb.append(((this.paydex11monthsago == null) ? "<null>" : this.paydex11monthsago));
        sb.append(',');
        sb.append("paydex12monthsago");
        sb.append('=');
        sb.append(((this.paydex12monthsago == null) ? "<null>" : this.paydex12monthsago));
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
