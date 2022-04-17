package com.ng;

import java.util.*;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "FIN_STR_SCR_PCTL_UP_DOWN_IND",
        "COMM_CR_SCR_PCTL_UP_DOWN_IND",
        "PAYDEX_UP_DOWN_IND",
        "D_B_RATING_RISK_IND",
        "AVG_DAYS_BEYOND",
        "COMPANY_TOTAL_PAST_DUE",
        "COMPANY_TOTAL_OUTSTANDING",
        "NO_OF_ACCOUNTS",
        "ENDROSEMENT_NAME",
        "OBR_5_BAND",
        "PORTFOLIO_COMPARISON_5_BAND",
        "VIABILITY_SCORE_5_BAND",
        "PORTFOLIO_COMPARISON_3_BAND",
        "VIABILITY_SCORE_3_BAND",
        "FAILURE_5_BAND",
        "FAILURE_3_BAND",
        "DELQ_3_BAND",
        "DELQ_5_BAND",
        "PAYDEX_3_BAND",
        "PAYDEX_5_BAND",
        "DB_RATING_5_BAND",
        "DB_RATING_3_BAND",
        "PROBABILITY_FAILURE",
        "PROBABILITY_DELINQUENCY",
        "PAYMENT_RISK_3_BAND",
        "PAYMENT_RISK_5_BAND",
        "AAA_RATING",
        "INDI_CONSOLIDATED",
        "MAX_CREDIT_RISK_LEVEL",
        "MAX_CREDIT_RECOMM_TEXT",
        "MAX_CREDIT_CURRENCY_CODE",
        "MAX_CREDIT_RECOMM",
        "PAY_WIHTIN_TERMS_PERC",
        "CONSERVATIVE_CREDIT_LIMIT",
        "SOURCE_ID",
        "SBFE_STANDARD_SCORE",
        "NAICS_CODE",
        "PAYDEX_11MONTHSAGO",
        "PAYDEX_10MONTHSAGO",
        "PAYDEX_8MONTHSAGO",
        "PAYDEX_7MONTHSAGO",
        "PAYDEX_4MONTHSAGO",
        "PAYDEX_2MONTHSAGO",
        "PAYDEX_5MONTHSAGO",
        "CCSPERCENTILE_11MONTHSAGO",
        "CCSPERCENTILE_10MONTHSAGO",
        "CCSPERCENTILE_8MONTHSAGO",
        "CCSPERCENTILE_7MONTHSAGO",
        "CCSPERCENTILE_5MONTHSAGO",
        "CCSPERCENTILE_4MONTHSAGO",
        "CCSPERCENTILE_2MONTHSAGO",
        "CCSCLASS_6MONTHSAGO",
        "CCSCLASS_10MONTHSAGO",
        "CCSCLASS_9MONTHSAGO",
        "CCSCLASS_3MONTHSAGO",
        "CCSCLASS_12MONTHSAGO",
        "CCSCLASS_7MONTHSAGO",
        "CCSCLASS_11MONTHSAGO",
        "CCSCLASS_8MONTHSAGO",
        "CCSCLASS_5MONTHSAGO",
        "CCSCLASS_4MONTHSAGO",
        "CCSCLASS_2MONTHSAGO",
        "CCSCLASS_1MONTHSAGO",
        "CCSSCORE_12MONTHSAGO",
        "CCSSCORE_6MONTHSAGO",
        "CCSSCORE_1MONTHSAGO",
        "CCSSCORE_8MONTHSAGO",
        "CCSSCORE_9MONTHSAGO",
        "CCSSCORE_11MONTHSAGO",
        "CCSSCORE_10MONTHSAGO",
        "CCSSCORE_7MONTHSAGO",
        "CCSSCORE_5MONTHSAGO",
        "CCSSCORE_4MONTHSAGO",
        "CCSSCORE_3MONTHSAGO",
        "CCSSCORE_2MONTHSAGO",
        "FSSPERCENTILE_8MONTHSAGO",
        "FSSPERCENTILE_4MONTHSAGO",
        "FSSPERCENTILE_11MONTHSAGO",
        "FSSPERCENTILE_10MONTHSAGO",
        "FSSPERCENTILE_7MONTHSAGO",
        "FSSPERCENTILE_5MONTHSAGO",
        "FSSPERCENTILE_2MONTHSAGO",
        "FSSSCORE_11MONTHSAGO",
        "FSSSCORE_5MONTHSAGO",
        "FSSSCORE_8MONTHSAGO",
        "FSSSCORE_3MONTHSAGO",
        "FSSSCORE_7MONTHSAGO",
        "FSSSCORE_12MONTHSAGO",
        "FSSSCORE_10MONTHSAGO",
        "FSSSCORE_9MONTHSAGO",
        "FSSSCORE_6MONTHSAGO",
        "FSSSCORE_4MONTHSAGO",
        "FSSSCORE_2MONTHSAGO",
        "FSSSCORE_1MONTHSAGO",
        "FSSCLASS_8MONTHSAGO",
        "FSSCLASS_3MONTHSAGO",
        "FSSCLASS_7MONTHSAGO",
        "FSSCLASS_12MONTHSAGO",
        "FSSCLASS_11MONTHSAGO",
        "FSSCLASS_10MONTHSAGO",
        "FSSCLASS_9MONTHSAGO",
        "FSSCLASS_6MONTHSAGO",
        "FSSCLASS_5MONTHSAGO",
        "FSSCLASS_4MONTHSAGO",
        "FSSCLASS_2MONTHSAGO",
        "FSSCLASS_1MONTHSAGO",
        "VIABILITY_RATING",
        "COMPANY_PROFILE",
        "DATA_DEPTH_INDICATOR",
        "PORTFOLIO_COMPARISON",
        "VIABILITY_SCORE",
        "PARENT_NAME",
        "BUREAU_BIZ_OWNERSHIP_TYPE",
        "ACCOUNT_CREATED_DATE",
        "PARENT_COUNTRY",
        "LEGAL_FLAG",
        "PARENT_DUNS_NUMBER",
        "SALESPERSON_NO",
        "PRM_COUNTRY",
        "SIC_TWO_DIGIT_DESC",
        "BAD_DEBT_RISK_CLASS",
        "LAWSUIT_COUNT",
        "LIEN_COUNT",
        "PROMPT_AMT",
        "PROMPT_PCT_AGING",
        "NATIONAL_ACCT_NUMBER",
        "SLOW_OR_NEG_PMT_COUNT",
        "HIGHEST_CREDIT",
        "DEBT_TO_NET_WORTH_RATIO",
        "AVG_HIGH_CREDIT",
        "NEGATIVE_PAYMENT_COUNT",
        "SLOW_PAYMENT_COUNT",
        "HIGH_RISK_INDICATOR",
        "VALUE_OF_LIEN",
        "VALUE_OFCOURT_JUDGEMENT",
        "VALUE_OF_SUIT",
        "JUDGEMENT_COUNT",
        "INC_YEAR",
        "DUNS_TEL",
        "PAY_WITHIN_TERM_COUNT",
        "SCORE_16",
        "SCORE_20",
        "SCORE_19",
        "SCORE_18",
        "SCORE_17",
        "SCORE_15",
        "SCORE_14",
        "SCORE_13",
        "SCORE_12",
        "SCORE_11",
        "SCORE_10",
        "SCORE_9",
        "SCORE_8",
        "SCORE_7",
        "SCORE_6",
        "SCORE_5",
        "SCORE_4",
        "SCORE_3",
        "SCORE_2",
        "SCORE_1",
        "DELETE_YN",
        "TRADE_EXP_SLOW_NEG_PMT",
        "CONTROL_YEAR",
        "INCORPORATION_YEAR",
        "BUSINESS_START_DATE",
        "LAST_PAYMENT_DATE",
        "LAST_ORDER_DATE",
        "LAST_YEAR_SALES",
        "LAST_ORDER_AMT",
        "LAST_PAYMENT_AMT",
        "BUSINESS_OWNERSHIP_TYPE",
        "DIVISION",
        "DISTRICT",
        "EXCLUDE_YN",
        "FINANCIAL_STRESS_SCORE",
        "COMMERCIAL_CREDIT_SCORE",
        "PARENT_CUST_NUMBER",
        "GLOBAL_ULTIMATE_PARENT_CUSTNO",
        "HEADQTR_COUNTRY_CODE",
        "GLOBAL_ULTIMATE_COUNTRY",
        "BUSINESS_METROAREA",
        "HEAD_NAME",
        "DAYS_BEYOND_TERMS",
        "DUNS_NUMBER",
        "MODIFIED_BY",
        "CREATED_BY",
        "DATE_MODIFIED",
        "DATE_CREATED",
        "CREDIT_LIMIT_UTILIZATION",
        "DAYS_SALES_OUTSTANDING",
        "TOTAL_OUTSTG_WITH_OUT_CREDIT",
        "BACK_OFF_TOTAL_OUTSTANDING_AMT",
        "TOTAL_OUTSTANDING_AMT",
        "TOTAL_PASTDUE_AMT",
        "BUCKET_11_PCT_OVER",
        "BUCKET_10_PCT_OVER",
        "BUCKET_9_PCT_OVER",
        "BUCKET_8_PCT_OVER",
        "BUCKET_7_PCT_OVER",
        "BUCKET_6_PCT_OVER",
        "BUCKET_5_PCT_OVER",
        "BUCKET_4_PCT_OVER",
        "BUCKET_3_PCT_OVER",
        "BUCKET_2_PCT_OVER",
        "BUCKET_1_PCT_OVER",
        "BUCKET_12_PCT",
        "BUCKET_11_PCT",
        "BUCKET_10_PCT",
        "BUCKET_9_PCT",
        "BUCKET_8_PCT",
        "BUCKET_7_PCT",
        "BUCKET_6_PCT",
        "BUCKET_5_PCT",
        "BUCKET_4_PCT",
        "BUCKET_3_PCT",
        "BUCKET_2_PCT",
        "BUCKET_1_PCT",
        "BUCKET_11_AMT_OVER",
        "BUCKET_10_AMT_OVER",
        "BUCKET_9_AMT_OVER",
        "BUCKET_8_AMT_OVER",
        "BUCKET_7_AMT_OVER",
        "BUCKET_6_AMT_OVER",
        "BUCKET_5_AMT_OVER",
        "BUCKET_4_AMT_OVER",
        "BUCKET_3_AMT_OVER",
        "BUCKET_2_AMT_OVER",
        "BUCKET_1_AMT_OVER",
        "BUCKET_12_AMT",
        "BUCKET_11_AMT",
        "BUCKET_10_AMT",
        "BUCKET_9_AMT",
        "BUCKET_8_AMT",
        "BUCKET_7_AMT",
        "BUCKET_6_AMT",
        "BUCKET_5_AMT",
        "BUCKET_4_AMT",
        "BUCKET_3_AMT",
        "BUCKET_2_AMT",
        "BUCKET_1_AMT",
        "DATE_OF_AGING",
        "PAYMENT_TERM",
        "PUBLIC_IND",
        "HISTORY_INDICATOR",
        "BHQ_INDICATOR",
        "REVENUE",
        "BUSINESS_NET_WORTH",
        "DNB_BUSINESS_BUREAU_IND",
        "YEARS_WITH_CURRENT_MGMT",
        "TRADE_EXP_SLOW_NEG_PMT_PCT",
        "TOTAL_PAYMENT_EXPERIENCES",
        "CURRENT_RATIO",
        "TOTAL_ASSETS",
        "TOTAL_LIABILITIES",
        "BANKRUPTCY_YN",
        "LIEN_YN",
        "JUDGEMENT_YN",
        "SUIT_YN",
        "TERRITORY",
        "RISK_CLASSIFICATION",
        "CUSTOMER_TYPE",
        "BUSINESS_UNIT",
        "BUSINESS_STRUCTURE",
        "CUSTOMER_NO",
        "SALESPERSON_NAME",
        "PRODUCT_LINE",
        "LAST_PAYMENT_AMOUNT",
        "PAYDEX_12MONTHSAGO",
        "PAYDEX_6MONTHSAGO",
        "PAYDEX_3MONTHSAGO",
        "PAYDEX_9MONTHSAGO",
        "PAYDEX_1MONTHSAGO",
        "CCSPERCENTILE_12MONTHSAGO",
        "CCSPERCENTILE_9MONTHSAGO",
        "CCSPERCENTILE_6MONTHSAGO",
        "CCSPERCENTILE_3MONTHSAGO",
        "CCSPERCENTILE_1MONTHSAGO",
        "FSSPERCENTILE_12MONTHSAGO",
        "FSSPERCENTILE_9MONTHSAGO",
        "FSSPERCENTILE_6MONTHSAGO",
        "FSSPERCENTILE_3MONTHSAGO",
        "FSSPERCENTILE_1MONTHSAGO",
        "HEAD_DUNS_NUMBER",
        "GLOBAL_ULTIM_NAME",
        "GLOBAL_ULTIM_DUNS_NUMBER",
        "YEARS_IN_BUSINESS",
        "OUT_OF_BUSINESS_YN",
        "EMPLOYEES",
        "SIC_CODE",
        "RECOMMENDED_CREDIT_LIMIT ",
        "CREDIT_LIMIT ",
        "DNB_RATING",
        "FIN_STRESS_CLASS",
        "COMM_CR_SCR_CLASS",
        "PAYDEX",
        "COMM_CR_SCR_PERCENTILE",
        "FIN_STRESS_SCR_PERCENTILE",
        "DUNS_COUNTRY",
        "DUNS_STATE",
        "DUNS_ZIP",
        "DUNS_CITY",
        "DUNS_STREET2",
        "DUNS_STREET1",
        "DUNS_BUSINESS_NAME",
        "BUSINESS_COUNTRY",
        "STATE",
        "ZIP",
        "CITY",
        "STREET2",
        "STREET1",
        "BUSINESS_NAME",
        "ACCT_LAST_UPDATE_DATE",
        "ACCT_DETAIL_STATUS",
        "ACCT_NO",
        "ENTITY_ID",
        "ENTITY_TYPE",
        "PRM_DOMAIN_ID",
        "WS_DOMAIN",
        "WORKSPACE_ID"
})
@Generated("jsonschema2pojo")
public class DtoCsvRow2 {
    @JsonIgnore
    private String[] setters = {"setFinStrScrPctlUpDownInd","setCommCrScrPctlUpDownInd","setPaydexUpDownInd","setDBRatingRiskInd","setAvgDaysBeyond","setCompanyTotalPastDue","setCompanyTotalOutstanding","setNoOfAccounts","setEndrosementName","setObr5Band","setPortfolioComparison5Band","setViabilityScore5Band","setPortfolioComparison3Band","setViabilityScore3Band","setFailure5Band","setFailure3Band","setDelq3Band","setDelq5Band","setPaydex3Band","setPaydex5Band","setDbRating5Band","setDbRating3Band","setProbabilityFailure","setProbabilityDelinquency","setPaymentRisk3Band","setPaymentRisk5Band","setAaaRating","setIndiConsolidated","setMaxCreditRiskLevel","setMaxCreditRecommText","setMaxCreditCurrencyCode","setMaxCreditRecomm","setPayWihtinTermsPerc","setConservativeCreditLimit","setSourceId","setSbfeStandardScore","setNaicsCode","setPaydex11monthsago","setPaydex10monthsago","setPaydex8monthsago","setPaydex7monthsago","setPaydex4monthsago","setPaydex2monthsago","setPaydex5monthsago","setCcspercentile11monthsago","setCcspercentile10monthsago","setCcspercentile8monthsago","setCcspercentile7monthsago","setCcspercentile5monthsago","setCcspercentile4monthsago","setCcspercentile2monthsago","setCcsclass6monthsago","setCcsclass10monthsago","setCcsclass9monthsago","setCcsclass3monthsago","setCcsclass12monthsago","setCcsclass7monthsago","setCcsclass11monthsago","setCcsclass8monthsago","setCcsclass5monthsago","setCcsclass4monthsago","setCcsclass2monthsago","setCcsclass1monthsago","setCcsscore12monthsago","setCcsscore6monthsago","setCcsscore1monthsago","setCcsscore8monthsago","setCcsscore9monthsago","setCcsscore11monthsago","setCcsscore10monthsago","setCcsscore7monthsago","setCcsscore5monthsago","setCcsscore4monthsago","setCcsscore3monthsago","setCcsscore2monthsago","setFsspercentile8monthsago","setFsspercentile4monthsago","setFsspercentile11monthsago","setFsspercentile10monthsago","setFsspercentile7monthsago","setFsspercentile5monthsago","setFsspercentile2monthsago","setFssscore11monthsago","setFssscore5monthsago","setFssscore8monthsago","setFssscore3monthsago","setFssscore7monthsago","setFssscore12monthsago","setFssscore10monthsago","setFssscore9monthsago","setFssscore6monthsago","setFssscore4monthsago","setFssscore2monthsago","setFssscore1monthsago","setFssclass8monthsago","setFssclass3monthsago","setFssclass7monthsago","setFssclass12monthsago","setFssclass11monthsago","setFssclass10monthsago","setFssclass9monthsago","setFssclass6monthsago","setFssclass5monthsago","setFssclass4monthsago","setFssclass2monthsago","setFssclass1monthsago","setViabilityRating","setCompanyProfile","setDataDepthIndicator","setPortfolioComparison","setViabilityScore","setParentName","setBureauBizOwnershipType","setAccountCreatedDate","setParentCountry","setLegalFlag","setParentDunsNumber","setSalespersonNo","setPrmCountry","setSicTwoDigitDesc","setBadDebtRiskClass","setLawsuitCount","setLienCount","setPromptAmt","setPromptPctAging","setNationalAcctNumber","setSlowOrNegPmtCount","setHighestCredit","setDebtToNetWorthRatio","setAvgHighCredit","setNegativePaymentCount","setSlowPaymentCount","setHighRiskIndicator","setValueOfLien","setValueOfcourtJudgement","setValueOfSuit","setJudgementCount","setIncYear","setDunsTel","setPayWithinTermCount","setScore16","setScore20","setScore19","setScore18","setScore17","setScore15","setScore14","setScore13","setScore12","setScore11","setScore10","setScore9","setScore8","setScore7","setScore6","setScore5","setScore4","setScore3","setScore2","setScore1","setDeleteYn","setTradeExpSlowNegPmt","setControlYear","setIncorporationYear","setBusinessStartDate","setLastPaymentDate","setLastOrderDate","setLastYearSales","setLastOrderAmt","setLastPaymentAmt","setBusinessOwnershipType","setDivision","setDistrict","setExcludeYn","setFinancialStressScore","setCommercialCreditScore","setParentCustNumber","setGlobalUltimateParentCustno","setHeadqtrCountryCode","setGlobalUltimateCountry","setBusinessMetroarea","setHeadName","setDaysBeyondTerms","setDunsNumber","setModifiedBy","setCreatedBy","setDateModified","setDateCreated","setCreditLimitUtilization","setDaysSalesOutstanding","setTotalOutstgWithOutCredit","setBackOffTotalOutstandingAmt","setTotalOutstandingAmt","setTotalPastdueAmt","setBucket11PctOver","setBucket10PctOver","setBucket9PctOver","setBucket8PctOver","setBucket7PctOver","setBucket6PctOver","setBucket5PctOver","setBucket4PctOver","setBucket3PctOver","setBucket2PctOver","setBucket1PctOver","setBucket12Pct","setBucket11Pct","setBucket10Pct","setBucket9Pct","setBucket8Pct","setBucket7Pct","setBucket6Pct","setBucket5Pct","setBucket4Pct","setBucket3Pct","setBucket2Pct","setBucket1Pct","setBucket11AmtOver","setBucket10AmtOver","setBucket9AmtOver","setBucket8AmtOver","setBucket7AmtOver","setBucket6AmtOver","setBucket5AmtOver","setBucket4AmtOver","setBucket3AmtOver","setBucket2AmtOver","setBucket1AmtOver","setBucket12Amt","setBucket11Amt","setBucket10Amt","setBucket9Amt","setBucket8Amt","setBucket7Amt","setBucket6Amt","setBucket5Amt","setBucket4Amt","setBucket3Amt","setBucket2Amt","setBucket1Amt","setDateOfAging","setPaymentTerm","setPublicInd","setHistoryIndicator","setBhqIndicator","setRevenue","setBusinessNetWorth","setDnbBusinessBureauInd","setYearsWithCurrentMgmt","setTradeExpSlowNegPmtPct","setTotalPaymentExperiences","setCurrentRatio","setTotalAssets","setTotalLiabilities","setBankruptcyYn","setLienYn","setJudgementYn","setSuitYn","setTerritory","setRiskClassification","setCustomerType","setBusinessUnit","setBusinessStructure","setCustomerNo","setSalespersonName","setProductLine","setLastPaymentAmount","setPaydex12monthsago","setPaydex6monthsago","setPaydex3monthsago","setPaydex9monthsago","setPaydex1monthsago","setCcspercentile12monthsago","setCcspercentile9monthsago","setCcspercentile6monthsago","setCcspercentile3monthsago","setCcspercentile1monthsago","setFsspercentile12monthsago","setFsspercentile9monthsago","setFsspercentile6monthsago","setFsspercentile3monthsago","setFsspercentile1monthsago","setHeadDunsNumber","setGlobalUltimName","setGlobalUltimDunsNumber","setYearsInBusiness","setOutOfBusinessYn","setEmployees","setSicCode","setRecommendedCreditLimit","setCreditLimit","setDnbRating","setFinStressClass","setCommCrScrClass","setPaydex","setCommCrScrPercentile","setFinStressScrPercentile","setDunsCountry","setDunsState","setDunsZip","setDunsCity","setDunsStreet2","setDunsStreet1","setDunsBusinessName","setBusinessCountry","setState","setZip","setCity","setStreet2","setStreet1","setBusinessName","setAcctLastUpdateDate","setAcctDetailStatus","setAcctNo","setEntityId","setEntityType","setPrmDomainId","setWsDomain","setWorkspaceId"};
    @JsonProperty("FIN_STR_SCR_PCTL_UP_DOWN_IND")
    private String finStrScrPctlUpDownInd;
    @JsonProperty("COMM_CR_SCR_PCTL_UP_DOWN_IND")
    private String commCrScrPctlUpDownInd;
    @JsonProperty("PAYDEX_UP_DOWN_IND")
    private String paydexUpDownInd;
    @JsonProperty("D_B_RATING_RISK_IND")
    private String dBRatingRiskInd;
    @JsonProperty("AVG_DAYS_BEYOND")
    private String avgDaysBeyond;
    @JsonProperty("COMPANY_TOTAL_PAST_DUE")
    private String companyTotalPastDue;
    @JsonProperty("COMPANY_TOTAL_OUTSTANDING")
    private String companyTotalOutstanding;
    @JsonProperty("NO_OF_ACCOUNTS")
    private String noOfAccounts;
    @JsonProperty("ENDROSEMENT_NAME")
    private String endrosementName;
    @JsonProperty("OBR_5_BAND")
    private String obr5Band;
    @JsonProperty("PORTFOLIO_COMPARISON_5_BAND")
    private String portfolioComparison5Band;
    @JsonProperty("VIABILITY_SCORE_5_BAND")
    private String viabilityScore5Band;
    @JsonProperty("PORTFOLIO_COMPARISON_3_BAND")
    private String portfolioComparison3Band;
    @JsonProperty("VIABILITY_SCORE_3_BAND")
    private String viabilityScore3Band;
    @JsonProperty("FAILURE_5_BAND")
    private String failure5Band;
    @JsonProperty("FAILURE_3_BAND")
    private String failure3Band;
    @JsonProperty("DELQ_3_BAND")
    private String delq3Band;
    @JsonProperty("DELQ_5_BAND")
    private String delq5Band;
    @JsonProperty("PAYDEX_3_BAND")
    private String paydex3Band;
    @JsonProperty("PAYDEX_5_BAND")
    private String paydex5Band;
    @JsonProperty("DB_RATING_5_BAND")
    private String dbRating5Band;
    @JsonProperty("DB_RATING_3_BAND")
    private String dbRating3Band;
    @JsonProperty("PROBABILITY_FAILURE")
    private String probabilityFailure;
    @JsonProperty("PROBABILITY_DELINQUENCY")
    private String probabilityDelinquency;
    @JsonProperty("PAYMENT_RISK_3_BAND")
    private String paymentRisk3Band;
    @JsonProperty("PAYMENT_RISK_5_BAND")
    private String paymentRisk5Band;
    @JsonProperty("AAA_RATING")
    private String aaaRating;
    @JsonProperty("INDI_CONSOLIDATED")
    private String indiConsolidated;
    @JsonProperty("MAX_CREDIT_RISK_LEVEL")
    private String maxCreditRiskLevel;
    @JsonProperty("MAX_CREDIT_RECOMM_TEXT")
    private String maxCreditRecommText;
    @JsonProperty("MAX_CREDIT_CURRENCY_CODE")
    private String maxCreditCurrencyCode;
    @JsonProperty("MAX_CREDIT_RECOMM")
    private String maxCreditRecomm;
    @JsonProperty("PAY_WIHTIN_TERMS_PERC")
    private String payWihtinTermsPerc;
    @JsonProperty("CONSERVATIVE_CREDIT_LIMIT")
    private String conservativeCreditLimit;
    @JsonProperty("SOURCE_ID")
    private String sourceId;
    @JsonProperty("SBFE_STANDARD_SCORE")
    private String sbfeStandardScore;
    @JsonProperty("NAICS_CODE")
    private String naicsCode;
    @JsonProperty("PAYDEX_11MONTHSAGO")
    private String paydex11monthsago;
    @JsonProperty("PAYDEX_10MONTHSAGO")
    private String paydex10monthsago;
    @JsonProperty("PAYDEX_8MONTHSAGO")
    private String paydex8monthsago;
    @JsonProperty("PAYDEX_7MONTHSAGO")
    private String paydex7monthsago;
    @JsonProperty("PAYDEX_4MONTHSAGO")
    private String paydex4monthsago;
    @JsonProperty("PAYDEX_2MONTHSAGO")
    private String paydex2monthsago;
    @JsonProperty("PAYDEX_5MONTHSAGO")
    private String paydex5monthsago;
    @JsonProperty("CCSPERCENTILE_11MONTHSAGO")
    private String ccspercentile11monthsago;
    @JsonProperty("CCSPERCENTILE_10MONTHSAGO")
    private String ccspercentile10monthsago;
    @JsonProperty("CCSPERCENTILE_8MONTHSAGO")
    private String ccspercentile8monthsago;
    @JsonProperty("CCSPERCENTILE_7MONTHSAGO")
    private String ccspercentile7monthsago;
    @JsonProperty("CCSPERCENTILE_5MONTHSAGO")
    private String ccspercentile5monthsago;
    @JsonProperty("CCSPERCENTILE_4MONTHSAGO")
    private String ccspercentile4monthsago;
    @JsonProperty("CCSPERCENTILE_2MONTHSAGO")
    private String ccspercentile2monthsago;
    @JsonProperty("CCSCLASS_6MONTHSAGO")
    private String ccsclass6monthsago;
    @JsonProperty("CCSCLASS_10MONTHSAGO")
    private String ccsclass10monthsago;
    @JsonProperty("CCSCLASS_9MONTHSAGO")
    private String ccsclass9monthsago;
    @JsonProperty("CCSCLASS_3MONTHSAGO")
    private String ccsclass3monthsago;
    @JsonProperty("CCSCLASS_12MONTHSAGO")
    private String ccsclass12monthsago;
    @JsonProperty("CCSCLASS_7MONTHSAGO")
    private String ccsclass7monthsago;
    @JsonProperty("CCSCLASS_11MONTHSAGO")
    private String ccsclass11monthsago;
    @JsonProperty("CCSCLASS_8MONTHSAGO")
    private String ccsclass8monthsago;
    @JsonProperty("CCSCLASS_5MONTHSAGO")
    private String ccsclass5monthsago;
    @JsonProperty("CCSCLASS_4MONTHSAGO")
    private String ccsclass4monthsago;
    @JsonProperty("CCSCLASS_2MONTHSAGO")
    private String ccsclass2monthsago;
    @JsonProperty("CCSCLASS_1MONTHSAGO")
    private String ccsclass1monthsago;
    @JsonProperty("CCSSCORE_12MONTHSAGO")
    private String ccsscore12monthsago;
    @JsonProperty("CCSSCORE_6MONTHSAGO")
    private String ccsscore6monthsago;
    @JsonProperty("CCSSCORE_1MONTHSAGO")
    private String ccsscore1monthsago;
    @JsonProperty("CCSSCORE_8MONTHSAGO")
    private String ccsscore8monthsago;
    @JsonProperty("CCSSCORE_9MONTHSAGO")
    private String ccsscore9monthsago;
    @JsonProperty("CCSSCORE_11MONTHSAGO")
    private String ccsscore11monthsago;
    @JsonProperty("CCSSCORE_10MONTHSAGO")
    private String ccsscore10monthsago;
    @JsonProperty("CCSSCORE_7MONTHSAGO")
    private String ccsscore7monthsago;
    @JsonProperty("CCSSCORE_5MONTHSAGO")
    private String ccsscore5monthsago;
    @JsonProperty("CCSSCORE_4MONTHSAGO")
    private String ccsscore4monthsago;
    @JsonProperty("CCSSCORE_3MONTHSAGO")
    private String ccsscore3monthsago;
    @JsonProperty("CCSSCORE_2MONTHSAGO")
    private String ccsscore2monthsago;
    @JsonProperty("FSSPERCENTILE_8MONTHSAGO")
    private String fsspercentile8monthsago;
    @JsonProperty("FSSPERCENTILE_4MONTHSAGO")
    private String fsspercentile4monthsago;
    @JsonProperty("FSSPERCENTILE_11MONTHSAGO")
    private String fsspercentile11monthsago;
    @JsonProperty("FSSPERCENTILE_10MONTHSAGO")
    private String fsspercentile10monthsago;
    @JsonProperty("FSSPERCENTILE_7MONTHSAGO")
    private String fsspercentile7monthsago;
    @JsonProperty("FSSPERCENTILE_5MONTHSAGO")
    private String fsspercentile5monthsago;
    @JsonProperty("FSSPERCENTILE_2MONTHSAGO")
    private String fsspercentile2monthsago;
    @JsonProperty("FSSSCORE_11MONTHSAGO")
    private String fssscore11monthsago;
    @JsonProperty("FSSSCORE_5MONTHSAGO")
    private String fssscore5monthsago;
    @JsonProperty("FSSSCORE_8MONTHSAGO")
    private String fssscore8monthsago;
    @JsonProperty("FSSSCORE_3MONTHSAGO")
    private String fssscore3monthsago;
    @JsonProperty("FSSSCORE_7MONTHSAGO")
    private String fssscore7monthsago;
    @JsonProperty("FSSSCORE_12MONTHSAGO")
    private String fssscore12monthsago;
    @JsonProperty("FSSSCORE_10MONTHSAGO")
    private String fssscore10monthsago;
    @JsonProperty("FSSSCORE_9MONTHSAGO")
    private String fssscore9monthsago;
    @JsonProperty("FSSSCORE_6MONTHSAGO")
    private String fssscore6monthsago;
    @JsonProperty("FSSSCORE_4MONTHSAGO")
    private String fssscore4monthsago;
    @JsonProperty("FSSSCORE_2MONTHSAGO")
    private String fssscore2monthsago;
    @JsonProperty("FSSSCORE_1MONTHSAGO")
    private String fssscore1monthsago;
    @JsonProperty("FSSCLASS_8MONTHSAGO")
    private String fssclass8monthsago;
    @JsonProperty("FSSCLASS_3MONTHSAGO")
    private String fssclass3monthsago;
    @JsonProperty("FSSCLASS_7MONTHSAGO")
    private String fssclass7monthsago;
    @JsonProperty("FSSCLASS_12MONTHSAGO")
    private String fssclass12monthsago;
    @JsonProperty("FSSCLASS_11MONTHSAGO")
    private String fssclass11monthsago;
    @JsonProperty("FSSCLASS_10MONTHSAGO")
    private String fssclass10monthsago;
    @JsonProperty("FSSCLASS_9MONTHSAGO")
    private String fssclass9monthsago;
    @JsonProperty("FSSCLASS_6MONTHSAGO")
    private String fssclass6monthsago;
    @JsonProperty("FSSCLASS_5MONTHSAGO")
    private String fssclass5monthsago;
    @JsonProperty("FSSCLASS_4MONTHSAGO")
    private String fssclass4monthsago;
    @JsonProperty("FSSCLASS_2MONTHSAGO")
    private String fssclass2monthsago;
    @JsonProperty("FSSCLASS_1MONTHSAGO")
    private String fssclass1monthsago;
    @JsonProperty("VIABILITY_RATING")
    private String viabilityRating;
    @JsonProperty("COMPANY_PROFILE")
    private String companyProfile;
    @JsonProperty("DATA_DEPTH_INDICATOR")
    private String dataDepthIndicator;
    @JsonProperty("PORTFOLIO_COMPARISON")
    private String portfolioComparison;
    @JsonProperty("VIABILITY_SCORE")
    private String viabilityScore;
    @JsonProperty("PARENT_NAME")
    private String parentName;
    @JsonProperty("BUREAU_BIZ_OWNERSHIP_TYPE")
    private String bureauBizOwnershipType;
    @JsonProperty("ACCOUNT_CREATED_DATE")
    private String accountCreatedDate;
    @JsonProperty("PARENT_COUNTRY")
    private String parentCountry;
    @JsonProperty("LEGAL_FLAG")
    private String legalFlag;
    @JsonProperty("PARENT_DUNS_NUMBER")
    private String parentDunsNumber;
    @JsonProperty("SALESPERSON_NO")
    private String salespersonNo;
    @JsonProperty("PRM_COUNTRY")
    private String prmCountry;
    @JsonProperty("SIC_TWO_DIGIT_DESC")
    private String sicTwoDigitDesc;
    @JsonProperty("BAD_DEBT_RISK_CLASS")
    private String badDebtRiskClass;
    @JsonProperty("LAWSUIT_COUNT")
    private String lawsuitCount;
    @JsonProperty("LIEN_COUNT")
    private String lienCount;
    @JsonProperty("PROMPT_AMT")
    private String promptAmt;
    @JsonProperty("PROMPT_PCT_AGING")
    private String promptPctAging;
    @JsonProperty("NATIONAL_ACCT_NUMBER")
    private String nationalAcctNumber;
    @JsonProperty("SLOW_OR_NEG_PMT_COUNT")
    private String slowOrNegPmtCount;
    @JsonProperty("HIGHEST_CREDIT")
    private String highestCredit;
    @JsonProperty("DEBT_TO_NET_WORTH_RATIO")
    private String debtToNetWorthRatio;
    @JsonProperty("AVG_HIGH_CREDIT")
    private String avgHighCredit;
    @JsonProperty("NEGATIVE_PAYMENT_COUNT")
    private String negativePaymentCount;
    @JsonProperty("SLOW_PAYMENT_COUNT")
    private String slowPaymentCount;
    @JsonProperty("HIGH_RISK_INDICATOR")
    private String highRiskIndicator;
    @JsonProperty("VALUE_OF_LIEN")
    private String valueOfLien;
    @JsonProperty("VALUE_OFCOURT_JUDGEMENT")
    private String valueOfcourtJudgement;
    @JsonProperty("VALUE_OF_SUIT")
    private String valueOfSuit;
    @JsonProperty("JUDGEMENT_COUNT")
    private String judgementCount;
    @JsonProperty("INC_YEAR")
    private String incYear;
    @JsonProperty("DUNS_TEL")
    private String dunsTel;
    @JsonProperty("PAY_WITHIN_TERM_COUNT")
    private String payWithinTermCount;
    @JsonProperty("SCORE_16")
    private String score16;
    @JsonProperty("SCORE_20")
    private String score20;
    @JsonProperty("SCORE_19")
    private String score19;
    @JsonProperty("SCORE_18")
    private String score18;
    @JsonProperty("SCORE_17")
    private String score17;
    @JsonProperty("SCORE_15")
    private String score15;
    @JsonProperty("SCORE_14")
    private String score14;
    @JsonProperty("SCORE_13")
    private String score13;
    @JsonProperty("SCORE_12")
    private String score12;
    @JsonProperty("SCORE_11")
    private String score11;
    @JsonProperty("SCORE_10")
    private String score10;
    @JsonProperty("SCORE_9")
    private String score9;
    @JsonProperty("SCORE_8")
    private String score8;
    @JsonProperty("SCORE_7")
    private String score7;
    @JsonProperty("SCORE_6")
    private String score6;
    @JsonProperty("SCORE_5")
    private String score5;
    @JsonProperty("SCORE_4")
    private String score4;
    @JsonProperty("SCORE_3")
    private String score3;
    @JsonProperty("SCORE_2")
    private String score2;
    @JsonProperty("SCORE_1")
    private String score1;
    @JsonProperty("DELETE_YN")
    private String deleteYn;
    @JsonProperty("TRADE_EXP_SLOW_NEG_PMT")
    private String tradeExpSlowNegPmt;
    @JsonProperty("CONTROL_YEAR")
    private String controlYear;
    @JsonProperty("INCORPORATION_YEAR")
    private String incorporationYear;
    @JsonProperty("BUSINESS_START_DATE")
    private String businessStartDate;
    @JsonProperty("LAST_PAYMENT_DATE")
    private String lastPaymentDate;
    @JsonProperty("LAST_ORDER_DATE")
    private String lastOrderDate;
    @JsonProperty("LAST_YEAR_SALES")
    private String lastYearSales;
    @JsonProperty("LAST_ORDER_AMT")
    private String lastOrderAmt;
    @JsonProperty("LAST_PAYMENT_AMT")
    private String lastPaymentAmt;
    @JsonProperty("BUSINESS_OWNERSHIP_TYPE")
    private String businessOwnershipType;
    @JsonProperty("DIVISION")
    private String division;
    @JsonProperty("DISTRICT")
    private String district;
    @JsonProperty("EXCLUDE_YN")
    private String excludeYn;
    @JsonProperty("FINANCIAL_STRESS_SCORE")
    private String financialStressScore;
    @JsonProperty("COMMERCIAL_CREDIT_SCORE")
    private String commercialCreditScore;
    @JsonProperty("PARENT_CUST_NUMBER")
    private String parentCustNumber;
    @JsonProperty("GLOBAL_ULTIMATE_PARENT_CUSTNO")
    private String globalUltimateParentCustno;
    @JsonProperty("HEADQTR_COUNTRY_CODE")
    private String headqtrCountryCode;
    @JsonProperty("GLOBAL_ULTIMATE_COUNTRY")
    private String globalUltimateCountry;
    @JsonProperty("BUSINESS_METROAREA")
    private String businessMetroarea;
    @JsonProperty("HEAD_NAME")
    private String headName;
    @JsonProperty("DAYS_BEYOND_TERMS")
    private String daysBeyondTerms;
    @JsonProperty("DUNS_NUMBER")
    private String dunsNumber;
    @JsonProperty("MODIFIED_BY")
    private String modifiedBy;
    @JsonProperty("CREATED_BY")
    private String createdBy;
    @JsonProperty("DATE_MODIFIED")
    private String dateModified;
    @JsonProperty("DATE_CREATED")
    private String dateCreated;
    @JsonProperty("CREDIT_LIMIT_UTILIZATION")
    private String creditLimitUtilization;
    @JsonProperty("DAYS_SALES_OUTSTANDING")
    private String daysSalesOutstanding;
    @JsonProperty("TOTAL_OUTSTG_WITH_OUT_CREDIT")
    private String totalOutstgWithOutCredit;
    @JsonProperty("BACK_OFF_TOTAL_OUTSTANDING_AMT")
    private String backOffTotalOutstandingAmt;
    @JsonProperty("TOTAL_OUTSTANDING_AMT")
    private String totalOutstandingAmt;
    @JsonProperty("TOTAL_PASTDUE_AMT")
    private String totalPastdueAmt;
    @JsonProperty("BUCKET_11_PCT_OVER")
    private String bucket11PctOver;
    @JsonProperty("BUCKET_10_PCT_OVER")
    private String bucket10PctOver;
    @JsonProperty("BUCKET_9_PCT_OVER")
    private String bucket9PctOver;
    @JsonProperty("BUCKET_8_PCT_OVER")
    private String bucket8PctOver;
    @JsonProperty("BUCKET_7_PCT_OVER")
    private String bucket7PctOver;
    @JsonProperty("BUCKET_6_PCT_OVER")
    private String bucket6PctOver;
    @JsonProperty("BUCKET_5_PCT_OVER")
    private String bucket5PctOver;
    @JsonProperty("BUCKET_4_PCT_OVER")
    private String bucket4PctOver;
    @JsonProperty("BUCKET_3_PCT_OVER")
    private String bucket3PctOver;
    @JsonProperty("BUCKET_2_PCT_OVER")
    private String bucket2PctOver;
    @JsonProperty("BUCKET_1_PCT_OVER")
    private String bucket1PctOver;
    @JsonProperty("BUCKET_12_PCT")
    private String bucket12Pct;
    @JsonProperty("BUCKET_11_PCT")
    private String bucket11Pct;
    @JsonProperty("BUCKET_10_PCT")
    private String bucket10Pct;
    @JsonProperty("BUCKET_9_PCT")
    private String bucket9Pct;
    @JsonProperty("BUCKET_8_PCT")
    private String bucket8Pct;
    @JsonProperty("BUCKET_7_PCT")
    private String bucket7Pct;
    @JsonProperty("BUCKET_6_PCT")
    private String bucket6Pct;
    @JsonProperty("BUCKET_5_PCT")
    private String bucket5Pct;
    @JsonProperty("BUCKET_4_PCT")
    private String bucket4Pct;
    @JsonProperty("BUCKET_3_PCT")
    private String bucket3Pct;
    @JsonProperty("BUCKET_2_PCT")
    private String bucket2Pct;
    @JsonProperty("BUCKET_1_PCT")
    private String bucket1Pct;
    @JsonProperty("BUCKET_11_AMT_OVER")
    private String bucket11AmtOver;
    @JsonProperty("BUCKET_10_AMT_OVER")
    private String bucket10AmtOver;
    @JsonProperty("BUCKET_9_AMT_OVER")
    private String bucket9AmtOver;
    @JsonProperty("BUCKET_8_AMT_OVER")
    private String bucket8AmtOver;
    @JsonProperty("BUCKET_7_AMT_OVER")
    private String bucket7AmtOver;
    @JsonProperty("BUCKET_6_AMT_OVER")
    private String bucket6AmtOver;
    @JsonProperty("BUCKET_5_AMT_OVER")
    private String bucket5AmtOver;
    @JsonProperty("BUCKET_4_AMT_OVER")
    private String bucket4AmtOver;
    @JsonProperty("BUCKET_3_AMT_OVER")
    private String bucket3AmtOver;
    @JsonProperty("BUCKET_2_AMT_OVER")
    private String bucket2AmtOver;
    @JsonProperty("BUCKET_1_AMT_OVER")
    private String bucket1AmtOver;
    @JsonProperty("BUCKET_12_AMT")
    private String bucket12Amt;
    @JsonProperty("BUCKET_11_AMT")
    private String bucket11Amt;
    @JsonProperty("BUCKET_10_AMT")
    private String bucket10Amt;
    @JsonProperty("BUCKET_9_AMT")
    private String bucket9Amt;
    @JsonProperty("BUCKET_8_AMT")
    private String bucket8Amt;
    @JsonProperty("BUCKET_7_AMT")
    private String bucket7Amt;
    @JsonProperty("BUCKET_6_AMT")
    private String bucket6Amt;
    @JsonProperty("BUCKET_5_AMT")
    private String bucket5Amt;
    @JsonProperty("BUCKET_4_AMT")
    private String bucket4Amt;
    @JsonProperty("BUCKET_3_AMT")
    private String bucket3Amt;
    @JsonProperty("BUCKET_2_AMT")
    private String bucket2Amt;
    @JsonProperty("BUCKET_1_AMT")
    private String bucket1Amt;
    @JsonProperty("DATE_OF_AGING")
    private String dateOfAging;
    @JsonProperty("PAYMENT_TERM")
    private String paymentTerm;
    @JsonProperty("PUBLIC_IND")
    private String publicInd;
    @JsonProperty("HISTORY_INDICATOR")
    private String historyIndicator;
    @JsonProperty("BHQ_INDICATOR")
    private String bhqIndicator;
    @JsonProperty("REVENUE")
    private String revenue;
    @JsonProperty("BUSINESS_NET_WORTH")
    private String businessNetWorth;
    @JsonProperty("DNB_BUSINESS_BUREAU_IND")
    private String dnbBusinessBureauInd;
    @JsonProperty("YEARS_WITH_CURRENT_MGMT")
    private String yearsWithCurrentMgmt;
    @JsonProperty("TRADE_EXP_SLOW_NEG_PMT_PCT")
    private String tradeExpSlowNegPmtPct;
    @JsonProperty("TOTAL_PAYMENT_EXPERIENCES")
    private String totalPaymentExperiences;
    @JsonProperty("CURRENT_RATIO")
    private String currentRatio;
    @JsonProperty("TOTAL_ASSETS")
    private String totalAssets;
    @JsonProperty("TOTAL_LIABILITIES")
    private String totalLiabilities;
    @JsonProperty("BANKRUPTCY_YN")
    private String bankruptcyYn;
    @JsonProperty("LIEN_YN")
    private String lienYn;
    @JsonProperty("JUDGEMENT_YN")
    private String judgementYn;
    @JsonProperty("SUIT_YN")
    private String suitYn;
    @JsonProperty("TERRITORY")
    private String territory;
    @JsonProperty("RISK_CLASSIFICATION")
    private String riskClassification;
    @JsonProperty("CUSTOMER_TYPE")
    private String customerType;
    @JsonProperty("BUSINESS_UNIT")
    private String businessUnit;
    @JsonProperty("BUSINESS_STRUCTURE")
    private String businessStructure;
    @JsonProperty("CUSTOMER_NO")
    private String customerNo;
    @JsonProperty("SALESPERSON_NAME")
    private String salespersonName;
    @JsonProperty("PRODUCT_LINE")
    private String productLine;
    @JsonProperty("LAST_PAYMENT_AMOUNT")
    private String lastPaymentAmount;
    @JsonProperty("PAYDEX_12MONTHSAGO")
    private String paydex12monthsago;
    @JsonProperty("PAYDEX_6MONTHSAGO")
    private String paydex6monthsago;
    @JsonProperty("PAYDEX_3MONTHSAGO")
    private String paydex3monthsago;
    @JsonProperty("PAYDEX_9MONTHSAGO")
    private String paydex9monthsago;
    @JsonProperty("PAYDEX_1MONTHSAGO")
    private String paydex1monthsago;
    @JsonProperty("CCSPERCENTILE_12MONTHSAGO")
    private String ccspercentile12monthsago;
    @JsonProperty("CCSPERCENTILE_9MONTHSAGO")
    private String ccspercentile9monthsago;
    @JsonProperty("CCSPERCENTILE_6MONTHSAGO")
    private String ccspercentile6monthsago;
    @JsonProperty("CCSPERCENTILE_3MONTHSAGO")
    private String ccspercentile3monthsago;
    @JsonProperty("CCSPERCENTILE_1MONTHSAGO")
    private String ccspercentile1monthsago;
    @JsonProperty("FSSPERCENTILE_12MONTHSAGO")
    private String fsspercentile12monthsago;
    @JsonProperty("FSSPERCENTILE_9MONTHSAGO")
    private String fsspercentile9monthsago;
    @JsonProperty("FSSPERCENTILE_6MONTHSAGO")
    private String fsspercentile6monthsago;
    @JsonProperty("FSSPERCENTILE_3MONTHSAGO")
    private String fsspercentile3monthsago;
    @JsonProperty("FSSPERCENTILE_1MONTHSAGO")
    private String fsspercentile1monthsago;
    @JsonProperty("HEAD_DUNS_NUMBER")
    private String headDunsNumber;
    @JsonProperty("GLOBAL_ULTIM_NAME")
    private String globalUltimName;
    @JsonProperty("GLOBAL_ULTIM_DUNS_NUMBER")
    private String globalUltimDunsNumber;
    @JsonProperty("YEARS_IN_BUSINESS")
    private String yearsInBusiness;
    @JsonProperty("OUT_OF_BUSINESS_YN")
    private String outOfBusinessYn;
    @JsonProperty("EMPLOYEES")
    private String employees;
    @JsonProperty("SIC_CODE")
    private String sicCode;
    @JsonProperty("RECOMMENDED_CREDIT_LIMIT ")
    private String recommendedCreditLimit;
    @JsonProperty("CREDIT_LIMIT ")
    private String creditLimit;
    @JsonProperty("DNB_RATING")
    private String dnbRating;
    @JsonProperty("FIN_STRESS_CLASS")
    private String finStressClass;
    @JsonProperty("COMM_CR_SCR_CLASS")
    private String commCrScrClass;
    @JsonProperty("PAYDEX")
    private String paydex;
    @JsonProperty("COMM_CR_SCR_PERCENTILE")
    private String commCrScrPercentile;
    @JsonProperty("FIN_STRESS_SCR_PERCENTILE")
    private String finStressScrPercentile;
    @JsonProperty("DUNS_COUNTRY")
    private String dunsCountry;
    @JsonProperty("DUNS_STATE")
    private String dunsState;
    @JsonProperty("DUNS_ZIP")
    private String dunsZip;
    @JsonProperty("DUNS_CITY")
    private String dunsCity;
    @JsonProperty("DUNS_STREET2")
    private String dunsStreet2;
    @JsonProperty("DUNS_STREET1")
    private String dunsStreet1;
    @JsonProperty("DUNS_BUSINESS_NAME")
    private String dunsBusinessName;
    @JsonProperty("BUSINESS_COUNTRY")
    private String businessCountry;
    @JsonProperty("STATE")
    private String state;
    @JsonProperty("ZIP")
    private String zip;
    @JsonProperty("CITY")
    private String city;
    @JsonProperty("STREET2")
    private String street2;
    @JsonProperty("STREET1")
    private String street1;
    @JsonProperty("BUSINESS_NAME")
    private String businessName;
    @JsonProperty("ACCT_LAST_UPDATE_DATE")
    private String acctLastUpdateDate;
    @JsonProperty("ACCT_DETAIL_STATUS")
    private String acctDetailStatus;
    @JsonProperty("ACCT_NO")
    private String acctNo;
    @JsonProperty("ENTITY_ID")
    private String entityId;
    @JsonProperty("ENTITY_TYPE")
    private String entityType;
    @JsonProperty("PRM_DOMAIN_ID")
    private String prmDomainId;
    @JsonProperty("WS_DOMAIN")
    private String wsDomain;
    @JsonProperty("WORKSPACE_ID")
    private String workspaceId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    //Note: Constructor isn't auto-generated. Below has been written manually with the help of regex tools.
    public DtoCsvRow2(@NotNull String[] csvRow) {
        int dataLength = csvRow.length;
        ArrayList<String> data = new ArrayList<>(Arrays.asList(csvRow));
        if(dataLength < this.setters.length) {
            int diff = this.setters.length - dataLength;
            for(int i = 0; i < diff; i++) {
                data.add("");
            }
        }
        this.setFinStrScrPctlUpDownInd(data.get(0));
        this.setCommCrScrPctlUpDownInd(data.get(1));
        this.setPaydexUpDownInd(data.get(2));
        this.setDBRatingRiskInd(data.get(3));
        this.setAvgDaysBeyond(data.get(4));
        this.setCompanyTotalPastDue(data.get(5));
        this.setCompanyTotalOutstanding(data.get(6));
        this.setNoOfAccounts(data.get(7));
        this.setEndrosementName(data.get(8));
        this.setObr5Band(data.get(9));
        this.setPortfolioComparison5Band(data.get(10));
        this.setViabilityScore5Band(data.get(11));
        this.setPortfolioComparison3Band(data.get(12));
        this.setViabilityScore3Band(data.get(13));
        this.setFailure5Band(data.get(14));
        this.setFailure3Band(data.get(15));
        this.setDelq3Band(data.get(16));
        this.setDelq5Band(data.get(17));
        this.setPaydex3Band(data.get(18));
        this.setPaydex5Band(data.get(19));
        this.setDbRating5Band(data.get(20));
        this.setDbRating3Band(data.get(21));
        this.setProbabilityFailure(data.get(22));
        this.setProbabilityDelinquency(data.get(23));
        this.setPaymentRisk3Band(data.get(24));
        this.setPaymentRisk5Band(data.get(25));
        this.setAaaRating(data.get(26));
        this.setIndiConsolidated(data.get(27));
        this.setMaxCreditRiskLevel(data.get(28));
        this.setMaxCreditRecommText(data.get(29));
        this.setMaxCreditCurrencyCode(data.get(30));
        this.setMaxCreditRecomm(data.get(31));
        this.setPayWihtinTermsPerc(data.get(32));
        this.setConservativeCreditLimit(data.get(33));
        this.setSourceId(data.get(34));
        this.setSbfeStandardScore(data.get(35));
        this.setNaicsCode(data.get(36));
        this.setPaydex11monthsago(data.get(37));
        this.setPaydex10monthsago(data.get(38));
        this.setPaydex8monthsago(data.get(39));
        this.setPaydex7monthsago(data.get(40));
        this.setPaydex4monthsago(data.get(41));
        this.setPaydex2monthsago(data.get(42));
        this.setPaydex5monthsago(data.get(43));
        this.setCcspercentile11monthsago(data.get(44));
        this.setCcspercentile10monthsago(data.get(45));
        this.setCcspercentile8monthsago(data.get(46));
        this.setCcspercentile7monthsago(data.get(47));
        this.setCcspercentile5monthsago(data.get(48));
        this.setCcspercentile4monthsago(data.get(49));
        this.setCcspercentile2monthsago(data.get(50));
        this.setCcsclass6monthsago(data.get(51));
        this.setCcsclass10monthsago(data.get(52));
        this.setCcsclass9monthsago(data.get(53));
        this.setCcsclass3monthsago(data.get(54));
        this.setCcsclass12monthsago(data.get(55));
        this.setCcsclass7monthsago(data.get(56));
        this.setCcsclass11monthsago(data.get(57));
        this.setCcsclass8monthsago(data.get(58));
        this.setCcsclass5monthsago(data.get(59));
        this.setCcsclass4monthsago(data.get(60));
        this.setCcsclass2monthsago(data.get(61));
        this.setCcsclass1monthsago(data.get(62));
        this.setCcsscore12monthsago(data.get(63));
        this.setCcsscore6monthsago(data.get(64));
        this.setCcsscore1monthsago(data.get(65));
        this.setCcsscore8monthsago(data.get(66));
        this.setCcsscore9monthsago(data.get(67));
        this.setCcsscore11monthsago(data.get(68));
        this.setCcsscore10monthsago(data.get(69));
        this.setCcsscore7monthsago(data.get(70));
        this.setCcsscore5monthsago(data.get(71));
        this.setCcsscore4monthsago(data.get(72));
        this.setCcsscore3monthsago(data.get(73));
        this.setCcsscore2monthsago(data.get(74));
        this.setFsspercentile8monthsago(data.get(75));
        this.setFsspercentile4monthsago(data.get(76));
        this.setFsspercentile11monthsago(data.get(77));
        this.setFsspercentile10monthsago(data.get(78));
        this.setFsspercentile7monthsago(data.get(79));
        this.setFsspercentile5monthsago(data.get(80));
        this.setFsspercentile2monthsago(data.get(81));
        this.setFssscore11monthsago(data.get(82));
        this.setFssscore5monthsago(data.get(83));
        this.setFssscore8monthsago(data.get(84));
        this.setFssscore3monthsago(data.get(85));
        this.setFssscore7monthsago(data.get(86));
        this.setFssscore12monthsago(data.get(87));
        this.setFssscore10monthsago(data.get(88));
        this.setFssscore9monthsago(data.get(89));
        this.setFssscore6monthsago(data.get(90));
        this.setFssscore4monthsago(data.get(91));
        this.setFssscore2monthsago(data.get(92));
        this.setFssscore1monthsago(data.get(93));
        this.setFssclass8monthsago(data.get(94));
        this.setFssclass3monthsago(data.get(95));
        this.setFssclass7monthsago(data.get(96));
        this.setFssclass12monthsago(data.get(97));
        this.setFssclass11monthsago(data.get(98));
        this.setFssclass10monthsago(data.get(99));
        this.setFssclass9monthsago(data.get(100));
        this.setFssclass6monthsago(data.get(101));
        this.setFssclass5monthsago(data.get(102));
        this.setFssclass4monthsago(data.get(103));
        this.setFssclass2monthsago(data.get(104));
        this.setFssclass1monthsago(data.get(105));
        this.setViabilityRating(data.get(106));
        this.setCompanyProfile(data.get(107));
        this.setDataDepthIndicator(data.get(108));
        this.setPortfolioComparison(data.get(109));
        this.setViabilityScore(data.get(110));
        this.setParentName(data.get(111));
        this.setBureauBizOwnershipType(data.get(112));
        this.setAccountCreatedDate(data.get(113));
        this.setParentCountry(data.get(114));
        this.setLegalFlag(data.get(115));
        this.setParentDunsNumber(data.get(116));
        this.setSalespersonNo(data.get(117));
        this.setPrmCountry(data.get(118));
        this.setSicTwoDigitDesc(data.get(119));
        this.setBadDebtRiskClass(data.get(120));
        this.setLawsuitCount(data.get(121));
        this.setLienCount(data.get(122));
        this.setPromptAmt(data.get(123));
        this.setPromptPctAging(data.get(124));
        this.setNationalAcctNumber(data.get(125));
        this.setSlowOrNegPmtCount(data.get(126));
        this.setHighestCredit(data.get(127));
        this.setDebtToNetWorthRatio(data.get(128));
        this.setAvgHighCredit(data.get(129));
        this.setNegativePaymentCount(data.get(130));
        this.setSlowPaymentCount(data.get(131));
        this.setHighRiskIndicator(data.get(132));
        this.setValueOfLien(data.get(133));
        this.setValueOfcourtJudgement(data.get(134));
        this.setValueOfSuit(data.get(135));
        this.setJudgementCount(data.get(136));
        this.setIncYear(data.get(137));
        this.setDunsTel(data.get(138));
        this.setPayWithinTermCount(data.get(139));
        this.setScore16(data.get(140));
        this.setScore20(data.get(141));
        this.setScore19(data.get(142));
        this.setScore18(data.get(143));
        this.setScore17(data.get(144));
        this.setScore15(data.get(145));
        this.setScore14(data.get(146));
        this.setScore13(data.get(147));
        this.setScore12(data.get(148));
        this.setScore11(data.get(149));
        this.setScore10(data.get(150));
        this.setScore9(data.get(151));
        this.setScore8(data.get(152));
        this.setScore7(data.get(153));
        this.setScore6(data.get(154));
        this.setScore5(data.get(155));
        this.setScore4(data.get(156));
        this.setScore3(data.get(157));
        this.setScore2(data.get(158));
        this.setScore1(data.get(159));
        this.setDeleteYn(data.get(160));
        this.setTradeExpSlowNegPmt(data.get(161));
        this.setControlYear(data.get(162));
        this.setIncorporationYear(data.get(163));
        this.setBusinessStartDate(data.get(164));
        this.setLastPaymentDate(data.get(165));
        this.setLastOrderDate(data.get(166));
        this.setLastYearSales(data.get(167));
        this.setLastOrderAmt(data.get(168));
        this.setLastPaymentAmt(data.get(169));
        this.setBusinessOwnershipType(data.get(170));
        this.setDivision(data.get(171));
        this.setDistrict(data.get(172));
        this.setExcludeYn(data.get(173));
        this.setFinancialStressScore(data.get(174));
        this.setCommercialCreditScore(data.get(175));
        this.setParentCustNumber(data.get(176));
        this.setGlobalUltimateParentCustno(data.get(177));
        this.setHeadqtrCountryCode(data.get(178));
        this.setGlobalUltimateCountry(data.get(179));
        this.setBusinessMetroarea(data.get(180));
        this.setHeadName(data.get(181));
        this.setDaysBeyondTerms(data.get(182));
        this.setDunsNumber(data.get(183));
        this.setModifiedBy(data.get(184));
        this.setCreatedBy(data.get(185));
        this.setDateModified(data.get(186));
        this.setDateCreated(data.get(187));
        this.setCreditLimitUtilization(data.get(188));
        this.setDaysSalesOutstanding(data.get(189));
        this.setTotalOutstgWithOutCredit(data.get(190));
        this.setBackOffTotalOutstandingAmt(data.get(191));
        this.setTotalOutstandingAmt(data.get(192));
        this.setTotalPastdueAmt(data.get(193));
        this.setBucket11PctOver(data.get(194));
        this.setBucket10PctOver(data.get(195));
        this.setBucket9PctOver(data.get(196));
        this.setBucket8PctOver(data.get(197));
        this.setBucket7PctOver(data.get(198));
        this.setBucket6PctOver(data.get(199));
        this.setBucket5PctOver(data.get(200));
        this.setBucket4PctOver(data.get(201));
        this.setBucket3PctOver(data.get(202));
        this.setBucket2PctOver(data.get(203));
        this.setBucket1PctOver(data.get(204));
        this.setBucket12Pct(data.get(205));
        this.setBucket11Pct(data.get(206));
        this.setBucket10Pct(data.get(207));
        this.setBucket9Pct(data.get(208));
        this.setBucket8Pct(data.get(209));
        this.setBucket7Pct(data.get(210));
        this.setBucket6Pct(data.get(211));
        this.setBucket5Pct(data.get(212));
        this.setBucket4Pct(data.get(213));
        this.setBucket3Pct(data.get(214));
        this.setBucket2Pct(data.get(215));
        this.setBucket1Pct(data.get(216));
        this.setBucket11AmtOver(data.get(217));
        this.setBucket10AmtOver(data.get(218));
        this.setBucket9AmtOver(data.get(219));
        this.setBucket8AmtOver(data.get(220));
        this.setBucket7AmtOver(data.get(221));
        this.setBucket6AmtOver(data.get(222));
        this.setBucket5AmtOver(data.get(223));
        this.setBucket4AmtOver(data.get(224));
        this.setBucket3AmtOver(data.get(225));
        this.setBucket2AmtOver(data.get(226));
        this.setBucket1AmtOver(data.get(227));
        this.setBucket12Amt(data.get(228));
        this.setBucket11Amt(data.get(229));
        this.setBucket10Amt(data.get(230));
        this.setBucket9Amt(data.get(231));
        this.setBucket8Amt(data.get(232));
        this.setBucket7Amt(data.get(233));
        this.setBucket6Amt(data.get(234));
        this.setBucket5Amt(data.get(235));
        this.setBucket4Amt(data.get(236));
        this.setBucket3Amt(data.get(237));
        this.setBucket2Amt(data.get(238));
        this.setBucket1Amt(data.get(239));
        this.setDateOfAging(data.get(240));
        this.setPaymentTerm(data.get(241));
        this.setPublicInd(data.get(242));
        this.setHistoryIndicator(data.get(243));
        this.setBhqIndicator(data.get(244));
        this.setRevenue(data.get(245));
        this.setBusinessNetWorth(data.get(246));
        this.setDnbBusinessBureauInd(data.get(247));
        this.setYearsWithCurrentMgmt(data.get(248));
        this.setTradeExpSlowNegPmtPct(data.get(249));
        this.setTotalPaymentExperiences(data.get(250));
        this.setCurrentRatio(data.get(251));
        this.setTotalAssets(data.get(252));
        this.setTotalLiabilities(data.get(253));
        this.setBankruptcyYn(data.get(254));
        this.setLienYn(data.get(255));
        this.setJudgementYn(data.get(256));
        this.setSuitYn(data.get(257));
        this.setTerritory(data.get(258));
        this.setRiskClassification(data.get(259));
        this.setCustomerType(data.get(260));
        this.setBusinessUnit(data.get(261));
        this.setBusinessStructure(data.get(262));
        this.setCustomerNo(data.get(263));
        this.setSalespersonName(data.get(264));
        this.setProductLine(data.get(265));
        this.setLastPaymentAmount(data.get(266));
        this.setPaydex12monthsago(data.get(267));
        this.setPaydex6monthsago(data.get(268));
        this.setPaydex3monthsago(data.get(269));
        this.setPaydex9monthsago(data.get(270));
        this.setPaydex1monthsago(data.get(271));
        this.setCcspercentile12monthsago(data.get(272));
        this.setCcspercentile9monthsago(data.get(273));
        this.setCcspercentile6monthsago(data.get(274));
        this.setCcspercentile3monthsago(data.get(275));
        this.setCcspercentile1monthsago(data.get(276));
        this.setFsspercentile12monthsago(data.get(277));
        this.setFsspercentile9monthsago(data.get(278));
        this.setFsspercentile6monthsago(data.get(279));
        this.setFsspercentile3monthsago(data.get(280));
        this.setFsspercentile1monthsago(data.get(281));
        this.setHeadDunsNumber(data.get(282));
        this.setGlobalUltimName(data.get(283));
        this.setGlobalUltimDunsNumber(data.get(284));
        this.setYearsInBusiness(data.get(285));
        this.setOutOfBusinessYn(data.get(286));
        this.setEmployees(data.get(287));
        this.setSicCode(data.get(288));
        this.setRecommendedCreditLimit(data.get(289));
        this.setCreditLimit(data.get(290));
        this.setDnbRating(data.get(291));
        this.setFinStressClass(data.get(292));
        this.setCommCrScrClass(data.get(293));
        this.setPaydex(data.get(294));
        this.setCommCrScrPercentile(data.get(295));
        this.setFinStressScrPercentile(data.get(296));
        this.setDunsCountry(data.get(297));
        this.setDunsState(data.get(298));
        this.setDunsZip(data.get(299));
        this.setDunsCity(data.get(300));
        this.setDunsStreet2(data.get(301));
        this.setDunsStreet1(data.get(302));
        this.setDunsBusinessName(data.get(303));
        this.setBusinessCountry(data.get(304));
        this.setState(data.get(305));
        this.setZip(data.get(306));
        this.setCity(data.get(307));
        this.setStreet2(data.get(308));
        this.setStreet1(data.get(309));
        this.setBusinessName(data.get(310));
        this.setAcctLastUpdateDate(data.get(311));
        this.setAcctDetailStatus(data.get(312));
        this.setAcctNo(data.get(313));
        this.setEntityId(data.get(314));
        this.setEntityType(data.get(315));
        this.setPrmDomainId(data.get(316));
        this.setWsDomain(data.get(317));
        this.setWorkspaceId(data.get(318));
    }

