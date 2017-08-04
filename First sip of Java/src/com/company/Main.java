package com.company;

public class Main {

    public static void main(String[] args) {
	    //System.out.println("Hello, Ann Arbor");

        int numberOfPassengers;
        int maxNumberofPassengers = 2;
        boolean isFull = false;
        int currentSpeed=0;
        boolean hasSpace;

        numberOfPassengers = 1;
        maxNumberofPassengers = maxNumberofPassengers + 3;
        numberOfPassengers++;

        System.out.println("Number of Passengers: " + numberOfPassengers);

        currentSpeed += 20;
        System.out.println("Current speed: " + currentSpeed);

        currentSpeed = currentSpeed/2;
        System.out.println("Current speed: " + currentSpeed);

        currentSpeed = currentSpeed * 3;
        System.out.println("Current speed: " + currentSpeed);

        isFull = (numberOfPassengers == maxNumberofPassengers);
        System.out.println("The car is Full: " + isFull);

        hasSpace = (numberOfPassengers < maxNumberofPassengers);
        System.out.println("The car has space: " + hasSpace);

        boolean dangerToSelfOnly = numberOfPassengers == 1 && currentSpeed > 55;
        System.out.println("I'm only endangering myself: " + dangerToSelfOnly);

        if (numberOfPassengers < maxNumberofPassengers) {
            System.out.println("Wanna lift?");
        } else if (numberOfPassengers == maxNumberofPassengers -1) {
            System.out.println("Room for one more!");
        } else {
            System.out.println("Call a cab!");
        }

        switch (numberOfPassengers) {
            case 1:
                System.out.println("I love driving by myself!");
                break;
            case 2:
                System.out.println("They always call shotgun");
                break;
            case 3:
                System.out.println("Third Wheel");
                break;
            case 4:
                System.out.println("Full House");
                break;
            default:
                System.out.println("Over the top!");
        }

        for (int mySpeed = 0; mySpeed < 55; mySpeed += 10) {
            System.out.println("I'm going " + mySpeed + "mph!");
        }

        String name = "Rose";
        System.out.println("My name in all caps, so it is yelling: " + name.toUpperCase());

    }
}
