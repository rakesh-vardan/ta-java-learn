package com.learn.home_tasks.solutions.task3;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the scale (C for Celsius, F for Fahrenheit): ");
        char scale = scanner.next().charAt(0);

        if (scale == 'C' || scale == 'c') {
            double fahrenheit = (temperature * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (scale == 'F' || scale == 'f') {
            double celsius = (temperature - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid scale. Please enter C or F.");
        }

        scanner.close();
    }
}

