package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamOperatorExample {
    public static void main(String[] args) {

        // Example 1: Count the total number of elements in a stream
        Stream<Integer> num = Stream.of(1, 2);
        long total = num.count(); // Output: 2

        // Example 2: Find the maximum and minimum values in a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3);

        Optional<Integer> max = numbers.stream().max(Integer::compareTo); // Maximum value
        Optional<Integer> min = numbers.stream().min(Integer::compareTo); // Minimum value

        // Print the total count
        System.out.println(total); // Output: 2

        // Print the minimum value if present
        if (min.isPresent()) {
            System.out.println(min.get()); // Output: 1
        } else {
            System.out.println("No minimum value found.");
        }

        // Print the maximum value if present
        if (max.isPresent()) {
            System.out.println(max.get()); // Output: 3
        } else {
            System.out.println("No maximum value found.");
        }
    }
}