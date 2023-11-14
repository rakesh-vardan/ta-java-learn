package com.learn.oops.inheritance;

public class Car extends Vehicle {

    int numberOfGears;

    public Car() {
    }

    public Car(String make, String model, int numberOfGears) {
        super(make, model);
        this.numberOfGears = numberOfGears;
    }

    public void changingGears() {
        System.out.println("Changing gear of the car");
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("Ford", "Mustang", 4);

        car.start();
        car.changingGears();
        car.stop();

        car1.start();
        car1.changingGears();
        car1.stop();
    }

}
