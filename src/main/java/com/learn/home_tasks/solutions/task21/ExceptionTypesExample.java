package com.learn.home_tasks.solutions.task21;

public class ExceptionTypesExample {
    public static void main(String[] args) {
        // Checked exception example
        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }

        // Unchecked exception example
        try {
            throwUncheckedException();
        } catch (Exception e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
    }

    static void throwCheckedException() throws Exception {
        throw new Exception("This is a checked exception.");
    }

    static void throwUncheckedException() {
        throw new RuntimeException("This is an unchecked exception.");
    }
}
