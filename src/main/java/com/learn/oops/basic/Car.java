package com.learn.oops.basic;

public class Car {

    String make;
    String model;

    void start() {
        System.out.println("Car is starting");
    }

    void stop() {
        System.out.println("Car is stopping");
    }

    public static void main(String[] args) {
        Car carObject1 = new Car();
        carObject1.make = "Toyota";
        carObject1.model = "Camry";

        carObject1.start();
        carObject1.stop();

        Car carObject2 = new Car();
        carObject2.make = "Ford";
        carObject2.model = "Mustang";

        carObject2.start();
        carObject2.stop();

    }

}
