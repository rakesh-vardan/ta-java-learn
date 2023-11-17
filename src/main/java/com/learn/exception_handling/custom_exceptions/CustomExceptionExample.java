package com.learn.exception_handling.custom_exceptions;

public class CustomExceptionExample {
    public static void main(String[] args) {

        try {
            validate(12);
        } catch (InvalidAgeException ex) {
            System.out.println("InvalidAgeException caught:" + ex.getMessage());
        }
    }

    public static void validate(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }
}
