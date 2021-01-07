package com.example.aboitez;

import android.app.Application;

public class MyApplication extends Application {

    private int id;
    private int applicant_id;

    private float business_total;
    private float household_total;
    private float totalnetcombineincome;
    private float adc;
    private String loanterm;
    private float adcxterms;
    private float maxloanamount;

    public MyApplication(int id, int applicant_id, float business_total, float household_total, float totalnetcombineincome, float adc, String loanterm, float adcxterms, float maxloanamount) {
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
                ", business_total=" + business_total +
                ", household_total=" + household_total +
                ", totalnetcombineincome=" + totalnetcombineincome +
                ", adc=" + adc +
                ", loanterm='" + loanterm + '\'' +
                ", adcxterms=" + adcxterms +
                ", maxloanamount=" + maxloanamount +
                '}';
    }


    public void CalculateNetBusinessIncome(float netincome){
        setBusiness_total(netincome*4);
    }

    //set only on NetHouseholdIncome ; No need calculations

    public void CalculateNetCombineIncome(float input, float input2){
        setTotalnetcombineincome(input+input2);
    }
    public void CalculateAdjustedDebtCapacity(float input){
        float y = (float)0.35;
        setAdc(input*y);
    }

    public void CalculateADCxTerms(){
        String c = getLoanterm();
        float adc = getAdc();
        switch(c){
            case "3 months" :setAdcxterms(adc*16);
                break;
            case "6 months" :
            setAdcxterms(adc*24);
                 break;
            case "9 months" : setAdcxterms(adc*36);
                break;
            case "12 months" : setAdcxterms(adc*48);
                break;
        }
    }

    public void MaxLoanAmountAvailment(){
        String c = getLoanterm();
        float adcxterms = getAdcxterms();
        float x;
        switch(c){
            case "3 months" : x = (float)0.8; setMaxloanamount(adcxterms*x);
                break;
            case "6 months" :
                x = (float)1.2; setMaxloanamount(adcxterms*x);
                break;
            case "9 months" : x = (float)0.1; setMaxloanamount(adcxterms*x);
                break;
            case "12 months" : x = (float)0.11; setMaxloanamount(adcxterms*x);
                break;
        }
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

    public float getBusiness_total() {
        return business_total;
    }

    public void setBusiness_total(float business_total) {
        this.business_total = business_total;
    }

    public float getHousehold_total() {
        return household_total;
    }

    public void setHousehold_total(float household_total) {
        this.household_total = household_total;
    }

    public float getTotalnetcombineincome() {
        return totalnetcombineincome;
    }

    public void setTotalnetcombineincome(float totalnetcombineincome) {
        this.totalnetcombineincome = totalnetcombineincome;
    }

    public float getAdc() {
        return adc;
    }

    public void setAdc(float adc) {
        this.adc = adc;
    }

    public String getLoanterm() {
        return loanterm;
    }

    public void setLoanterm(String loanterm) {
        this.loanterm = loanterm;
    }

    public float getAdcxterms() {
        return adcxterms;
    }

    public void setAdcxterms(float adcxterms) {
        this.adcxterms = adcxterms;
    }

    public float getMaxloanamount() {
        return maxloanamount;
    }

    public void setMaxloanamount(float maxloanamount) {
        this.maxloanamount = maxloanamount;
    }
}
