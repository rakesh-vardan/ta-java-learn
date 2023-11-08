package com.learn.control_flow.decision_making;

import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day-number from 1-7: ");

        int dayNumber = sc.nextInt();
        String day;

        switch (dayNumber) {
            case 1:
                day = "Monday";
                break;

            case 2:
                day = "Tuesday";
                break;

            case 3:
                day = "Wednesday";
                break;

            case 4:
                day = "Thursday";
                break;

            case 5:
                day = "Friday";
                break;

            case 6:
                day = "Saturday";
                break;

            case 7:
                day = "Sunday";
                break;

            default:
                day = "Invalid input, enter any number between 1 to 7 only";
                break;
        }

        System.out.println("The day of the week is: " +day);
        sc.close();

    }
}
