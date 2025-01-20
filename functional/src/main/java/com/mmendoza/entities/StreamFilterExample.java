package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {
    public static void main(String[] args) {

        /* The filter method receives a lambda expression of Predicate type.
           It is an intermediate operation used for filtering data based on a condition.
        */

        // Example 1: Filter even numbers from a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 5, 6, 7, 10, 12, 19);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Print each even number
        evenNumbers.forEach(System.out::println); // Output: 2, 6, 10, 12

        // Example 2: Filter names with length > 3 that contain the letter 'M'
        List<String> names = Arrays.asList("Matias", "Juan", "Pedro", "Lucas", "Martin", "Max");
        List<String> namesWithM = names.stream()
                .filter(n -> n.length() > 3 && n.contains("M"))
                .collect(Collectors.toList());

        // Print each name that satisfies the condition
        namesWithM.forEach(System.out::println); // Output: Matias, Martin
    }
}