package com.learn.control_flow.looping;

import java.util.Scanner;

public class ForExample2 {

    public static void main(String[] args) {

        //Generate the factorial of a given number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        int number = sc.nextInt();
        long factorial = 1;

        if(number < 0) {
            System.out.println("Factorial is not applicable for negative numbers");
        }
        else {
            for(int i = 1; i <= number; i++) {
//            factorial *= i;
                factorial = factorial * i;
            }

            System.out.println("Factorial of " +number+ " is: "+ factorial);
        }
        sc.close();
    }
}
