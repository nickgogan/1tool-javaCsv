package com.ng.DataModels;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "credit_Limit",
        "commercial_Credit",
        "suit_Yn_Judgement_Yn",
        "lien_Yn_Bankruptcy_Yn",
        "prompt_Amt_Lien_Count",
        "lawsuit_Count",
        "total_Liabilities",
        "total_Assets",
        "current_Ratio",
        "total_Payment_Experiences",
        "dnb_Business_Bureau_Ind",
        "business_Net_Worth",
        "revenue",
        "date_Of_Aging",
        "credit_Limit_Utilization",
        "trade_Exp_Slow_Neg_Pmt",
        "avg_High_Credit",
        "debt_To_Net_Worth_Ratio",
        "highest_Credit",
        "slow_Or_Neg_Pmt_Count",
        "national_Acct_Number",
        "bad_Debt_Risk_Class",
        "prm_Country",
        "data_Depth_Indicator",
        "max_Credit_Recomm",
        "max_Credit_Currency_Code",
        "max_Credit_Recomm_Text",
        "max_Credit_Risk_Level",
        "aaa_Rating",
        "probability_Delinquency",
        "probability_Failiure",
        "no_Of_Accounts",
        "company_Total_Outstanding",
        "company_Total_Past_Due",
        "avg_Days_Beyond",
        "d_b_Rating_Risk_Ind",
        "paydex_Up_Down_Ind",
        "comm_Cr_Scr_Pctl_Up_Down_Ind",
        "fin_Str_Scr_Pctl_Up_Down_Ind"
})
@Generated("jsonschema2pojo")
public class RiskEvalution {
    @JsonProperty("credit_Limit")
    private String creditLimit;
    @JsonProperty("commercial_Credit")
    private String commercialCredit;
    @JsonProperty("suit_Yn_Judgement_Yn")
    private String suitYnJudgementYn;
    @JsonProperty("lien_Yn_Bankruptcy_Yn")
    private String lienYnBankruptcyYn;
    @JsonProperty("prompt_Amt_Lien_Count")
    private String promptAmtLienCount;
    @JsonProperty("lawsuit_Count")
    private String lawsuitCount;
    @JsonProperty("total_Liabilities")
    private String totalLiabilities;
    @JsonProperty("total_Assets")
    private String totalAssets;
    @JsonProperty("current_Ratio")
    private String currentRatio;
    @JsonProperty("total_Payment_Experiences")
    private String totalPaymentExperiences;
    @JsonProperty("dnb_Business_Bureau_Ind")
    private String dnbBusinessBureauInd;
    @JsonProperty("business_Net_Worth")
    private String businessNetWorth;
    @JsonProperty("revenue")
    private String revenue;
    @JsonProperty("date_Of_Aging")
    private String dateOfAging;
    @JsonProperty("credit_Limit_Utilization")
    private String creditLimitUtilization;
    @JsonProperty("trade_Exp_Slow_Neg_Pmt")
    private String tradeExpSlowNegPmt;
    @JsonProperty("avg_High_Credit")
    private String avgHighCredit;
    @JsonProperty("debt_To_Net_Worth_Ratio")
    private String debtToNetWorthRatio;
    @JsonProperty("highest_Credit")
    private String highestCredit;
    @JsonProperty("slow_Or_Neg_Pmt_Count")
    private String slowOrNegPmtCount;
    @JsonProperty("national_Acct_Number")
    private String nationalAcctNumber;
    @JsonProperty("bad_Debt_Risk_Class")
    private String badDebtRiskClass;
    @JsonProperty("prm_Country")
    private String prmCountry;
    @JsonProperty("data_Depth_Indicator")
    private String dataDepthIndicator;
    @JsonProperty("max_Credit_Recomm")
    private String maxCreditRecomm;
    @JsonProperty("max_Credit_Currency_Code")
    private String maxCreditCurrencyCode;
    @JsonProperty("max_Credit_Recomm_Text")
    private String maxCreditRecommText;
    @JsonProperty("max_Credit_Risk_Level")
    private String maxCreditRiskLevel;
    @JsonProperty("aaa_Rating")
    private String aaaRating;
    @JsonProperty("probability_Delinquency")
    private String probabilityDelinquency;
    @JsonProperty("probability_Failiure")
    private String probabilityFailiure;
    @JsonProperty("no_Of_Accounts")
    private String noOfAccounts;
    @JsonProperty("company_Total_Outstanding")
    private String companyTotalOutstanding;
    @JsonProperty("company_Total_Past_Due")
    private String companyTotalPastDue;
    @JsonProperty("avg_Days_Beyond")
    private String avgDaysBeyond;
    @JsonProperty("d_b_Rating_Risk_Ind")
    private String dBRatingRiskInd;
    @JsonProperty("paydex_Up_Down_Ind")
    private String paydexUpDownInd;
    @JsonProperty("comm_Cr_Scr_Pctl_Up_Down_Ind")
    private String commCrScrPctlUpDownInd;
    @JsonProperty("fin_Str_Scr_Pctl_Up_Down_Ind")
    private String finStrScrPctlUpDownInd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("credit_Limit")
    public String getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("credit_Limit")
    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("commercial_Credit")
    public String getCommercialCredit() {
        return commercialCredit;
    }

