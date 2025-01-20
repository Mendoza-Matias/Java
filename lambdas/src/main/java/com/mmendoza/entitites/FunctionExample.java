package com.mmendoza.entitites; // Corrected package name

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        // Define a Function that takes a String as input and returns its length
        // <Input, Output>
        Function<String, Integer> getLength = str -> str.length();

        // Call the Function with a specific string and print the result
        System.out.println(getLength.apply("Hello")); // Output: 5
    }
}