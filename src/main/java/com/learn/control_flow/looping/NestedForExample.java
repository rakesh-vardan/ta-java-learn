package com.learn.control_flow.looping;

public class NestedForExample {

    public static void main(String[] args) {
        //print the multiplication table

        int tableNum = 10;

        for(int i = 1; i <=tableNum; i++) {
            for(int j = 1; j<= tableNum; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
