package com.example.aboitez;

public class MyApplication {

    private int id;
    private int applicant_id;

    private String business_total;
    private String household_total;
    private String totalnetcombineincome;
    private String adc;
    private String loanterm;
    private String adcxterms;
    private String maxloanamount;

    public MyApplication(int id, int applicant_id, String business_total, String household_total, String totalnetcombineincome, String adc, String loanterm, String adcxterms, String maxloanamount) {
        this.id = id;
        this.applicant_id = applicant_id;
        this.business_total = business_total;
        this.household_total = household_total;
        this.totalnetcombineincome = totalnetcombineincome;
        this.adc = adc;
        this.loanterm = loanterm;
        this.adcxterms = adcxterms;
        this.maxloanamount = maxloanamount;
    }

    public MyApplication() {
    }

    @Override
    public String toString() {
        return "MyApplication{" +
                "id=" + id +
                ", applicant_id=" + applicant_id +
                ", business_total='" + business_total + '\'' +
                ", household_total='" + household_total + '\'' +
                ", totalnetcombineincome='" + totalnetcombineincome + '\'' +
                ", adc='" + adc + '\'' +
                ", loanterm='" + loanterm + '\'' +
                ", adcxterms='" + adcxterms + '\'' +
                ", maxloanamount='" + maxloanamount + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplicant_id() {
        return applicant_id;
    }

    public void setApplicant_id(int applicant_id) {
        this.applicant_id = applicant_id;
    }

    public String getBusiness_total() {
        return business_total;
    }

    public void setBusiness_total(String business_total) {
        this.business_total = business_total;
    }

    public String getHousehold_total() {
        return household_total;
    }

    public void setHousehold_total(String household_total) {
        this.household_total = household_total;
    }

    public String getTotalnetcombineincome() {
        return totalnetcombineincome;
    }

    public void setTotalnetcombineincome(String totalnetcombineincome) {
        this.totalnetcombineincome = totalnetcombineincome;
    }

    public String getAdc() {
        return adc;
    }

    public void setAdc(String adc) {
        this.adc = adc;
    }

    public String getLoanterm() {
        return loanterm;
    }

    public void setLoanterm(String loanterm) {
        this.loanterm = loanterm;
    }

    public String getAdcxterms() {
        return adcxterms;
    }

    public void setAdcxterms(String adcxterms) {
        this.adcxterms = adcxterms;
    }

    public String getMaxloanamount() {
        return maxloanamount;
    }

    public void setMaxloanamount(String maxloanamount) {
        this.maxloanamount = maxloanamount;
    }
}
