package com.learn.exception_handling;

public class ThrowExample {
    public static void main(String[] args) {
        validate(12);
    }

    public static void validate(int age) {
        if(age < 18) {
            throw new ArithmeticException("Not eligible to vote");
//            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
