package com.car;

import java.text.DecimalFormat;

public class Sedan extends Car {
    
    private boolean absEnabled;
    private Integer bootSpace;

    public Sedan(){
        super();
    }

    @Override
    public double calculateDriveCost(double kms) {

        double cost;
        if (bootSpace > 600){
            cost = kms*15;
            return cost + cost*0.15;
        }
        cost = kms*15;
        return cost;

    }

    public boolean isAbsEnabled() {
        return absEnabled;
    }

    public void setAbsEnabled(boolean absEnabled) {
        this.absEnabled = absEnabled;
    }

    public Integer getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(Integer bootSpace) {
        this.bootSpace = bootSpace;
    }

    

}
