package com.car;

public class Hatchback extends Car {

    private boolean powerWindowsEnabled;
    private boolean automaticGear;

    public Hatchback(){
        super();
    }

    @Override
    public double calculateDriveCost(double kms) {
        // TODO Auto-generated method stub
        if (automaticGear){
            return kms*12;
        }
        return kms*10;
    }



    public boolean isPowerWindowsEnabled() {
        return powerWindowsEnabled;
    }


    public void setPowerWindowsEnabled(boolean powerWindowsEnabled) {
        this.powerWindowsEnabled = powerWindowsEnabled;
    }


    public boolean isAutomaticGear() {
        return automaticGear;
    }


    public void setAutomaticGear(boolean automaticGear) {
        this.automaticGear = automaticGear;
    }
    
}
