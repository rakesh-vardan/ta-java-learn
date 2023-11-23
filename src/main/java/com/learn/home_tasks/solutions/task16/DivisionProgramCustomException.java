package com.learn.home_tasks.solutions.task16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgramCustomException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            validateInput(denominator);

            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

            scanner.close();
        } catch (InvalidInputException | ArithmeticException | InputMismatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void validateInput(int denominator) throws InvalidInputException {
        if (denominator == 0) {
            throw new InvalidInputException("Denominator cannot be zero.");
        }
    }

    static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
