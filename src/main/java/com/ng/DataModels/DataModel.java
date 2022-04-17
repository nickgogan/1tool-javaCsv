package com.ng.DataModels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "workspace_id",
        "ws_Domain",
        "prm_Domain_id",
        "entity_Type",
        "entity_id",
        "acct_No",
        "acct_Detail_Status",
        "acct_Last_Update_Date",
        "portfolio_Comparison",
        "company_Profile",
        "business_Unit",
        "customer_Type",
        "risk_Classification",
        "date_Created",
        "date_Modified",
        "create_By",
        "exclude_Yn",
        "delete_Yn",
        "business_Name",
        "address",
        "duns_Number",
        "dnb_Rating",
        "sic_Code",
        "naics_Code",
        "sic_Two_Digit_Desc",
        "employees",
        "out_Of_Business_Yn",
        "years_In_Business",
        "years_With_Current_Mgmt",
        "incorporation_Year",
        "bhq_Indicator",
        "history_Indicator",
        "viability_Rating",
        "viability_Score",
        "financial_Stress_Score",
        "fin_Stress_Class",
        "fsspercentile",
        "commercial_Credit_Score",
        "comm_Cr_Scr_Percentile",
        "paydex",
        "corporate_linkage",
        "risk_Evalution",
        "3 Band",
        "5 Band"
})
@Generated("jsonschema2pojo")
public class DataModel {
    @JsonProperty("_id")
    private String id;
    @JsonProperty("workspace_id")
    private String workspaceId;
    @JsonProperty("ws_Domain")
    private String wsDomain;
    @JsonProperty("prm_Domain_id")
    private String prmDomainId;
    @JsonProperty("entity_Type")
    private String entityType;
    @JsonProperty("entity_id")
    private String entityId;
    @JsonProperty("acct_No")
    private String acctNo;
    @JsonProperty("acct_Detail_Status")
    private String acctDetailStatus;
    @JsonProperty("acct_Last_Update_Date")
    private String acctLastUpdateDate;
    @JsonProperty("portfolio_Comparison")
    private String portfolioComparison;
    @JsonProperty("company_Profile")
    private String companyProfile;
    @JsonProperty("business_Unit")
    private String businessUnit;
    @JsonProperty("customer_Type")
    private String customerType;
    @JsonProperty("risk_Classification")
    private String riskClassification;
    @JsonProperty("date_Created")
    private String dateCreated;
    @JsonProperty("date_Modified")
    private String dateModified;
    @JsonProperty("create_By")
    private String createBy;
    @JsonProperty("exclude_Yn")
    private String excludeYn;
    @JsonProperty("delete_Yn")
    private String deleteYn;
    @JsonProperty("business_Name")
    private String businessName;
    @JsonProperty("address")
    private List<Address> address = new ArrayList<Address>();
    @JsonProperty("duns_Number")
    private String dunsNumber;
    @JsonProperty("dnb_Rating")
    private String dnbRating;
    @JsonProperty("sic_Code")
    private String sicCode;
    @JsonProperty("naics_Code")
    private String naicsCode;
    @JsonProperty("sic_Two_Digit_Desc")
    private String sicTwoDigitDesc;
    @JsonProperty("employees")
    private String employees;
    @JsonProperty("out_Of_Business_Yn")
    private String outOfBusinessYn;
    @JsonProperty("years_In_Business")
    private String yearsInBusiness;
    @JsonProperty("years_With_Current_Mgmt")
    private String yearsWithCurrentMgmt;
    @JsonProperty("incorporation_Year")
    private String incorporationYear;
    @JsonProperty("bhq_Indicator")
    private String bhqIndicator;
    @JsonProperty("history_Indicator")
    private String historyIndicator;
    @JsonProperty("viability_Rating")
    private String viabilityRating;
    @JsonProperty("viability_Score")
    private String viabilityScore;
    @JsonProperty("financial_Stress_Score")
    private List<FinancialStressScore> financialStressScore = new ArrayList<FinancialStressScore>();
    @JsonProperty("fin_Stress_Class")
    private List<FinStressClas> finStressClass = new ArrayList<FinStressClas>();
    @JsonProperty("fsspercentile")
    private List<Fsspercentile> fsspercentile = new ArrayList<Fsspercentile>();
    @JsonProperty("commercial_Credit_Score")
    private List<CommercialCreditScore> commercialCreditScore = new ArrayList<CommercialCreditScore>();
    @JsonProperty("comm_Cr_Scr_Percentile")
    private List<CommCrScrPercentile> commCrScrPercentile = new ArrayList<CommCrScrPercentile>();
    @JsonProperty("paydex")
    private List<Paydex> paydex = new ArrayList<Paydex>();
    @JsonProperty("corporate_linkage")
    private List<CorporateLinkage> corporateLinkage = new ArrayList<CorporateLinkage>();
    @JsonProperty("risk_Evalution")
    private List<RiskEvalution> riskEvalution = new ArrayList<RiskEvalution>();
    @JsonProperty("3 Band")
    private List<com.ng.DataModels._3Band> _3Band = new ArrayList<com.ng.DataModels._3Band>();
    @JsonProperty("5 Band")
    private List<com.ng.DataModels._5Band> _5Band = new ArrayList<com.ng.DataModels._5Band>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("workspace_id")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("workspace_id")
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @JsonProperty("ws_Domain")
    public String getWsDomain() {
        return wsDomain;
    }

