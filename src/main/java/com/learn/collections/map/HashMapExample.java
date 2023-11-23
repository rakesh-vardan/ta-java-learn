package com.learn.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        //adding elements/entries
        hashMap.put(100, "Raj");
        hashMap.put(101, "Ram");
        hashMap.put(102, "Raheem");
        hashMap.put(100, "Raj1"); //keys should have unique values

        System.out.println(hashMap);

        //get an element value based on the key
        System.out.println(hashMap.get(100));

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

        //iterate elements
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey()); //give us the key
            System.out.println(entry.getValue()); //give us the value
        }

        Map<String, String> strMap = new HashMap<>();
        strMap.put("a", "Apple");
        strMap.put("b", "Ball");
        strMap.put("c", "Cat");

        System.out.println(strMap);

        //remove element
        strMap.remove("b"); //removes the second entry which has key as "b"
        System.out.println(strMap);

        strMap.remove("c", "Cat"); //removes the entry which has key as "c" and value as "Cat"
        System.out.println(strMap);

        //insertion order
        Map<Integer, String> fruitMap = new HashMap<>();
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
