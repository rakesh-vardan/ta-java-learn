package com.learn.exception_handling;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsExample {

    public static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return simpleDateFormat.parse(dateString);
    }

    public static void main(String[] args) {
        try {
            String dateString = "2023-11-17";
//            String dateString = "20211-17";
            Date parsedDate = parseDate(dateString);
            System.out.println("Parsed date: " + parsedDate);
        } catch (ParseException ex) {
            System.out.println("Parsed exception: " + ex.getMessage());
        }
    }
}
