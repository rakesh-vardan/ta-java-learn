package com.learn.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        //creating a list of books
        List<Book> bookList = new LinkedList<>();

        //creating book objects
        Book book1 = new Book(101, "Let us C", "Yeshwant Kentkar", "Publisher-1", 8);
        Book book2 = new Book(102, "Let's learn Java", "Rakesh V", "Publisher-2", 10);
        Book book3 = new Book(103, "Let's learn Python", "Ramesh K", "Publisher-3", 20);

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        for(Book book : bookList) {
            System.out.println(book);
        }

    }
}
