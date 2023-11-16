package com.learn.oops.encapsulation.subclass_package;

import com.learn.oops.encapsulation.Student;

public class StudentDemo2 {

    public static void main(String[] args) {
        Student student = new Student();
//        student.age = 200;
//
//        System.out.println(student.age);

        student.setAge(200);
    }
}
