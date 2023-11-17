package com.learn.exception_handling;

public class ExceptionHandlingExample2 {
    public static void main(String[] args) {

        try{
            int[] arr = {1, 3, 5, 7};
            System.out.println(arr[4]);
            System.out.println("Statement after risky line");
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Exception occurred: "+ exception.getLocalizedMessage());
        }

        System.out.println("Rest of code");
    }
}
