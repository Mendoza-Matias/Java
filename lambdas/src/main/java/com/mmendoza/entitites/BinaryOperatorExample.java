package com.mmendoza.entitites; // Corrected package name

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Define a BinaryOperator that calculates the product of two integers
        BinaryOperator<Integer> multiply = (num1, num2) -> num1 * num2;

        // Apply the BinaryOperator and print the result
        System.out.println(multiply.apply(3, 4)); // Output: 12
    }
}
