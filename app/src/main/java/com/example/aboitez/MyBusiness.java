package com.example.aboitez;

import android.app.Application;

public class MyBusiness extends Application {

    private int id;
    private int application_id;
    private float monday;
    private float tuesday;
    private float wednesday;
    private float thursday;
    private float friday;
    private float saturday;
    private float sunday;
    private float weeklysales;
    private float dailyavesales;
    private float weeklystandsales;
    private float dailystandavesales;
    private int actualmarkup;
    private float netprofit;
    private float netcost;


    public MyBusiness(int id, int application_id, float monday, float tuesday, float wednesday, float thursday, float friday, float saturday, float sunday, float weeklysales, float dailyavesales, float weeklystandsales, float dailystandavesales, int actualmarkup, float netprofit, float netcost) {
        this.id = id;
        this.application_id = application_id;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.weeklysales = weeklysales;
        this.dailyavesales = dailyavesales;
        this.weeklystandsales = weeklystandsales;
        this.dailystandavesales = dailystandavesales;
        this.actualmarkup = actualmarkup;
        this.netprofit = netprofit;
        this.netcost = netcost;
    }

    public MyBusiness(int application_id, float monday, float tuesday, float wednesday, float thursday, float friday, float saturday, float sunday, float weeklysales, float dailyavesales, float weeklystandsales, float dailystandavesales, int actualmarkup, float netprofit, float netcost) {
        this.application_id = application_id;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.weeklysales = weeklysales;
        this.dailyavesales = dailyavesales;
        this.weeklystandsales = weeklystandsales;
        this.dailystandavesales = dailystandavesales;
        this.actualmarkup = actualmarkup;
        this.netprofit = netprofit;
        this.netcost = netcost;
    }

    public MyBusiness(int application_id, float monday, float tuesday, float wednesday, float thursday, float friday, float saturday, float sunday, float weeklysales, float dailyavesales) {
        this.application_id = application_id;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
        this.weeklysales = weeklysales;
        this.dailyavesales = dailyavesales;
    }

    public MyBusiness() {
    }

    @Override
    public String toString() {
        return "MyBusiness{" +
                "id=" + id +
                ", application_id=" + application_id +
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                ", weeklysales=" + weeklysales +
                ", dailyavesales=" + dailyavesales +
                ", weeklystandsales=" + weeklystandsales +
                ", dailystandavesales=" + dailystandavesales +
                ", actualmarkup=" + actualmarkup +
                ", netprofit=" + netprofit +
                ", netcost=" + netcost +
                '}';
    }

    public void CalculateWeeklySales(){
        setWeeklysales(this.monday+this.tuesday+this.wednesday+this.thursday+this.friday+this.saturday+this.sunday);
    }

    public void CalculateAverageSales(){
        float x = getWeeklysales();
        setDailyavesales(x/7);
    }

    public void CalculateWeeklyStandardSales(float cost){
            float x = (float)1.25;
            setWeeklysales(cost*x);
    }

    public void CalculateStandardAverageSales(){
        float ave =  getWeeklysales();
        ave = ave / 7;
        setDailystandavesales(ave);
    }


    public void CalculateWeeklyNetProfit(){
        float x = getNetcost();
        float y = (float)0.25;
        setNetprofit(x*y);
    }

    public void CalculateTotalCost(float sum){
        setNetcost(this.weeklysales + sum);
    }

    public float getWeeklystandsales() {
        return weeklystandsales;
    }

    public void setWeeklystandsales(float weeklystandsales) {
        this.weeklystandsales = weeklystandsales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplication_id() {
        return application_id;
    }

    public void setApplication_id(int application_id) {
        this.application_id = application_id;
    }

    public float getMonday() {
        return monday;
    }

    public void setMonday(float monday) {
        this.monday = monday;
    }

    public float getTuesday() {
        return tuesday;
    }

    public void setTuesday(float tuesday) {
        this.tuesday = tuesday;
    }

    public float getWednesday() {
        return wednesday;
    }

    public void setWednesday(float wednesday) {
        this.wednesday = wednesday;
    }

    public float getThursday() {
        return thursday;
    }

    public void setThursday(float thursday) {
        this.thursday = thursday;
    }

    public float getFriday() {
        return friday;
    }

    public void setFriday(float friday) {
        this.friday = friday;
    }

    public float getSaturday() {
        return saturday;
    }

    public void setSaturday(float saturday) {
        this.saturday = saturday;
    }

    public float getSunday() {
        return sunday;
    }

    public void setSunday(float sunday) {
        this.sunday = sunday;
    }

    public float getWeeklysales() {
        return weeklysales;
    }

    public void setWeeklysales(float weeklysales) {
        this.weeklysales = weeklysales;
    }

    public float getDailyavesales() {
        return dailyavesales;
    }

    public void setDailyavesales(float dailyavesales) {
        this.dailyavesales = dailyavesales;
    }

    public float getDailystandavesales() {
        return dailystandavesales;
    }

    public void setDailystandavesales(float dailystandavesales) {
        this.dailystandavesales = dailystandavesales;
    }

    public int getActualmarkup() {
        return actualmarkup;
    }

    public void setActualmarkup(int actualmarkup) {
        this.actualmarkup = actualmarkup;
    }

    public float getNetcost() {
        return netcost;
    }

    public void setNetcost(float netcost) {
        this.netcost = netcost;
    }

    public float getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(float netprofit) {
        this.netprofit = netprofit;
    }
}
