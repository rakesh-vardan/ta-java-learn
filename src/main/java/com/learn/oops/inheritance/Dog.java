package com.learn.oops.inheritance;

public class Dog extends Animal {

    String breed;

    public Dog() {
    }

    public Dog(String breed, String name) {
        super(name);
        this.breed = breed;
    }

    public void walk() {
        System.out.println(super.name + " with breed "+ this.breed+" is walking");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("labrador", "Charlie"); //new object for Dog
        dog.walk(); //invoking the method from child class

        dog.eat(); //method from parent class
    }

}
