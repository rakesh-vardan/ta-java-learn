package com.learn.exception_handling;

public class FinallyBlockExample2 {
    public static void main(String[] args) {

        try {
            //gives an exception
          int data = 25 / 0;
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
