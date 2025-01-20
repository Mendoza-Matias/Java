package com.mmendoza.entitites; // Corrected package name

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        // Define a UnaryOperator that multiplies an integer by 2
        UnaryOperator<Integer> multiplyByTwo = number -> number * 2;

        // Apply the UnaryOperator to a specific integer and store the result
        Integer result = multiplyByTwo.apply(6);

        // Print the result
        System.out.println(result); // Output: 12
    }
}
