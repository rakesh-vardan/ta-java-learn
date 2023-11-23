package com.learn.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        //insertion order
        Map<Integer, String> fruitMap = new LinkedHashMap<>();
        fruitMap.put(1, "Mango");
        fruitMap.put(3, "Banana");
        fruitMap.put(4, "Apple");
        fruitMap.put(2, "Grapes");

        System.out.println("Iterating the fruitMap");

        for(Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

    }
}