    @JsonProperty("ws_Domain")
    public void setWsDomain(String wsDomain) {
        this.wsDomain = wsDomain;
    }

    @JsonProperty("prm_Domain_id")
    public String getPrmDomainId() {
        return prmDomainId;
    }

    @JsonProperty("prm_Domain_id")
    public void setPrmDomainId(String prmDomainId) {
        this.prmDomainId = prmDomainId;
    }

    @JsonProperty("entity_Type")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("entity_Type")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("entity_id")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("entity_id")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("acct_No")
    public String getAcctNo() {
        return acctNo;
    }

    @JsonProperty("acct_No")
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    @JsonProperty("acct_Detail_Status")
    public String getAcctDetailStatus() {
        return acctDetailStatus;
    }

    @JsonProperty("acct_Detail_Status")
    public void setAcctDetailStatus(String acctDetailStatus) {
        this.acctDetailStatus = acctDetailStatus;
    }

    @JsonProperty("acct_Last_Update_Date")
    public String getAcctLastUpdateDate() {
        return acctLastUpdateDate;
    }

    @JsonProperty("acct_Last_Update_Date")
    public void setAcctLastUpdateDate(String acctLastUpdateDate) {
        this.acctLastUpdateDate = acctLastUpdateDate;
    }

    @JsonProperty("portfolio_Comparison")
    public String getPortfolioComparison() {
        return portfolioComparison;
    }

    @JsonProperty("portfolio_Comparison")
    public void setPortfolioComparison(String portfolioComparison) {
        this.portfolioComparison = portfolioComparison;
    }

    @JsonProperty("company_Profile")
    public String getCompanyProfile() {
        return companyProfile;
    }

    @JsonProperty("company_Profile")
    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    @JsonProperty("business_Unit")
    public String getBusinessUnit() {
        return businessUnit;
    }

    @JsonProperty("business_Unit")
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    @JsonProperty("customer_Type")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("customer_Type")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("risk_Classification")
    public String getRiskClassification() {
        return riskClassification;
    }

    @JsonProperty("risk_Classification")
    public void setRiskClassification(String riskClassification) {
        this.riskClassification = riskClassification;
    }

    @JsonProperty("date_Created")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("date_Created")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("date_Modified")
    public String getDateModified() {
        return dateModified;
    }

