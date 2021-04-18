package com.testcar;

import com.car.*;
public class Testcar {
    
    public static void main(String[] args){

        Sedan car1 = new Sedan();
        car1.setId(1);
        car1.setName("i20");
        car1.setAbsEnabled(false);
        car1.setBootSpace(350);
        System.out.printf("Cost is Rs %.0f" , car1.calculateDriveCost(20));

        System.out.println("\n============================\n");

        Hatchback car2 = new Hatchback();
        car2.setId(2);
        car2.setName("Verna");
        car2.setPowerWindowsEnabled(true);
        car2.setAutomaticGear(false);
        System.out.printf("Cost is Rs %.0f" , car2.calculateDriveCost(10));

        System.out.println("\n============================\n");

        Utilitycar car3 = new Utilitycar();
        car3.setId(3);
        car3.setName("Mahindra SUV");
        car3.setRearCoolingVents(false);
        System.out.printf("Cost is Rs %.0f", car3.calculateDriveCost(10));

    }

}