package com.mmendoza;

public class Main {
    public static void main(String[] args) {

        // Create an Accumulator object with an initial value of 25
        Accumulator acc = new Accumulator(25);

        // Print the current value of the accumulator (should be 25)
        System.out.println(acc.getValue()); // 25

        // Increment the value of the accumulator by 10
        acc.increment(10);

        // Print the updated value of the accumulator (should be 35)
        System.out.println(acc.getValue()); // 35
    }
}
