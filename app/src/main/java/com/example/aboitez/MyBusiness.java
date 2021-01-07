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
    private float dailystandavesales;
    private int actualmarkup;


    public MyBusiness(int id, int application_id, float monday, float tuesday, float wednesday, float thursday, float friday, float saturday, float sunday, float weeklysales, float dailyavesales, float dailystandavesales, int actualmarkup) {
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
                ", monday=" + monday +
                ", tuesday=" + tuesday +
                ", wednesday=" + wednesday +
                ", thursday=" + thursday +
                ", friday=" + friday +
                ", saturday=" + saturday +
                ", sunday=" + sunday +
                ", weeklysales=" + weeklysales +
                ", dailyavesales=" + dailyavesales +
                ", dailystandavesales=" + dailystandavesales +
                ", actualmarkup=" + actualmarkup +
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
}
