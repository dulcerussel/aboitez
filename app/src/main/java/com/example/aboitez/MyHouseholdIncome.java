package com.example.aboitez;

import android.app.Application;

public class MyHouseholdIncome extends Application {
    private int id;
    private int household_id;
    private  String sourceincome;
    private String details;
    private String type;
    private String freq;
    private float amount;

    public MyHouseholdIncome(int id, int household_id, String sourceincome, String details, String type, String freq, float amount) {
        this.id = id;
        this.household_id = household_id;
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
                "id=" + id +
                ", household_id=" + household_id +
                ", sourceincome='" + sourceincome + '\'' +
                ", details='" + details + '\'' +
                ", type='" + type + '\'' +
                ", freq='" + freq + '\'' +
                ", amount=" + amount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHousehold_id() {
        return household_id;
    }

    public void setHousehold_id(int household_id) {
        this.household_id = household_id;
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

