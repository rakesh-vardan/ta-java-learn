package com.learn.home_tasks.solutions.task18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadProgram {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line = reader.readLine();
            System.out.println("Read from file: " + line);
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
