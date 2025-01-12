package com.mmendoza;

public class Calculator {

    // Private constructor to prevent instantiation
    // This class is meant to only provide static utility methods
    private Calculator() {

    }

    // Method to sum two integers
    public static int sum(int numA, int numB) {
        return numA + numB;
    }

    // Method to sum two floats
    public static float sum(float numA, float numB) {
        return numA + numB;
    }

    // Method to sum an integer and a float
    public static float sum(int numA, float numB) {
        return numA + numB;
    }

    // Method to sum a float and an integer
    public static float sum(float numA, int numB) {
        return numA + numB;
    }

    // Method to sum two strings that represent integers
    // If the strings cannot be parsed into integers, it returns 0
    public static int sum(String numA, String numB) {
        int result;
        try {
            result = Integer.parseInt(numA) + Integer.parseInt(numB);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    // Method to sum multiple integers using varargs (variable arguments)
    public static int sum(int... argument) {
        int total = 0;
        // Iterates over each integer in the argument array and adds them to the total
        for (int num : argument) {
            total += num;
        }
        return total;
    }

    // Method to sum a float with multiple integers using varargs
    public static float sum(float a, int... argument) {
        float total = 0;
        // Iterates over each integer in the argument array and adds them to the total
        for (int num : argument) {
            total += num;
        }
        return a + total;
    }
}
