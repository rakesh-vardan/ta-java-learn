package com.learn.home_tasks.solutions.task9;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;

        System.out.print("Prime factorization of " + originalNumber + ": ");

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i);
                number /= i;
                if (number != 1) {
                    System.out.print(" * ");
                }
            }
        }

        scanner.close();
    }
}

