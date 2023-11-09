package com.learn.control_flow.looping;

public class ForExample {

    public static void main(String[] args) {

        //print the numbers from 1-10 to the console

        /*System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        .....*/

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //another example
        String[] genders = {"male", "female", "other"};

        for(int i = 0; i < genders.length; i++) {
            System.out.println(genders[i]);
        }
    }
}
