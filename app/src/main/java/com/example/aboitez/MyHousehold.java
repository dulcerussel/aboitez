package com.example.aboitez;

public class MyHousehold {
    private int id;
    private int application_id;
    private float grosshouseincome;
    private float grosshouseexpense;
    private float nethouseincome;
    private float grosspersonalincome;
    private String familylocsize;
    private float expectedhouseexpense;

    public MyHousehold(int id, int application_id, float grosshouseincome, float grosshouseexpense, float nethouseincome, float grosspersonalincome, String familylocsize, float expectedhouseexpense) {
        this.id = id;
        this.application_id = application_id;
        this.grosshouseincome = grosshouseincome;
        this.grosshouseexpense = grosshouseexpense;
        this.nethouseincome = nethouseincome;
        this.grosspersonalincome = grosspersonalincome;
        this.familylocsize = familylocsize;
        this.expectedhouseexpense = expectedhouseexpense;
    }

    public MyHousehold() {
    }

    @Override
    public String toString() {
        return "MyHousehold{" +
                "id=" + id +
                ", application_id=" + application_id +
                ", grosshouseincome=" + grosshouseincome +
                ", grosshouseexpense=" + grosshouseexpense +
                ", nethouseincome=" + nethouseincome +
                ", grosspersonalincome=" + grosspersonalincome +
                ", familylocsize=" + familylocsize +
                ", expectedhouseexpense=" + expectedhouseexpense +
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

    public float getGrosshouseincome() {
        return grosshouseincome;
    }

    public void setGrosshouseincome(float grosshouseincome) {
        this.grosshouseincome = grosshouseincome;
    }

    public float getGrosshouseexpense() {
        return grosshouseexpense;
    }

    public void setGrosshouseexpense(float grosshouseexpense) {
        this.grosshouseexpense = grosshouseexpense;
    }

    public float getNethouseincome() {
        return nethouseincome;
    }

    public void setNethouseincome(float nethouseincome) {
        this.nethouseincome = nethouseincome;
    }

    public float getGrosspersonalincome() {
        return grosspersonalincome;
    }

    public void setGrosspersonalincome(float grosspersonalincome) {
        this.grosspersonalincome = grosspersonalincome;
    }

    public String getFamilylocsize() {
        return familylocsize;
    }

    public void setFamilylocsize(String familylocsize) {
        this.familylocsize = familylocsize;
    }

    public float getExpectedhouseexpense() {
        return expectedhouseexpense;
    }

    public void setExpectedhouseexpense(float expectedhouseexpense) {
        this.expectedhouseexpense = expectedhouseexpense;
    }
}

