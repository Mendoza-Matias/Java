package com.mmendoza.entitites; // Corrected package name

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        // Define a Consumer that takes a String and prints it to the console
        Consumer<String> printMessage = message -> System.out.println(message);

        // Call the Consumer with a specific string
        printMessage.accept("Hello"); // Output: Hello
    }
}