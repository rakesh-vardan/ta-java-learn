package com.learn.keywords;

public class StaticExample2 {

    static int num = 10;

    public static void main(String[] args) {

        System.out.println(num);
        num = 20;
        System.out.println(num); //modified value of num
    }
}
