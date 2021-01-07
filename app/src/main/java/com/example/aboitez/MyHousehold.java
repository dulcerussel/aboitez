package com.example.aboitez;

import android.app.Application;

public class MyHousehold  extends Application {
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
    public void CalculateNetHouseholdIncome(){
            float x = getGrosshouseexpense();
            float y = getGrosshouseincome();
            setNethouseincome(x+y);
    }
    public void CalculateExpectedHouseHoldExpense(){
        String input = getFamilylocsize();
        switch(input){
            case "Urban, 1-2 persons" : float a = (float)12500.00;
                                        setGrosshouseexpense(a);
                                        setExpectedhouseexpense(a);break;
            case "Urban, 3-4 persons" : float b = (float)16667.00;
                                        setGrosshouseexpense(b);
                                        setExpectedhouseexpense(b); break;
            case "Urban, 5-6 persons" : float c = (float)20833.00;
                setGrosshouseexpense(c);
                                        setExpectedhouseexpense(c); break;
            case "Urban, 7-8 persons" : float d = (float)25000.00;
                setGrosshouseexpense(d);
                                            setExpectedhouseexpense(d); break;
            case "Urban, More than 8" : float e = (float)33333.00;
                setGrosshouseexpense(e);
                                        setExpectedhouseexpense(e); break;
            case "Rural, 1-2 persons" : float f = (float)8333.00;
                setGrosshouseexpense(f);
                setExpectedhouseexpense(f); break;
            case "Rural, 3-4 persons" : float g = (float)12500.00;
                setGrosshouseexpense(g);
                setExpectedhouseexpense(g); break;
            case "Rural, 5-6 persons" : float h = (float)16667.00;
                setGrosshouseexpense(h);
                setExpectedhouseexpense(h); break;
            case "Rural, 7-8 persons" : float i = (float)20833.00;
                setGrosshouseexpense(i);
                setExpectedhouseexpense(i); break;
            case "Rural, More than 8" : float j = (float)29167.00;
                setGrosshouseexpense(j);
                setExpectedhouseexpense(j); break;
            case "NCR, 1-2 persons" : float l = (float)20833.00;
                setGrosshouseexpense(l);
                setExpectedhouseexpense(l); break;
            case "NCR, 3-4 persons" : float m = (float)25000.00;
                setGrosshouseexpense(m);
                setExpectedhouseexpense(m); break;
            case "NCR, 5-6 persons" : float n = (float)29167.00;
                setGrosshouseexpense(n);
                setExpectedhouseexpense(n); break;
            case "NCR, 7-8 persons" : float o = (float)33333.00;
                setGrosshouseexpense(o);
                setExpectedhouseexpense(o); break;
            case "NCR, More than 8" : float p = (float)41667.00;
                setGrosshouseexpense(p);
                setExpectedhouseexpense(p); break;
        }
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

