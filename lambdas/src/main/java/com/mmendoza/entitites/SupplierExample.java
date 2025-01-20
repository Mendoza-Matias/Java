package com.mmendoza.entitites; // Corrected package name

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        // Define a Supplier that generates and returns a random double value
        Supplier<Double> randomValue = () -> Math.random();

        // Call the Supplier's get method to retrieve the value and print it
        System.out.println(randomValue.get()); // Example Output: 0.123456789
    }
}