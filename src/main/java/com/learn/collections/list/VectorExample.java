package com.learn.collections.list;

import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<String> vector = new Vector<>();
        vector.add("Raj");
        vector.add("Ram");
        vector.add("Raheem");

        System.out.println(vector);

        for(String name : vector) {
            System.out.println(name);
        }
    }
}
