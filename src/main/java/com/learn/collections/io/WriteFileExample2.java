package com.learn.collections.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample2 {
    public static void main(String[] args) throws IOException {

        //try-catch-finally block
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter("output.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            String content = "This is a new line that I want to write in new file";
            bufferedWriter.write(content);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedWriter.close();
            fileWriter.close();
        }
    }
}
