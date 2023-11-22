package com.learn.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        //adding elements
        list.add("Raj");
        list.add("Ram");
        list.add("Raheem");
        list.add("Raj");

        System.out.println(list);

        //iterating the elements
        System.out.println("Iterating with for-each loop");
        for(String name : list) {
            System.out.println(name);
        }

        //iterating the elements with iterator
        System.out.println("Iterating with the iterator");
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //get the first element
        System.out.println(list.get(0));

        //get the last element
        int size = list.size();
        System.out.println(list.get(size - 1));

        //update element
        System.out.println("Updated list");
        list.set(2, "Rakesh");
        System.out.println(list);

        //add another list
        List<String> list2 = new LinkedList<>();
        list2.add("Sekhar");
        list2.add("Somu");

        list.addAll(list2);
        System.out.println(list);

        //remove
        list.remove(4);
        System.out.println(list);

        list.remove("Rakesh");
        System.out.println(list);

    }

}
