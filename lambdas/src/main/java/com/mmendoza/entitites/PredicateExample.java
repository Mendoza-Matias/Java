package com.mmendoza.entitites; // Corrected package name

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        // Define a Predicate that checks if a string contains the letter 'a'
        Predicate<String> containsA = str -> str.contains("a");

        // Test the Predicate with a specific string and print the result
        System.out.println(containsA.test("Automobile")); // Output: true
    }
}