    @JsonProperty("FIN_STR_SCR_PCTL_UP_DOWN_IND")
    public String getFinStrScrPctlUpDownInd() {
        return finStrScrPctlUpDownInd;
    }

    @JsonProperty("FIN_STR_SCR_PCTL_UP_DOWN_IND")
    public void setFinStrScrPctlUpDownInd(String finStrScrPctlUpDownInd) {
        this.finStrScrPctlUpDownInd = finStrScrPctlUpDownInd;
    }

    @JsonProperty("COMM_CR_SCR_PCTL_UP_DOWN_IND")
    public String getCommCrScrPctlUpDownInd() {
        return commCrScrPctlUpDownInd;
    }

    @JsonProperty("COMM_CR_SCR_PCTL_UP_DOWN_IND")
    public void setCommCrScrPctlUpDownInd(String commCrScrPctlUpDownInd) {
        this.commCrScrPctlUpDownInd = commCrScrPctlUpDownInd;
    }

    @JsonProperty("PAYDEX_UP_DOWN_IND")
    public String getPaydexUpDownInd() {
        return paydexUpDownInd;
    }

    @JsonProperty("PAYDEX_UP_DOWN_IND")
    public void setPaydexUpDownInd(String paydexUpDownInd) {
        this.paydexUpDownInd = paydexUpDownInd;
    }

