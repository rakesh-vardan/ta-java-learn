package com.learn.home_tasks.solutions.task19;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try {
            outerMethod();
        } catch (CustomException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    static void outerMethod() throws CustomException {
        try {
            innerMethod();
        } catch (CustomException e) {
            System.out.println("Exception caught in outerMethod: " + e.getMessage());
            throw e; // Propagate the exception
        }
    }

    static void innerMethod() throws CustomException {
        throw new CustomException("Custom exception in innerMethod");
    }
}