    @JsonProperty("commercial_Credit")
    public void setCommercialCredit(String commercialCredit) {
        this.commercialCredit = commercialCredit;
    }

    @JsonProperty("suit_Yn_Judgement_Yn")
    public String getSuitYnJudgementYn() {
        return suitYnJudgementYn;
    }

    @JsonProperty("suit_Yn_Judgement_Yn")
    public void setSuitYnJudgementYn(String suitYnJudgementYn) {
        this.suitYnJudgementYn = suitYnJudgementYn;
    }

    @JsonProperty("lien_Yn_Bankruptcy_Yn")
    public String getLienYnBankruptcyYn() {
        return lienYnBankruptcyYn;
    }

    @JsonProperty("lien_Yn_Bankruptcy_Yn")
    public void setLienYnBankruptcyYn(String lienYnBankruptcyYn) {
        this.lienYnBankruptcyYn = lienYnBankruptcyYn;
    }

    @JsonProperty("prompt_Amt_Lien_Count")
    public String getPromptAmtLienCount() {
        return promptAmtLienCount;
    }

    @JsonProperty("prompt_Amt_Lien_Count")
    public void setPromptAmtLienCount(String promptAmtLienCount) {
        this.promptAmtLienCount = promptAmtLienCount;
    }

    @JsonProperty("lawsuit_Count")
    public String getLawsuitCount() {
        return lawsuitCount;
    }

    @JsonProperty("lawsuit_Count")
    public void setLawsuitCount(String lawsuitCount) {
        this.lawsuitCount = lawsuitCount;
    }

    @JsonProperty("total_Liabilities")
    public String getTotalLiabilities() {
        return totalLiabilities;
    }

    @JsonProperty("total_Liabilities")
    public void setTotalLiabilities(String totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    @JsonProperty("total_Assets")
    public String getTotalAssets() {
        return totalAssets;
    }

    @JsonProperty("total_Assets")
    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
    }

    @JsonProperty("current_Ratio")
    public String getCurrentRatio() {
        return currentRatio;
    }

    @JsonProperty("current_Ratio")
    public void setCurrentRatio(String currentRatio) {
        this.currentRatio = currentRatio;
    }

    @JsonProperty("total_Payment_Experiences")
    public String getTotalPaymentExperiences() {
        return totalPaymentExperiences;
    }

    @JsonProperty("total_Payment_Experiences")
    public void setTotalPaymentExperiences(String totalPaymentExperiences) {
        this.totalPaymentExperiences = totalPaymentExperiences;
    }

    @JsonProperty("dnb_Business_Bureau_Ind")
    public String getDnbBusinessBureauInd() {
        return dnbBusinessBureauInd;
    }

    @JsonProperty("dnb_Business_Bureau_Ind")
    public void setDnbBusinessBureauInd(String dnbBusinessBureauInd) {
        this.dnbBusinessBureauInd = dnbBusinessBureauInd;
    }

    @JsonProperty("business_Net_Worth")
    public String getBusinessNetWorth() {
        return businessNetWorth;
    }

