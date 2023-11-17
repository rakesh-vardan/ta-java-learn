package com.learn.exception_handling;

public class FinallyBlockExample {
    public static void main(String[] args) {

        try {
            //below code works fine, don't give any exception
          int data = 25 / 5;
          System.out.println(data);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
        //regardless of exception occurred or not, this block would be executed
        finally {
            System.out.println("Finally block is always executed");
        }

        System.out.println("Rest Of code");
    }
}
