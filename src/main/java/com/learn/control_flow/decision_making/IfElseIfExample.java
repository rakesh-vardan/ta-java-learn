package com.learn.control_flow.decision_making;

import sun.security.jgss.GSSCaller;

import java.util.Scanner;

public class IfElseIfExample {

    public static void main(String[] args) {

        //get the user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score: ");

        //read the value into a variable
        int marks = sc.nextInt();
        char grade;

        //implement the logic using if-else-if

        if(marks >= 90) {
            grade = 'A';
        } else if(marks < 90 && marks >=80) {
            grade = 'B';
        } else if(marks < 80 && marks >=70) {
            grade = 'C';
        } else if(marks < 70 && marks >=60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        System.out.println("Grade of the student is: " +grade);
        sc.close();
    }
}
