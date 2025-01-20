package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctExample {
    public static void main(String[] args) {

        // Example 1: Remove duplicates from a list of integers
        List<Integer> list = Arrays.asList(1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 10, 10, 10, 10, 20);

        // Print distinct numbers
        list.stream()
                .distinct()
                .forEach(System.out::println); // Output: 1, 2, 3, 4, 5, 6, 10, 20

        // Example 2: Get distinct even numbers and collect them into a new list
        List<Integer> listParDistinct = list.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Print distinct even numbers
        listParDistinct.forEach(System.out::println); // Output: 2, 4, 6, 10, 20
    }
}