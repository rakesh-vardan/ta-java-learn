package com.learn;

import java.util.Arrays;

public class DataTypesNonPrimitive {

    public static void main(String[] args) {

        /*
            String
                - is an object that represents a sequence of characters
                - 2 ways to create
                    1. using the string literal
                    2. using the new keyword
                - string constant pool (special memory area)
                - many useful methods are available by default
         */
        String name = "Rakesh Vardan";
        System.out.println(name);

        String value = new String("Hello!");
        System.out.println(value);
        //        u n h a p p y --> str.substring(2)
        //        0 1 2 3 4 5 6 --> happy

        // Rakesh Var d  a n
        // 0123456789 10 11 12
        System.out.println(name.substring(7)); //Vardan


        /*
            Array
            - is a data type (object) which stores multiple homogeneous variables
            - collection of similar type of elements which has contiguous memory location
            - can store only fixed set of elements
            - index based, can access elements based on index
            - first element starts with index 0, second element 1, and so on.
            - can be dimensional & multidimensional
         */

        int marks[] = new int[5]; // --> [] []  [] [] []
                                  // -->  0  1  2  3  4
        marks[0] = 20;            // --> [20][][][][]
        marks[1] = 25;            // --> [20][25][][][]
        marks[2] = 52;            // --> [20][25][52][][]
        marks[3] = 58;            // --> [20][25][52][58][]
        marks[4] = 94;            // --> [20][25][52][58][94]

        System.out.println(Arrays.toString(marks));

        //another example
        int[] numbers = {1, 2, 3, 4, 5};

//        byte[] numbers11 = {100000, 2, 3, 4, 5};

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        //int []numbers1 = {1, 2, 3, 4, 5};

        //another example
        String[] genders = {"male", "female", "other"};
        //String[] g = new String[3];

        System.out.println(Arrays.toString(genders));


        /*
            Class
            - user created data type created by the developer
            - is a blue-print or template for creating objects
            - can have fields (variables) and methods (functions) which describe the attributes and behaviour of the objects created from
         */

        /*
            Object
            - is a variable/instance of the class
            - using this we can access the variables & methods in the class
            - we can create multiple objects from same class, each will have its own data & characteristics
         */

        /*
            Interface
            - is a contract for classes that implement it
            - consists of static constants and abstract methods
            - used to achieve abstraction
         */
    }
}
