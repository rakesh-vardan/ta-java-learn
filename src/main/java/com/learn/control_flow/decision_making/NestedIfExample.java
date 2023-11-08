package com.learn.control_flow.decision_making;

import java.util.Scanner;

public class NestedIfExample {

    public static void main(String[] args) {

        //ask the user for this age
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");

        //read user input and store in a variable
        int age = sc.nextInt();

        //build logic based on the age & other condition
        if(age > 18) {
            //eligible to vote
            System.out.println("Are you a citizen (yes/no)? ");
            String isCitizen = sc.next();

            if(isCitizen.equalsIgnoreCase("yes")) {
                System.out.println("Hurray! You are eligible to vote");
            } else {
                System.out.println("Sorry, only citizens are allowed to vote!");
            }

        } else {
            //not eligible to vote
            System.out.println("Sorry, you are not allowed to vote:(");
        }

    }

}