    @JsonProperty("D_B_RATING_RISK_IND")
    public String getDBRatingRiskInd() {
        return dBRatingRiskInd;
    }

    @JsonProperty("D_B_RATING_RISK_IND")
    public void setDBRatingRiskInd(String dBRatingRiskInd) {
        this.dBRatingRiskInd = dBRatingRiskInd;
    }

    @JsonProperty("AVG_DAYS_BEYOND")
    public String getAvgDaysBeyond() {
        return avgDaysBeyond;
    }

    @JsonProperty("AVG_DAYS_BEYOND")
    public void setAvgDaysBeyond(String avgDaysBeyond) {
        this.avgDaysBeyond = avgDaysBeyond;
    }

    @JsonProperty("COMPANY_TOTAL_PAST_DUE")
    public String getCompanyTotalPastDue() {
        return companyTotalPastDue;
    }

    @JsonProperty("COMPANY_TOTAL_PAST_DUE")
    public void setCompanyTotalPastDue(String companyTotalPastDue) {
        this.companyTotalPastDue = companyTotalPastDue;
    }

    @JsonProperty("COMPANY_TOTAL_OUTSTANDING")
    public String getCompanyTotalOutstanding() {
        return companyTotalOutstanding;
    }

    @JsonProperty("COMPANY_TOTAL_OUTSTANDING")
    public void setCompanyTotalOutstanding(String companyTotalOutstanding) {
        this.companyTotalOutstanding = companyTotalOutstanding;
    }

    @JsonProperty("NO_OF_ACCOUNTS")
    public String getNoOfAccounts() {
        return noOfAccounts;
    }

    @JsonProperty("NO_OF_ACCOUNTS")
    public void setNoOfAccounts(String noOfAccounts) {
        this.noOfAccounts = noOfAccounts;
    }

    @JsonProperty("ENDROSEMENT_NAME")
    public String getEndrosementName() {
        return endrosementName;
    }

    @JsonProperty("ENDROSEMENT_NAME")
    public void setEndrosementName(String endrosementName) {
        this.endrosementName = endrosementName;
    }

    @JsonProperty("OBR_5_BAND")
    public String getObr5Band() {
        return obr5Band;
    }

    @JsonProperty("OBR_5_BAND")
    public void setObr5Band(String obr5Band) {
        this.obr5Band = obr5Band;
    }

    @JsonProperty("PORTFOLIO_COMPARISON_5_BAND")
    public String getPortfolioComparison5Band() {
        return portfolioComparison5Band;
    }

    @JsonProperty("PORTFOLIO_COMPARISON_5_BAND")
    public void setPortfolioComparison5Band(String portfolioComparison5Band) {
        this.portfolioComparison5Band = portfolioComparison5Band;
    }

    @JsonProperty("VIABILITY_SCORE_5_BAND")
    public String getViabilityScore5Band() {
        return viabilityScore5Band;
    }

    @JsonProperty("VIABILITY_SCORE_5_BAND")
    public void setViabilityScore5Band(String viabilityScore5Band) {
        this.viabilityScore5Band = viabilityScore5Band;
    }

    @JsonProperty("PORTFOLIO_COMPARISON_3_BAND")
    public String getPortfolioComparison3Band() {
        return portfolioComparison3Band;
    }

    @JsonProperty("PORTFOLIO_COMPARISON_3_BAND")
    public void setPortfolioComparison3Band(String portfolioComparison3Band) {
        this.portfolioComparison3Band = portfolioComparison3Band;
    }

    @JsonProperty("VIABILITY_SCORE_3_BAND")
    public String getViabilityScore3Band() {
        return viabilityScore3Band;
    }

    @JsonProperty("VIABILITY_SCORE_3_BAND")
    public void setViabilityScore3Band(String viabilityScore3Band) {
        this.viabilityScore3Band = viabilityScore3Band;
    }

    @JsonProperty("FAILURE_5_BAND")
    public String getFailure5Band() {
        return failure5Band;
    }

    @JsonProperty("FAILURE_5_BAND")
    public void setFailure5Band(String failure5Band) {
        this.failure5Band = failure5Band;
    }

    @JsonProperty("FAILURE_3_BAND")
    public String getFailure3Band() {
        return failure3Band;
    }

    @JsonProperty("FAILURE_3_BAND")
    public void setFailure3Band(String failure3Band) {
        this.failure3Band = failure3Band;
    }

    @JsonProperty("DELQ_3_BAND")
    public String getDelq3Band() {
        return delq3Band;
    }

    @JsonProperty("DELQ_3_BAND")
    public void setDelq3Band(String delq3Band) {
        this.delq3Band = delq3Band;
    }

    @JsonProperty("DELQ_5_BAND")
    public String getDelq5Band() {
        return delq5Band;
    }

    @JsonProperty("DELQ_5_BAND")
    public void setDelq5Band(String delq5Band) {
        this.delq5Band = delq5Band;
    }

    @JsonProperty("PAYDEX_3_BAND")
    public String getPaydex3Band() {
        return paydex3Band;
    }

    @JsonProperty("PAYDEX_3_BAND")
    public void setPaydex3Band(String paydex3Band) {
        this.paydex3Band = paydex3Band;
    }

    @JsonProperty("PAYDEX_5_BAND")
    public String getPaydex5Band() {
        return paydex5Band;
    }

    @JsonProperty("PAYDEX_5_BAND")
    public void setPaydex5Band(String paydex5Band) {
        this.paydex5Band = paydex5Band;
    }

    @JsonProperty("DB_RATING_5_BAND")
    public String getDbRating5Band() {
        return dbRating5Band;
    }

    @JsonProperty("DB_RATING_5_BAND")
    public void setDbRating5Band(String dbRating5Band) {
        this.dbRating5Band = dbRating5Band;
    }

    @JsonProperty("DB_RATING_3_BAND")
    public String getDbRating3Band() {
        return dbRating3Band;
    }

    @JsonProperty("DB_RATING_3_BAND")
    public void setDbRating3Band(String dbRating3Band) {
        this.dbRating3Band = dbRating3Band;
    }

    @JsonProperty("PROBABILITY_FAILURE")
    public String getProbabilityFailure() {
        return probabilityFailure;
    }

    @JsonProperty("PROBABILITY_FAILURE")
    public void setProbabilityFailure(String probabilityFailure) {
        this.probabilityFailure = probabilityFailure;
    }

    @JsonProperty("PROBABILITY_DELINQUENCY")
    public String getProbabilityDelinquency() {
        return probabilityDelinquency;
    }

    @JsonProperty("PROBABILITY_DELINQUENCY")
    public void setProbabilityDelinquency(String probabilityDelinquency) {
        this.probabilityDelinquency = probabilityDelinquency;
    }

    @JsonProperty("PAYMENT_RISK_3_BAND")
    public String getPaymentRisk3Band() {
        return paymentRisk3Band;
    }

    @JsonProperty("PAYMENT_RISK_3_BAND")
    public void setPaymentRisk3Band(String paymentRisk3Band) {
        this.paymentRisk3Band = paymentRisk3Band;
    }

    @JsonProperty("PAYMENT_RISK_5_BAND")
    public String getPaymentRisk5Band() {
        return paymentRisk5Band;
    }

    @JsonProperty("PAYMENT_RISK_5_BAND")
    public void setPaymentRisk5Band(String paymentRisk5Band) {
        this.paymentRisk5Band = paymentRisk5Band;
    }

    @JsonProperty("AAA_RATING")
    public String getAaaRating() {
        return aaaRating;
    }

    @JsonProperty("AAA_RATING")
    public void setAaaRating(String aaaRating) {
        this.aaaRating = aaaRating;
    }

    @JsonProperty("INDI_CONSOLIDATED")
    public String getIndiConsolidated() {
        return indiConsolidated;
    }

    @JsonProperty("INDI_CONSOLIDATED")
    public void setIndiConsolidated(String indiConsolidated) {
        this.indiConsolidated = indiConsolidated;
    }

    @JsonProperty("MAX_CREDIT_RISK_LEVEL")
    public String getMaxCreditRiskLevel() {
        return maxCreditRiskLevel;
    }

    @JsonProperty("MAX_CREDIT_RISK_LEVEL")
    public void setMaxCreditRiskLevel(String maxCreditRiskLevel) {
        this.maxCreditRiskLevel = maxCreditRiskLevel;
    }

    @JsonProperty("MAX_CREDIT_RECOMM_TEXT")
    public String getMaxCreditRecommText() {
        return maxCreditRecommText;
    }

    @JsonProperty("MAX_CREDIT_RECOMM_TEXT")
    public void setMaxCreditRecommText(String maxCreditRecommText) {
        this.maxCreditRecommText = maxCreditRecommText;
    }

    @JsonProperty("MAX_CREDIT_CURRENCY_CODE")
    public String getMaxCreditCurrencyCode() {
        return maxCreditCurrencyCode;
    }

    @JsonProperty("MAX_CREDIT_CURRENCY_CODE")
    public void setMaxCreditCurrencyCode(String maxCreditCurrencyCode) {
        this.maxCreditCurrencyCode = maxCreditCurrencyCode;
    }

    @JsonProperty("MAX_CREDIT_RECOMM")
    public String getMaxCreditRecomm() {
        return maxCreditRecomm;
    }

    @JsonProperty("MAX_CREDIT_RECOMM")
    public void setMaxCreditRecomm(String maxCreditRecomm) {
        this.maxCreditRecomm = maxCreditRecomm;
    }

    @JsonProperty("PAY_WIHTIN_TERMS_PERC")
    public String getPayWihtinTermsPerc() {
        return payWihtinTermsPerc;
    }

    @JsonProperty("PAY_WIHTIN_TERMS_PERC")
    public void setPayWihtinTermsPerc(String payWihtinTermsPerc) {
        this.payWihtinTermsPerc = payWihtinTermsPerc;
    }

    @JsonProperty("CONSERVATIVE_CREDIT_LIMIT")
    public String getConservativeCreditLimit() {
        return conservativeCreditLimit;
    }

    @JsonProperty("CONSERVATIVE_CREDIT_LIMIT")
    public void setConservativeCreditLimit(String conservativeCreditLimit) {
        this.conservativeCreditLimit = conservativeCreditLimit;
    }

    @JsonProperty("SOURCE_ID")
    public String getSourceId() {
        return sourceId;
    }

    @JsonProperty("SOURCE_ID")
    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    @JsonProperty("SBFE_STANDARD_SCORE")
    public String getSbfeStandardScore() {
        return sbfeStandardScore;
    }

    @JsonProperty("SBFE_STANDARD_SCORE")
    public void setSbfeStandardScore(String sbfeStandardScore) {
        this.sbfeStandardScore = sbfeStandardScore;
    }

    @JsonProperty("NAICS_CODE")
    public String getNaicsCode() {
        return naicsCode;
    }

    @JsonProperty("NAICS_CODE")
    public void setNaicsCode(String naicsCode) {
        this.naicsCode = naicsCode;
    }

    @JsonProperty("PAYDEX_11MONTHSAGO")
    public String getPaydex11monthsago() {
        return paydex11monthsago;
    }

    @JsonProperty("PAYDEX_11MONTHSAGO")
    public void setPaydex11monthsago(String paydex11monthsago) {
        this.paydex11monthsago = paydex11monthsago;
    }

    @JsonProperty("PAYDEX_10MONTHSAGO")
    public String getPaydex10monthsago() {
        return paydex10monthsago;
    }

    @JsonProperty("PAYDEX_10MONTHSAGO")
    public void setPaydex10monthsago(String paydex10monthsago) {
        this.paydex10monthsago = paydex10monthsago;
    }

    @JsonProperty("PAYDEX_8MONTHSAGO")
    public String getPaydex8monthsago() {
        return paydex8monthsago;
    }

    @JsonProperty("PAYDEX_8MONTHSAGO")
    public void setPaydex8monthsago(String paydex8monthsago) {
        this.paydex8monthsago = paydex8monthsago;
    }

    @JsonProperty("PAYDEX_7MONTHSAGO")
    public String getPaydex7monthsago() {
        return paydex7monthsago;
    }

    @JsonProperty("PAYDEX_7MONTHSAGO")
    public void setPaydex7monthsago(String paydex7monthsago) {
        this.paydex7monthsago = paydex7monthsago;
    }

    @JsonProperty("PAYDEX_4MONTHSAGO")
    public String getPaydex4monthsago() {
        return paydex4monthsago;
    }

    @JsonProperty("PAYDEX_4MONTHSAGO")
    public void setPaydex4monthsago(String paydex4monthsago) {
        this.paydex4monthsago = paydex4monthsago;
    }

    @JsonProperty("PAYDEX_2MONTHSAGO")
    public String getPaydex2monthsago() {
        return paydex2monthsago;
    }

    @JsonProperty("PAYDEX_2MONTHSAGO")
    public void setPaydex2monthsago(String paydex2monthsago) {
        this.paydex2monthsago = paydex2monthsago;
    }

    @JsonProperty("PAYDEX_5MONTHSAGO")
    public String getPaydex5monthsago() {
        return paydex5monthsago;
    }

