package com.mmendoza.entitites; // Corrected package name

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        // Define a BiPredicate that compares the lengths of two strings
        BiPredicate<String, String> isFirstLonger = (str1, str2) -> str1.length() > str2.length();

        // Test the BiPredicate with specific strings and print the result
        System.out.println(isFirstLonger.test("automobile", "car")); // Output: true
    }
}
