package com.example.aboitez;

public class MyOtherOperatingCost {

    private int id;
    private int business_id;

    private String loss;
    private String transpo;
    private String salaries;
    private String others;

    public MyOtherOperatingCost(int id, int business_id, String loss, String transpo, String salaries, String others) {
        this.id = id;
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
                ", loss='" + loss + '\'' +
                ", transpo='" + transpo + '\'' +
                ", salaries='" + salaries + '\'' +
                ", others='" + others + '\'' +
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

    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
    }

    public String getTranspo() {
        return transpo;
    }

    public void setTranspo(String transpo) {
        this.transpo = transpo;
    }

    public String getSalaries() {
        return salaries;
    }

    public void setSalaries(String salaries) {
        this.salaries = salaries;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }
}
