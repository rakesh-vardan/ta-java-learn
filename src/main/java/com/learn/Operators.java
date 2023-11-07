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
        4. Less than (<)
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
        - Logical AND (&&)
        - Logical OR (||)
        - Logical NOT (!)
         */
        System.out.println("Logical AND examples: ");
        System.out.println( (5 > 3) && (5 > 2)); //true AND true --> true
        System.out.println( (3 > 8) && (5 > 1)); //false AND true --> false
        System.out.println( (8 > 3) && (1 > 2)); //true AND false --> false
        System.out.println( (1 > 3) && (1 > 2)); //false AND false --> false

        System.out.println("Logical OR examples: ");
        System.out.println( (5 > 3) || (5 > 2)); //true AND true --> true
        System.out.println( (3 > 8) || (5 > 1)); //false AND true --> true
        System.out.println( (8 > 3) || (1 > 2)); //true AND false --> true
        System.out.println( (1 > 3) || (1 > 2)); //false AND false --> false

        System.out.println("Logical NOT examples: ");
        System.out.println(!(5 > 3));

        /*
        Assignment Operators:
        --> used to assign values to the variables
        1. =
        2. +=
        3. -=
        4. *=
        5. /=
        6. %=
         */
        int a = 10;
        int b = 4;

        System.out.println("Value of a is: " +a);
        System.out.println("Value of b is:" +b);

        a = a + b;
        System.out.println("Value of a+b: " + a); // 14
        a = 10;
        System.out.println("Value of a+=b: " + (a+=b)); // 14

        a = 10;
        System.out.println("Value of a-=b: " + (a-=b)); // 6

        a = 10;
        System.out.println("Value of a*=b: " + (a*=b)); // 40

        a = 10;
        System.out.println("Value of a/=b: " + (a/=b)); // 2

        a = 10;
        System.out.println("Value of a%=b: " + (a%=b)); // 2

        /*
        Unary, Increment & Decrement Operators
        1. Unary Plus (+)
        2. Unary Minus (-)
        3. Increment (++)
        4. Decrement (--)
         */
        System.out.println("Unary Plus: " + (+2) + (+3)); //5
        System.out.println("Unary Minus: " + (+2) + (-3)); //-1

        int num = 2;
        //Post-increment operator
        System.out.println(num++); //2
        System.out.println(num); //3

        num = 2;
        //Pre-increment operator
        System.out.println(++num); //3
        System.out.println(num); //3

        num = 2;
        //Post-decrement operator
        System.out.println(num--); //2
        System.out.println(num); //1

        num = 2;
        //Pre-decrement operator
        System.out.println(--num); //1
        System.out.println(num); //1


        /*
        Bitwise Operators:
        --> used to perform operations on individual bits
        1. Bitwise complement (~)
        2. Left shift (<<)
        3. Right shift (>>)
        4. Unsigned right shift (>>>)
        5. Bitwise AND (&)
        6. Bitwise OR (|)
        7. Bitwise Exclusive OR - XOR (^)
         */

        /*
        Instance Of Operator
        --> used to check if the given object is instance of a particular class or not
         */
        String name = "Rakesh";
        System.out.println(name instanceof String); //true

        /*
        Ternary Operator
        - can be used instead of an if/else statement
         */
        int marks = 40;
        String output = (marks > 35) ? "PASS": "FAIL";
        System.out.println(output);

        //Operator Precedence
        int myInt = 12 - 4 * 2; //BODMAS
        System.out.println(myInt);

    }

}
