package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {
    public static void main(String[] args) {

        // Example: Sum all numbers in a list using the reduce method
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Reduce operation: Start with 0 as the initial value, then sum each element in the stream
        int result = nums.stream()
                .reduce(0, (numOne, numTwo) -> numOne + numTwo);

        // Explanation of the process:
        // Initial value: 0
        // Step 1: 0 + 1 = 1
        // Step 2: 1 + 2 = 3
        // Step 3: 3 + 3 = 6
        // ...
        // Final Result: Sum of all elements in the list

        System.out.println(result); // Output: 55
    }
}
