package com.learn.collections.list;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //check if it's empty or not
        System.out.println(stack.isEmpty());

        stack.push(10);
        stack.push(23);
        stack.push(45);

        System.out.println(stack);

        //check if it's empty or not
        System.out.println(stack.isEmpty());

        //size of stack
        System.out.println(stack.size());

        //pop to remove
        stack.pop();
        System.out.println(stack);

        //peek to view the top-most element
        System.out.println(stack.peek());

        //searching an element
        System.out.println(stack.search(23));
        System.out.println(stack.search(10));

        System.out.println("Traversing the elements");
        for(Integer i : stack) {
            System.out.println(i);
        }

    }
}
