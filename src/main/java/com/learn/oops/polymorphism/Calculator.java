package com.learn.oops.polymorphism;

public class Calculator {

    //method overloading
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public double add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int output = calculator.add(2, 3); //5
        double output2 = calculator.add(2.4, 4.2); //6.6
        System.out.println(output);
        System.out.println(output2);

        calculator.add(1, 2, 3); //6
    }

}
