package com.learn.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample2 {
    public static void main(String[] args) {

        Map<Integer, Book> bookMap = new LinkedHashMap<>();
        
        //creating book objects
        Book book1 = new Book(101, "Let us C", "Yeshwant Kentkar", "Publisher-1", 8);
        Book book2 = new Book(102, "Let's learn Java", "Rakesh V", "Publisher-2", 10);
        Book book3 = new Book(103, "Let's learn Python", "Ramesh K", "Publisher-3", 20);

        bookMap.put(1, book1);
        bookMap.put(2, book2);
        bookMap.put(3, book3);

        System.out.println("Iterating the elements");

        Set<Map.Entry<Integer, Book>> books = bookMap.entrySet();
        for(Map.Entry<Integer, Book> book : books) {
            int id = book.getKey();
            Book b = book.getValue();
            System.out.println("Book-" +id+ " Details: ");
            System.out.println(b.id +" " + b.name +" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
