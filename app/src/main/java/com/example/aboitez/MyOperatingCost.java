package com.example.aboitez;

import android.app.Application;

public class MyOperatingCost extends Application {

    private int id;
    private int business_id;

    private String item;
    private float cost;
    private float sales;
    private int markup;
    private float weeklypurchase;

    public MyOperatingCost(int id, int business_id, String item, float cost, float sales, int markup, float weeklypurchase) {
        this.id = id;
        this.business_id = business_id;
        this.item = item;
        this.cost = cost;
        this.sales = sales;
        this.markup = markup;
        this.weeklypurchase = weeklypurchase;
    }

    public MyOperatingCost(String item, float cost, float sales, int markup, float weeklypurchase) {
        this.item = item;
        this.cost = cost;
        this.sales = sales;
        this.markup = markup;
        this.weeklypurchase = weeklypurchase;
    }

    public MyOperatingCost() {
    }

    @Override
    public String toString() {
        return "MyOperatingCost{" +
                "id=" + id +
                ", business_id=" + business_id +
                ", item='" + item + '\'' +
                ", cost=" + cost +
                ", sales=" + sales +
                ", markup=" + markup +
                ", weeklypurchase=" + weeklypurchase +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBusiness_id() {
        return business_id;
    }

    public void setBusiness_id(int business_id) {
        this.business_id = business_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public float getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public int getMarkup() {
        return markup;
    }

    public void setMarkup(int markup) {
        this.markup = markup;
    }

    public float getWeeklypurchase() {
        return weeklypurchase;
    }

    public void setWeeklypurchase(float weeklypurchase) {
        this.weeklypurchase = weeklypurchase;
    }
}
