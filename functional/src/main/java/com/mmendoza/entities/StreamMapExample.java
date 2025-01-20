package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {

        /* The map method applies a function to each element of the stream.
           It is an intermediate operation used for data manipulation and transformation.
        */

        // Create a Stream of Integer ages
        Stream<Integer> ages = Stream.<Integer>builder().add(2000).add(2001).add(2002).build();

        // Transform each Integer in the stream into a String and collect the result into a List
        List<String> listAgesOfString = ages.map(age -> String.valueOf(age) ).collect(Collectors.toList());

        // Create a List of Integers
        List<Integer> doubles = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Transform each Integer in the list by doubling its value and collect the result into a List
        List<Integer> result = doubles.stream().map(num -> num * 2).collect(Collectors.toList());

        // Print each element of the result list
        result.forEach(System.out::println); // Output: 2, 4, 6, 8, ..., 20
    }
}
