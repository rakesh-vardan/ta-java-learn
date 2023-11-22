package com.learn.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;


public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        //adding elements
        linkedHashSet.add("One");
        linkedHashSet.add("Two");
        linkedHashSet.add("Three");
        linkedHashSet.add("Four");
        linkedHashSet.add("Five");
        linkedHashSet.add("One");

        System.out.println("LinkedHashset");
        System.out.println(linkedHashSet);

        for(String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
