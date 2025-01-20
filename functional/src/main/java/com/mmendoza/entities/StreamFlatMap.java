package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
    public static void main(String[] args) {

        // Example 1: Combine multiple lists of integers into a single stream
        List<Integer> numOne = Arrays.asList(5, 7, 11, 13);
        List<Integer> numTwo = Arrays.asList(2, 9, 10, 22);

        // List of lists containing two lists of integers
        List<List<Integer>> listOfList = Arrays.asList(numOne, numTwo);

        // Print each list within the list of lists
        listOfList.forEach(System.out::println); // Output: [5, 7, 11, 13] and [2, 9, 10, 22]

        // Flatten the list of lists into a single stream, collect it into a list, and calculate the total sum
        int total = listOfList.stream()
                .flatMap(list -> list.stream()) // Flatten the nested lists
                .collect(Collectors.toList()) // Collect into a single list
                .stream() // Create a new stream
                .reduce(0, Integer::sum); // Sum all elements

        // Print the total sum
        System.out.println(total); // Output: 79
    }
}
