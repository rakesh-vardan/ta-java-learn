package com.learn.home_tasks.solutions.task22;

import java.io.IOException;

public class ExceptionChainingExample {
    public static void main(String[] args) {
        try {
            processFile("nonexistent.txt");
        } catch (CustomFileException e) {
            System.out.println("CustomFileException caught: " + e.getMessage());
            if (e.getCause() != null) {
                System.out.println("Original cause: " + e.getCause().getMessage());
            }
        }
    }

    static void processFile(String fileName) throws CustomFileException {
        try {
            readFile(fileName);
        } catch (IOException e) {
            throw new CustomFileException("Error processing file: " + fileName, e);
        }
    }

    static void readFile(String fileName) throws IOException {
        // Simulating an IOException
        throw new IOException("IOException while reading file: " + fileName);
    }
}

