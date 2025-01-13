package com.mmendoza;

public class Accumulator implements Modification {

    private Integer value;  // Private field to hold the accumulated value

    // Default constructor
    public Accumulator() {
    }

    // Constructor to initialize with a specific value
    public Accumulator(Integer value) {
        this.value = value;
    }

    // Getter method to retrieve the current value
    public Integer getValue() {
        return value;
    }

    // Implements the increment method from the Modification interface
    @Override
    public void increment(Integer a) {
        this.value += a;  // Increment the current value by the specified amount 'a'
    }
}
