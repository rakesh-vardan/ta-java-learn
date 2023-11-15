package com.learn.oops.encapsulation;

public class StudentDemo {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.setName("Rakesh");
        student1.setAge(30);

        student2.setName("Test");
        student2.setAge(10);

        //student1
        System.out.println(student1.getName());
        System.out.println(student1.getAge());

        //student2
        System.out.println(student2.getName());
        System.out.println(student2.getAge());

    }
}
