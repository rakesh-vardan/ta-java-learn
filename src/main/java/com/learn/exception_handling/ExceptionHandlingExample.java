package com.learn.exception_handling;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(4, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) {
            System.out.println("An exception occurred: " + exception.getMessage());
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
