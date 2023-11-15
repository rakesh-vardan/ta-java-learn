package com.learn.oops.abstraction;

public abstract class Shape {

    String color;

    public Shape(String color) {
        this.color = color;
    }

    //concrete method - it has implementation defined inside
    public String getColor() {
        return color;
    }

    //abstract method which needs implementation by the child classes
    public abstract double calculateArea();
}
