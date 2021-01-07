package com.example.aboitez;

import android.app.Application;

public class MyHouseholdExpense  extends Application {
    private int id;
    private int household_id;
    private float houseutilies;
    private float  houserent;
    private float housefood;
    private float housemedicine;
    private float houseeduc;
    private float otherexpense;

    public MyHouseholdExpense(int id, int household_id, float houseutilies, float houserent, float housefood, float housemedicine, float houseeduc, float otherexpense) {
        this.id = id;
        this.household_id = household_id;
        this.houseutilies = houseutilies;
        this.houserent = houserent;
        this.housefood = housefood;
        this.housemedicine = housemedicine;
        this.houseeduc = houseeduc;
        this.otherexpense = otherexpense;
    }

    public MyHouseholdExpense() {
    }

    @Override
    public String toString() {
        return "MyHouseholdExpense{" +
                "id=" + id +
                ", household_id=" + household_id +
                ", houseutilies=" + houseutilies +
                ", houserent=" + houserent +
                ", housefood=" + housefood +
                ", housemedicine=" + housemedicine +
                ", houseeduc=" + houseeduc +
                ", otherexpense=" + otherexpense +
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

    public float getHouseutilies() {
        return houseutilies;
    }

    public void setHouseutilies(float houseutilies) {
        this.houseutilies = houseutilies;
    }

    public float getHouserent() {
        return houserent;
    }

    public void setHouserent(float houserent) {
        this.houserent = houserent;
    }

    public float getHousefood() {
        return housefood;
    }

    public void setHousefood(float housefood) {
        this.housefood = housefood;
    }

    public float getHousemedicine() {
        return housemedicine;
    }

    public void setHousemedicine(float housemedicine) {
        this.housemedicine = housemedicine;
    }

    public float getHouseeduc() {
        return houseeduc;
    }

    public void setHouseeduc(float houseeduc) {
        this.houseeduc = houseeduc;
    }

    public float getOtherexpense() {
        return otherexpense;
    }

    public void setOtherexpense(float otherexpense) {
        this.otherexpense = otherexpense;
    }
}