    @JsonProperty("business_Net_Worth")
    public void setBusinessNetWorth(String businessNetWorth) {
        this.businessNetWorth = businessNetWorth;
    }

    @JsonProperty("revenue")
    public String getRevenue() {
        return revenue;
    }

    @JsonProperty("revenue")
    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("date_Of_Aging")
    public String getDateOfAging() {
        return dateOfAging;
    }

    @JsonProperty("date_Of_Aging")
    public void setDateOfAging(String dateOfAging) {
        this.dateOfAging = dateOfAging;
    }

    @JsonProperty("credit_Limit_Utilization")
    public String getCreditLimitUtilization() {
        return creditLimitUtilization;
    }

    @JsonProperty("credit_Limit_Utilization")
    public void setCreditLimitUtilization(String creditLimitUtilization) {
        this.creditLimitUtilization = creditLimitUtilization;
    }

    @JsonProperty("trade_Exp_Slow_Neg_Pmt")
    public String getTradeExpSlowNegPmt() {
        return tradeExpSlowNegPmt;
    }

    @JsonProperty("trade_Exp_Slow_Neg_Pmt")
    public void setTradeExpSlowNegPmt(String tradeExpSlowNegPmt) {
        this.tradeExpSlowNegPmt = tradeExpSlowNegPmt;
    }

    @JsonProperty("avg_High_Credit")
    public String getAvgHighCredit() {
        return avgHighCredit;
    }

    @JsonProperty("avg_High_Credit")
    public void setAvgHighCredit(String avgHighCredit) {
        this.avgHighCredit = avgHighCredit;
    }

    @JsonProperty("debt_To_Net_Worth_Ratio")
    public String getDebtToNetWorthRatio() {
        return debtToNetWorthRatio;
    }

    @JsonProperty("debt_To_Net_Worth_Ratio")
    public void setDebtToNetWorthRatio(String debtToNetWorthRatio) {
        this.debtToNetWorthRatio = debtToNetWorthRatio;
    }

    @JsonProperty("highest_Credit")
    public String getHighestCredit() {
        return highestCredit;
    }

    @JsonProperty("highest_Credit")
    public void setHighestCredit(String highestCredit) {
        this.highestCredit = highestCredit;
    }

    @JsonProperty("slow_Or_Neg_Pmt_Count")
    public String getSlowOrNegPmtCount() {
        return slowOrNegPmtCount;
    }

    @JsonProperty("slow_Or_Neg_Pmt_Count")
    public void setSlowOrNegPmtCount(String slowOrNegPmtCount) {
        this.slowOrNegPmtCount = slowOrNegPmtCount;
    }

    @JsonProperty("national_Acct_Number")
    public String getNationalAcctNumber() {
        return nationalAcctNumber;
    }

    @JsonProperty("national_Acct_Number")
    public void setNationalAcctNumber(String nationalAcctNumber) {
        this.nationalAcctNumber = nationalAcctNumber;
    }

    @JsonProperty("bad_Debt_Risk_Class")
    public String getBadDebtRiskClass() {
        return badDebtRiskClass;
    }

    @JsonProperty("bad_Debt_Risk_Class")
    public void setBadDebtRiskClass(String badDebtRiskClass) {
        this.badDebtRiskClass = badDebtRiskClass;
    }

    @JsonProperty("prm_Country")
    public String getPrmCountry() {
        return prmCountry;
    }

    @JsonProperty("prm_Country")
    public void setPrmCountry(String prmCountry) {
        this.prmCountry = prmCountry;
    }

    @JsonProperty("data_Depth_Indicator")
    public String getDataDepthIndicator() {
        return dataDepthIndicator;
    }

    @JsonProperty("data_Depth_Indicator")
    public void setDataDepthIndicator(String dataDepthIndicator) {
        this.dataDepthIndicator = dataDepthIndicator;
    }

    @JsonProperty("max_Credit_Recomm")
    public String getMaxCreditRecomm() {
        return maxCreditRecomm;
    }

    @JsonProperty("max_Credit_Recomm")
    public void setMaxCreditRecomm(String maxCreditRecomm) {
        this.maxCreditRecomm = maxCreditRecomm;
    }

