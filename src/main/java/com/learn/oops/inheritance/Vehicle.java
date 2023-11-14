package com.learn.oops.inheritance;

public class Vehicle {

    String make;
    String model;

    public Vehicle() {
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

}
