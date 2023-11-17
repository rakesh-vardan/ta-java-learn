package com.learn.exception_handling;


public class MultipleExceptionHandling {
    public static void main(String[] args) {
        try {
            int[] a = new int[5];
            a[5] = 30/0; //ArithmeticException
            a[10] = 20; //ArrayIndexOutOfBoundsException
        } catch (ArithmeticException ex) {
            System.out.println("Arithmetic exception occurs: " + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " +ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex.getMessage());
        }

        System.out.println("Rest of the code");
    }
}
