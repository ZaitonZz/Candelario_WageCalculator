package com.example.candelario_wagecalculator.Model;

import java.io.Serializable;

public class WageRelated implements Serializable {
    int hours, OThours=0, totalhours, wage, OTwage=0, totalwage;
    String name, type;
    boolean allgoods = false;

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
    public int getWage() {
        return wage;
    }
    public void setWage(int wage) {
        this.wage = wage;
    }
    public int getOTwage() {
        return OTwage;
    }
    public void setOTwage(int OTwage) {
        this.OTwage = OTwage;
    }
    public int getTotalwage() {
        return totalwage;
    }
    public void setTotalwage(int totalwage) {
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
    public boolean isAllgoods() {
        return allgoods;
    }
    public void setAllgoods(boolean allgoods) {
        this.allgoods = allgoods;
    }
}
