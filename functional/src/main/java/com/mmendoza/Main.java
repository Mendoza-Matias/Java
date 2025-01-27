package com.mmendoza;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // 1: Create an empty stream
        Stream<String> streamEmpty = Stream.empty();

        // 2: Create a stream from a collection
        Collection<String> collectionOne = Arrays.asList("A", "B", "C");
        Stream<String> streamOfACollection = collectionOne.stream();

        // 3: Create a stream from an array
        Stream<Integer> streamOfAArray = Stream.of(1, 2, 3);

        // 3 - b: Create a stream from an array using Arrays.stream
        Integer[] arrayOne = new Integer[]{1, 2, 3};
        Stream<Integer> streamOfAArrayTwo = Arrays.stream(arrayOne);

        // 3 - c: Create a stream from a subset of an array
        Stream<Integer> streamOfArrayThree = Arrays.stream(arrayOne, 0, 2);

        // 4: Create a stream using the builder method
        Stream<Integer> ages = Stream.<Integer>builder().add(2002).add(2005).add(2025).build();

        // 5: Create a stream using the generate method
        Stream<String> streamGenerate = Stream.generate(() -> "Name").limit(5); // Generates "Name" 5 times

        // 6: Create a stream using the iterate method
        Stream<Integer> numbers = Stream.iterate(0, n -> n + 1).limit(10); // Generates a sequence: 0, 1, 2, ... 9

        // 7: Create a stream using range and primitives
        IntStream intStream = IntStream.range(1, 4); // Generates 1, 2, 3
        IntStream intStreamOne = IntStream.rangeClosed(1, 4); // Generates 1, 2, 3, 4

        // Print values from the streams
        intStream.forEach(System.out::println); // Prints 1, 2, 3
        intStreamOne.forEach(System.out::println); // Prints 1, 2, 3, 4
    }

    // Utility method to create a stream from a list
    public static Stream<String> streamList(List<String> list) {
        return list == null || list.isEmpty() ? Stream.empty() : list.stream();
    }
}