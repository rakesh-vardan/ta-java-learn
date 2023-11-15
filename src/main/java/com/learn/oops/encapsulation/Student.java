package com.learn.oops.encapsulation;

public class Student {

    private String name;
    private int age;

    public Student() {}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //getter method for name
    public String getName() {
        return name;
    }

    //getter method for age
    public int getAge() {
        return age;
    }

    //setter for name
    public void setName(String name) {
        this.name = name;
    }

    //setter for age
    public void setAge(int age) {
        if(age >=0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        }
    }
}
