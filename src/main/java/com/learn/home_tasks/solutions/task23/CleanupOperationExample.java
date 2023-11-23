package com.learn.home_tasks.solutions.task23;

import java.io.Closeable;
import java.io.IOException;

public class CleanupOperationExample {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.doSomething();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}

class Resource implements Closeable {
    void doSomething() throws IOException {
        // Simulate some resource operation
        System.out.println("Doing something with the resource");
        throw new IOException("IOException during resource operation");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Closing the resource");
        // Cleanup or resource release code goes here
    }
}

