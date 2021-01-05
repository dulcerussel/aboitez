package com.example.aboitez;

public class MyHouseholdExpense {

    private float houseutilies;
    private float  houserent;
    private float housefood;
    private float housemedicine;
    private float houseeduc;
    private float otherexpense;

    public MyHouseholdExpense(float houseutilies, float houserent, float housefood, float housemedicine, float houseeduc, float otherexpense) {
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
                "houseutilies=" + houseutilies +
                ", houserent=" + houserent +
                ", housefood=" + housefood +
                ", housemedicine=" + housemedicine +
                ", houseeduc=" + houseeduc +
                ", otherexpense=" + otherexpense +
                '}';
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