    @JsonProperty("max_Credit_Currency_Code")
    public String getMaxCreditCurrencyCode() {
        return maxCreditCurrencyCode;
    }

    @JsonProperty("max_Credit_Currency_Code")
    public void setMaxCreditCurrencyCode(String maxCreditCurrencyCode) {
        this.maxCreditCurrencyCode = maxCreditCurrencyCode;
    }

    @JsonProperty("max_Credit_Recomm_Text")
    public String getMaxCreditRecommText() {
        return maxCreditRecommText;
    }

    @JsonProperty("max_Credit_Recomm_Text")
    public void setMaxCreditRecommText(String maxCreditRecommText) {
        this.maxCreditRecommText = maxCreditRecommText;
    }

    @JsonProperty("max_Credit_Risk_Level")
    public String getMaxCreditRiskLevel() {
        return maxCreditRiskLevel;
    }

    @JsonProperty("max_Credit_Risk_Level")
    public void setMaxCreditRiskLevel(String maxCreditRiskLevel) {
        this.maxCreditRiskLevel = maxCreditRiskLevel;
    }

    @JsonProperty("aaa_Rating")
    public String getAaaRating() {
        return aaaRating;
    }

    @JsonProperty("aaa_Rating")
    public void setAaaRating(String aaaRating) {
        this.aaaRating = aaaRating;
    }

    @JsonProperty("probability_Delinquency")
    public String getProbabilityDelinquency() {
        return probabilityDelinquency;
    }

    @JsonProperty("probability_Delinquency")
    public void setProbabilityDelinquency(String probabilityDelinquency) {
        this.probabilityDelinquency = probabilityDelinquency;
    }

    @JsonProperty("probability_Failiure")
    public String getProbabilityFailiure() {
        return probabilityFailiure;
    }

    @JsonProperty("probability_Failiure")
    public void setProbabilityFailiure(String probabilityFailiure) {
        this.probabilityFailiure = probabilityFailiure;
    }

    @JsonProperty("no_Of_Accounts")
    public String getNoOfAccounts() {
        return noOfAccounts;
    }

    @JsonProperty("no_Of_Accounts")
    public void setNoOfAccounts(String noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }

    @JsonProperty("company_Total_Outstanding")
    public String getCompanyTotalOutstanding() {
        return companyTotalOutstanding;
    }

    @JsonProperty("company_Total_Outstanding")
    public void setCompanyTotalOutstanding(String companyTotalOutstanding) {
        this.companyTotalOutstanding = companyTotalOutstanding;
    }

    @JsonProperty("company_Total_Past_Due")
    public String getCompanyTotalPastDue() {
        return companyTotalPastDue;
    }

    @JsonProperty("company_Total_Past_Due")
    public void setCompanyTotalPastDue(String companyTotalPastDue) {
        this.companyTotalPastDue = companyTotalPastDue;
    }

    @JsonProperty("avg_Days_Beyond")
    public String getAvgDaysBeyond() {
        return avgDaysBeyond;
    }

    @JsonProperty("avg_Days_Beyond")
    public void setAvgDaysBeyond(String avgDaysBeyond) {
        this.avgDaysBeyond = avgDaysBeyond;
    }

    @JsonProperty("d_b_Rating_Risk_Ind")
    public String getdBRatingRiskInd() {
        return dBRatingRiskInd;
    }

    @JsonProperty("d_b_Rating_Risk_Ind")
    public void setdBRatingRiskInd(String dBRatingRiskInd) {
        this.dBRatingRiskInd = dBRatingRiskInd;
    }

    @JsonProperty("paydex_Up_Down_Ind")
    public String getPaydexUpDownInd() {
        return paydexUpDownInd;
    }

    @JsonProperty("paydex_Up_Down_Ind")
    public void setPaydexUpDownInd(String paydexUpDownInd) {
        this.paydexUpDownInd = paydexUpDownInd;
    }

    @JsonProperty("comm_Cr_Scr_Pctl_Up_Down_Ind")
    public String getCommCrScrPctlUpDownInd() {
        return commCrScrPctlUpDownInd;
    }