    @JsonProperty("PAYDEX_5MONTHSAGO")
    public void setPaydex5monthsago(String paydex5monthsago) {
        this.paydex5monthsago = paydex5monthsago;
    }

    @JsonProperty("CCSPERCENTILE_11MONTHSAGO")
    public String getCcspercentile11monthsago() {
        return ccspercentile11monthsago;
    }

    @JsonProperty("CCSPERCENTILE_11MONTHSAGO")
    public void setCcspercentile11monthsago(String ccspercentile11monthsago) {
        this.ccspercentile11monthsago = ccspercentile11monthsago;
    }

    @JsonProperty("CCSPERCENTILE_10MONTHSAGO")
    public String getCcspercentile10monthsago() {
        return ccspercentile10monthsago;
    }

    @JsonProperty("CCSPERCENTILE_10MONTHSAGO")
    public void setCcspercentile10monthsago(String ccspercentile10monthsago) {
        this.ccspercentile10monthsago = ccspercentile10monthsago;
    }

    @JsonProperty("CCSPERCENTILE_8MONTHSAGO")
    public String getCcspercentile8monthsago() {
        return ccspercentile8monthsago;
    }

    @JsonProperty("CCSPERCENTILE_8MONTHSAGO")
    public void setCcspercentile8monthsago(String ccspercentile8monthsago) {
        this.ccspercentile8monthsago = ccspercentile8monthsago;
    }

    @JsonProperty("CCSPERCENTILE_7MONTHSAGO")
    public String getCcspercentile7monthsago() {
        return ccspercentile7monthsago;
    }

    @JsonProperty("CCSPERCENTILE_7MONTHSAGO")
    public void setCcspercentile7monthsago(String ccspercentile7monthsago) {
        this.ccspercentile7monthsago = ccspercentile7monthsago;
    }

    @JsonProperty("CCSPERCENTILE_5MONTHSAGO")
    public String getCcspercentile5monthsago() {
        return ccspercentile5monthsago;
    }

    @JsonProperty("CCSPERCENTILE_5MONTHSAGO")
    public void setCcspercentile5monthsago(String ccspercentile5monthsago) {
        this.ccspercentile5monthsago = ccspercentile5monthsago;
    }

    @JsonProperty("CCSPERCENTILE_4MONTHSAGO")
    public String getCcspercentile4monthsago() {
        return ccspercentile4monthsago;
    }

    @JsonProperty("CCSPERCENTILE_4MONTHSAGO")
    public void setCcspercentile4monthsago(String ccspercentile4monthsago) {
        this.ccspercentile4monthsago = ccspercentile4monthsago;
    }

    @JsonProperty("CCSPERCENTILE_2MONTHSAGO")
    public String getCcspercentile2monthsago() {
        return ccspercentile2monthsago;
    }

    @JsonProperty("CCSPERCENTILE_2MONTHSAGO")
    public void setCcspercentile2monthsago(String ccspercentile2monthsago) {
        this.ccspercentile2monthsago = ccspercentile2monthsago;
    }

    @JsonProperty("CCSCLASS_6MONTHSAGO")
    public String getCcsclass6monthsago() {
        return ccsclass6monthsago;
    }

    @JsonProperty("CCSCLASS_6MONTHSAGO")
    public void setCcsclass6monthsago(String ccsclass6monthsago) {
        this.ccsclass6monthsago = ccsclass6monthsago;
    }

    @JsonProperty("CCSCLASS_10MONTHSAGO")
    public String getCcsclass10monthsago() {
        return ccsclass10monthsago;
    }

    @JsonProperty("CCSCLASS_10MONTHSAGO")
    public void setCcsclass10monthsago(String ccsclass10monthsago) {
        this.ccsclass10monthsago = ccsclass10monthsago;
    }

    @JsonProperty("CCSCLASS_9MONTHSAGO")
    public String getCcsclass9monthsago() {
        return ccsclass9monthsago;
    }

    @JsonProperty("CCSCLASS_9MONTHSAGO")
    public void setCcsclass9monthsago(String ccsclass9monthsago) {
        this.ccsclass9monthsago = ccsclass9monthsago;
    }

    @JsonProperty("CCSCLASS_3MONTHSAGO")
    public String getCcsclass3monthsago() {
        return ccsclass3monthsago;
    }

    @JsonProperty("CCSCLASS_3MONTHSAGO")
    public void setCcsclass3monthsago(String ccsclass3monthsago) {
        this.ccsclass3monthsago = ccsclass3monthsago;
    }

    @JsonProperty("CCSCLASS_12MONTHSAGO")
    public String getCcsclass12monthsago() {
        return ccsclass12monthsago;
    }

    @JsonProperty("CCSCLASS_12MONTHSAGO")
    public void setCcsclass12monthsago(String ccsclass12monthsago) {
        this.ccsclass12monthsago = ccsclass12monthsago;
    }

    @JsonProperty("CCSCLASS_7MONTHSAGO")
    public String getCcsclass7monthsago() {
        return ccsclass7monthsago;
    }

    @JsonProperty("CCSCLASS_7MONTHSAGO")
    public void setCcsclass7monthsago(String ccsclass7monthsago) {
        this.ccsclass7monthsago = ccsclass7monthsago;
    }

    @JsonProperty("CCSCLASS_11MONTHSAGO")
    public String getCcsclass11monthsago() {
        return ccsclass11monthsago;
    }

    @JsonProperty("CCSCLASS_11MONTHSAGO")
    public void setCcsclass11monthsago(String ccsclass11monthsago) {
        this.ccsclass11monthsago = ccsclass11monthsago;
    }

    @JsonProperty("CCSCLASS_8MONTHSAGO")
    public String getCcsclass8monthsago() {
        return ccsclass8monthsago;
    }

    @JsonProperty("CCSCLASS_8MONTHSAGO")
    public void setCcsclass8monthsago(String ccsclass8monthsago) {
        this.ccsclass8monthsago = ccsclass8monthsago;
    }

    @JsonProperty("CCSCLASS_5MONTHSAGO")
    public String getCcsclass5monthsago() {
        return ccsclass5monthsago;
    }

    @JsonProperty("CCSCLASS_5MONTHSAGO")
    public void setCcsclass5monthsago(String ccsclass5monthsago) {
        this.ccsclass5monthsago = ccsclass5monthsago;
    }

    @JsonProperty("CCSCLASS_4MONTHSAGO")
    public String getCcsclass4monthsago() {
        return ccsclass4monthsago;
    }

    @JsonProperty("CCSCLASS_4MONTHSAGO")
    public void setCcsclass4monthsago(String ccsclass4monthsago) {
        this.ccsclass4monthsago = ccsclass4monthsago;
    }

    @JsonProperty("CCSCLASS_2MONTHSAGO")
    public String getCcsclass2monthsago() {
        return ccsclass2monthsago;
    }

    @JsonProperty("CCSCLASS_2MONTHSAGO")
    public void setCcsclass2monthsago(String ccsclass2monthsago) {
        this.ccsclass2monthsago = ccsclass2monthsago;
    }

    @JsonProperty("CCSCLASS_1MONTHSAGO")
    public String getCcsclass1monthsago() {
        return ccsclass1monthsago;
    }

    @JsonProperty("CCSCLASS_1MONTHSAGO")
    public void setCcsclass1monthsago(String ccsclass1monthsago) {
        this.ccsclass1monthsago = ccsclass1monthsago;
    }

    @JsonProperty("CCSSCORE_12MONTHSAGO")
    public String getCcsscore12monthsago() {
        return ccsscore12monthsago;
    }

    @JsonProperty("CCSSCORE_12MONTHSAGO")
    public void setCcsscore12monthsago(String ccsscore12monthsago) {
        this.ccsscore12monthsago = ccsscore12monthsago;
    }

    @JsonProperty("CCSSCORE_6MONTHSAGO")
    public String getCcsscore6monthsago() {
        return ccsscore6monthsago;
    }

    @JsonProperty("CCSSCORE_6MONTHSAGO")
    public void setCcsscore6monthsago(String ccsscore6monthsago) {
        this.ccsscore6monthsago = ccsscore6monthsago;
    }

    @JsonProperty("CCSSCORE_1MONTHSAGO")
    public String getCcsscore1monthsago() {
        return ccsscore1monthsago;
    }

    @JsonProperty("CCSSCORE_1MONTHSAGO")
    public void setCcsscore1monthsago(String ccsscore1monthsago) {
        this.ccsscore1monthsago = ccsscore1monthsago;
    }

    @JsonProperty("CCSSCORE_8MONTHSAGO")
    public String getCcsscore8monthsago() {
        return ccsscore8monthsago;
    }

    @JsonProperty("CCSSCORE_8MONTHSAGO")
    public void setCcsscore8monthsago(String ccsscore8monthsago) {
        this.ccsscore8monthsago = ccsscore8monthsago;
    }

    @JsonProperty("CCSSCORE_9MONTHSAGO")
    public String getCcsscore9monthsago() {
        return ccsscore9monthsago;
    }

    @JsonProperty("CCSSCORE_9MONTHSAGO")
    public void setCcsscore9monthsago(String ccsscore9monthsago) {
        this.ccsscore9monthsago = ccsscore9monthsago;
    }

    @JsonProperty("CCSSCORE_11MONTHSAGO")
    public String getCcsscore11monthsago() {
        return ccsscore11monthsago;
    }

    @JsonProperty("CCSSCORE_11MONTHSAGO")
    public void setCcsscore11monthsago(String ccsscore11monthsago) {
        this.ccsscore11monthsago = ccsscore11monthsago;
    }

    @JsonProperty("CCSSCORE_10MONTHSAGO")
    public String getCcsscore10monthsago() {
        return ccsscore10monthsago;
    }

    @JsonProperty("CCSSCORE_10MONTHSAGO")
    public void setCcsscore10monthsago(String ccsscore10monthsago) {
        this.ccsscore10monthsago = ccsscore10monthsago;
    }

    @JsonProperty("CCSSCORE_7MONTHSAGO")
    public String getCcsscore7monthsago() {
        return ccsscore7monthsago;
    }

    @JsonProperty("CCSSCORE_7MONTHSAGO")
    public void setCcsscore7monthsago(String ccsscore7monthsago) {
        this.ccsscore7monthsago = ccsscore7monthsago;
    }

    @JsonProperty("CCSSCORE_5MONTHSAGO")
    public String getCcsscore5monthsago() {
        return ccsscore5monthsago;
    }

    @JsonProperty("CCSSCORE_5MONTHSAGO")
    public void setCcsscore5monthsago(String ccsscore5monthsago) {
        this.ccsscore5monthsago = ccsscore5monthsago;
    }

    @JsonProperty("CCSSCORE_4MONTHSAGO")
    public String getCcsscore4monthsago() {
        return ccsscore4monthsago;
    }

    @JsonProperty("CCSSCORE_4MONTHSAGO")
    public void setCcsscore4monthsago(String ccsscore4monthsago) {
        this.ccsscore4monthsago = ccsscore4monthsago;
    }

    @JsonProperty("CCSSCORE_3MONTHSAGO")
    public String getCcsscore3monthsago() {
        return ccsscore3monthsago;
    }

    @JsonProperty("CCSSCORE_3MONTHSAGO")
    public void setCcsscore3monthsago(String ccsscore3monthsago) {
        this.ccsscore3monthsago = ccsscore3monthsago;
    }

    @JsonProperty("CCSSCORE_2MONTHSAGO")
    public String getCcsscore2monthsago() {
        return ccsscore2monthsago;
    }

    @JsonProperty("CCSSCORE_2MONTHSAGO")
    public void setCcsscore2monthsago(String ccsscore2monthsago) {
        this.ccsscore2monthsago = ccsscore2monthsago;
    }

    @JsonProperty("FSSPERCENTILE_8MONTHSAGO")
    public String getFsspercentile8monthsago() {
        return fsspercentile8monthsago;
    }

    @JsonProperty("FSSPERCENTILE_8MONTHSAGO")
    public void setFsspercentile8monthsago(String fsspercentile8monthsago) {
        this.fsspercentile8monthsago = fsspercentile8monthsago;
    }

    @JsonProperty("FSSPERCENTILE_4MONTHSAGO")
    public String getFsspercentile4monthsago() {
        return fsspercentile4monthsago;
    }

    @JsonProperty("FSSPERCENTILE_4MONTHSAGO")
    public void setFsspercentile4monthsago(String fsspercentile4monthsago) {
        this.fsspercentile4monthsago = fsspercentile4monthsago;
    }

    @JsonProperty("FSSPERCENTILE_11MONTHSAGO")
    public String getFsspercentile11monthsago() {
        return fsspercentile11monthsago;
    }

    @JsonProperty("FSSPERCENTILE_11MONTHSAGO")
    public void setFsspercentile11monthsago(String fsspercentile11monthsago) {
        this.fsspercentile11monthsago = fsspercentile11monthsago;
    }

    @JsonProperty("FSSPERCENTILE_10MONTHSAGO")
    public String getFsspercentile10monthsago() {
        return fsspercentile10monthsago;
    }

    @JsonProperty("FSSPERCENTILE_10MONTHSAGO")
    public void setFsspercentile10monthsago(String fsspercentile10monthsago) {
        this.fsspercentile10monthsago = fsspercentile10monthsago;
    }

    @JsonProperty("FSSPERCENTILE_7MONTHSAGO")
    public String getFsspercentile7monthsago() {
        return fsspercentile7monthsago;
    }

    @JsonProperty("FSSPERCENTILE_7MONTHSAGO")
    public void setFsspercentile7monthsago(String fsspercentile7monthsago) {
        this.fsspercentile7monthsago = fsspercentile7monthsago;
    }

    @JsonProperty("FSSPERCENTILE_5MONTHSAGO")
    public String getFsspercentile5monthsago() {
        return fsspercentile5monthsago;
    }

    @JsonProperty("FSSPERCENTILE_5MONTHSAGO")
    public void setFsspercentile5monthsago(String fsspercentile5monthsago) {
        this.fsspercentile5monthsago = fsspercentile5monthsago;
    }

    @JsonProperty("FSSPERCENTILE_2MONTHSAGO")
    public String getFsspercentile2monthsago() {
        return fsspercentile2monthsago;
    }

    @JsonProperty("FSSPERCENTILE_2MONTHSAGO")
    public void setFsspercentile2monthsago(String fsspercentile2monthsago) {
        this.fsspercentile2monthsago = fsspercentile2monthsago;
    }

    @JsonProperty("FSSSCORE_11MONTHSAGO")
    public String getFssscore11monthsago() {
        return fssscore11monthsago;
    }

    @JsonProperty("FSSSCORE_11MONTHSAGO")
    public void setFssscore11monthsago(String fssscore11monthsago) {
        this.fssscore11monthsago = fssscore11monthsago;
    }

    @JsonProperty("FSSSCORE_5MONTHSAGO")
    public String getFssscore5monthsago() {
        return fssscore5monthsago;
    }

    @JsonProperty("FSSSCORE_5MONTHSAGO")
    public void setFssscore5monthsago(String fssscore5monthsago) {
        this.fssscore5monthsago = fssscore5monthsago;
    }

    @JsonProperty("FSSSCORE_8MONTHSAGO")
    public String getFssscore8monthsago() {
        return fssscore8monthsago;
    }

    @JsonProperty("FSSSCORE_8MONTHSAGO")
    public void setFssscore8monthsago(String fssscore8monthsago) {
        this.fssscore8monthsago = fssscore8monthsago;
    }

    @JsonProperty("FSSSCORE_3MONTHSAGO")
    public String getFssscore3monthsago() {
        return fssscore3monthsago;
    }

    @JsonProperty("FSSSCORE_3MONTHSAGO")
    public void setFssscore3monthsago(String fssscore3monthsago) {
        this.fssscore3monthsago = fssscore3monthsago;
    }

    @JsonProperty("FSSSCORE_7MONTHSAGO")
    public String getFssscore7monthsago() {
        return fssscore7monthsago;
    }

    @JsonProperty("FSSSCORE_7MONTHSAGO")
    public void setFssscore7monthsago(String fssscore7monthsago) {
        this.fssscore7monthsago = fssscore7monthsago;
    }

    @JsonProperty("FSSSCORE_12MONTHSAGO")
    public String getFssscore12monthsago() {
        return fssscore12monthsago;
    }

    @JsonProperty("FSSSCORE_12MONTHSAGO")
    public void setFssscore12monthsago(String fssscore12monthsago) {
        this.fssscore12monthsago = fssscore12monthsago;
    }

    @JsonProperty("FSSSCORE_10MONTHSAGO")
    public String getFssscore10monthsago() {
        return fssscore10monthsago;
    }

    @JsonProperty("FSSSCORE_10MONTHSAGO")
    public void setFssscore10monthsago(String fssscore10monthsago) {
        this.fssscore10monthsago = fssscore10monthsago;
    }

    @JsonProperty("FSSSCORE_9MONTHSAGO")
    public String getFssscore9monthsago() {
        return fssscore9monthsago;
    }

    @JsonProperty("FSSSCORE_9MONTHSAGO")
    public void setFssscore9monthsago(String fssscore9monthsago) {
        this.fssscore9monthsago = fssscore9monthsago;
    }

    @JsonProperty("FSSSCORE_6MONTHSAGO")
    public String getFssscore6monthsago() {
        return fssscore6monthsago;
    }

    @JsonProperty("FSSSCORE_6MONTHSAGO")
    public void setFssscore6monthsago(String fssscore6monthsago) {
        this.fssscore6monthsago = fssscore6monthsago;
    }

    @JsonProperty("FSSSCORE_4MONTHSAGO")
    public String getFssscore4monthsago() {
        return fssscore4monthsago;
    }

    @JsonProperty("FSSSCORE_4MONTHSAGO")
    public void setFssscore4monthsago(String fssscore4monthsago) {
        this.fssscore4monthsago = fssscore4monthsago;
    }

    @JsonProperty("FSSSCORE_2MONTHSAGO")
    public String getFssscore2monthsago() {
        return fssscore2monthsago;
    }

    @JsonProperty("FSSSCORE_2MONTHSAGO")
    public void setFssscore2monthsago(String fssscore2monthsago) {
        this.fssscore2monthsago = fssscore2monthsago;
    }

    @JsonProperty("FSSSCORE_1MONTHSAGO")
    public String getFssscore1monthsago() {
        return fssscore1monthsago;
    }

    @JsonProperty("FSSSCORE_1MONTHSAGO")
    public void setFssscore1monthsago(String fssscore1monthsago) {
        this.fssscore1monthsago = fssscore1monthsago;
    }

    @JsonProperty("FSSCLASS_8MONTHSAGO")
    public String getFssclass8monthsago() {
        return fssclass8monthsago;
    }

    @JsonProperty("FSSCLASS_8MONTHSAGO")
    public void setFssclass8monthsago(String fssclass8monthsago) {
        this.fssclass8monthsago = fssclass8monthsago;
    }

    @JsonProperty("FSSCLASS_3MONTHSAGO")
    public String getFssclass3monthsago() {
        return fssclass3monthsago;
    }

    @JsonProperty("FSSCLASS_3MONTHSAGO")
    public void setFssclass3monthsago(String fssclass3monthsago) {
        this.fssclass3monthsago = fssclass3monthsago;
    }

    @JsonProperty("FSSCLASS_7MONTHSAGO")
    public String getFssclass7monthsago() {
        return fssclass7monthsago;
    }

    @JsonProperty("FSSCLASS_7MONTHSAGO")
    public void setFssclass7monthsago(String fssclass7monthsago) {
        this.fssclass7monthsago = fssclass7monthsago;
    }

    @JsonProperty("FSSCLASS_12MONTHSAGO")
    public String getFssclass12monthsago() {
        return fssclass12monthsago;
    }

    @JsonProperty("FSSCLASS_12MONTHSAGO")
    public void setFssclass12monthsago(String fssclass12monthsago) {
        this.fssclass12monthsago = fssclass12monthsago;
    }

    @JsonProperty("FSSCLASS_11MONTHSAGO")
    public String getFssclass11monthsago() {
        return fssclass11monthsago;
    }

    @JsonProperty("FSSCLASS_11MONTHSAGO")
    public void setFssclass11monthsago(String fssclass11monthsago) {
        this.fssclass11monthsago = fssclass11monthsago;
    }

    @JsonProperty("FSSCLASS_10MONTHSAGO")
    public String getFssclass10monthsago() {
        return fssclass10monthsago;
    }

    @JsonProperty("FSSCLASS_10MONTHSAGO")
    public void setFssclass10monthsago(String fssclass10monthsago) {
        this.fssclass10monthsago = fssclass10monthsago;
    }

    @JsonProperty("FSSCLASS_9MONTHSAGO")
    public String getFssclass9monthsago() {
        return fssclass9monthsago;
    }

    @JsonProperty("FSSCLASS_9MONTHSAGO")
    public void setFssclass9monthsago(String fssclass9monthsago) {
        this.fssclass9monthsago = fssclass9monthsago;
    }

    @JsonProperty("FSSCLASS_6MONTHSAGO")
    public String getFssclass6monthsago() {
        return fssclass6monthsago;
    }

    @JsonProperty("FSSCLASS_6MONTHSAGO")
    public void setFssclass6monthsago(String fssclass6monthsago) {
        this.fssclass6monthsago = fssclass6monthsago;
    }

    @JsonProperty("FSSCLASS_5MONTHSAGO")
    public String getFssclass5monthsago() {
        return fssclass5monthsago;
    }

    @JsonProperty("FSSCLASS_5MONTHSAGO")
    public void setFssclass5monthsago(String fssclass5monthsago) {
        this.fssclass5monthsago = fssclass5monthsago;
    }

    @JsonProperty("FSSCLASS_4MONTHSAGO")
    public String getFssclass4monthsago() {
        return fssclass4monthsago;
    }

    @JsonProperty("FSSCLASS_4MONTHSAGO")
    public void setFssclass4monthsago(String fssclass4monthsago) {
        this.fssclass4monthsago = fssclass4monthsago;
    }

    @JsonProperty("FSSCLASS_2MONTHSAGO")
    public String getFssclass2monthsago() {
        return fssclass2monthsago;
    }

    @JsonProperty("FSSCLASS_2MONTHSAGO")
    public void setFssclass2monthsago(String fssclass2monthsago) {
        this.fssclass2monthsago = fssclass2monthsago;
    }

    @JsonProperty("FSSCLASS_1MONTHSAGO")
    public String getFssclass1monthsago() {
        return fssclass1monthsago;
    }

    @JsonProperty("FSSCLASS_1MONTHSAGO")
    public void setFssclass1monthsago(String fssclass1monthsago) {
        this.fssclass1monthsago = fssclass1monthsago;
    }

    @JsonProperty("VIABILITY_RATING")
    public String getViabilityRating() {
        return viabilityRating;
    }

    @JsonProperty("VIABILITY_RATING")
    public void setViabilityRating(String viabilityRating) {
        this.viabilityRating = viabilityRating;
    }

    @JsonProperty("COMPANY_PROFILE")
    public String getCompanyProfile() {
        return companyProfile;
    }

    @JsonProperty("COMPANY_PROFILE")
    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    @JsonProperty("DATA_DEPTH_INDICATOR")
    public String getDataDepthIndicator() {
        return dataDepthIndicator;
    }

    @JsonProperty("DATA_DEPTH_INDICATOR")
    public void setDataDepthIndicator(String dataDepthIndicator) {
        this.dataDepthIndicator = dataDepthIndicator;
    }

    @JsonProperty("PORTFOLIO_COMPARISON")
    public String getPortfolioComparison() {
        return portfolioComparison;
    }

    @JsonProperty("PORTFOLIO_COMPARISON")
    public void setPortfolioComparison(String portfolioComparison) {
        this.portfolioComparison = portfolioComparison;
    }

    @JsonProperty("VIABILITY_SCORE")
    public String getViabilityScore() {
        return viabilityScore;
    }

    @JsonProperty("VIABILITY_SCORE")
    public void setViabilityScore(String viabilityScore) {
        this.viabilityScore = viabilityScore;
    }

    @JsonProperty("PARENT_NAME")
    public String getParentName() {
        return parentName;
    }

    @JsonProperty("PARENT_NAME")
    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    @JsonProperty("BUREAU_BIZ_OWNERSHIP_TYPE")
    public String getBureauBizOwnershipType() {
        return bureauBizOwnershipType;
    }

    @JsonProperty("BUREAU_BIZ_OWNERSHIP_TYPE")
    public void setBureauBizOwnershipType(String bureauBizOwnershipType) {
        this.bureauBizOwnershipType = bureauBizOwnershipType;
    }

    @JsonProperty("ACCOUNT_CREATED_DATE")
    public String getAccountCreatedDate() {
        return accountCreatedDate;
    }

    @JsonProperty("ACCOUNT_CREATED_DATE")
    public void setAccountCreatedDate(String accountCreatedDate) {
        this.accountCreatedDate = accountCreatedDate;
    }

    @JsonProperty("PARENT_COUNTRY")
    public String getParentCountry() {
        return parentCountry;
    }

    @JsonProperty("PARENT_COUNTRY")
    public void setParentCountry(String parentCountry) {
        this.parentCountry = parentCountry;
    }

    @JsonProperty("LEGAL_FLAG")
    public String getLegalFlag() {
        return legalFlag;
    }

    @JsonProperty("LEGAL_FLAG")
    public void setLegalFlag(String legalFlag) {
        this.legalFlag = legalFlag;
    }

    @JsonProperty("PARENT_DUNS_NUMBER")
    public String getParentDunsNumber() {
        return parentDunsNumber;
    }

    @JsonProperty("PARENT_DUNS_NUMBER")
    public void setParentDunsNumber(String parentDunsNumber) {
        this.parentDunsNumber = parentDunsNumber;
    }

    @JsonProperty("SALESPERSON_NO")
    public String getSalespersonNo() {
        return salespersonNo;
    }

    @JsonProperty("SALESPERSON_NO")
    public void setSalespersonNo(String salespersonNo) {
        this.salespersonNo = salespersonNo;
    }

    @JsonProperty("PRM_COUNTRY")
    public String getPrmCountry() {
        return prmCountry;
    }

    @JsonProperty("PRM_COUNTRY")
    public void setPrmCountry(String prmCountry) {
        this.prmCountry = prmCountry;
    }

    @JsonProperty("SIC_TWO_DIGIT_DESC")
    public String getSicTwoDigitDesc() {
        return sicTwoDigitDesc;
    }

    @JsonProperty("SIC_TWO_DIGIT_DESC")
    public void setSicTwoDigitDesc(String sicTwoDigitDesc) {
        this.sicTwoDigitDesc = sicTwoDigitDesc;
    }

    @JsonProperty("BAD_DEBT_RISK_CLASS")
    public String getBadDebtRiskClass() {
        return badDebtRiskClass;
    }

    @JsonProperty("BAD_DEBT_RISK_CLASS")
    public void setBadDebtRiskClass(String badDebtRiskClass) {
        this.badDebtRiskClass = badDebtRiskClass;
    }

    @JsonProperty("LAWSUIT_COUNT")
    public String getLawsuitCount() {
        return lawsuitCount;
    }

