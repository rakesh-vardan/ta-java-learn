package com.learn.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList();

        Student student1 = new Student(1, "Raj"); //object
        Student student2 = new Student(2, "Ram");
        Student student3 = new Student(3, "Raheem");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        for(Student student : studentList) {
            System.out.println(student.toString()); //[1, "Raj"] [2, "Ram] [3, Raheem]
        }
    }
}
