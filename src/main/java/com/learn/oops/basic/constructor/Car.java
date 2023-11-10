package com.learn.oops.basic.constructor;

public class Car {

    String make;
    String model;

    //default constructor
    public Car() {

    }

    //parameterized constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String make) {

    }


    void start() {
        System.out.println("Car with make: "+make+" and model: "+model+" is starting");
    }

    void stop() {
        System.out.println("Car with make: "+make+" and model: "+model+" is stopping");
    }

    public static void main(String[] args) {
        Car toyotaCar = new Car("Toyota", "Camry");
        System.out.println(toyotaCar.make);
        System.out.println(toyotaCar.model);

        /*Car toyotaCar1 = new Car();
        toyotaCar1.make = "Toyota";
        toyotaCar1.model = "Camry";*/

        toyotaCar.start();
        toyotaCar.stop();

        Car fordCar = new Car("Ford", "Mustang");
        System.out.println(fordCar.make);
        System.out.println(fordCar.model);

        fordCar.start();
        fordCar.stop();

    }
}
