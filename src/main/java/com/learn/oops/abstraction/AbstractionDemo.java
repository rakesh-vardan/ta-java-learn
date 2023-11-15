package com.learn.oops.abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5.0);
        Rectangle rectangle = new Rectangle("Blue", 4.0, 6.0);

        //calculate and print the areas of both shapes - accessing the abstract methods
        System.out.println("Circle area is: " + circle.calculateArea());
        System.out.println("Rectangle area is: "+ rectangle.calculateArea());

        //accessing the concrete method
        System.out.println("Circle color: " +circle.getColor());
        System.out.println("Rectangle color: " + rectangle.getColor());

    }
}