    @JsonProperty("comm_Cr_Scr_Pctl_Up_Down_Ind")
    public void setCommCrScrPctlUpDownInd(String commCrScrPctlUpDownInd) {
        this.commCrScrPctlUpDownInd = commCrScrPctlUpDownInd;
    }

    @JsonProperty("fin_Str_Scr_Pctl_Up_Down_Ind")
    public String getFinStrScrPctlUpDownInd() {
        return finStrScrPctlUpDownInd;
    }

    @JsonProperty("fin_Str_Scr_Pctl_Up_Down_Ind")
    public void setFinStrScrPctlUpDownInd(String finStrScrPctlUpDownInd) {
        this.finStrScrPctlUpDownInd = finStrScrPctlUpDownInd;
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
        sb.append(com.ng.DataModels.RiskEvalution.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("creditLimit");
        sb.append('=');
        sb.append(((this.creditLimit == null) ? "<null>" : this.creditLimit));
        sb.append(',');
        sb.append("commercialCredit");
        sb.append('=');
        sb.append(((this.commercialCredit == null) ? "<null>" : this.commercialCredit));
        sb.append(',');
        sb.append("suitYnJudgementYn");
        sb.append('=');
        sb.append(((this.suitYnJudgementYn == null) ? "<null>" : this.suitYnJudgementYn));
        sb.append(',');
        sb.append("lienYnBankruptcyYn");
        sb.append('=');
        sb.append(((this.lienYnBankruptcyYn == null) ? "<null>" : this.lienYnBankruptcyYn));
        sb.append(',');
        sb.append("promptAmtLienCount");
        sb.append('=');
        sb.append(((this.promptAmtLienCount == null) ? "<null>" : this.promptAmtLienCount));
        sb.append(',');
        sb.append("lawsuitCount");
        sb.append('=');
        sb.append(((this.lawsuitCount == null) ? "<null>" : this.lawsuitCount));
        sb.append(',');
        sb.append("totalLiabilities");
        sb.append('=');
        sb.append(((this.totalLiabilities == null) ? "<null>" : this.totalLiabilities));
        sb.append(',');
        sb.append("totalAssets");
        sb.append('=');
        sb.append(((this.totalAssets == null) ? "<null>" : this.totalAssets));
        sb.append(',');
        sb.append("currentRatio");
        sb.append('=');
        sb.append(((this.currentRatio == null) ? "<null>" : this.currentRatio));
        sb.append(',');
        sb.append("totalPaymentExperiences");
        sb.append('=');
        sb.append(((this.totalPaymentExperiences == null) ? "<null>" : this.totalPaymentExperiences));
        sb.append(',');
        sb.append("dnbBusinessBureauInd");
        sb.append('=');
        sb.append(((this.dnbBusinessBureauInd == null) ? "<null>" : this.dnbBusinessBureauInd));
        sb.append(',');
        sb.append("businessNetWorth");
        sb.append('=');
        sb.append(((this.businessNetWorth == null) ? "<null>" : this.businessNetWorth));
        sb.append(',');
        sb.append("revenue");
        sb.append('=');
        sb.append(((this.revenue == null) ? "<null>" : this.revenue));
        sb.append(',');
        sb.append("dateOfAging");
        sb.append('=');
        sb.append(((this.dateOfAging == null) ? "<null>" : this.dateOfAging));
        sb.append(',');
        sb.append("creditLimitUtilization");
        sb.append('=');
        sb.append(((this.creditLimitUtilization == null) ? "<null>" : this.creditLimitUtilization));
        sb.append(',');
        sb.append("tradeExpSlowNegPmt");
        sb.append('=');
        sb.append(((this.tradeExpSlowNegPmt == null) ? "<null>" : this.tradeExpSlowNegPmt));
        sb.append(',');
        sb.append("avgHighCredit");
        sb.append('=');
        sb.append(((this.avgHighCredit == null) ? "<null>" : this.avgHighCredit));
        sb.append(',');
        sb.append("debtToNetWorthRatio");
        sb.append('=');
        sb.append(((this.debtToNetWorthRatio == null) ? "<null>" : this.debtToNetWorthRatio));
        sb.append(',');
        sb.append("highestCredit");
        sb.append('=');
        sb.append(((this.highestCredit == null) ? "<null>" : this.highestCredit));
        sb.append(',');
        sb.append("slowOrNegPmtCount");
        sb.append('=');
        sb.append(((this.slowOrNegPmtCount == null) ? "<null>" : this.slowOrNegPmtCount));
        sb.append(',');
        sb.append("nationalAcctNumber");
        sb.append('=');
        sb.append(((this.nationalAcctNumber == null) ? "<null>" : this.nationalAcctNumber));
        sb.append(',');
        sb.append("badDebtRiskClass");
        sb.append('=');
        sb.append(((this.badDebtRiskClass == null) ? "<null>" : this.badDebtRiskClass));
        sb.append(',');
        sb.append("prmCountry");
        sb.append('=');
        sb.append(((this.prmCountry == null) ? "<null>" : this.prmCountry));
        sb.append(',');
        sb.append("dataDepthIndicator");
        sb.append('=');
        sb.append(((this.dataDepthIndicator == null) ? "<null>" : this.dataDepthIndicator));
        sb.append(',');
        sb.append("maxCreditRecomm");
        sb.append('=');
        sb.append(((this.maxCreditRecomm == null) ? "<null>" : this.maxCreditRecomm));
        sb.append(',');
        sb.append("maxCreditCurrencyCode");
        sb.append('=');
        sb.append(((this.maxCreditCurrencyCode == null) ? "<null>" : this.maxCreditCurrencyCode));
        sb.append(',');
        sb.append("maxCreditRecommText");
        sb.append('=');
        sb.append(((this.maxCreditRecommText == null) ? "<null>" : this.maxCreditRecommText));
        sb.append(',');
        sb.append("maxCreditRiskLevel");
        sb.append('=');
        sb.append(((this.maxCreditRiskLevel == null) ? "<null>" : this.maxCreditRiskLevel));
        sb.append(',');
        sb.append("aaaRating");
        sb.append('=');
        sb.append(((this.aaaRating == null) ? "<null>" : this.aaaRating));
        sb.append(',');
        sb.append("probabilityDelinquency");
        sb.append('=');
        sb.append(((this.probabilityDelinquency == null) ? "<null>" : this.probabilityDelinquency));
        sb.append(',');
        sb.append("probabilityFailiure");
        sb.append('=');
        sb.append(((this.probabilityFailiure == null) ? "<null>" : this.probabilityFailiure));
        sb.append(',');
        sb.append("noOfAccounts");
        sb.append('=');
        sb.append(((this.noOfAccounts == null) ? "<null>" : this.noOfAccounts));
        sb.append(',');
        sb.append("companyTotalOutstanding");
        sb.append('=');
        sb.append(((this.companyTotalOutstanding == null) ? "<null>" : this.companyTotalOutstanding));
        sb.append(',');
        sb.append("companyTotalPastDue");
        sb.append('=');
        sb.append(((this.companyTotalPastDue == null) ? "<null>" : this.companyTotalPastDue));
        sb.append(',');
        sb.append("avgDaysBeyond");
        sb.append('=');
        sb.append(((this.avgDaysBeyond == null) ? "<null>" : this.avgDaysBeyond));
        sb.append(',');
        sb.append("dBRatingRiskInd");
        sb.append('=');
        sb.append(((this.dBRatingRiskInd == null) ? "<null>" : this.dBRatingRiskInd));
        sb.append(',');
        sb.append("paydexUpDownInd");
        sb.append('=');
        sb.append(((this.paydexUpDownInd == null) ? "<null>" : this.paydexUpDownInd));
        sb.append(',');
        sb.append("commCrScrPctlUpDownInd");
        sb.append('=');
        sb.append(((this.commCrScrPctlUpDownInd == null) ? "<null>" : this.commCrScrPctlUpDownInd));
        sb.append(',');
        sb.append("finStrScrPctlUpDownInd");
        sb.append('=');
        sb.append(((this.finStrScrPctlUpDownInd == null) ? "<null>" : this.finStrScrPctlUpDownInd));
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
