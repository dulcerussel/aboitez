package com.example.aboitez;

import android.app.Application;

public class MyApplicant extends Application {
    private int id;
    private String clientname;
    private String groupname;
    private String branchname;
    private String area;
    private String dateconducted;
    private String loanapplied;
    private String businessname;
    private String businesstype;


    public MyApplicant(int id, String clientname, String groupname, String branchname, String area, String dateconducted, String loanapplied, String businessname, String businesstype) {
        this.id = id;
        this.clientname = clientname;
        this.groupname = groupname;
        this.branchname = branchname;
        this.area = area;
        this.dateconducted = dateconducted;
        this.loanapplied = loanapplied;
        this.businessname = businessname;
        this.businesstype = businesstype;
    }


    public MyApplicant() {

    }


    @Override
    public String toString() {
        return "MyApplicant{" +
                "id=" + id +
                ", clientname='" + clientname + '\'' +
                ", groupname='" + groupname + '\'' +
                ", branchname='" + branchname + '\'' +
                ", area='" + area + '\'' +
                ", dateconducted='" + dateconducted + '\'' +
                ", loanapplied='" + loanapplied + '\'' +
                ", businessname='" + businessname + '\'' +
                ", businesstype='" + businesstype + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getBranchname() {
        return branchname;
    }

    public void setBranchname(String branchname) {
        this.branchname = branchname;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDateconducted() {
        return dateconducted;
    }

    public void setDateconducted(String dateconducted) {
        this.dateconducted = dateconducted;
    }

    public String getLoanapplied() {
        return loanapplied;
    }

    public void setLoanapplied(String loanapplied) {
        this.loanapplied = loanapplied;
    }

    public String getBusinessname() {
        return businessname;
    }

    public void setBusinessname(String businessname) {
        this.businessname = businessname;
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype;
    }
}
