package com.learn.home_tasks.solutions.task10;

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }
}