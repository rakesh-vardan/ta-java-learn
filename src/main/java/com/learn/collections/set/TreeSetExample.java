package com.learn.collections.set;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        //adding elements
        treeSet.add("Raj");
        treeSet.add("Ram");
        treeSet.add("Raheem");

        treeSet.add("c");
        treeSet.add("a");
        treeSet.add("d");

        System.out.println("TreeSet");
        System.out.println(treeSet);

    }
}