    @JsonProperty("LAWSUIT_COUNT")
    public void setLawsuitCount(String lawsuitCount) {
        this.lawsuitCount = lawsuitCount;
    }

    @JsonProperty("LIEN_COUNT")
    public String getLienCount() {
        return lienCount;
    }

    @JsonProperty("LIEN_COUNT")
    public void setLienCount(String lienCount) {
        this.lienCount = lienCount;
    }

    @JsonProperty("PROMPT_AMT")
    public String getPromptAmt() {
        return promptAmt;
    }

    @JsonProperty("PROMPT_AMT")
    public void setPromptAmt(String promptAmt) {
        this.promptAmt = promptAmt;
    }

    @JsonProperty("PROMPT_PCT_AGING")
    public String getPromptPctAging() {
        return promptPctAging;
    }

    @JsonProperty("PROMPT_PCT_AGING")
    public void setPromptPctAging(String promptPctAging) {
        this.promptPctAging = promptPctAging;
    }

    @JsonProperty("NATIONAL_ACCT_NUMBER")
    public String getNationalAcctNumber() {
        return nationalAcctNumber;
    }

    @JsonProperty("NATIONAL_ACCT_NUMBER")
    public void setNationalAcctNumber(String nationalAcctNumber) {
        this.nationalAcctNumber = nationalAcctNumber;
    }

    @JsonProperty("SLOW_OR_NEG_PMT_COUNT")
    public String getSlowOrNegPmtCount() {
        return slowOrNegPmtCount;
    }

    @JsonProperty("SLOW_OR_NEG_PMT_COUNT")
    public void setSlowOrNegPmtCount(String slowOrNegPmtCount) {
        this.slowOrNegPmtCount = slowOrNegPmtCount;
    }

    @JsonProperty("HIGHEST_CREDIT")
    public String getHighestCredit() {
        return highestCredit;
    }

    @JsonProperty("HIGHEST_CREDIT")
    public void setHighestCredit(String highestCredit) {
        this.highestCredit = highestCredit;
    }

    @JsonProperty("DEBT_TO_NET_WORTH_RATIO")
    public String getDebtToNetWorthRatio() {
        return debtToNetWorthRatio;
    }

    @JsonProperty("DEBT_TO_NET_WORTH_RATIO")
    public void setDebtToNetWorthRatio(String debtToNetWorthRatio) {
        this.debtToNetWorthRatio = debtToNetWorthRatio;
    }

    @JsonProperty("AVG_HIGH_CREDIT")
    public String getAvgHighCredit() {
        return avgHighCredit;
    }

    @JsonProperty("AVG_HIGH_CREDIT")
    public void setAvgHighCredit(String avgHighCredit) {
        this.avgHighCredit = avgHighCredit;
    }

    @JsonProperty("NEGATIVE_PAYMENT_COUNT")
    public String getNegativePaymentCount() {
        return negativePaymentCount;
    }

    @JsonProperty("NEGATIVE_PAYMENT_COUNT")
    public void setNegativePaymentCount(String negativePaymentCount) {
        this.negativePaymentCount = negativePaymentCount;
    }

    @JsonProperty("SLOW_PAYMENT_COUNT")
    public String getSlowPaymentCount() {
        return slowPaymentCount;
    }

    @JsonProperty("SLOW_PAYMENT_COUNT")
    public void setSlowPaymentCount(String slowPaymentCount) {
        this.slowPaymentCount = slowPaymentCount;
    }

    @JsonProperty("HIGH_RISK_INDICATOR")
    public String getHighRiskIndicator() {
        return highRiskIndicator;
    }

    @JsonProperty("HIGH_RISK_INDICATOR")
    public void setHighRiskIndicator(String highRiskIndicator) {
        this.highRiskIndicator = highRiskIndicator;
    }

    @JsonProperty("VALUE_OF_LIEN")
    public String getValueOfLien() {
        return valueOfLien;
    }

    @JsonProperty("VALUE_OF_LIEN")
    public void setValueOfLien(String valueOfLien) {
        this.valueOfLien = valueOfLien;
    }

    @JsonProperty("VALUE_OFCOURT_JUDGEMENT")
    public String getValueOfcourtJudgement() {
        return valueOfcourtJudgement;
    }

    @JsonProperty("VALUE_OFCOURT_JUDGEMENT")
    public void setValueOfcourtJudgement(String valueOfcourtJudgement) {
        this.valueOfcourtJudgement = valueOfcourtJudgement;
    }

    @JsonProperty("VALUE_OF_SUIT")
    public String getValueOfSuit() {
        return valueOfSuit;
    }

    @JsonProperty("VALUE_OF_SUIT")
    public void setValueOfSuit(String valueOfSuit) {
        this.valueOfSuit = valueOfSuit;
    }

    @JsonProperty("JUDGEMENT_COUNT")
    public String getJudgementCount() {
        return judgementCount;
    }

    @JsonProperty("JUDGEMENT_COUNT")
    public void setJudgementCount(String judgementCount) {
        this.judgementCount = judgementCount;
    }

    @JsonProperty("INC_YEAR")
    public String getIncYear() {
        return incYear;
    }

    @JsonProperty("INC_YEAR")
    public void setIncYear(String incYear) {
        this.incYear = incYear;
    }

    @JsonProperty("DUNS_TEL")
    public String getDunsTel() {
        return dunsTel;
    }

    @JsonProperty("DUNS_TEL")
    public void setDunsTel(String dunsTel) {
        this.dunsTel = dunsTel;
    }

    @JsonProperty("PAY_WITHIN_TERM_COUNT")
    public String getPayWithinTermCount() {
        return payWithinTermCount;
    }

    @JsonProperty("PAY_WITHIN_TERM_COUNT")
    public void setPayWithinTermCount(String payWithinTermCount) {
        this.payWithinTermCount = payWithinTermCount;
    }

    @JsonProperty("SCORE_16")
    public String getScore16() {
        return score16;
    }

    @JsonProperty("SCORE_16")
    public void setScore16(String score16) {
        this.score16 = score16;
    }

    @JsonProperty("SCORE_20")
    public String getScore20() {
        return score20;
    }

    @JsonProperty("SCORE_20")
    public void setScore20(String score20) {
        this.score20 = score20;
    }

    @JsonProperty("SCORE_19")
    public String getScore19() {
        return score19;
    }

    @JsonProperty("SCORE_19")
    public void setScore19(String score19) {
        this.score19 = score19;
    }

    @JsonProperty("SCORE_18")
    public String getScore18() {
        return score18;
    }

    @JsonProperty("SCORE_18")
    public void setScore18(String score18) {
        this.score18 = score18;
    }

    @JsonProperty("SCORE_17")
    public String getScore17() {
        return score17;
    }

    @JsonProperty("SCORE_17")
    public void setScore17(String score17) {
        this.score17 = score17;
    }

    @JsonProperty("SCORE_15")
    public String getScore15() {
        return score15;
    }

    @JsonProperty("SCORE_15")
    public void setScore15(String score15) {
        this.score15 = score15;
    }

    @JsonProperty("SCORE_14")
    public String getScore14() {
        return score14;
    }

    @JsonProperty("SCORE_14")
    public void setScore14(String score14) {
        this.score14 = score14;
    }

    @JsonProperty("SCORE_13")
    public String getScore13() {
        return score13;
    }

    @JsonProperty("SCORE_13")
    public void setScore13(String score13) {
        this.score13 = score13;
    }

    @JsonProperty("SCORE_12")
    public String getScore12() {
        return score12;
    }

    @JsonProperty("SCORE_12")
    public void setScore12(String score12) {
        this.score12 = score12;
    }

    @JsonProperty("SCORE_11")
    public String getScore11() {
        return score11;
    }

    @JsonProperty("SCORE_11")
    public void setScore11(String score11) {
        this.score11 = score11;
    }

    @JsonProperty("SCORE_10")
    public String getScore10() {
        return score10;
    }

    @JsonProperty("SCORE_10")
    public void setScore10(String score10) {
        this.score10 = score10;
    }

    @JsonProperty("SCORE_9")
    public String getScore9() {
        return score9;
    }

    @JsonProperty("SCORE_9")
    public void setScore9(String score9) {
        this.score9 = score9;
    }

    @JsonProperty("SCORE_8")
    public String getScore8() {
        return score8;
    }

    @JsonProperty("SCORE_8")
    public void setScore8(String score8) {
        this.score8 = score8;
    }

    @JsonProperty("SCORE_7")
    public String getScore7() {
        return score7;
    }

    @JsonProperty("SCORE_7")
    public void setScore7(String score7) {
        this.score7 = score7;
    }

    @JsonProperty("SCORE_6")
    public String getScore6() {
        return score6;
    }

    @JsonProperty("SCORE_6")
    public void setScore6(String score6) {
        this.score6 = score6;
    }

    @JsonProperty("SCORE_5")
    public String getScore5() {
        return score5;
    }

    @JsonProperty("SCORE_5")
    public void setScore5(String score5) {
        this.score5 = score5;
    }

    @JsonProperty("SCORE_4")
    public String getScore4() {
        return score4;
    }

    @JsonProperty("SCORE_4")
    public void setScore4(String score4) {
        this.score4 = score4;
    }

    @JsonProperty("SCORE_3")
    public String getScore3() {
        return score3;
    }

    @JsonProperty("SCORE_3")
    public void setScore3(String score3) {
        this.score3 = score3;
    }

    @JsonProperty("SCORE_2")
    public String getScore2() {
        return score2;
    }

    @JsonProperty("SCORE_2")
    public void setScore2(String score2) {
        this.score2 = score2;
    }

    @JsonProperty("SCORE_1")
    public String getScore1() {
        return score1;
    }

    @JsonProperty("SCORE_1")
    public void setScore1(String score1) {
        this.score1 = score1;
    }

    @JsonProperty("DELETE_YN")
    public String getDeleteYn() {
        return deleteYn;
    }

    @JsonProperty("DELETE_YN")
    public void setDeleteYn(String deleteYn) {
        this.deleteYn = deleteYn;
    }

    @JsonProperty("TRADE_EXP_SLOW_NEG_PMT")
    public String getTradeExpSlowNegPmt() {
        return tradeExpSlowNegPmt;
    }

    @JsonProperty("TRADE_EXP_SLOW_NEG_PMT")
    public void setTradeExpSlowNegPmt(String tradeExpSlowNegPmt) {
        this.tradeExpSlowNegPmt = tradeExpSlowNegPmt;
    }

    @JsonProperty("CONTROL_YEAR")
    public String getControlYear() {
        return controlYear;
    }

    @JsonProperty("CONTROL_YEAR")
    public void setControlYear(String controlYear) {
        this.controlYear = controlYear;
    }

    @JsonProperty("INCORPORATION_YEAR")
    public String getIncorporationYear() {
        return incorporationYear;
    }

    @JsonProperty("INCORPORATION_YEAR")
    public void setIncorporationYear(String incorporationYear) {
        this.incorporationYear = incorporationYear;
    }

    @JsonProperty("BUSINESS_START_DATE")
    public String getBusinessStartDate() {
        return businessStartDate;
    }

    @JsonProperty("BUSINESS_START_DATE")
    public void setBusinessStartDate(String businessStartDate) {
        this.businessStartDate = businessStartDate;
    }

