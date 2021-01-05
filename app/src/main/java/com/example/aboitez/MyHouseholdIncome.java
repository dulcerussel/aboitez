package com.example.aboitez;

public class MyHouseholdIncome {

    private  String sourceincome;
    private String details;
    private String type;
    private String freq;
    private float amount;

    public MyHouseholdIncome(String sourceincome, String details, String type, String freq, float amount) {
        this.sourceincome = sourceincome;
        this.details = details;
        this.type = type;
        this.freq = freq;
        this.amount = amount;
    }

    public MyHouseholdIncome() {
    }

    @Override
    public String toString() {
        return "MyHouseholdIncome{" +
                "sourceincome='" + sourceincome + '\'' +
                ", details='" + details + '\'' +
                ", type='" + type + '\'' +
                ", freq='" + freq + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getSourceincome() {
        return sourceincome;
    }

    public void setSourceincome(String sourceincome) {
        this.sourceincome = sourceincome;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFreq() {
        return freq;
    }

    public void setFreq(String freq) {
        this.freq = freq;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
