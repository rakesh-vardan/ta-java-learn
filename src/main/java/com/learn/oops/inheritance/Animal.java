package com.learn.oops.inheritance;

public class Animal {

    //instance variable
    String name;

    //default constructor
    public Animal() {
    }

    //parameterized constructor
    public Animal(String name) {
        this.name = name;
    }

    //method
    public void eat() {
        System.out.println("Animal is eating");
    }

}