    @JsonProperty("LAST_PAYMENT_DATE")
    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    @JsonProperty("LAST_PAYMENT_DATE")
    public void setLastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
    }

    @JsonProperty("LAST_ORDER_DATE")
    public String getLastOrderDate() {
        return lastOrderDate;
    }

    @JsonProperty("LAST_ORDER_DATE")
    public void setLastOrderDate(String lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    @JsonProperty("LAST_YEAR_SALES")
    public String getLastYearSales() {
        return lastYearSales;
    }

    @JsonProperty("LAST_YEAR_SALES")
    public void setLastYearSales(String lastYearSales) {
        this.lastYearSales = lastYearSales;
    }

    @JsonProperty("LAST_ORDER_AMT")
    public String getLastOrderAmt() {
        return lastOrderAmt;
    }

    @JsonProperty("LAST_ORDER_AMT")
    public void setLastOrderAmt(String lastOrderAmt) {
        this.lastOrderAmt = lastOrderAmt;
    }

    @JsonProperty("LAST_PAYMENT_AMT")
    public String getLastPaymentAmt() {
        return lastPaymentAmt;
    }

    @JsonProperty("LAST_PAYMENT_AMT")
    public void setLastPaymentAmt(String lastPaymentAmt) {
        this.lastPaymentAmt = lastPaymentAmt;
    }

    @JsonProperty("BUSINESS_OWNERSHIP_TYPE")
    public String getBusinessOwnershipType() {
        return businessOwnershipType;
    }

    @JsonProperty("BUSINESS_OWNERSHIP_TYPE")
    public void setBusinessOwnershipType(String businessOwnershipType) {
        this.businessOwnershipType = businessOwnershipType;
    }

    @JsonProperty("DIVISION")
    public String getDivision() {
        return division;
    }

    @JsonProperty("DIVISION")
    public void setDivision(String division) {
        this.division = division;
    }

    @JsonProperty("DISTRICT")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("DISTRICT")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("EXCLUDE_YN")
    public String getExcludeYn() {
        return excludeYn;
    }

    @JsonProperty("EXCLUDE_YN")
    public void setExcludeYn(String excludeYn) {
        this.excludeYn = excludeYn;
    }

    @JsonProperty("FINANCIAL_STRESS_SCORE")
    public String getFinancialStressScore() {
        return financialStressScore;
    }

    @JsonProperty("FINANCIAL_STRESS_SCORE")
    public void setFinancialStressScore(String financialStressScore) {
        this.financialStressScore = financialStressScore;
    }

    @JsonProperty("COMMERCIAL_CREDIT_SCORE")
    public String getCommercialCreditScore() {
        return commercialCreditScore;
    }

    @JsonProperty("COMMERCIAL_CREDIT_SCORE")
    public void setCommercialCreditScore(String commercialCreditScore) {
        this.commercialCreditScore = commercialCreditScore;
    }

    @JsonProperty("PARENT_CUST_NUMBER")
    public String getParentCustNumber() {
        return parentCustNumber;
    }

    @JsonProperty("PARENT_CUST_NUMBER")
    public void setParentCustNumber(String parentCustNumber) {
        this.parentCustNumber = parentCustNumber;
    }

    @JsonProperty("GLOBAL_ULTIMATE_PARENT_CUSTNO")
    public String getGlobalUltimateParentCustno() {
        return globalUltimateParentCustno;
    }

    @JsonProperty("GLOBAL_ULTIMATE_PARENT_CUSTNO")
    public void setGlobalUltimateParentCustno(String globalUltimateParentCustno) {
        this.globalUltimateParentCustno = globalUltimateParentCustno;
    }

    @JsonProperty("HEADQTR_COUNTRY_CODE")
    public String getHeadqtrCountryCode() {
        return headqtrCountryCode;
    }

    @JsonProperty("HEADQTR_COUNTRY_CODE")
    public void setHeadqtrCountryCode(String headqtrCountryCode) {
        this.headqtrCountryCode = headqtrCountryCode;
    }

    @JsonProperty("GLOBAL_ULTIMATE_COUNTRY")
    public String getGlobalUltimateCountry() {
        return globalUltimateCountry;
    }

    @JsonProperty("GLOBAL_ULTIMATE_COUNTRY")
    public void setGlobalUltimateCountry(String globalUltimateCountry) {
        this.globalUltimateCountry = globalUltimateCountry;
    }

    @JsonProperty("BUSINESS_METROAREA")
    public String getBusinessMetroarea() {
        return businessMetroarea;
    }

    @JsonProperty("BUSINESS_METROAREA")
    public void setBusinessMetroarea(String businessMetroarea) {
        this.businessMetroarea = businessMetroarea;
    }

    @JsonProperty("HEAD_NAME")
    public String getHeadName() {
        return headName;
    }

    @JsonProperty("HEAD_NAME")
    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @JsonProperty("DAYS_BEYOND_TERMS")
    public String getDaysBeyondTerms() {
        return daysBeyondTerms;
    }

    @JsonProperty("DAYS_BEYOND_TERMS")
    public void setDaysBeyondTerms(String daysBeyondTerms) {
        this.daysBeyondTerms = daysBeyondTerms;
    }

    @JsonProperty("DUNS_NUMBER")
    public String getDunsNumber() {
        return dunsNumber;
    }

    @JsonProperty("DUNS_NUMBER")
    public void setDunsNumber(String dunsNumber) {
        this.dunsNumber = dunsNumber;
    }

    @JsonProperty("MODIFIED_BY")
    public String getModifiedBy() {
        return modifiedBy;
    }

    @JsonProperty("MODIFIED_BY")
    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @JsonProperty("CREATED_BY")
    public String getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("CREATED_BY")
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("DATE_MODIFIED")
    public String getDateModified() {
        return dateModified;
    }

    @JsonProperty("DATE_MODIFIED")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonProperty("DATE_CREATED")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("DATE_CREATED")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("CREDIT_LIMIT_UTILIZATION")
    public String getCreditLimitUtilization() {
        return creditLimitUtilization;
    }

    @JsonProperty("CREDIT_LIMIT_UTILIZATION")
    public void setCreditLimitUtilization(String creditLimitUtilization) {
        this.creditLimitUtilization = creditLimitUtilization;
    }

    @JsonProperty("DAYS_SALES_OUTSTANDING")
    public String getDaysSalesOutstanding() {
        return daysSalesOutstanding;
    }

    @JsonProperty("DAYS_SALES_OUTSTANDING")
    public void setDaysSalesOutstanding(String daysSalesOutstanding) {
        this.daysSalesOutstanding = daysSalesOutstanding;
    }

    @JsonProperty("TOTAL_OUTSTG_WITH_OUT_CREDIT")
    public String getTotalOutstgWithOutCredit() {
        return totalOutstgWithOutCredit;
    }

    @JsonProperty("TOTAL_OUTSTG_WITH_OUT_CREDIT")
    public void setTotalOutstgWithOutCredit(String totalOutstgWithOutCredit) {
        this.totalOutstgWithOutCredit = totalOutstgWithOutCredit;
    }

    @JsonProperty("BACK_OFF_TOTAL_OUTSTANDING_AMT")
    public String getBackOffTotalOutstandingAmt() {
        return backOffTotalOutstandingAmt;
    }

    @JsonProperty("BACK_OFF_TOTAL_OUTSTANDING_AMT")
    public void setBackOffTotalOutstandingAmt(String backOffTotalOutstandingAmt) {
        this.backOffTotalOutstandingAmt = backOffTotalOutstandingAmt;
    }

    @JsonProperty("TOTAL_OUTSTANDING_AMT")
    public String getTotalOutstandingAmt() {
        return totalOutstandingAmt;
    }

    @JsonProperty("TOTAL_OUTSTANDING_AMT")
    public void setTotalOutstandingAmt(String totalOutstandingAmt) {
        this.totalOutstandingAmt = totalOutstandingAmt;
    }

    @JsonProperty("TOTAL_PASTDUE_AMT")
    public String getTotalPastdueAmt() {
        return totalPastdueAmt;
    }

    @JsonProperty("TOTAL_PASTDUE_AMT")
    public void setTotalPastdueAmt(String totalPastdueAmt) {
        this.totalPastdueAmt = totalPastdueAmt;
    }

    @JsonProperty("BUCKET_11_PCT_OVER")
    public String getBucket11PctOver() {
        return bucket11PctOver;
    }

    @JsonProperty("BUCKET_11_PCT_OVER")
    public void setBucket11PctOver(String bucket11PctOver) {
        this.bucket11PctOver = bucket11PctOver;
    }

    @JsonProperty("BUCKET_10_PCT_OVER")
    public String getBucket10PctOver() {
        return bucket10PctOver;
    }

    @JsonProperty("BUCKET_10_PCT_OVER")
    public void setBucket10PctOver(String bucket10PctOver) {
        this.bucket10PctOver = bucket10PctOver;
    }

    @JsonProperty("BUCKET_9_PCT_OVER")
    public String getBucket9PctOver() {
        return bucket9PctOver;
    }

    @JsonProperty("BUCKET_9_PCT_OVER")
    public void setBucket9PctOver(String bucket9PctOver) {
        this.bucket9PctOver = bucket9PctOver;
    }

    @JsonProperty("BUCKET_8_PCT_OVER")
    public String getBucket8PctOver() {
        return bucket8PctOver;
    }

    @JsonProperty("BUCKET_8_PCT_OVER")
    public void setBucket8PctOver(String bucket8PctOver) {
        this.bucket8PctOver = bucket8PctOver;
    }

    @JsonProperty("BUCKET_7_PCT_OVER")
    public String getBucket7PctOver() {
        return bucket7PctOver;
    }

    @JsonProperty("BUCKET_7_PCT_OVER")
    public void setBucket7PctOver(String bucket7PctOver) {
        this.bucket7PctOver = bucket7PctOver;
    }

    @JsonProperty("BUCKET_6_PCT_OVER")
    public String getBucket6PctOver() {
        return bucket6PctOver;
    }

    @JsonProperty("BUCKET_6_PCT_OVER")
    public void setBucket6PctOver(String bucket6PctOver) {
        this.bucket6PctOver = bucket6PctOver;
    }

    @JsonProperty("BUCKET_5_PCT_OVER")
    public String getBucket5PctOver() {
        return bucket5PctOver;
    }

    @JsonProperty("BUCKET_5_PCT_OVER")
    public void setBucket5PctOver(String bucket5PctOver) {
        this.bucket5PctOver = bucket5PctOver;
    }

    @JsonProperty("BUCKET_4_PCT_OVER")
    public String getBucket4PctOver() {
        return bucket4PctOver;
    }

    @JsonProperty("BUCKET_4_PCT_OVER")
    public void setBucket4PctOver(String bucket4PctOver) {
        this.bucket4PctOver = bucket4PctOver;
    }

    @JsonProperty("BUCKET_3_PCT_OVER")
    public String getBucket3PctOver() {
        return bucket3PctOver;
    }

    @JsonProperty("BUCKET_3_PCT_OVER")
    public void setBucket3PctOver(String bucket3PctOver) {
        this.bucket3PctOver = bucket3PctOver;
    }

    @JsonProperty("BUCKET_2_PCT_OVER")
    public String getBucket2PctOver() {
        return bucket2PctOver;
    }

    @JsonProperty("BUCKET_2_PCT_OVER")
    public void setBucket2PctOver(String bucket2PctOver) {
        this.bucket2PctOver = bucket2PctOver;
    }

    @JsonProperty("BUCKET_1_PCT_OVER")
    public String getBucket1PctOver() {
        return bucket1PctOver;
    }

    @JsonProperty("BUCKET_1_PCT_OVER")
    public void setBucket1PctOver(String bucket1PctOver) {
        this.bucket1PctOver = bucket1PctOver;
    }

    @JsonProperty("BUCKET_12_PCT")
    public String getBucket12Pct() {
        return bucket12Pct;
    }

    @JsonProperty("BUCKET_12_PCT")
    public void setBucket12Pct(String bucket12Pct) {
        this.bucket12Pct = bucket12Pct;
    }

    @JsonProperty("BUCKET_11_PCT")
    public String getBucket11Pct() {
        return bucket11Pct;
    }

    @JsonProperty("BUCKET_11_PCT")
    public void setBucket11Pct(String bucket11Pct) {
        this.bucket11Pct = bucket11Pct;
    }

    @JsonProperty("BUCKET_10_PCT")
    public String getBucket10Pct() {
        return bucket10Pct;
    }

    @JsonProperty("BUCKET_10_PCT")
    public void setBucket10Pct(String bucket10Pct) {
        this.bucket10Pct = bucket10Pct;
    }

    @JsonProperty("BUCKET_9_PCT")
    public String getBucket9Pct() {
        return bucket9Pct;
    }

    @JsonProperty("BUCKET_9_PCT")
    public void setBucket9Pct(String bucket9Pct) {
        this.bucket9Pct = bucket9Pct;
    }

    @JsonProperty("BUCKET_8_PCT")
    public String getBucket8Pct() {
        return bucket8Pct;
    }

    @JsonProperty("BUCKET_8_PCT")
    public void setBucket8Pct(String bucket8Pct) {
        this.bucket8Pct = bucket8Pct;
    }

    @JsonProperty("BUCKET_7_PCT")
    public String getBucket7Pct() {
        return bucket7Pct;
    }

    @JsonProperty("BUCKET_7_PCT")
    public void setBucket7Pct(String bucket7Pct) {
        this.bucket7Pct = bucket7Pct;
    }

    @JsonProperty("BUCKET_6_PCT")
    public String getBucket6Pct() {
        return bucket6Pct;
    }

    @JsonProperty("BUCKET_6_PCT")
    public void setBucket6Pct(String bucket6Pct) {
        this.bucket6Pct = bucket6Pct;
    }

    @JsonProperty("BUCKET_5_PCT")
    public String getBucket5Pct() {
        return bucket5Pct;
    }

    @JsonProperty("BUCKET_5_PCT")
    public void setBucket5Pct(String bucket5Pct) {
        this.bucket5Pct = bucket5Pct;
    }

    @JsonProperty("BUCKET_4_PCT")
    public String getBucket4Pct() {
        return bucket4Pct;
    }

    @JsonProperty("BUCKET_4_PCT")
    public void setBucket4Pct(String bucket4Pct) {
        this.bucket4Pct = bucket4Pct;
    }

    @JsonProperty("BUCKET_3_PCT")
    public String getBucket3Pct() {
        return bucket3Pct;
    }

    @JsonProperty("BUCKET_3_PCT")
    public void setBucket3Pct(String bucket3Pct) {
        this.bucket3Pct = bucket3Pct;
    }

    @JsonProperty("BUCKET_2_PCT")
    public String getBucket2Pct() {
        return bucket2Pct;
    }

    @JsonProperty("BUCKET_2_PCT")
    public void setBucket2Pct(String bucket2Pct) {
        this.bucket2Pct = bucket2Pct;
    }

    @JsonProperty("BUCKET_1_PCT")
    public String getBucket1Pct() {
        return bucket1Pct;
    }

    @JsonProperty("BUCKET_1_PCT")
    public void setBucket1Pct(String bucket1Pct) {
        this.bucket1Pct = bucket1Pct;
    }

    @JsonProperty("BUCKET_11_AMT_OVER")
    public String getBucket11AmtOver() {
        return bucket11AmtOver;
    }

    @JsonProperty("BUCKET_11_AMT_OVER")
    public void setBucket11AmtOver(String bucket11AmtOver) {
        this.bucket11AmtOver = bucket11AmtOver;
    }

    @JsonProperty("BUCKET_10_AMT_OVER")
    public String getBucket10AmtOver() {
        return bucket10AmtOver;
    }

    @JsonProperty("BUCKET_10_AMT_OVER")
    public void setBucket10AmtOver(String bucket10AmtOver) {
        this.bucket10AmtOver = bucket10AmtOver;
    }

    @JsonProperty("BUCKET_9_AMT_OVER")
    public String getBucket9AmtOver() {
        return bucket9AmtOver;
    }

    @JsonProperty("BUCKET_9_AMT_OVER")
    public void setBucket9AmtOver(String bucket9AmtOver) {
        this.bucket9AmtOver = bucket9AmtOver;
    }

    @JsonProperty("BUCKET_8_AMT_OVER")
    public String getBucket8AmtOver() {
        return bucket8AmtOver;
    }

    @JsonProperty("BUCKET_8_AMT_OVER")
    public void setBucket8AmtOver(String bucket8AmtOver) {
        this.bucket8AmtOver = bucket8AmtOver;
    }

    @JsonProperty("BUCKET_7_AMT_OVER")
    public String getBucket7AmtOver() {
        return bucket7AmtOver;
    }

    @JsonProperty("BUCKET_7_AMT_OVER")
    public void setBucket7AmtOver(String bucket7AmtOver) {
        this.bucket7AmtOver = bucket7AmtOver;
    }

    @JsonProperty("BUCKET_6_AMT_OVER")
    public String getBucket6AmtOver() {
        return bucket6AmtOver;
    }

    @JsonProperty("BUCKET_6_AMT_OVER")
    public void setBucket6AmtOver(String bucket6AmtOver) {
        this.bucket6AmtOver = bucket6AmtOver;
    }

    @JsonProperty("BUCKET_5_AMT_OVER")
    public String getBucket5AmtOver() {
        return bucket5AmtOver;
    }

    @JsonProperty("BUCKET_5_AMT_OVER")
    public void setBucket5AmtOver(String bucket5AmtOver) {
        this.bucket5AmtOver = bucket5AmtOver;
    }

    @JsonProperty("BUCKET_4_AMT_OVER")
    public String getBucket4AmtOver() {
        return bucket4AmtOver;
    }

    @JsonProperty("BUCKET_4_AMT_OVER")
    public void setBucket4AmtOver(String bucket4AmtOver) {
        this.bucket4AmtOver = bucket4AmtOver;
    }

    @JsonProperty("BUCKET_3_AMT_OVER")
    public String getBucket3AmtOver() {
        return bucket3AmtOver;
    }

    @JsonProperty("BUCKET_3_AMT_OVER")
    public void setBucket3AmtOver(String bucket3AmtOver) {
        this.bucket3AmtOver = bucket3AmtOver;
    }

    @JsonProperty("BUCKET_2_AMT_OVER")
    public String getBucket2AmtOver() {
        return bucket2AmtOver;
    }

    @JsonProperty("BUCKET_2_AMT_OVER")
    public void setBucket2AmtOver(String bucket2AmtOver) {
        this.bucket2AmtOver = bucket2AmtOver;
    }

    @JsonProperty("BUCKET_1_AMT_OVER")
    public String getBucket1AmtOver() {
        return bucket1AmtOver;
    }

    @JsonProperty("BUCKET_1_AMT_OVER")
    public void setBucket1AmtOver(String bucket1AmtOver) {
        this.bucket1AmtOver = bucket1AmtOver;
    }

    @JsonProperty("BUCKET_12_AMT")
    public String getBucket12Amt() {
        return bucket12Amt;
    }

    @JsonProperty("BUCKET_12_AMT")
    public void setBucket12Amt(String bucket12Amt) {
        this.bucket12Amt = bucket12Amt;
    }

    @JsonProperty("BUCKET_11_AMT")
    public String getBucket11Amt() {
        return bucket11Amt;
    }

    @JsonProperty("BUCKET_11_AMT")
    public void setBucket11Amt(String bucket11Amt) {
        this.bucket11Amt = bucket11Amt;
    }

    @JsonProperty("BUCKET_10_AMT")
    public String getBucket10Amt() {
        return bucket10Amt;
    }

    @JsonProperty("BUCKET_10_AMT")
    public void setBucket10Amt(String bucket10Amt) {
        this.bucket10Amt = bucket10Amt;
    }

    @JsonProperty("BUCKET_9_AMT")
    public String getBucket9Amt() {
        return bucket9Amt;
    }

    @JsonProperty("BUCKET_9_AMT")
    public void setBucket9Amt(String bucket9Amt) {
        this.bucket9Amt = bucket9Amt;
    }

    @JsonProperty("BUCKET_8_AMT")
    public String getBucket8Amt() {
        return bucket8Amt;
    }

    @JsonProperty("BUCKET_8_AMT")
    public void setBucket8Amt(String bucket8Amt) {
        this.bucket8Amt = bucket8Amt;
    }

    @JsonProperty("BUCKET_7_AMT")
    public String getBucket7Amt() {
        return bucket7Amt;
    }

    @JsonProperty("BUCKET_7_AMT")
    public void setBucket7Amt(String bucket7Amt) {
        this.bucket7Amt = bucket7Amt;
    }

    @JsonProperty("BUCKET_6_AMT")
    public String getBucket6Amt() {
        return bucket6Amt;
    }

    @JsonProperty("BUCKET_6_AMT")
    public void setBucket6Amt(String bucket6Amt) {
        this.bucket6Amt = bucket6Amt;
    }

    @JsonProperty("BUCKET_5_AMT")
    public String getBucket5Amt() {
        return bucket5Amt;
    }

    @JsonProperty("BUCKET_5_AMT")
    public void setBucket5Amt(String bucket5Amt) {
        this.bucket5Amt = bucket5Amt;
    }

    @JsonProperty("BUCKET_4_AMT")
    public String getBucket4Amt() {
        return bucket4Amt;
    }

    @JsonProperty("BUCKET_4_AMT")
    public void setBucket4Amt(String bucket4Amt) {
        this.bucket4Amt = bucket4Amt;
    }

    @JsonProperty("BUCKET_3_AMT")
    public String getBucket3Amt() {
        return bucket3Amt;
    }

    @JsonProperty("BUCKET_3_AMT")
    public void setBucket3Amt(String bucket3Amt) {
        this.bucket3Amt = bucket3Amt;
    }

    @JsonProperty("BUCKET_2_AMT")
    public String getBucket2Amt() {
        return bucket2Amt;
    }

    @JsonProperty("BUCKET_2_AMT")
    public void setBucket2Amt(String bucket2Amt) {
        this.bucket2Amt = bucket2Amt;
    }

    @JsonProperty("BUCKET_1_AMT")
    public String getBucket1Amt() {
        return bucket1Amt;
    }

    @JsonProperty("BUCKET_1_AMT")
    public void setBucket1Amt(String bucket1Amt) {
        this.bucket1Amt = bucket1Amt;
    }

    @JsonProperty("DATE_OF_AGING")
    public String getDateOfAging() {
        return dateOfAging;
    }

    @JsonProperty("DATE_OF_AGING")
    public void setDateOfAging(String dateOfAging) {
        this.dateOfAging = dateOfAging;
    }

    @JsonProperty("PAYMENT_TERM")
    public String getPaymentTerm() {
        return paymentTerm;
    }

    @JsonProperty("PAYMENT_TERM")
    public void setPaymentTerm(String paymentTerm) {
        this.paymentTerm = paymentTerm;
    }

    @JsonProperty("PUBLIC_IND")
    public String getPublicInd() {
        return publicInd;
    }

    @JsonProperty("PUBLIC_IND")
    public void setPublicInd(String publicInd) {
        this.publicInd = publicInd;
    }

    @JsonProperty("HISTORY_INDICATOR")
    public String getHistoryIndicator() {
        return historyIndicator;
    }

    @JsonProperty("HISTORY_INDICATOR")
    public void setHistoryIndicator(String historyIndicator) {
        this.historyIndicator = historyIndicator;
    }

    @JsonProperty("BHQ_INDICATOR")
    public String getBhqIndicator() {
        return bhqIndicator;
    }

    @JsonProperty("BHQ_INDICATOR")
    public void setBhqIndicator(String bhqIndicator) {
        this.bhqIndicator = bhqIndicator;
    }

    @JsonProperty("REVENUE")
    public String getRevenue() {
        return revenue;
    }

    @JsonProperty("REVENUE")
    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    @JsonProperty("BUSINESS_NET_WORTH")
    public String getBusinessNetWorth() {
        return businessNetWorth;
    }

    @JsonProperty("BUSINESS_NET_WORTH")
    public void setBusinessNetWorth(String businessNetWorth) {
        this.businessNetWorth = businessNetWorth;
    }

    @JsonProperty("DNB_BUSINESS_BUREAU_IND")
    public String getDnbBusinessBureauInd() {
        return dnbBusinessBureauInd;
    }

    @JsonProperty("DNB_BUSINESS_BUREAU_IND")
    public void setDnbBusinessBureauInd(String dnbBusinessBureauInd) {
        this.dnbBusinessBureauInd = dnbBusinessBureauInd;
    }

    @JsonProperty("YEARS_WITH_CURRENT_MGMT")
    public String getYearsWithCurrentMgmt() {
        return yearsWithCurrentMgmt;
    }

    @JsonProperty("YEARS_WITH_CURRENT_MGMT")
    public void setYearsWithCurrentMgmt(String yearsWithCurrentMgmt) {
        this.yearsWithCurrentMgmt = yearsWithCurrentMgmt;
    }

    @JsonProperty("TRADE_EXP_SLOW_NEG_PMT_PCT")
    public String getTradeExpSlowNegPmtPct() {
        return tradeExpSlowNegPmtPct;
    }

    @JsonProperty("TRADE_EXP_SLOW_NEG_PMT_PCT")
    public void setTradeExpSlowNegPmtPct(String tradeExpSlowNegPmtPct) {
        this.tradeExpSlowNegPmtPct = tradeExpSlowNegPmtPct;
    }

    @JsonProperty("TOTAL_PAYMENT_EXPERIENCES")
    public String getTotalPaymentExperiences() {
        return totalPaymentExperiences;
    }

    @JsonProperty("TOTAL_PAYMENT_EXPERIENCES")
    public void setTotalPaymentExperiences(String totalPaymentExperiences) {
        this.totalPaymentExperiences = totalPaymentExperiences;
    }

    @JsonProperty("CURRENT_RATIO")
    public String getCurrentRatio() {
        return currentRatio;
    }

    @JsonProperty("CURRENT_RATIO")
    public void setCurrentRatio(String currentRatio) {
        this.currentRatio = currentRatio;
    }

    @JsonProperty("TOTAL_ASSETS")
    public String getTotalAssets() {
        return totalAssets;
    }

    @JsonProperty("TOTAL_ASSETS")
    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
    }

    @JsonProperty("TOTAL_LIABILITIES")
    public String getTotalLiabilities() {
        return totalLiabilities;
    }

    @JsonProperty("TOTAL_LIABILITIES")
    public void setTotalLiabilities(String totalLiabilities) {
        this.totalLiabilities = totalLiabilities;
    }

    @JsonProperty("BANKRUPTCY_YN")
    public String getBankruptcyYn() {
        return bankruptcyYn;
    }

    @JsonProperty("BANKRUPTCY_YN")
    public void setBankruptcyYn(String bankruptcyYn) {
        this.bankruptcyYn = bankruptcyYn;
    }

    @JsonProperty("LIEN_YN")
    public String getLienYn() {
        return lienYn;
    }

    @JsonProperty("LIEN_YN")
    public void setLienYn(String lienYn) {
        this.lienYn = lienYn;
    }

    @JsonProperty("JUDGEMENT_YN")
    public String getJudgementYn() {
        return judgementYn;
    }

    @JsonProperty("JUDGEMENT_YN")
    public void setJudgementYn(String judgementYn) {
        this.judgementYn = judgementYn;
    }

    @JsonProperty("SUIT_YN")
    public String getSuitYn() {
        return suitYn;
    }

    @JsonProperty("SUIT_YN")
    public void setSuitYn(String suitYn) {
        this.suitYn = suitYn;
    }

    @JsonProperty("TERRITORY")
    public String getTerritory() {
        return territory;
    }

    @JsonProperty("TERRITORY")
    public void setTerritory(String territory) {
        this.territory = territory;
    }

    @JsonProperty("RISK_CLASSIFICATION")
    public String getRiskClassification() {
        return riskClassification;
    }

    @JsonProperty("RISK_CLASSIFICATION")
    public void setRiskClassification(String riskClassification) {
        this.riskClassification = riskClassification;
    }

    @JsonProperty("CUSTOMER_TYPE")
    public String getCustomerType() {
        return customerType;
    }

    @JsonProperty("CUSTOMER_TYPE")
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @JsonProperty("BUSINESS_UNIT")
    public String getBusinessUnit() {
        return businessUnit;
    }

    @JsonProperty("BUSINESS_UNIT")
    public void setBusinessUnit(String businessUnit) {
        this.businessUnit = businessUnit;
    }

    @JsonProperty("BUSINESS_STRUCTURE")
    public String getBusinessStructure() {
        return businessStructure;
    }

    @JsonProperty("BUSINESS_STRUCTURE")
    public void setBusinessStructure(String businessStructure) {
        this.businessStructure = businessStructure;
    }

    @JsonProperty("CUSTOMER_NO")
    public String getCustomerNo() {
        return customerNo;
    }

    @JsonProperty("CUSTOMER_NO")
    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    @JsonProperty("SALESPERSON_NAME")
    public String getSalespersonName() {
        return salespersonName;
    }

    @JsonProperty("SALESPERSON_NAME")
    public void setSalespersonName(String salespersonName) {
        this.salespersonName = salespersonName;
    }

    @JsonProperty("PRODUCT_LINE")
    public String getProductLine() {
        return productLine;
    }

    @JsonProperty("PRODUCT_LINE")
    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    @JsonProperty("LAST_PAYMENT_AMOUNT")
    public String getLastPaymentAmount() {
        return lastPaymentAmount;
    }

    @JsonProperty("LAST_PAYMENT_AMOUNT")
    public void setLastPaymentAmount(String lastPaymentAmount) {
        this.lastPaymentAmount = lastPaymentAmount;
    }

    @JsonProperty("PAYDEX_12MONTHSAGO")
    public String getPaydex12monthsago() {
        return paydex12monthsago;
    }

    @JsonProperty("PAYDEX_12MONTHSAGO")
    public void setPaydex12monthsago(String paydex12monthsago) {
        this.paydex12monthsago = paydex12monthsago;
    }

    @JsonProperty("PAYDEX_6MONTHSAGO")
    public String getPaydex6monthsago() {
        return paydex6monthsago;
    }

    @JsonProperty("PAYDEX_6MONTHSAGO")
    public void setPaydex6monthsago(String paydex6monthsago) {
        this.paydex6monthsago = paydex6monthsago;
    }

    @JsonProperty("PAYDEX_3MONTHSAGO")
    public String getPaydex3monthsago() {
        return paydex3monthsago;
    }

    @JsonProperty("PAYDEX_3MONTHSAGO")
    public void setPaydex3monthsago(String paydex3monthsago) {
        this.paydex3monthsago = paydex3monthsago;
    }

    @JsonProperty("PAYDEX_9MONTHSAGO")
    public String getPaydex9monthsago() {
        return paydex9monthsago;
    }

    @JsonProperty("PAYDEX_9MONTHSAGO")
    public void setPaydex9monthsago(String paydex9monthsago) {
        this.paydex9monthsago = paydex9monthsago;
    }

    @JsonProperty("PAYDEX_1MONTHSAGO")
    public String getPaydex1monthsago() {
        return paydex1monthsago;
    }

    @JsonProperty("PAYDEX_1MONTHSAGO")
    public void setPaydex1monthsago(String paydex1monthsago) {
        this.paydex1monthsago = paydex1monthsago;
    }

    @JsonProperty("CCSPERCENTILE_12MONTHSAGO")
    public String getCcspercentile12monthsago() {
        return ccspercentile12monthsago;
    }

    @JsonProperty("CCSPERCENTILE_12MONTHSAGO")
    public void setCcspercentile12monthsago(String ccspercentile12monthsago) {
        this.ccspercentile12monthsago = ccspercentile12monthsago;
    }

    @JsonProperty("CCSPERCENTILE_9MONTHSAGO")
    public String getCcspercentile9monthsago() {
        return ccspercentile9monthsago;
    }

    @JsonProperty("CCSPERCENTILE_9MONTHSAGO")
    public void setCcspercentile9monthsago(String ccspercentile9monthsago) {
        this.ccspercentile9monthsago = ccspercentile9monthsago;
    }

    @JsonProperty("CCSPERCENTILE_6MONTHSAGO")
    public String getCcspercentile6monthsago() {
        return ccspercentile6monthsago;
    }

    @JsonProperty("CCSPERCENTILE_6MONTHSAGO")
    public void setCcspercentile6monthsago(String ccspercentile6monthsago) {
        this.ccspercentile6monthsago = ccspercentile6monthsago;
    }

    @JsonProperty("CCSPERCENTILE_3MONTHSAGO")
    public String getCcspercentile3monthsago() {
        return ccspercentile3monthsago;
    }

    @JsonProperty("CCSPERCENTILE_3MONTHSAGO")
    public void setCcspercentile3monthsago(String ccspercentile3monthsago) {
        this.ccspercentile3monthsago = ccspercentile3monthsago;
    }

    @JsonProperty("CCSPERCENTILE_1MONTHSAGO")
    public String getCcspercentile1monthsago() {
        return ccspercentile1monthsago;
    }

    @JsonProperty("CCSPERCENTILE_1MONTHSAGO")
    public void setCcspercentile1monthsago(String ccspercentile1monthsago) {
        this.ccspercentile1monthsago = ccspercentile1monthsago;
    }

    @JsonProperty("FSSPERCENTILE_12MONTHSAGO")
    public String getFsspercentile12monthsago() {
        return fsspercentile12monthsago;
    }

    @JsonProperty("FSSPERCENTILE_12MONTHSAGO")
    public void setFsspercentile12monthsago(String fsspercentile12monthsago) {
        this.fsspercentile12monthsago = fsspercentile12monthsago;
    }

    @JsonProperty("FSSPERCENTILE_9MONTHSAGO")
    public String getFsspercentile9monthsago() {
        return fsspercentile9monthsago;
    }

    @JsonProperty("FSSPERCENTILE_9MONTHSAGO")
    public void setFsspercentile9monthsago(String fsspercentile9monthsago) {
        this.fsspercentile9monthsago = fsspercentile9monthsago;
    }

    @JsonProperty("FSSPERCENTILE_6MONTHSAGO")
    public String getFsspercentile6monthsago() {
        return fsspercentile6monthsago;
    }

    @JsonProperty("FSSPERCENTILE_6MONTHSAGO")
    public void setFsspercentile6monthsago(String fsspercentile6monthsago) {
        this.fsspercentile6monthsago = fsspercentile6monthsago;
    }

    @JsonProperty("FSSPERCENTILE_3MONTHSAGO")
    public String getFsspercentile3monthsago() {
        return fsspercentile3monthsago;
    }

    @JsonProperty("FSSPERCENTILE_3MONTHSAGO")
    public void setFsspercentile3monthsago(String fsspercentile3monthsago) {
        this.fsspercentile3monthsago = fsspercentile3monthsago;
    }

    @JsonProperty("FSSPERCENTILE_1MONTHSAGO")
    public String getFsspercentile1monthsago() {
        return fsspercentile1monthsago;
    }

    @JsonProperty("FSSPERCENTILE_1MONTHSAGO")
    public void setFsspercentile1monthsago(String fsspercentile1monthsago) {
        this.fsspercentile1monthsago = fsspercentile1monthsago;
    }

    @JsonProperty("HEAD_DUNS_NUMBER")
    public String getHeadDunsNumber() {
        return headDunsNumber;
    }

    @JsonProperty("HEAD_DUNS_NUMBER")
    public void setHeadDunsNumber(String headDunsNumber) {
        this.headDunsNumber = headDunsNumber;
    }

    @JsonProperty("GLOBAL_ULTIM_NAME")
    public String getGlobalUltimName() {
        return globalUltimName;
    }

    @JsonProperty("GLOBAL_ULTIM_NAME")
    public void setGlobalUltimName(String globalUltimName) {
        this.globalUltimName = globalUltimName;
    }

    @JsonProperty("GLOBAL_ULTIM_DUNS_NUMBER")
    public String getGlobalUltimDunsNumber() {
        return globalUltimDunsNumber;
    }

    @JsonProperty("GLOBAL_ULTIM_DUNS_NUMBER")
    public void setGlobalUltimDunsNumber(String globalUltimDunsNumber) {
        this.globalUltimDunsNumber = globalUltimDunsNumber;
    }

    @JsonProperty("YEARS_IN_BUSINESS")
    public String getYearsInBusiness() {
        return yearsInBusiness;
    }

    @JsonProperty("YEARS_IN_BUSINESS")
    public void setYearsInBusiness(String yearsInBusiness) {
        this.yearsInBusiness = yearsInBusiness;
    }

    @JsonProperty("OUT_OF_BUSINESS_YN")
    public String getOutOfBusinessYn() {
        return outOfBusinessYn;
    }

    @JsonProperty("OUT_OF_BUSINESS_YN")
    public void setOutOfBusinessYn(String outOfBusinessYn) {
        this.outOfBusinessYn = outOfBusinessYn;
    }

    @JsonProperty("EMPLOYEES")
    public String getEmployees() {
        return employees;
    }

    @JsonProperty("EMPLOYEES")
    public void setEmployees(String employees) {
        this.employees = employees;
    }

    @JsonProperty("SIC_CODE")
    public String getSicCode() {
        return sicCode;
    }

    @JsonProperty("SIC_CODE")
    public void setSicCode(String sicCode) {
        this.sicCode = sicCode;
    }

    @JsonProperty("RECOMMENDED_CREDIT_LIMIT ")
    public String getRecommendedCreditLimit() {
        return recommendedCreditLimit;
    }

    @JsonProperty("RECOMMENDED_CREDIT_LIMIT ")
    public void setRecommendedCreditLimit(String recommendedCreditLimit) {
        this.recommendedCreditLimit = recommendedCreditLimit;
    }

    @JsonProperty("CREDIT_LIMIT ")
    public String getCreditLimit() {
        return creditLimit;
    }

    @JsonProperty("CREDIT_LIMIT ")
    public void setCreditLimit(String creditLimit) {
        this.creditLimit = creditLimit;
    }

    @JsonProperty("DNB_RATING")
    public String getDnbRating() {
        return dnbRating;
    }

    @JsonProperty("DNB_RATING")
    public void setDnbRating(String dnbRating) {
        this.dnbRating = dnbRating;
    }

    @JsonProperty("FIN_STRESS_CLASS")
    public String getFinStressClass() {
        return finStressClass;
    }

    @JsonProperty("FIN_STRESS_CLASS")
    public void setFinStressClass(String finStressClass) {
        this.finStressClass = finStressClass;
    }

    @JsonProperty("COMM_CR_SCR_CLASS")
    public String getCommCrScrClass() {
        return commCrScrClass;
    }

    @JsonProperty("COMM_CR_SCR_CLASS")
    public void setCommCrScrClass(String commCrScrClass) {
        this.commCrScrClass = commCrScrClass;
    }

    @JsonProperty("PAYDEX")
    public String getPaydex() {
        return paydex;
    }

    @JsonProperty("PAYDEX")
    public void setPaydex(String paydex) {
        this.paydex = paydex;
    }

    @JsonProperty("COMM_CR_SCR_PERCENTILE")
    public String getCommCrScrPercentile() {
        return commCrScrPercentile;
    }

    @JsonProperty("COMM_CR_SCR_PERCENTILE")
    public void setCommCrScrPercentile(String commCrScrPercentile) {
        this.commCrScrPercentile = commCrScrPercentile;
    }

    @JsonProperty("FIN_STRESS_SCR_PERCENTILE")
    public String getFinStressScrPercentile() {
        return finStressScrPercentile;
    }

    @JsonProperty("FIN_STRESS_SCR_PERCENTILE")
    public void setFinStressScrPercentile(String finStressScrPercentile) {
        this.finStressScrPercentile = finStressScrPercentile;
    }

    @JsonProperty("DUNS_COUNTRY")
    public String getDunsCountry() {
        return dunsCountry;
    }

    @JsonProperty("DUNS_COUNTRY")
    public void setDunsCountry(String dunsCountry) {
        this.dunsCountry = dunsCountry;
    }

    @JsonProperty("DUNS_STATE")
    public String getDunsState() {
        return dunsState;
    }

    @JsonProperty("DUNS_STATE")
    public void setDunsState(String dunsState) {
        this.dunsState = dunsState;
    }

    @JsonProperty("DUNS_ZIP")
    public String getDunsZip() {
        return dunsZip;
    }

    @JsonProperty("DUNS_ZIP")
    public void setDunsZip(String dunsZip) {
        this.dunsZip = dunsZip;
    }

    @JsonProperty("DUNS_CITY")
    public String getDunsCity() {
        return dunsCity;
    }

    @JsonProperty("DUNS_CITY")
    public void setDunsCity(String dunsCity) {
        this.dunsCity = dunsCity;
    }

    @JsonProperty("DUNS_STREET2")
    public String getDunsStreet2() {
        return dunsStreet2;
    }

    @JsonProperty("DUNS_STREET2")
    public void setDunsStreet2(String dunsStreet2) {
        this.dunsStreet2 = dunsStreet2;
    }

    @JsonProperty("DUNS_STREET1")
    public String getDunsStreet1() {
        return dunsStreet1;
    }

    @JsonProperty("DUNS_STREET1")
    public void setDunsStreet1(String dunsStreet1) {
        this.dunsStreet1 = dunsStreet1;
    }

    @JsonProperty("DUNS_BUSINESS_NAME")
    public String getDunsBusinessName() {
        return dunsBusinessName;
    }

    @JsonProperty("DUNS_BUSINESS_NAME")
    public void setDunsBusinessName(String dunsBusinessName) {
        this.dunsBusinessName = dunsBusinessName;
    }

    @JsonProperty("BUSINESS_COUNTRY")
    public String getBusinessCountry() {
        return businessCountry;
    }

    @JsonProperty("BUSINESS_COUNTRY")
    public void setBusinessCountry(String businessCountry) {
        this.businessCountry = businessCountry;
    }

    @JsonProperty("STATE")
    public String getState() {
        return state;
    }

    @JsonProperty("STATE")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("ZIP")
    public String getZip() {
        return zip;
    }

    @JsonProperty("ZIP")
    public void setZip(String zip) {
        this.zip = zip;
    }

    @JsonProperty("CITY")
    public String getCity() {
        return city;
    }

    @JsonProperty("CITY")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("STREET2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("STREET2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @JsonProperty("STREET1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("STREET1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @JsonProperty("BUSINESS_NAME")
    public String getBusinessName() {
        return businessName;
    }

    @JsonProperty("BUSINESS_NAME")
    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @JsonProperty("ACCT_LAST_UPDATE_DATE")
    public String getAcctLastUpdateDate() {
        return acctLastUpdateDate;
    }

    @JsonProperty("ACCT_LAST_UPDATE_DATE")
    public void setAcctLastUpdateDate(String acctLastUpdateDate) {
        this.acctLastUpdateDate = acctLastUpdateDate;
    }

    @JsonProperty("ACCT_DETAIL_STATUS")
    public String getAcctDetailStatus() {
        return acctDetailStatus;
    }

    @JsonProperty("ACCT_DETAIL_STATUS")
    public void setAcctDetailStatus(String acctDetailStatus) {
        this.acctDetailStatus = acctDetailStatus;
    }

    @JsonProperty("ACCT_NO")
    public String getAcctNo() {
        return acctNo;
    }

    @JsonProperty("ACCT_NO")
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    @JsonProperty("ENTITY_ID")
    public String getEntityId() {
        return entityId;
    }

    @JsonProperty("ENTITY_ID")
    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @JsonProperty("ENTITY_TYPE")
    public String getEntityType() {
        return entityType;
    }

    @JsonProperty("ENTITY_TYPE")
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @JsonProperty("PRM_DOMAIN_ID")
    public String getPrmDomainId() {
        return prmDomainId;
    }

    @JsonProperty("PRM_DOMAIN_ID")
    public void setPrmDomainId(String prmDomainId) {
        this.prmDomainId = prmDomainId;
    }

    @JsonProperty("WS_DOMAIN")
    public String getWsDomain() {
        return wsDomain;
    }

    @JsonProperty("WS_DOMAIN")
    public void setWsDomain(String wsDomain) {
        this.wsDomain = wsDomain;
    }

    @JsonProperty("WORKSPACE_ID")
    public String getWorkspaceId() {
        return workspaceId;
    }

    @JsonProperty("WORKSPACE_ID")
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
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
        sb.append(DtoCsvRow2.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finStrScrPctlUpDownInd");
        sb.append('=');
        sb.append(((this.finStrScrPctlUpDownInd == null)?"<null>":this.finStrScrPctlUpDownInd));
        sb.append(',');
        sb.append("commCrScrPctlUpDownInd");
        sb.append('=');
        sb.append(((this.commCrScrPctlUpDownInd == null)?"<null>":this.commCrScrPctlUpDownInd));
        sb.append(',');
        sb.append("paydexUpDownInd");
        sb.append('=');
        sb.append(((this.paydexUpDownInd == null)?"<null>":this.paydexUpDownInd));
        sb.append(',');
        sb.append("dBRatingRiskInd");
        sb.append('=');
        sb.append(((this.dBRatingRiskInd == null)?"<null>":this.dBRatingRiskInd));
        sb.append(',');
        sb.append("avgDaysBeyond");
        sb.append('=');
        sb.append(((this.avgDaysBeyond == null)?"<null>":this.avgDaysBeyond));
        sb.append(',');
        sb.append("companyTotalPastDue");
        sb.append('=');
        sb.append(((this.companyTotalPastDue == null)?"<null>":this.companyTotalPastDue));
        sb.append(',');
        sb.append("companyTotalOutstanding");
        sb.append('=');
        sb.append(((this.companyTotalOutstanding == null)?"<null>":this.companyTotalOutstanding));
        sb.append(',');
        sb.append("noOfAccounts");
        sb.append('=');
        sb.append(((this.noOfAccounts == null)?"<null>":this.noOfAccounts));
        sb.append(',');
        sb.append("endrosementName");
        sb.append('=');
        sb.append(((this.endrosementName == null)?"<null>":this.endrosementName));
        sb.append(',');
        sb.append("obr5Band");
        sb.append('=');
        sb.append(((this.obr5Band == null)?"<null>":this.obr5Band));
        sb.append(',');
        sb.append("portfolioComparison5Band");
        sb.append('=');
        sb.append(((this.portfolioComparison5Band == null)?"<null>":this.portfolioComparison5Band));
        sb.append(',');
        sb.append("viabilityScore5Band");
        sb.append('=');
        sb.append(((this.viabilityScore5Band == null)?"<null>":this.viabilityScore5Band));
        sb.append(',');
        sb.append("portfolioComparison3Band");
        sb.append('=');
        sb.append(((this.portfolioComparison3Band == null)?"<null>":this.portfolioComparison3Band));
        sb.append(',');
        sb.append("viabilityScore3Band");
        sb.append('=');
        sb.append(((this.viabilityScore3Band == null)?"<null>":this.viabilityScore3Band));
        sb.append(',');
        sb.append("failure5Band");
        sb.append('=');
        sb.append(((this.failure5Band == null)?"<null>":this.failure5Band));
        sb.append(',');
        sb.append("failure3Band");
        sb.append('=');
        sb.append(((this.failure3Band == null)?"<null>":this.failure3Band));
        sb.append(',');
        sb.append("delq3Band");
        sb.append('=');
        sb.append(((this.delq3Band == null)?"<null>":this.delq3Band));
        sb.append(',');
        sb.append("delq5Band");
        sb.append('=');
        sb.append(((this.delq5Band == null)?"<null>":this.delq5Band));
        sb.append(',');
        sb.append("paydex3Band");
        sb.append('=');
        sb.append(((this.paydex3Band == null)?"<null>":this.paydex3Band));
        sb.append(',');
        sb.append("paydex5Band");
        sb.append('=');
        sb.append(((this.paydex5Band == null)?"<null>":this.paydex5Band));
        sb.append(',');
        sb.append("dbRating5Band");
        sb.append('=');
        sb.append(((this.dbRating5Band == null)?"<null>":this.dbRating5Band));
        sb.append(',');
        sb.append("dbRating3Band");
        sb.append('=');
        sb.append(((this.dbRating3Band == null)?"<null>":this.dbRating3Band));
        sb.append(',');
        sb.append("probabilityFailure");
        sb.append('=');
        sb.append(((this.probabilityFailure == null)?"<null>":this.probabilityFailure));
        sb.append(',');
        sb.append("probabilityDelinquency");
        sb.append('=');
        sb.append(((this.probabilityDelinquency == null)?"<null>":this.probabilityDelinquency));
        sb.append(',');
        sb.append("paymentRisk3Band");
        sb.append('=');
        sb.append(((this.paymentRisk3Band == null)?"<null>":this.paymentRisk3Band));
        sb.append(',');
        sb.append("paymentRisk5Band");
        sb.append('=');
        sb.append(((this.paymentRisk5Band == null)?"<null>":this.paymentRisk5Band));
        sb.append(',');
        sb.append("aaaRating");
        sb.append('=');
        sb.append(((this.aaaRating == null)?"<null>":this.aaaRating));
        sb.append(',');
        sb.append("indiConsolidated");
        sb.append('=');
        sb.append(((this.indiConsolidated == null)?"<null>":this.indiConsolidated));
        sb.append(',');
        sb.append("maxCreditRiskLevel");
        sb.append('=');
        sb.append(((this.maxCreditRiskLevel == null)?"<null>":this.maxCreditRiskLevel));
        sb.append(',');
        sb.append("maxCreditRecommText");
        sb.append('=');
        sb.append(((this.maxCreditRecommText == null)?"<null>":this.maxCreditRecommText));
        sb.append(',');
        sb.append("maxCreditCurrencyCode");
        sb.append('=');
        sb.append(((this.maxCreditCurrencyCode == null)?"<null>":this.maxCreditCurrencyCode));
        sb.append(',');
        sb.append("maxCreditRecomm");
        sb.append('=');
        sb.append(((this.maxCreditRecomm == null)?"<null>":this.maxCreditRecomm));
        sb.append(',');
        sb.append("payWihtinTermsPerc");
        sb.append('=');
        sb.append(((this.payWihtinTermsPerc == null)?"<null>":this.payWihtinTermsPerc));
        sb.append(',');
        sb.append("conservativeCreditLimit");
        sb.append('=');
        sb.append(((this.conservativeCreditLimit == null)?"<null>":this.conservativeCreditLimit));
        sb.append(',');
        sb.append("sourceId");
        sb.append('=');
        sb.append(((this.sourceId == null)?"<null>":this.sourceId));
        sb.append(',');
        sb.append("sbfeStandardScore");
        sb.append('=');
        sb.append(((this.sbfeStandardScore == null)?"<null>":this.sbfeStandardScore));
        sb.append(',');
        sb.append("naicsCode");
        sb.append('=');
        sb.append(((this.naicsCode == null)?"<null>":this.naicsCode));
        sb.append(',');
        sb.append("paydex11monthsago");
        sb.append('=');
        sb.append(((this.paydex11monthsago == null)?"<null>":this.paydex11monthsago));
        sb.append(',');
        sb.append("paydex10monthsago");
        sb.append('=');
        sb.append(((this.paydex10monthsago == null)?"<null>":this.paydex10monthsago));
        sb.append(',');
        sb.append("paydex8monthsago");
        sb.append('=');
        sb.append(((this.paydex8monthsago == null)?"<null>":this.paydex8monthsago));
        sb.append(',');
        sb.append("paydex7monthsago");
        sb.append('=');
        sb.append(((this.paydex7monthsago == null)?"<null>":this.paydex7monthsago));
        sb.append(',');
        sb.append("paydex4monthsago");
        sb.append('=');
        sb.append(((this.paydex4monthsago == null)?"<null>":this.paydex4monthsago));
        sb.append(',');
        sb.append("paydex2monthsago");
        sb.append('=');
        sb.append(((this.paydex2monthsago == null)?"<null>":this.paydex2monthsago));
        sb.append(',');
        sb.append("paydex5monthsago");
        sb.append('=');
        sb.append(((this.paydex5monthsago == null)?"<null>":this.paydex5monthsago));
        sb.append(',');
        sb.append("ccspercentile11monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile11monthsago == null)?"<null>":this.ccspercentile11monthsago));
        sb.append(',');
        sb.append("ccspercentile10monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile10monthsago == null)?"<null>":this.ccspercentile10monthsago));
        sb.append(',');
        sb.append("ccspercentile8monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile8monthsago == null)?"<null>":this.ccspercentile8monthsago));
        sb.append(',');
        sb.append("ccspercentile7monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile7monthsago == null)?"<null>":this.ccspercentile7monthsago));
        sb.append(',');
        sb.append("ccspercentile5monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile5monthsago == null)?"<null>":this.ccspercentile5monthsago));
        sb.append(',');
        sb.append("ccspercentile4monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile4monthsago == null)?"<null>":this.ccspercentile4monthsago));
        sb.append(',');
        sb.append("ccspercentile2monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile2monthsago == null)?"<null>":this.ccspercentile2monthsago));
        sb.append(',');
        sb.append("ccsclass6monthsago");
        sb.append('=');
        sb.append(((this.ccsclass6monthsago == null)?"<null>":this.ccsclass6monthsago));
        sb.append(',');
        sb.append("ccsclass10monthsago");
        sb.append('=');
        sb.append(((this.ccsclass10monthsago == null)?"<null>":this.ccsclass10monthsago));
        sb.append(',');
        sb.append("ccsclass9monthsago");
        sb.append('=');
        sb.append(((this.ccsclass9monthsago == null)?"<null>":this.ccsclass9monthsago));
        sb.append(',');
        sb.append("ccsclass3monthsago");
        sb.append('=');
        sb.append(((this.ccsclass3monthsago == null)?"<null>":this.ccsclass3monthsago));
        sb.append(',');
        sb.append("ccsclass12monthsago");
        sb.append('=');
        sb.append(((this.ccsclass12monthsago == null)?"<null>":this.ccsclass12monthsago));
        sb.append(',');
        sb.append("ccsclass7monthsago");
        sb.append('=');
        sb.append(((this.ccsclass7monthsago == null)?"<null>":this.ccsclass7monthsago));
        sb.append(',');
        sb.append("ccsclass11monthsago");
        sb.append('=');
        sb.append(((this.ccsclass11monthsago == null)?"<null>":this.ccsclass11monthsago));
        sb.append(',');
        sb.append("ccsclass8monthsago");
        sb.append('=');
        sb.append(((this.ccsclass8monthsago == null)?"<null>":this.ccsclass8monthsago));
        sb.append(',');
        sb.append("ccsclass5monthsago");
        sb.append('=');
        sb.append(((this.ccsclass5monthsago == null)?"<null>":this.ccsclass5monthsago));
        sb.append(',');
        sb.append("ccsclass4monthsago");
        sb.append('=');
        sb.append(((this.ccsclass4monthsago == null)?"<null>":this.ccsclass4monthsago));
        sb.append(',');
        sb.append("ccsclass2monthsago");
        sb.append('=');
        sb.append(((this.ccsclass2monthsago == null)?"<null>":this.ccsclass2monthsago));
        sb.append(',');
        sb.append("ccsclass1monthsago");
        sb.append('=');
        sb.append(((this.ccsclass1monthsago == null)?"<null>":this.ccsclass1monthsago));
        sb.append(',');
        sb.append("ccsscore12monthsago");
        sb.append('=');
        sb.append(((this.ccsscore12monthsago == null)?"<null>":this.ccsscore12monthsago));
        sb.append(',');
        sb.append("ccsscore6monthsago");
        sb.append('=');
        sb.append(((this.ccsscore6monthsago == null)?"<null>":this.ccsscore6monthsago));
        sb.append(',');
        sb.append("ccsscore1monthsago");
        sb.append('=');
        sb.append(((this.ccsscore1monthsago == null)?"<null>":this.ccsscore1monthsago));
        sb.append(',');
        sb.append("ccsscore8monthsago");
        sb.append('=');
        sb.append(((this.ccsscore8monthsago == null)?"<null>":this.ccsscore8monthsago));
        sb.append(',');
        sb.append("ccsscore9monthsago");
        sb.append('=');
        sb.append(((this.ccsscore9monthsago == null)?"<null>":this.ccsscore9monthsago));
        sb.append(',');
        sb.append("ccsscore11monthsago");
        sb.append('=');
        sb.append(((this.ccsscore11monthsago == null)?"<null>":this.ccsscore11monthsago));
        sb.append(',');
        sb.append("ccsscore10monthsago");
        sb.append('=');
        sb.append(((this.ccsscore10monthsago == null)?"<null>":this.ccsscore10monthsago));
        sb.append(',');
        sb.append("ccsscore7monthsago");
        sb.append('=');
        sb.append(((this.ccsscore7monthsago == null)?"<null>":this.ccsscore7monthsago));
        sb.append(',');
        sb.append("ccsscore5monthsago");
        sb.append('=');
        sb.append(((this.ccsscore5monthsago == null)?"<null>":this.ccsscore5monthsago));
        sb.append(',');
        sb.append("ccsscore4monthsago");
        sb.append('=');
        sb.append(((this.ccsscore4monthsago == null)?"<null>":this.ccsscore4monthsago));
        sb.append(',');
        sb.append("ccsscore3monthsago");
        sb.append('=');
        sb.append(((this.ccsscore3monthsago == null)?"<null>":this.ccsscore3monthsago));
        sb.append(',');
        sb.append("ccsscore2monthsago");
        sb.append('=');
        sb.append(((this.ccsscore2monthsago == null)?"<null>":this.ccsscore2monthsago));
        sb.append(',');
        sb.append("fsspercentile8monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile8monthsago == null)?"<null>":this.fsspercentile8monthsago));
        sb.append(',');
        sb.append("fsspercentile4monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile4monthsago == null)?"<null>":this.fsspercentile4monthsago));
        sb.append(',');
        sb.append("fsspercentile11monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile11monthsago == null)?"<null>":this.fsspercentile11monthsago));
        sb.append(',');
        sb.append("fsspercentile10monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile10monthsago == null)?"<null>":this.fsspercentile10monthsago));
        sb.append(',');
        sb.append("fsspercentile7monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile7monthsago == null)?"<null>":this.fsspercentile7monthsago));
        sb.append(',');
        sb.append("fsspercentile5monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile5monthsago == null)?"<null>":this.fsspercentile5monthsago));
        sb.append(',');
        sb.append("fsspercentile2monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile2monthsago == null)?"<null>":this.fsspercentile2monthsago));
        sb.append(',');
        sb.append("fssscore11monthsago");
        sb.append('=');
        sb.append(((this.fssscore11monthsago == null)?"<null>":this.fssscore11monthsago));
        sb.append(',');
        sb.append("fssscore5monthsago");
        sb.append('=');
        sb.append(((this.fssscore5monthsago == null)?"<null>":this.fssscore5monthsago));
        sb.append(',');
        sb.append("fssscore8monthsago");
        sb.append('=');
        sb.append(((this.fssscore8monthsago == null)?"<null>":this.fssscore8monthsago));
        sb.append(',');
        sb.append("fssscore3monthsago");
        sb.append('=');
        sb.append(((this.fssscore3monthsago == null)?"<null>":this.fssscore3monthsago));
        sb.append(',');
        sb.append("fssscore7monthsago");
        sb.append('=');
        sb.append(((this.fssscore7monthsago == null)?"<null>":this.fssscore7monthsago));
        sb.append(',');
        sb.append("fssscore12monthsago");
        sb.append('=');
        sb.append(((this.fssscore12monthsago == null)?"<null>":this.fssscore12monthsago));
        sb.append(',');
        sb.append("fssscore10monthsago");
        sb.append('=');
        sb.append(((this.fssscore10monthsago == null)?"<null>":this.fssscore10monthsago));
        sb.append(',');
        sb.append("fssscore9monthsago");
        sb.append('=');
        sb.append(((this.fssscore9monthsago == null)?"<null>":this.fssscore9monthsago));
        sb.append(',');
        sb.append("fssscore6monthsago");
        sb.append('=');
        sb.append(((this.fssscore6monthsago == null)?"<null>":this.fssscore6monthsago));
        sb.append(',');
        sb.append("fssscore4monthsago");
        sb.append('=');
        sb.append(((this.fssscore4monthsago == null)?"<null>":this.fssscore4monthsago));
        sb.append(',');
        sb.append("fssscore2monthsago");
        sb.append('=');
        sb.append(((this.fssscore2monthsago == null)?"<null>":this.fssscore2monthsago));
        sb.append(',');
        sb.append("fssscore1monthsago");
        sb.append('=');
        sb.append(((this.fssscore1monthsago == null)?"<null>":this.fssscore1monthsago));
        sb.append(',');
        sb.append("fssclass8monthsago");
        sb.append('=');
        sb.append(((this.fssclass8monthsago == null)?"<null>":this.fssclass8monthsago));
        sb.append(',');
        sb.append("fssclass3monthsago");
        sb.append('=');
        sb.append(((this.fssclass3monthsago == null)?"<null>":this.fssclass3monthsago));
        sb.append(',');
        sb.append("fssclass7monthsago");
        sb.append('=');
        sb.append(((this.fssclass7monthsago == null)?"<null>":this.fssclass7monthsago));
        sb.append(',');
        sb.append("fssclass12monthsago");
        sb.append('=');
        sb.append(((this.fssclass12monthsago == null)?"<null>":this.fssclass12monthsago));
        sb.append(',');
        sb.append("fssclass11monthsago");
        sb.append('=');
        sb.append(((this.fssclass11monthsago == null)?"<null>":this.fssclass11monthsago));
        sb.append(',');
        sb.append("fssclass10monthsago");
        sb.append('=');
        sb.append(((this.fssclass10monthsago == null)?"<null>":this.fssclass10monthsago));
        sb.append(',');
        sb.append("fssclass9monthsago");
        sb.append('=');
        sb.append(((this.fssclass9monthsago == null)?"<null>":this.fssclass9monthsago));
        sb.append(',');
        sb.append("fssclass6monthsago");
        sb.append('=');
        sb.append(((this.fssclass6monthsago == null)?"<null>":this.fssclass6monthsago));
        sb.append(',');
        sb.append("fssclass5monthsago");
        sb.append('=');
        sb.append(((this.fssclass5monthsago == null)?"<null>":this.fssclass5monthsago));
        sb.append(',');
        sb.append("fssclass4monthsago");
        sb.append('=');
        sb.append(((this.fssclass4monthsago == null)?"<null>":this.fssclass4monthsago));
        sb.append(',');
        sb.append("fssclass2monthsago");
        sb.append('=');
        sb.append(((this.fssclass2monthsago == null)?"<null>":this.fssclass2monthsago));
        sb.append(',');
        sb.append("fssclass1monthsago");
        sb.append('=');
        sb.append(((this.fssclass1monthsago == null)?"<null>":this.fssclass1monthsago));
        sb.append(',');
        sb.append("viabilityRating");
        sb.append('=');
        sb.append(((this.viabilityRating == null)?"<null>":this.viabilityRating));
        sb.append(',');
        sb.append("companyProfile");
        sb.append('=');
        sb.append(((this.companyProfile == null)?"<null>":this.companyProfile));
        sb.append(',');
        sb.append("dataDepthIndicator");
        sb.append('=');
        sb.append(((this.dataDepthIndicator == null)?"<null>":this.dataDepthIndicator));
        sb.append(',');
        sb.append("portfolioComparison");
        sb.append('=');
        sb.append(((this.portfolioComparison == null)?"<null>":this.portfolioComparison));
        sb.append(',');
        sb.append("viabilityScore");
        sb.append('=');
        sb.append(((this.viabilityScore == null)?"<null>":this.viabilityScore));
        sb.append(',');
        sb.append("parentName");
        sb.append('=');
        sb.append(((this.parentName == null)?"<null>":this.parentName));
        sb.append(',');
        sb.append("bureauBizOwnershipType");
        sb.append('=');
        sb.append(((this.bureauBizOwnershipType == null)?"<null>":this.bureauBizOwnershipType));
        sb.append(',');
        sb.append("accountCreatedDate");
        sb.append('=');
        sb.append(((this.accountCreatedDate == null)?"<null>":this.accountCreatedDate));
        sb.append(',');
        sb.append("parentCountry");
        sb.append('=');
        sb.append(((this.parentCountry == null)?"<null>":this.parentCountry));
        sb.append(',');
        sb.append("legalFlag");
        sb.append('=');
        sb.append(((this.legalFlag == null)?"<null>":this.legalFlag));
        sb.append(',');
        sb.append("parentDunsNumber");
        sb.append('=');
        sb.append(((this.parentDunsNumber == null)?"<null>":this.parentDunsNumber));
        sb.append(',');
        sb.append("salespersonNo");
        sb.append('=');
        sb.append(((this.salespersonNo == null)?"<null>":this.salespersonNo));
        sb.append(',');
        sb.append("prmCountry");
        sb.append('=');
        sb.append(((this.prmCountry == null)?"<null>":this.prmCountry));
        sb.append(',');
        sb.append("sicTwoDigitDesc");
        sb.append('=');
        sb.append(((this.sicTwoDigitDesc == null)?"<null>":this.sicTwoDigitDesc));
        sb.append(',');
        sb.append("badDebtRiskClass");
        sb.append('=');
        sb.append(((this.badDebtRiskClass == null)?"<null>":this.badDebtRiskClass));
        sb.append(',');
        sb.append("lawsuitCount");
        sb.append('=');
        sb.append(((this.lawsuitCount == null)?"<null>":this.lawsuitCount));
        sb.append(',');
        sb.append("lienCount");
        sb.append('=');
        sb.append(((this.lienCount == null)?"<null>":this.lienCount));
        sb.append(',');
        sb.append("promptAmt");
        sb.append('=');
        sb.append(((this.promptAmt == null)?"<null>":this.promptAmt));
        sb.append(',');
        sb.append("promptPctAging");
        sb.append('=');
        sb.append(((this.promptPctAging == null)?"<null>":this.promptPctAging));
        sb.append(',');
        sb.append("nationalAcctNumber");
        sb.append('=');
        sb.append(((this.nationalAcctNumber == null)?"<null>":this.nationalAcctNumber));
        sb.append(',');
        sb.append("slowOrNegPmtCount");
        sb.append('=');
        sb.append(((this.slowOrNegPmtCount == null)?"<null>":this.slowOrNegPmtCount));
        sb.append(',');
        sb.append("highestCredit");
        sb.append('=');
        sb.append(((this.highestCredit == null)?"<null>":this.highestCredit));
        sb.append(',');
        sb.append("debtToNetWorthRatio");
        sb.append('=');
        sb.append(((this.debtToNetWorthRatio == null)?"<null>":this.debtToNetWorthRatio));
        sb.append(',');
        sb.append("avgHighCredit");
        sb.append('=');
        sb.append(((this.avgHighCredit == null)?"<null>":this.avgHighCredit));
        sb.append(',');
        sb.append("negativePaymentCount");
        sb.append('=');
        sb.append(((this.negativePaymentCount == null)?"<null>":this.negativePaymentCount));
        sb.append(',');
        sb.append("slowPaymentCount");
        sb.append('=');
        sb.append(((this.slowPaymentCount == null)?"<null>":this.slowPaymentCount));
        sb.append(',');
        sb.append("highRiskIndicator");
        sb.append('=');
        sb.append(((this.highRiskIndicator == null)?"<null>":this.highRiskIndicator));
        sb.append(',');
        sb.append("valueOfLien");
        sb.append('=');
        sb.append(((this.valueOfLien == null)?"<null>":this.valueOfLien));
        sb.append(',');
        sb.append("valueOfcourtJudgement");
        sb.append('=');
        sb.append(((this.valueOfcourtJudgement == null)?"<null>":this.valueOfcourtJudgement));
        sb.append(',');
        sb.append("valueOfSuit");
        sb.append('=');
        sb.append(((this.valueOfSuit == null)?"<null>":this.valueOfSuit));
        sb.append(',');
        sb.append("judgementCount");
        sb.append('=');
        sb.append(((this.judgementCount == null)?"<null>":this.judgementCount));
        sb.append(',');
        sb.append("incYear");
        sb.append('=');
        sb.append(((this.incYear == null)?"<null>":this.incYear));
        sb.append(',');
        sb.append("dunsTel");
        sb.append('=');
        sb.append(((this.dunsTel == null)?"<null>":this.dunsTel));
        sb.append(',');
        sb.append("payWithinTermCount");
        sb.append('=');
        sb.append(((this.payWithinTermCount == null)?"<null>":this.payWithinTermCount));
        sb.append(',');
        sb.append("score16");
        sb.append('=');
        sb.append(((this.score16 == null)?"<null>":this.score16));
        sb.append(',');
        sb.append("score20");
        sb.append('=');
        sb.append(((this.score20 == null)?"<null>":this.score20));
        sb.append(',');
        sb.append("score19");
        sb.append('=');
        sb.append(((this.score19 == null)?"<null>":this.score19));
        sb.append(',');
        sb.append("score18");
        sb.append('=');
        sb.append(((this.score18 == null)?"<null>":this.score18));
        sb.append(',');
        sb.append("score17");
        sb.append('=');
        sb.append(((this.score17 == null)?"<null>":this.score17));
        sb.append(',');
        sb.append("score15");
        sb.append('=');
        sb.append(((this.score15 == null)?"<null>":this.score15));
        sb.append(',');
        sb.append("score14");
        sb.append('=');
        sb.append(((this.score14 == null)?"<null>":this.score14));
        sb.append(',');
        sb.append("score13");
        sb.append('=');
        sb.append(((this.score13 == null)?"<null>":this.score13));
        sb.append(',');
        sb.append("score12");
        sb.append('=');
        sb.append(((this.score12 == null)?"<null>":this.score12));
        sb.append(',');
        sb.append("score11");
        sb.append('=');
        sb.append(((this.score11 == null)?"<null>":this.score11));
        sb.append(',');
        sb.append("score10");
        sb.append('=');
        sb.append(((this.score10 == null)?"<null>":this.score10));
        sb.append(',');
        sb.append("score9");
        sb.append('=');
        sb.append(((this.score9 == null)?"<null>":this.score9));
        sb.append(',');
        sb.append("score8");
        sb.append('=');
        sb.append(((this.score8 == null)?"<null>":this.score8));
        sb.append(',');
        sb.append("score7");
        sb.append('=');
        sb.append(((this.score7 == null)?"<null>":this.score7));
        sb.append(',');
        sb.append("score6");
        sb.append('=');
        sb.append(((this.score6 == null)?"<null>":this.score6));
        sb.append(',');
        sb.append("score5");
        sb.append('=');
        sb.append(((this.score5 == null)?"<null>":this.score5));
        sb.append(',');
        sb.append("score4");
        sb.append('=');
        sb.append(((this.score4 == null)?"<null>":this.score4));
        sb.append(',');
        sb.append("score3");
        sb.append('=');
        sb.append(((this.score3 == null)?"<null>":this.score3));
        sb.append(',');
        sb.append("score2");
        sb.append('=');
        sb.append(((this.score2 == null)?"<null>":this.score2));
        sb.append(',');
        sb.append("score1");
        sb.append('=');
        sb.append(((this.score1 == null)?"<null>":this.score1));
        sb.append(',');
        sb.append("deleteYn");
        sb.append('=');
        sb.append(((this.deleteYn == null)?"<null>":this.deleteYn));
        sb.append(',');
        sb.append("tradeExpSlowNegPmt");
        sb.append('=');
        sb.append(((this.tradeExpSlowNegPmt == null)?"<null>":this.tradeExpSlowNegPmt));
        sb.append(',');
        sb.append("controlYear");
        sb.append('=');
        sb.append(((this.controlYear == null)?"<null>":this.controlYear));
        sb.append(',');
        sb.append("incorporationYear");
        sb.append('=');
        sb.append(((this.incorporationYear == null)?"<null>":this.incorporationYear));
        sb.append(',');
        sb.append("businessStartDate");
        sb.append('=');
        sb.append(((this.businessStartDate == null)?"<null>":this.businessStartDate));
        sb.append(',');
        sb.append("lastPaymentDate");
        sb.append('=');
        sb.append(((this.lastPaymentDate == null)?"<null>":this.lastPaymentDate));
        sb.append(',');
        sb.append("lastOrderDate");
        sb.append('=');
        sb.append(((this.lastOrderDate == null)?"<null>":this.lastOrderDate));
        sb.append(',');
        sb.append("lastYearSales");
        sb.append('=');
        sb.append(((this.lastYearSales == null)?"<null>":this.lastYearSales));
        sb.append(',');
        sb.append("lastOrderAmt");
        sb.append('=');
        sb.append(((this.lastOrderAmt == null)?"<null>":this.lastOrderAmt));
        sb.append(',');
        sb.append("lastPaymentAmt");
        sb.append('=');
        sb.append(((this.lastPaymentAmt == null)?"<null>":this.lastPaymentAmt));
        sb.append(',');
        sb.append("businessOwnershipType");
        sb.append('=');
        sb.append(((this.businessOwnershipType == null)?"<null>":this.businessOwnershipType));
        sb.append(',');
        sb.append("division");
        sb.append('=');
        sb.append(((this.division == null)?"<null>":this.division));
        sb.append(',');
        sb.append("district");
        sb.append('=');
        sb.append(((this.district == null)?"<null>":this.district));
        sb.append(',');
        sb.append("excludeYn");
        sb.append('=');
        sb.append(((this.excludeYn == null)?"<null>":this.excludeYn));
        sb.append(',');
        sb.append("financialStressScore");
        sb.append('=');
        sb.append(((this.financialStressScore == null)?"<null>":this.financialStressScore));
        sb.append(',');
        sb.append("commercialCreditScore");
        sb.append('=');
        sb.append(((this.commercialCreditScore == null)?"<null>":this.commercialCreditScore));
        sb.append(',');
        sb.append("parentCustNumber");
        sb.append('=');
        sb.append(((this.parentCustNumber == null)?"<null>":this.parentCustNumber));
        sb.append(',');
        sb.append("globalUltimateParentCustno");
        sb.append('=');
        sb.append(((this.globalUltimateParentCustno == null)?"<null>":this.globalUltimateParentCustno));
        sb.append(',');
        sb.append("headqtrCountryCode");
        sb.append('=');
        sb.append(((this.headqtrCountryCode == null)?"<null>":this.headqtrCountryCode));
        sb.append(',');
        sb.append("globalUltimateCountry");
        sb.append('=');
        sb.append(((this.globalUltimateCountry == null)?"<null>":this.globalUltimateCountry));
        sb.append(',');
        sb.append("businessMetroarea");
        sb.append('=');
        sb.append(((this.businessMetroarea == null)?"<null>":this.businessMetroarea));
        sb.append(',');
        sb.append("headName");
        sb.append('=');
        sb.append(((this.headName == null)?"<null>":this.headName));
        sb.append(',');
        sb.append("daysBeyondTerms");
        sb.append('=');
        sb.append(((this.daysBeyondTerms == null)?"<null>":this.daysBeyondTerms));
        sb.append(',');
        sb.append("dunsNumber");
        sb.append('=');
        sb.append(((this.dunsNumber == null)?"<null>":this.dunsNumber));
        sb.append(',');
        sb.append("modifiedBy");
        sb.append('=');
        sb.append(((this.modifiedBy == null)?"<null>":this.modifiedBy));
        sb.append(',');
        sb.append("createdBy");
        sb.append('=');
        sb.append(((this.createdBy == null)?"<null>":this.createdBy));
        sb.append(',');
        sb.append("dateModified");
        sb.append('=');
        sb.append(((this.dateModified == null)?"<null>":this.dateModified));
        sb.append(',');
        sb.append("dateCreated");
        sb.append('=');
        sb.append(((this.dateCreated == null)?"<null>":this.dateCreated));
        sb.append(',');
        sb.append("creditLimitUtilization");
        sb.append('=');
        sb.append(((this.creditLimitUtilization == null)?"<null>":this.creditLimitUtilization));
        sb.append(',');
        sb.append("daysSalesOutstanding");
        sb.append('=');
        sb.append(((this.daysSalesOutstanding == null)?"<null>":this.daysSalesOutstanding));
        sb.append(',');
        sb.append("totalOutstgWithOutCredit");
        sb.append('=');
        sb.append(((this.totalOutstgWithOutCredit == null)?"<null>":this.totalOutstgWithOutCredit));
        sb.append(',');
        sb.append("backOffTotalOutstandingAmt");
        sb.append('=');
        sb.append(((this.backOffTotalOutstandingAmt == null)?"<null>":this.backOffTotalOutstandingAmt));
        sb.append(',');
        sb.append("totalOutstandingAmt");
        sb.append('=');
        sb.append(((this.totalOutstandingAmt == null)?"<null>":this.totalOutstandingAmt));
        sb.append(',');
        sb.append("totalPastdueAmt");
        sb.append('=');
        sb.append(((this.totalPastdueAmt == null)?"<null>":this.totalPastdueAmt));
        sb.append(',');
        sb.append("bucket11PctOver");
        sb.append('=');
        sb.append(((this.bucket11PctOver == null)?"<null>":this.bucket11PctOver));
        sb.append(',');
        sb.append("bucket10PctOver");
        sb.append('=');
        sb.append(((this.bucket10PctOver == null)?"<null>":this.bucket10PctOver));
        sb.append(',');
        sb.append("bucket9PctOver");
        sb.append('=');
        sb.append(((this.bucket9PctOver == null)?"<null>":this.bucket9PctOver));
        sb.append(',');
        sb.append("bucket8PctOver");
        sb.append('=');
        sb.append(((this.bucket8PctOver == null)?"<null>":this.bucket8PctOver));
        sb.append(',');
        sb.append("bucket7PctOver");
        sb.append('=');
        sb.append(((this.bucket7PctOver == null)?"<null>":this.bucket7PctOver));
        sb.append(',');
        sb.append("bucket6PctOver");
        sb.append('=');
        sb.append(((this.bucket6PctOver == null)?"<null>":this.bucket6PctOver));
        sb.append(',');
        sb.append("bucket5PctOver");
        sb.append('=');
        sb.append(((this.bucket5PctOver == null)?"<null>":this.bucket5PctOver));
        sb.append(',');
        sb.append("bucket4PctOver");
        sb.append('=');
        sb.append(((this.bucket4PctOver == null)?"<null>":this.bucket4PctOver));
        sb.append(',');
        sb.append("bucket3PctOver");
        sb.append('=');
        sb.append(((this.bucket3PctOver == null)?"<null>":this.bucket3PctOver));
        sb.append(',');
        sb.append("bucket2PctOver");
        sb.append('=');
        sb.append(((this.bucket2PctOver == null)?"<null>":this.bucket2PctOver));
        sb.append(',');
        sb.append("bucket1PctOver");
        sb.append('=');
        sb.append(((this.bucket1PctOver == null)?"<null>":this.bucket1PctOver));
        sb.append(',');
        sb.append("bucket12Pct");
        sb.append('=');
        sb.append(((this.bucket12Pct == null)?"<null>":this.bucket12Pct));
        sb.append(',');
        sb.append("bucket11Pct");
        sb.append('=');
        sb.append(((this.bucket11Pct == null)?"<null>":this.bucket11Pct));
        sb.append(',');
        sb.append("bucket10Pct");
        sb.append('=');
        sb.append(((this.bucket10Pct == null)?"<null>":this.bucket10Pct));
        sb.append(',');
        sb.append("bucket9Pct");
        sb.append('=');
        sb.append(((this.bucket9Pct == null)?"<null>":this.bucket9Pct));
        sb.append(',');
        sb.append("bucket8Pct");
        sb.append('=');
        sb.append(((this.bucket8Pct == null)?"<null>":this.bucket8Pct));
        sb.append(',');
        sb.append("bucket7Pct");
        sb.append('=');
        sb.append(((this.bucket7Pct == null)?"<null>":this.bucket7Pct));
        sb.append(',');
        sb.append("bucket6Pct");
        sb.append('=');
        sb.append(((this.bucket6Pct == null)?"<null>":this.bucket6Pct));
        sb.append(',');
        sb.append("bucket5Pct");
        sb.append('=');
        sb.append(((this.bucket5Pct == null)?"<null>":this.bucket5Pct));
        sb.append(',');
        sb.append("bucket4Pct");
        sb.append('=');
        sb.append(((this.bucket4Pct == null)?"<null>":this.bucket4Pct));
        sb.append(',');
        sb.append("bucket3Pct");
        sb.append('=');
        sb.append(((this.bucket3Pct == null)?"<null>":this.bucket3Pct));
        sb.append(',');
        sb.append("bucket2Pct");
        sb.append('=');
        sb.append(((this.bucket2Pct == null)?"<null>":this.bucket2Pct));
        sb.append(',');
        sb.append("bucket1Pct");
        sb.append('=');
        sb.append(((this.bucket1Pct == null)?"<null>":this.bucket1Pct));
        sb.append(',');
        sb.append("bucket11AmtOver");
        sb.append('=');
        sb.append(((this.bucket11AmtOver == null)?"<null>":this.bucket11AmtOver));
        sb.append(',');
        sb.append("bucket10AmtOver");
        sb.append('=');
        sb.append(((this.bucket10AmtOver == null)?"<null>":this.bucket10AmtOver));
        sb.append(',');
        sb.append("bucket9AmtOver");
        sb.append('=');
        sb.append(((this.bucket9AmtOver == null)?"<null>":this.bucket9AmtOver));
        sb.append(',');
        sb.append("bucket8AmtOver");
        sb.append('=');
        sb.append(((this.bucket8AmtOver == null)?"<null>":this.bucket8AmtOver));
        sb.append(',');
        sb.append("bucket7AmtOver");
        sb.append('=');
        sb.append(((this.bucket7AmtOver == null)?"<null>":this.bucket7AmtOver));
        sb.append(',');
        sb.append("bucket6AmtOver");
        sb.append('=');
        sb.append(((this.bucket6AmtOver == null)?"<null>":this.bucket6AmtOver));
        sb.append(',');
        sb.append("bucket5AmtOver");
        sb.append('=');
        sb.append(((this.bucket5AmtOver == null)?"<null>":this.bucket5AmtOver));
        sb.append(',');
        sb.append("bucket4AmtOver");
        sb.append('=');
        sb.append(((this.bucket4AmtOver == null)?"<null>":this.bucket4AmtOver));
        sb.append(',');
        sb.append("bucket3AmtOver");
        sb.append('=');
        sb.append(((this.bucket3AmtOver == null)?"<null>":this.bucket3AmtOver));
        sb.append(',');
        sb.append("bucket2AmtOver");
        sb.append('=');
        sb.append(((this.bucket2AmtOver == null)?"<null>":this.bucket2AmtOver));
        sb.append(',');
        sb.append("bucket1AmtOver");
        sb.append('=');
        sb.append(((this.bucket1AmtOver == null)?"<null>":this.bucket1AmtOver));
        sb.append(',');
        sb.append("bucket12Amt");
        sb.append('=');
        sb.append(((this.bucket12Amt == null)?"<null>":this.bucket12Amt));
        sb.append(',');
        sb.append("bucket11Amt");
        sb.append('=');
        sb.append(((this.bucket11Amt == null)?"<null>":this.bucket11Amt));
        sb.append(',');
        sb.append("bucket10Amt");
        sb.append('=');
        sb.append(((this.bucket10Amt == null)?"<null>":this.bucket10Amt));
        sb.append(',');
        sb.append("bucket9Amt");
        sb.append('=');
        sb.append(((this.bucket9Amt == null)?"<null>":this.bucket9Amt));
        sb.append(',');
        sb.append("bucket8Amt");
        sb.append('=');
        sb.append(((this.bucket8Amt == null)?"<null>":this.bucket8Amt));
        sb.append(',');
        sb.append("bucket7Amt");
        sb.append('=');
        sb.append(((this.bucket7Amt == null)?"<null>":this.bucket7Amt));
        sb.append(',');
        sb.append("bucket6Amt");
        sb.append('=');
        sb.append(((this.bucket6Amt == null)?"<null>":this.bucket6Amt));
        sb.append(',');
        sb.append("bucket5Amt");
        sb.append('=');
        sb.append(((this.bucket5Amt == null)?"<null>":this.bucket5Amt));
        sb.append(',');
        sb.append("bucket4Amt");
        sb.append('=');
        sb.append(((this.bucket4Amt == null)?"<null>":this.bucket4Amt));
        sb.append(',');
        sb.append("bucket3Amt");
        sb.append('=');
        sb.append(((this.bucket3Amt == null)?"<null>":this.bucket3Amt));
        sb.append(',');
        sb.append("bucket2Amt");
        sb.append('=');
        sb.append(((this.bucket2Amt == null)?"<null>":this.bucket2Amt));
        sb.append(',');
        sb.append("bucket1Amt");
        sb.append('=');
        sb.append(((this.bucket1Amt == null)?"<null>":this.bucket1Amt));
        sb.append(',');
        sb.append("dateOfAging");
        sb.append('=');
        sb.append(((this.dateOfAging == null)?"<null>":this.dateOfAging));
        sb.append(',');
        sb.append("paymentTerm");
        sb.append('=');
        sb.append(((this.paymentTerm == null)?"<null>":this.paymentTerm));
        sb.append(',');
        sb.append("publicInd");
        sb.append('=');
        sb.append(((this.publicInd == null)?"<null>":this.publicInd));
        sb.append(',');
        sb.append("historyIndicator");
        sb.append('=');
        sb.append(((this.historyIndicator == null)?"<null>":this.historyIndicator));
        sb.append(',');
        sb.append("bhqIndicator");
        sb.append('=');
        sb.append(((this.bhqIndicator == null)?"<null>":this.bhqIndicator));
        sb.append(',');
        sb.append("revenue");
        sb.append('=');
        sb.append(((this.revenue == null)?"<null>":this.revenue));
        sb.append(',');
        sb.append("businessNetWorth");
        sb.append('=');
        sb.append(((this.businessNetWorth == null)?"<null>":this.businessNetWorth));
        sb.append(',');
        sb.append("dnbBusinessBureauInd");
        sb.append('=');
        sb.append(((this.dnbBusinessBureauInd == null)?"<null>":this.dnbBusinessBureauInd));
        sb.append(',');
        sb.append("yearsWithCurrentMgmt");
        sb.append('=');
        sb.append(((this.yearsWithCurrentMgmt == null)?"<null>":this.yearsWithCurrentMgmt));
        sb.append(',');
        sb.append("tradeExpSlowNegPmtPct");
        sb.append('=');
        sb.append(((this.tradeExpSlowNegPmtPct == null)?"<null>":this.tradeExpSlowNegPmtPct));
        sb.append(',');
        sb.append("totalPaymentExperiences");
        sb.append('=');
        sb.append(((this.totalPaymentExperiences == null)?"<null>":this.totalPaymentExperiences));
        sb.append(',');
        sb.append("currentRatio");
        sb.append('=');
        sb.append(((this.currentRatio == null)?"<null>":this.currentRatio));
        sb.append(',');
        sb.append("totalAssets");
        sb.append('=');
        sb.append(((this.totalAssets == null)?"<null>":this.totalAssets));
        sb.append(',');
        sb.append("totalLiabilities");
        sb.append('=');
        sb.append(((this.totalLiabilities == null)?"<null>":this.totalLiabilities));
        sb.append(',');
        sb.append("bankruptcyYn");
        sb.append('=');
        sb.append(((this.bankruptcyYn == null)?"<null>":this.bankruptcyYn));
        sb.append(',');
        sb.append("lienYn");
        sb.append('=');
        sb.append(((this.lienYn == null)?"<null>":this.lienYn));
        sb.append(',');
        sb.append("judgementYn");
        sb.append('=');
        sb.append(((this.judgementYn == null)?"<null>":this.judgementYn));
        sb.append(',');
        sb.append("suitYn");
        sb.append('=');
        sb.append(((this.suitYn == null)?"<null>":this.suitYn));
        sb.append(',');
        sb.append("territory");
        sb.append('=');
        sb.append(((this.territory == null)?"<null>":this.territory));
        sb.append(',');
        sb.append("riskClassification");
        sb.append('=');
        sb.append(((this.riskClassification == null)?"<null>":this.riskClassification));
        sb.append(',');
        sb.append("customerType");
        sb.append('=');
        sb.append(((this.customerType == null)?"<null>":this.customerType));
        sb.append(',');
        sb.append("businessUnit");
        sb.append('=');
        sb.append(((this.businessUnit == null)?"<null>":this.businessUnit));
        sb.append(',');
        sb.append("businessStructure");
        sb.append('=');
        sb.append(((this.businessStructure == null)?"<null>":this.businessStructure));
        sb.append(',');
        sb.append("customerNo");
        sb.append('=');
        sb.append(((this.customerNo == null)?"<null>":this.customerNo));
        sb.append(',');
        sb.append("salespersonName");
        sb.append('=');
        sb.append(((this.salespersonName == null)?"<null>":this.salespersonName));
        sb.append(',');
        sb.append("productLine");
        sb.append('=');
        sb.append(((this.productLine == null)?"<null>":this.productLine));
        sb.append(',');
        sb.append("lastPaymentAmount");
        sb.append('=');
        sb.append(((this.lastPaymentAmount == null)?"<null>":this.lastPaymentAmount));
        sb.append(',');
        sb.append("paydex12monthsago");
        sb.append('=');
        sb.append(((this.paydex12monthsago == null)?"<null>":this.paydex12monthsago));
        sb.append(',');
        sb.append("paydex6monthsago");
        sb.append('=');
        sb.append(((this.paydex6monthsago == null)?"<null>":this.paydex6monthsago));
        sb.append(',');
        sb.append("paydex3monthsago");
        sb.append('=');
        sb.append(((this.paydex3monthsago == null)?"<null>":this.paydex3monthsago));
        sb.append(',');
        sb.append("paydex9monthsago");
        sb.append('=');
        sb.append(((this.paydex9monthsago == null)?"<null>":this.paydex9monthsago));
        sb.append(',');
        sb.append("paydex1monthsago");
        sb.append('=');
        sb.append(((this.paydex1monthsago == null)?"<null>":this.paydex1monthsago));
        sb.append(',');
        sb.append("ccspercentile12monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile12monthsago == null)?"<null>":this.ccspercentile12monthsago));
        sb.append(',');
        sb.append("ccspercentile9monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile9monthsago == null)?"<null>":this.ccspercentile9monthsago));
        sb.append(',');
        sb.append("ccspercentile6monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile6monthsago == null)?"<null>":this.ccspercentile6monthsago));
        sb.append(',');
        sb.append("ccspercentile3monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile3monthsago == null)?"<null>":this.ccspercentile3monthsago));
        sb.append(',');
        sb.append("ccspercentile1monthsago");
        sb.append('=');
        sb.append(((this.ccspercentile1monthsago == null)?"<null>":this.ccspercentile1monthsago));
        sb.append(',');
        sb.append("fsspercentile12monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile12monthsago == null)?"<null>":this.fsspercentile12monthsago));
        sb.append(',');
        sb.append("fsspercentile9monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile9monthsago == null)?"<null>":this.fsspercentile9monthsago));
        sb.append(',');
        sb.append("fsspercentile6monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile6monthsago == null)?"<null>":this.fsspercentile6monthsago));
        sb.append(',');
        sb.append("fsspercentile3monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile3monthsago == null)?"<null>":this.fsspercentile3monthsago));
        sb.append(',');
        sb.append("fsspercentile1monthsago");
        sb.append('=');
        sb.append(((this.fsspercentile1monthsago == null)?"<null>":this.fsspercentile1monthsago));
        sb.append(',');
        sb.append("headDunsNumber");
        sb.append('=');
        sb.append(((this.headDunsNumber == null)?"<null>":this.headDunsNumber));
        sb.append(',');
        sb.append("globalUltimName");
        sb.append('=');
        sb.append(((this.globalUltimName == null)?"<null>":this.globalUltimName));
        sb.append(',');
        sb.append("globalUltimDunsNumber");
        sb.append('=');
        sb.append(((this.globalUltimDunsNumber == null)?"<null>":this.globalUltimDunsNumber));
        sb.append(',');
        sb.append("yearsInBusiness");
        sb.append('=');
        sb.append(((this.yearsInBusiness == null)?"<null>":this.yearsInBusiness));
        sb.append(',');
        sb.append("outOfBusinessYn");
        sb.append('=');
        sb.append(((this.outOfBusinessYn == null)?"<null>":this.outOfBusinessYn));
        sb.append(',');
        sb.append("employees");
        sb.append('=');
        sb.append(((this.employees == null)?"<null>":this.employees));
        sb.append(',');
        sb.append("sicCode");
        sb.append('=');
        sb.append(((this.sicCode == null)?"<null>":this.sicCode));
        sb.append(',');
        sb.append("recommendedCreditLimit");
        sb.append('=');
        sb.append(((this.recommendedCreditLimit == null)?"<null>":this.recommendedCreditLimit));
        sb.append(',');
        sb.append("creditLimit");
        sb.append('=');
        sb.append(((this.creditLimit == null)?"<null>":this.creditLimit));
        sb.append(',');
        sb.append("dnbRating");
        sb.append('=');
        sb.append(((this.dnbRating == null)?"<null>":this.dnbRating));
        sb.append(',');
        sb.append("finStressClass");
        sb.append('=');
        sb.append(((this.finStressClass == null)?"<null>":this.finStressClass));
        sb.append(',');
        sb.append("commCrScrClass");
        sb.append('=');
        sb.append(((this.commCrScrClass == null)?"<null>":this.commCrScrClass));
        sb.append(',');
        sb.append("paydex");
        sb.append('=');
        sb.append(((this.paydex == null)?"<null>":this.paydex));
        sb.append(',');
        sb.append("commCrScrPercentile");
        sb.append('=');
        sb.append(((this.commCrScrPercentile == null)?"<null>":this.commCrScrPercentile));
        sb.append(',');
        sb.append("finStressScrPercentile");
        sb.append('=');
        sb.append(((this.finStressScrPercentile == null)?"<null>":this.finStressScrPercentile));
        sb.append(',');
        sb.append("dunsCountry");
        sb.append('=');
        sb.append(((this.dunsCountry == null)?"<null>":this.dunsCountry));
        sb.append(',');
        sb.append("dunsState");
        sb.append('=');
        sb.append(((this.dunsState == null)?"<null>":this.dunsState));
        sb.append(',');
        sb.append("dunsZip");
        sb.append('=');
        sb.append(((this.dunsZip == null)?"<null>":this.dunsZip));
        sb.append(',');
        sb.append("dunsCity");
        sb.append('=');
        sb.append(((this.dunsCity == null)?"<null>":this.dunsCity));
        sb.append(',');
        sb.append("dunsStreet2");
        sb.append('=');
        sb.append(((this.dunsStreet2 == null)?"<null>":this.dunsStreet2));
        sb.append(',');
        sb.append("dunsStreet1");
        sb.append('=');
        sb.append(((this.dunsStreet1 == null)?"<null>":this.dunsStreet1));
        sb.append(',');
        sb.append("dunsBusinessName");
        sb.append('=');
        sb.append(((this.dunsBusinessName == null)?"<null>":this.dunsBusinessName));
        sb.append(',');
        sb.append("businessCountry");
        sb.append('=');
        sb.append(((this.businessCountry == null)?"<null>":this.businessCountry));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("street2");
        sb.append('=');
        sb.append(((this.street2 == null)?"<null>":this.street2));
        sb.append(',');
        sb.append("street1");
        sb.append('=');
        sb.append(((this.street1 == null)?"<null>":this.street1));
        sb.append(',');
        sb.append("businessName");
        sb.append('=');
        sb.append(((this.businessName == null)?"<null>":this.businessName));
        sb.append(',');
        sb.append("acctLastUpdateDate");
        sb.append('=');
        sb.append(((this.acctLastUpdateDate == null)?"<null>":this.acctLastUpdateDate));
        sb.append(',');
        sb.append("acctDetailStatus");
        sb.append('=');
        sb.append(((this.acctDetailStatus == null)?"<null>":this.acctDetailStatus));
        sb.append(',');
        sb.append("acctNo");
        sb.append('=');
        sb.append(((this.acctNo == null)?"<null>":this.acctNo));
        sb.append(',');
        sb.append("entityId");
        sb.append('=');
        sb.append(((this.entityId == null)?"<null>":this.entityId));
        sb.append(',');
        sb.append("entityType");
        sb.append('=');
        sb.append(((this.entityType == null)?"<null>":this.entityType));
        sb.append(',');
        sb.append("prmDomainId");
        sb.append('=');
        sb.append(((this.prmDomainId == null)?"<null>":this.prmDomainId));
        sb.append(',');
        sb.append("wsDomain");
        sb.append('=');
        sb.append(((this.wsDomain == null)?"<null>":this.wsDomain));
        sb.append(',');
        sb.append("workspaceId");
        sb.append('=');
        sb.append(((this.workspaceId == null)?"<null>":this.workspaceId));
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