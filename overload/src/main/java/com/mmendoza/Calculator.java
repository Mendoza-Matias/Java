package com.mmendoza;

public class Calculator {

    /* do not instantiate */
    private Calculator() {

    }

    public static int sum(int numA, int numB) {
        return numA + numB;
    }

    public static float sum(float numA, float numB) {
        return numA + numB;
    }

    public static float sum(int numA, float numB) {
        return numA + numB;
    }

    public static float sum(float numA, int numB) {
        return numA + numB;
    }

    public static int sum(String numA, String numB) {
        int result;
        try {
            result = Integer.parseInt(numA) + Integer.parseInt(numB);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }

    /* more than one argument | the type of argument is array */
    public static int sum(int... argument) {
        int total = 0;
        for (int num : argument) {
            total += num;
        }
        return total;
    }

    public static float sum(float a, int... argument) {
        float total = 0;
        for (int num : argument) {
            total += num;
        }
        return a + total;
    }
}
