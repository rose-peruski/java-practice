package com.gdi.motorvehicles;

/**
 * Created by Rose on 4/12/15.
 */
public abstract class MotorVehicle {
    private boolean mengineOn;
    protected int mcurrentSpeed;

    private static int sCountCreated = 0;

    public MotorVehicle() {
        mengineOn = false;
        mcurrentSpeed = 0;
        sCountCreated++;
    }


    public void accelerate(int amount){
        mcurrentSpeed = mcurrentSpeed + amount;
    }

    public void decelerate(int amount) {
        mcurrentSpeed = mcurrentSpeed - amount;
    }

    public void switchengineState() {
        if (mengineOn) {
            mengineOn = false;
        }
        else {
            mengineOn = true;
        }

    }

    public void printDescription() {
        System.out.println("I'm a MotorVehicle and my engine is on " + mengineOn + ", and I'm currently going " + mcurrentSpeed + " mph");
    }

    public int getCurrentSpeed() {
        return mcurrentSpeed;
    }

    public boolean getEngineStatus() {
        return mengineOn;
    }

    public static int getCountCreated() {
        return sCountCreated;
    }
}
