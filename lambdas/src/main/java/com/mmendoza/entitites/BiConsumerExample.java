package com.mmendoza.entitites; // Corrected package name

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        // Define a BiConsumer that takes an Integer and a String as input
        // and prints a message combining the two.
        BiConsumer<Integer, String> show = (age, message) -> System.out.println(message + " " + age);

        // Use the BiConsumer with specific values.
        show.accept(21, "My age is");
    }
}