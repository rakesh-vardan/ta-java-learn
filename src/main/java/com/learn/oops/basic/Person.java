package com.learn.oops.basic;

public class Person {

    //state/data/variables
    String name;
    int age;

    //behavior/methods
    void speak() {
        System.out.println("Person is speaking");
    }

    public static void main(String[] args) {
        //object creation
        Person personObject = new Person();
        personObject.speak();

        personObject.name = "Rakesh";
        personObject.age = 31;

        System.out.println(personObject.name);
        System.out.println(personObject.age);

        //2nd object
        Person personObject2 = new Person();
        personObject2.speak();
    }
}
