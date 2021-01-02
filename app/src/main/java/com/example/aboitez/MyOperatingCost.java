package com.example.aboitez;

public class MyOperatingCost {

    private int id;
    private int business_id;

    private String item;
    private String cost;
    private String sales;
    private String markup;
    private String weeklypurchase;


    public MyOperatingCost(int id, int business_id, String item, String cost, String sales, String markup, String weeklypurchase) {
        this.id = id;
        this.business_id = business_id;
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
                ", cost='" + cost + '\'' +
                ", sales='" + sales + '\'' +
                ", markup='" + markup + '\'' +
                ", weeklypurchase='" + weeklypurchase + '\'' +
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

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getMarkup() {
        return markup;
    }

    public void setMarkup(String markup) {
        this.markup = markup;
    }

    public String getWeeklypurchase() {
        return weeklypurchase;
    }

    public void setWeeklypurchase(String weeklypurchase) {
        this.weeklypurchase = weeklypurchase;
    }
}
