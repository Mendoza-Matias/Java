package com.mmendoza.generic_constructor_example.entities;

public class SumN {

    private int sum;

    // Generic constructor with a limit of type Number
    // The constructor accepts a parameter of type T that extends Number
    public <T extends Number> SumN(T sum) {
        this.sum = 0;

        // Iterate from 0 to the integer value of the sum parameter
        for (int i = 0; i <= sum.intValue(); i++) {
            this.sum += i; // Add each value to the sum
        }
    }

    // Getter method to return the calculated sum
    public int getSum() {
        return sum;
    }
}