    @JsonProperty("date_Modified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonProperty("create_By")
    public String getCreateBy() {
        return createBy;
    }

    @JsonProperty("create_By")
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @JsonProperty("exclude_Yn")
    public String getExcludeYn() {
        return excludeYn;
    }

    @JsonProperty("exclude_Yn")
    public void setExcludeYn(String excludeYn) {
        this.excludeYn = excludeYn;
    }

    @JsonProperty("delete_Yn")
    public String getDeleteYn() {
        return deleteYn;
    }

    @JsonProperty("delete_Yn")
    public void setDeleteYn(String deleteYn) {
        this.deleteYn = deleteYn;
    }

    @JsonProperty("business_Name")
    public String getBusinessName() {
        return businessName;
    }

    @JsonProperty("business_Name")
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @JsonProperty("address")
    public List<Address> getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    @JsonProperty("duns_Number")
    public String getDunsNumber() {
        return dunsNumber;
    }

    @JsonProperty("duns_Number")
    public void setDunsNumber(String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    @JsonProperty("dnb_Rating")
    public String getDnbRating() {
        return dnbRating;
    }

    @JsonProperty("dnb_Rating")
    public void setDnbRating(String dnbRating) {
        this.dnbRating = dnbRating;
    }

    @JsonProperty("sic_Code")
    public String getSicCode() {
        return sicCode;
    }

    @JsonProperty("sic_Code")
    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    @JsonProperty("naics_Code")
    public String getNaicsCode() {
        return naicsCode;
    }

    @JsonProperty("naics_Code")
    public void setNaicsCode(String naicsCode) {
        this.naicsCode = naicsCode;
    }

    @JsonProperty("sic_Two_Digit_Desc")
    public String getSicTwoDigitDesc() {
        return sicTwoDigitDesc;
    }

    @JsonProperty("sic_Two_Digit_Desc")
    public void setSicTwoDigitDesc(String sicTwoDigitDesc) {
        this.sicTwoDigitDesc = sicTwoDigitDesc;
    }

    @JsonProperty("employees")
    public String getEmployees() {
        return employees;
    }

    @JsonProperty("employees")
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    @JsonProperty("out_Of_Business_Yn")
    public String getOutOfBusinessYn() {
        return outOfBusinessYn;
    }

    @JsonProperty("out_Of_Business_Yn")
    public void setOutOfBusinessYn(String outOfBusinessYn) {
        this.outOfBusinessYn = outOfBusinessYn;
    }

    @JsonProperty("years_In_Business")
    public String getYearsInBusiness() {
        return yearsInBusiness;
    }

    @JsonProperty("years_In_Business")
    public void setYearsInBusiness(String yearsInBusiness) {
        this.yearsInBusiness = yearsInBusiness;
    }

    @JsonProperty("years_With_Current_Mgmt")
    public String getYearsWithCurrentMgmt() {
        return yearsWithCurrentMgmt;
    }

    @JsonProperty("years_With_Current_Mgmt")
    public void setYearsWithCurrentMgmt(String yearsWithCurrentMgmt) {
        this.yearsWithCurrentMgmt = yearsWithCurrentMgmt;
    }

    @JsonProperty("incorporation_Year")
    public String getIncorporationYear() {
        return incorporationYear;
    }

    @JsonProperty("incorporation_Year")
    public void setIncorporationYear(String incorporationYear) {
        this.incorporationYear = incorporationYear;
    }

    @JsonProperty("bhq_Indicator")
    public String getBhqIndicator() {
        return bhqIndicator;
    }

    @JsonProperty("bhq_Indicator")
    public void setBhqIndicator(String bhqIndicator) {
        this.bhqIndicator = bhqIndicator;
    }

    @JsonProperty("history_Indicator")
    public String getHistoryIndicator() {
        return historyIndicator;
    }

    @JsonProperty("history_Indicator")
    public void setHistoryIndicator(String historyIndicator) {
        this.historyIndicator = historyIndicator;
    }

    @JsonProperty("viability_Rating")
    public String getViabilityRating() {
        return viabilityRating;
    }

    @JsonProperty("viability_Rating")
    public void setViabilityRating(String viabilityRating) {
        this.viabilityRating = viabilityRating;
    }

    @JsonProperty("viability_Score")
    public String getViabilityScore() {
        return viabilityScore;
    }

    @JsonProperty("viability_Score")
    public void setViabilityScore(String viabilityScore) {
        this.viabilityScore = viabilityScore;
    }

    @JsonProperty("financial_Stress_Score")
    public List<FinancialStressScore> getFinancialStressScore() {
        return financialStressScore;
    }

    @JsonProperty("financial_Stress_Score")
    public void setFinancialStressScore(List<FinancialStressScore> financialStressScore) {
        this.financialStressScore = financialStressScore;
    }

    @JsonProperty("fin_Stress_Class")
    public List<FinStressClas> getFinStressClass() {
        return finStressClass;
    }

    @JsonProperty("fin_Stress_Class")
    public void setFinStressClass(List<FinStressClas> finStressClass) {
        this.finStressClass = finStressClass;
    }

    @JsonProperty("fsspercentile")
    public List<Fsspercentile> getFsspercentile() {
        return fsspercentile;
    }

    @JsonProperty("fsspercentile")
    public void setFsspercentile(List<Fsspercentile> fsspercentile) {
        this.fsspercentile = fsspercentile;
    }

    @JsonProperty("commercial_Credit_Score")
    public List<CommercialCreditScore> getCommercialCreditScore() {
        return commercialCreditScore;
    }

    @JsonProperty("commercial_Credit_Score")
    public void setCommercialCreditScore(List<CommercialCreditScore> commercialCreditScore) {
        this.commercialCreditScore = commercialCreditScore;
    }

    @JsonProperty("comm_Cr_Scr_Percentile")
    public List<CommCrScrPercentile> getCommCrScrPercentile() {
        return commCrScrPercentile;
    }

    @JsonProperty("comm_Cr_Scr_Percentile")
    public void setCommCrScrPercentile(List<CommCrScrPercentile> commCrScrPercentile) {
        this.commCrScrPercentile = commCrScrPercentile;
    }

    @JsonProperty("paydex")
    public List<Paydex> getPaydex() {
        return paydex;
    }

    @JsonProperty("paydex")
    public void setPaydex(List<Paydex> paydex) {
        this.paydex = paydex;
    }

    @JsonProperty("corporate_linkage")
    public List<CorporateLinkage> getCorporateLinkage() {
        return corporateLinkage;
    }

    @JsonProperty("corporate_linkage")
    public void setCorporateLinkage(List<CorporateLinkage> corporateLinkage) {
        this.corporateLinkage = corporateLinkage;
    }

    @JsonProperty("risk_Evalution")
    public List<RiskEvalution> getRiskEvalution() {
        return riskEvalution;
    }

    @JsonProperty("risk_Evalution")
    public void setRiskEvalution(List<RiskEvalution> riskEvalution) {
        this.riskEvalution = riskEvalution;
    }

    @JsonProperty("3 Band")
    public List<com.ng.DataModels._3Band> get3Band() {
        return _3Band;
    }

    @JsonProperty("3 Band")
    public void set3Band(List<com.ng.DataModels._3Band> _3Band) {
        this._3Band = _3Band;
    }

    @JsonProperty("5 Band")
    public List<com.ng.DataModels._5Band> get5Band() {
        return this._5Band;
    }

    @JsonProperty("5 Band")
    public void set5Band(List<com.ng.DataModels._5Band> _5Band) {
        this._5Band = _5Band;
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
        sb.append(DataModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
        sb.append(',');
        sb.append("wsDomain");
        sb.append('=');
        sb.append(((this.wsDomain == null)?"<null>":this.wsDomain));
        sb.append(',');
        sb.append("prmDomainId");
        sb.append('=');
        sb.append(((this.prmDomainId == null)?"<null>":this.prmDomainId));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("acctNo");
        sb.append('=');
        sb.append(((this.acctNo == null)?"<null>":this.acctNo));
        sb.append(',');
        sb.append("acctDetailStatus");
        sb.append('=');
        sb.append(((this.acctDetailStatus == null)?"<null>":this.acctDetailStatus));
        sb.append(',');
        sb.append("acctLastUpdateDate");
        sb.append('=');
        sb.append(((this.acctLastUpdateDate == null)?"<null>":this.acctLastUpdateDate));
        sb.append(',');
        sb.append("portfolioComparison");
        sb.append('=');
        sb.append(((this.portfolioComparison == null)?"<null>":this.portfolioComparison));
        sb.append(',');
        sb.append("companyProfile");
        sb.append('=');
        sb.append(((this.companyProfile == null)?"<null>":this.companyProfile));
        sb.append(',');
        sb.append("businessUnit");
        sb.append('=');
        sb.append(((this.businessUnit == null)?"<null>":this.businessUnit));
        sb.append(',');
        sb.append("customerType");
        sb.append('=');
        sb.append(((this.customerType == null)?"<null>":this.customerType));
        sb.append(',');
        sb.append("riskClassification");
        sb.append('=');
        sb.append(((this.riskClassification == null)?"<null>":this.riskClassification));
        sb.append(',');
        sb.append("dateCreated");
        sb.append('=');
        sb.append(((this.dateCreated == null)?"<null>":this.dateCreated));
        sb.append(',');
        sb.append("dateModified");
        sb.append('=');
        sb.append(((this.dateModified == null)?"<null>":this.dateModified));
        sb.append(',');
        sb.append("createBy");
        sb.append('=');
        sb.append(((this.createBy == null)?"<null>":this.createBy));
        sb.append(',');
        sb.append("excludeYn");
        sb.append('=');
        sb.append(((this.excludeYn == null)?"<null>":this.excludeYn));
        sb.append(',');
        sb.append("deleteYn");
        sb.append('=');
        sb.append(((this.deleteYn == null)?"<null>":this.deleteYn));
        sb.append(',');
        sb.append("businessName");
        sb.append('=');
        sb.append(((this.businessName == null)?"<null>":this.businessName));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("dunsNumber");
        sb.append('=');
        sb.append(((this.dunsNumber == null)?"<null>":this.dunsNumber));
        sb.append(',');
        sb.append("dnbRating");
        sb.append('=');
        sb.append(((this.dnbRating == null)?"<null>":this.dnbRating));
        sb.append(',');
        sb.append("sicCode");
        sb.append('=');
        sb.append(((this.sicCode == null)?"<null>":this.sicCode));
        sb.append(',');
        sb.append("naicsCode");
        sb.append('=');
        sb.append(((this.naicsCode == null)?"<null>":this.naicsCode));
        sb.append(',');
        sb.append("sicTwoDigitDesc");
        sb.append('=');
        sb.append(((this.sicTwoDigitDesc == null)?"<null>":this.sicTwoDigitDesc));
        sb.append(',');
        sb.append("employees");
        sb.append('=');
        sb.append(((this.employees == null)?"<null>":this.employees));
        sb.append(',');
        sb.append("outOfBusinessYn");
        sb.append('=');
        sb.append(((this.outOfBusinessYn == null)?"<null>":this.outOfBusinessYn));
        sb.append(',');
        sb.append("yearsInBusiness");
        sb.append('=');
        sb.append(((this.yearsInBusiness == null)?"<null>":this.yearsInBusiness));
        sb.append(',');
        sb.append("yearsWithCurrentMgmt");
        sb.append('=');
        sb.append(((this.yearsWithCurrentMgmt == null)?"<null>":this.yearsWithCurrentMgmt));
        sb.append(',');
        sb.append("incorporationYear");
        sb.append('=');
        sb.append(((this.incorporationYear == null)?"<null>":this.incorporationYear));
        sb.append(',');
        sb.append("bhqIndicator");
        sb.append('=');
        sb.append(((this.bhqIndicator == null)?"<null>":this.bhqIndicator));
        sb.append(',');
        sb.append("historyIndicator");
        sb.append('=');
        sb.append(((this.historyIndicator == null)?"<null>":this.historyIndicator));
        sb.append(',');
        sb.append("viabilityRating");
        sb.append('=');
        sb.append(((this.viabilityRating == null)?"<null>":this.viabilityRating));
        sb.append(',');
        sb.append("viabilityScore");
        sb.append('=');
        sb.append(((this.viabilityScore == null)?"<null>":this.viabilityScore));
        sb.append(',');
        sb.append("financialStressScore");
        sb.append('=');
        sb.append(((this.financialStressScore == null)?"<null>":this.financialStressScore));
        sb.append(',');
        sb.append("finStressClass");
        sb.append('=');
        sb.append(((this.finStressClass == null)?"<null>":this.finStressClass));
        sb.append(',');
        sb.append("fsspercentile");
        sb.append('=');
        sb.append(((this.fsspercentile == null)?"<null>":this.fsspercentile));
        sb.append(',');
        sb.append("commercialCreditScore");
        sb.append('=');
        sb.append(((this.commercialCreditScore == null)?"<null>":this.commercialCreditScore));
        sb.append(',');
        sb.append("commCrScrPercentile");
        sb.append('=');
        sb.append(((this.commCrScrPercentile == null)?"<null>":this.commCrScrPercentile));
        sb.append(',');
        sb.append("paydex");
        sb.append('=');
        sb.append(((this.paydex == null)?"<null>":this.paydex));
        sb.append(',');
        sb.append("corporateLinkage");
        sb.append('=');
        sb.append(((this.corporateLinkage == null)?"<null>":this.corporateLinkage));
        sb.append(',');
        sb.append("riskEvalution");
        sb.append('=');
        sb.append(((this.riskEvalution == null)?"<null>":this.riskEvalution));
        sb.append(',');
        sb.append("_3Band");
        sb.append('=');
        sb.append(((this._3Band == null)?"<null>":this._3Band));
        sb.append(',');
        sb.append("_5Band");
        sb.append('=');
        sb.append(((this._5Band == null)?"<null>":this._5Band));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}