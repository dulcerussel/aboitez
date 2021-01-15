package com.example.aboitez;

import android.app.Application;

public class MyOtherOperatingCost extends Application {

    private int id;
    private int business_id;

    private float loss;
    private float transpo;
    private float salaries;
    private float others;

    public MyOtherOperatingCost(int id, int business_id, float loss, float transpo, float salaries, float others) {
        this.id = id;
        this.business_id = business_id;
        this.loss = loss;
        this.transpo = transpo;
        this.salaries = salaries;
        this.others = others;
    }

    public MyOtherOperatingCost(int business_id, float loss, float transpo, float salaries, float others) {
        this.business_id = business_id;
        this.loss = loss;
        this.transpo = transpo;
        this.salaries = salaries;
        this.others = others;
    }

    public MyOtherOperatingCost() {
    }

    @Override
    public String toString() {
        return "MyOtherOperatingCost{" +
                "id=" + id +
                ", business_id=" + business_id +
                ", loss=" + loss +
                ", transpo=" + transpo +
                ", salaries=" + salaries +
                ", others=" + others +
                '}';
    }

    public void CalculateLoss(float x){
        float d = (float)0.4;
        setLoss(x*d);
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

    public float getLoss() {
        return loss;
    }

    public void setLoss(float loss) {
        this.loss = loss;
    }

    public float getTranspo() {
        return transpo;
    }

    public void setTranspo(float transpo) {
        this.transpo = transpo;
    }

    public float getSalaries() {
        return salaries;
    }

    public void setSalaries(float salaries) {
        this.salaries = salaries;
    }

    public float getOthers() {
        return others;
    }

    public void setOthers(float others) {
        this.others = others;
    }
}
