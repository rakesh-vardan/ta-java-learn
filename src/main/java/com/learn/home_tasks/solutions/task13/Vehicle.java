package com.learn.home_tasks.solutions.task13;

public abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();
}
