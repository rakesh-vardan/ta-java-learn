package com.learn.oops.keywords;

public class StaticExample {
    // Static variable (class variable)
    static int staticVariable = 0;

    // Instance variable
    int instanceVariable;

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
        // Static methods can only directly access other static members
        System.out.println("Static variable: " + staticVariable);
        // Instance variables must be accessed through an object reference
//         System.out.println("Instance variable: " + instanceVariable); // This would result in a compilation error
    }

    // Instance method
    void instanceMethod() {
        System.out.println("This is an instance method.");
        // Both static and instance variables can be accessed in instance methods
        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        // Accessing static members directly using the class name
        System.out.println("Static variable in main: " + StaticExample.staticVariable);
        StaticExample.staticMethod();

        // Creating an instance of the class
        StaticExample instance1 = new StaticExample();
        // Modifying instance variables
        instance1.instanceVariable = 5;

        // Accessing static members through an instance (not recommended)
        System.out.println("Static variable through instance: " + instance1.staticVariable);
        instance1.staticMethod(); // This works, but it's not recommended

        // Accessing instance members
        System.out.println("Instance variable: " + instance1.instanceVariable);
        instance1.instanceMethod();

        // Creating another instance
        StaticExample instance2 = new StaticExample();
        // Instance variable is separate for each instance
        instance2.instanceVariable = 10;

        // Static variable is shared among all instances
        System.out.println("Static variable through instance2: " + instance2.staticVariable);

        // Static method can still be called through the class name
        StaticExample.staticMethod();
    }
}
