package com.learn.home_tasks.solutions.task11;

class Rectangle extends Shape implements Drawable {
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

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}