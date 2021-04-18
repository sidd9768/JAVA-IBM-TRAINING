package com.car;

public class Utilitycar extends Car{

    private boolean rearCoolingVents;

    public Utilitycar(){
        super();
    }

    @Override
    public double calculateDriveCost(double kms) {
        return kms * 18;
    }

    public boolean isRearCoolingVents() {
        return rearCoolingVents;
    }

    public void setRearCoolingVents(boolean rearCoolingVents) {
        this.rearCoolingVents = rearCoolingVents;
    }

}