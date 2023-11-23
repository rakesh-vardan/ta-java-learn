package com.learn.home_tasks.solutions.task13;

public class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Motorcycle started");
    }
}
