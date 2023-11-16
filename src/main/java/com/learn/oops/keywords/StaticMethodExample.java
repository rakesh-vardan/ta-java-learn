package com.learn.oops.keywords;

public class StaticMethodExample {
    public static void main(String[] args) {
        // Calling a static method without creating an instance of the class
        int result = MathUtil.add(5, 3); //8
        System.out.println("Result of addition: " + result);
        //without any return
        MathUtil.add2(5, 3); //8

        // Creating instances of the class to call non-static method
        MathUtil mathUtilInstance = new MathUtil();
        int product = mathUtilInstance.multiply(4, 6);
        System.out.println("Result of multiplication: " + product);
    }
}

class MathUtil {
    // Static method for addition
    static int add(int a, int b) {
        return a + b;
    }

    static void add2(int a, int b) {
        System.out.println(a + b);
    }
    // Non-static method for multiplication
    int multiply(int a, int b) {
        return a * b;
    }
}
