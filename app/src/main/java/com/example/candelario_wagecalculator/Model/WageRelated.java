package com.example.candelario_wagecalculator.Model;

public class WageRelated {
    int hours, OThours=0, totalhours;
    double wage,OTwage=0, totalwage;
    String name, type;

public WageRelated(){}

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getOThours() {
        return OThours;
    }
    public void setOThours(int OThours) {
        this.OThours = OThours;
    }
    public double getWage() {
        return wage;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public double getOTwage() {
        return OTwage;
    }
    public void setOTwage(double OTwage) {
        this.OTwage = OTwage;
    }
    public double getTotalwage() {
        return totalwage;
    }
    public void setTotalwage(double totalwage) {
        this.totalwage = totalwage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getTotalhours() {
        return totalhours;
    }
    public void setTotalhours(int totalhours) {
        this.totalhours = totalhours;
    }
}
