package com.learn.collections.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {
    public static void main(String[] args) {
        //try with resources
        try(FileWriter fileWriter = new FileWriter("output.txt")) {
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String content = "This is a new line that I want to write in new file";
            bufferedWriter.write(content);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
