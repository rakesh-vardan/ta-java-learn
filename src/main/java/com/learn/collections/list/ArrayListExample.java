package com.learn.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        //List<String> list = new ArrayList(); same as above line, always suggested to use the parent class/interface reference for code reusability

        //adding elements
        list.add("Mango");
        list.add("Banana");
        list.add("Apple");

        System.out.println(list);

        //removing elements from index
        list.remove(0);
        System.out.println(list);

        //get element from the list
        System.out.println(list.get(0));

        //update or modify the list
        list.set(0, "Mango");
        System.out.println(list);

        //append to the list - added to the last
        list.add("Banana");
        System.out.println(list);

        //size of list
        int size = list.size();
        System.out.println(size);

        //last element
        System.out.println(list.get(size - 1));

        //iterating the elements - for-each loop
        System.out.println("iterating the elements - for-each loop");
        for(String name : list) {
            System.out.println(name); //prints all the strings inside the arrayList
        }

        //iterating the elements - simple for loop
        System.out.println("iterating the elements - simple for loop");
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //iterating the elements - using iterator
        System.out.println("iterating the elements - using iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) { //hasNext will return true if element is present
            System.out.println(iterator.next()); //next return the actual element
        }

         /*
        int a = 10; //primitive data type
        Integer a1 = 10; //wrapper class for integer data
         */

        List<Integer> numList = new ArrayList();
        numList.add(2);
        numList.add(3);
        numList.add(1);

        System.out.println(numList); // [2, 3, 1]
        Collections.sort(numList); //predefined class in the collections framework
        System.out.println(numList); // [1, 2, 3]

    }
}
