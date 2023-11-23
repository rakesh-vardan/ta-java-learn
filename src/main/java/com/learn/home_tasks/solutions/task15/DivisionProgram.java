package com.learn.home_tasks.solutions.task15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

            scanner.close();
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

