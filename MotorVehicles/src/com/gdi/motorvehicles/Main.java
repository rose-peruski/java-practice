package com.gdi.motorvehicles;

public class Main {

    public static void main(String[] args) {
       Car myCar = new Car();
        myCar.switchengineState();
        System.out.println("My current speed is: " + myCar.getCurrentSpeed());
        myCar.accelerate(80);
        System.out.println("My current speed is: " + myCar.getCurrentSpeed());
        myCar.decelerate(50);
        System.out.println("My current speed is: " + myCar.getCurrentSpeed());
        myCar.printDescription();
        System.out.println("There are " + MotorVehicle.getCountCreated() + " car(s) on the road.");
        System.out.println("Is the trunk open? " + myCar.gettrunkOpen());
        System.out.println("How many doors? " + myCar.getnumDoors());
        myCar.printDescription();


    }


}
