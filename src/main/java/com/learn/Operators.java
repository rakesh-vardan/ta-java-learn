package com.learn;

public class Operators {

    public static void main(String[] args) {

        //operators are symbols that perform operations on variables & values

        /*
        Arithmetic Operators:
        - used to perform arithmetic operations on variables & data

        1. addition (+)
        2. subtraction (-)
        3. multiplication (*)
        4. division (/)
        5. modulus (%)
         */

        int num1 = 10;
        int num2 = 5;
        System.out.println(num1);
        System.out.println(num2);

        int sum = num1 + num2; //addition
        System.out.println("num1 + num2 = " + sum); //15

        int difference = num1 - num2; //subtraction
        System.out.println("num1 - num2 = " + difference); //5

        int multiply = num1 * num2; //multiplication
        System.out.println("num1 * num2 = " + multiply); //50

        int division = num1 / num2; //division
        System.out.println("num1 / num2 = " + division); //2

        int remainder = num1 % num2; //modulus
        System.out.println("num1 % num2 = " + remainder); //0


        /*
        Relational Operators:
        --> used in decision-making & loops
        1. Equal to (==)
        2. Not Equal to (!=)
        3. Greater than (>)
        4. Less than (>)
        5. Greater than equal to (>=)
        6. Less than equal to (<=)
         */
        System.out.println("Is num1 == num2? " + (num1 == num2)); //false
        System.out.println("Is num1 != num2? " + (num1 != num2)); //true
        System.out.println("Is num1 > num2? " + (num1 > num2)); //true
        System.out.println("Is num1 < num2? " + (num1 < num2)); //false
        System.out.println("Is num1 >= num2? " + (num1 >= num2)); //true
        System.out.println("Is num1 <= num2? " + (num1 <= num2)); //false

        /*
        Logical Operators:
         */

        /*
        Assignment Operators:
         */



    }

}
