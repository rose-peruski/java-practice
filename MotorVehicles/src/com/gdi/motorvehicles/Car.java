package com.gdi.motorvehicles;

/**
 * Created by Rose on 4/12/15.
 */
public class Car extends MotorVehicle {
    private boolean mtrunkOpen;
    private int mnumDoors;

    public Car() {
        super();
        mtrunkOpen = false;
        mnumDoors = 4;
    }

    public boolean gettrunkOpen() {
        return mtrunkOpen;
    }

    public int getnumDoors() {
        return mnumDoors;
    }

    public void printDescription() {
        System.out.println("I'm a car! I have " + mnumDoors + "doors!");
    }

}
