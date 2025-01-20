package com.mmendoza.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAllMatchExample {
    public static void main(String[] args) {

        // Example 1: Check if any number in the stream is even
        Stream<Integer> containAPar = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        boolean result = containAPar.anyMatch(n -> n % 2 == 0);

        // Example 2: Check if all names in the stream have a length of 3
        Stream<String> names = Stream.of("A", "B", "C", "D", "E", "F");
        boolean resultAll = names.allMatch(n -> n.length() == 3);

        // Example 3: Check if any product name contains the letter 'N'
        List<Product> products = Arrays.asList(
                new Product("Telephone"),
                new Product("Notebook"),
                new Product("Iphone")
        );

        // Output the result of the even number check
        if (result) {
            System.out.println("Match"); // Output: Match
        } else {
            System.out.println("Not Match");
        }

        // Output the result of the all-match check
        if (resultAll) {
            System.out.println("Match All");
        } else {
            System.out.println("Not Match All"); // Output: Not Match All
        }

        // Check if any product name contains the letter 'N'
        boolean containsProductWithN = products.stream().anyMatch(p -> p.getName().contains("N"));
        System.out.println(containsProductWithN); // Output: true
    }

    // Inner class to represent a product
    public static class Product {

        private String name;

        public Product(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}