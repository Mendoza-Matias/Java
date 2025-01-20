package com.mmendoza.entitites; // Corrected package name

import java.util.function.BiFunction;

public class BiFunctionExample { // Renamed class for better readability
    public static void main(String[] args) {
        // Define a BiFunction that takes two Integers as input and returns their sum
        BiFunction<Integer, Integer, Integer> biFunction = (num1, num2) -> num1 + num2;

        // Apply the BiFunction with specific values and print the result
        System.out.println(biFunction.apply(1, 2)); // Output: 3
    }
}