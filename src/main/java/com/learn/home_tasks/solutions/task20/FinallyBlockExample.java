package com.learn.home_tasks.solutions.task20;

public class FinallyBlockExample {
    public static void main(String[] args) {
        try {
            divide(10, 2);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in divide method: " + e.getMessage());
            throw e;
        } finally {
            System.out.println("Finally block in divide method executed");
        }
    }
}
