package com.learn.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        List<String> list = new ArrayList<>();

        //adding elements
        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("One");

        //adding elements
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("One");
        System.out.println("Hashset");
        System.out.println(hashSet);

        System.out.println("ArrayList");
        System.out.println(list);

        for(String s : hashSet) {
            System.out.println(s);
        }
    }
}
