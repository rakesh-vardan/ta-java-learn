package com.learn.home_tasks.solutions.task13;

public class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car started");
    }
}
