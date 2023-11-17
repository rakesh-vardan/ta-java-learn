package com.learn.keywords;

// Parent class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class
class Dog extends Animal {
    String breed;

    // Constructor with two parameters
    Dog(String name, String breed) {
        // Invoking the constructor of the superclass using super
        super(name);
        this.breed = breed;
//        super.name = "";
    }

    // Constructor with one parameter, invoking the two-parameter constructor using this()
    Dog(String name) {
        this(name, "Unknown Breed");
    }

    void bark() {
        System.out.println("Woof! Woof!");
    }

    // Overriding method from the superclass
    @Override
    void makeSound() {
        System.out.println("Bark! Bark!");
    }

    // Example of using this to distinguish instance variables from parameters
    void printDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Breed: " + this.breed);
    }
}

public class ThisSuperExample {
    public static void main(String[] args) {
        // Creating an instance of the Dog class using the two-parameter constructor
        Dog myDog = new Dog("Buddy", "Golden Retriever");

        // Accessing members using this and super
        System.out.println("Name: " + myDog.name);  // Accessing instance variable from the superclass
        System.out.println("Breed: " + myDog.breed); // Accessing instance variable from the subclass

        // Using super to call a method in the superclass
        myDog.makeSound(); // Calls the overridden makeSound method in Dog class

        // Creating an instance of the Dog class using the one-parameter constructor
        Dog anotherDog = new Dog("Max");
        anotherDog.printDetails(); // Prints details using the printDetails method
    }
}
