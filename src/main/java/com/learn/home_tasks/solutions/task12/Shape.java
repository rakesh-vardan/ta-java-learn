package com.learn.home_tasks.solutions.task12;

public class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    double getArea() {
        return 0.0; // Base implementation, to be overridden
    }

    void displayInfo() {
        System.out.println("This is a shape");
    }
}