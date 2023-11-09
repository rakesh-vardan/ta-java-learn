package com.learn.control_flow.looping;

public class EnhancedForExample {

    public static void main(String[] args) {
        String[] names = {"Raja", "Rakesh", "Sekhar"};
        System.out.println("List of names are: ");

        for(String name: names){ //for-each loop
//            System.out.println(name);
            System.out.println(name.toUpperCase());
        }

        System.out.println("=======================");
        for(int i = 0; i < names.length; i++) {
            String name = names[i];
            System.out.println(name.toUpperCase());
        }
    }
}
