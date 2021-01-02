package com.example.aboitez;

public class MyBusiness {

    private int id;
    private int application_id;
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;
    private String friday;
    private String saturday;
    private String sunday;
    private String weeklysales;
    private String dailyavesales;
    private String dailystandavesales;
    private String actualmarkup;


    public MyBusiness(int id, int application_id, String monday, String tuesday, String wednesday, String thursday, String friday, String saturday, String sunday, String weeklysales, String dailyavesales, String dailystandavesales, String actualmarkup) {
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
        this.dailystandavesales = dailystandavesales;
        this.actualmarkup = actualmarkup;
    }

    public MyBusiness() {
    }


    @Override
    public String toString() {
        return "MyBusiness{" +
                "id=" + id +
                ", application_id=" + application_id +
                ", monday='" + monday + '\'' +
                ", tuesday='" + tuesday + '\'' +
                ", wednesday='" + wednesday + '\'' +
                ", thursday='" + thursday + '\'' +
                ", friday='" + friday + '\'' +
                ", saturday='" + saturday + '\'' +
                ", sunday='" + sunday + '\'' +
                ", weeklysales='" + weeklysales + '\'' +
                ", dailyavesales='" + dailyavesales + '\'' +
                ", dailystandavesales='" + dailystandavesales + '\'' +
                ", actualmarkup='" + actualmarkup + '\'' +
                '}';
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

    public String getMonday() {
        return monday;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getFriday() {
        return friday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getWeeklysales() {
        return weeklysales;
    }

    public void setWeeklysales(String weeklysales) {
        this.weeklysales = weeklysales;
    }

    public String getDailyavesales() {
        return dailyavesales;
    }

    public void setDailyavesales(String dailyavesales) {
        this.dailyavesales = dailyavesales;
    }

    public String getDailystandavesales() {
        return dailystandavesales;
    }

    public void setDailystandavesales(String dailystandavesales) {
        this.dailystandavesales = dailystandavesales;
    }

    public String getActualmarkup() {
        return actualmarkup;
    }

    public void setActualmarkup(String actualmarkup) {
        this.actualmarkup = actualmarkup;
    }
}
