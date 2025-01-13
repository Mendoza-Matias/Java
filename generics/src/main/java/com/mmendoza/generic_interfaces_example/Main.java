package com.mmendoza.generic_interfaces_example;

import com.mmendoza.generic_interfaces_example.entities.MyClass;

public class Main {
    public static void main(String[] args) {

        // Create an array of Integer objects
        Integer[] numbers = {2, 3, 4};

        // Instantiate MyClass with Integer as the type parameter and pass the numbers array
        MyClass<Integer> myClass = new MyClass<>(numbers);

        // Check if the array contains the number 3 and print the result (true/false)
        System.out.println(myClass.contains(3)); // Output: true
    }
}
