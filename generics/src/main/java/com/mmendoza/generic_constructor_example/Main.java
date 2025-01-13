package com.mmendoza.generic_constructor_example;

import com.mmendoza.generic_constructor_example.entities.MyClass;
import com.mmendoza.generic_constructor_example.entities.SumN;

public class Main {
    public static void main(String[] args) {

        // Create an instance of SumN with an integer value (3)
        SumN sumN = new SumN(3);

        // Create an instance of SumN with a double value (4.5)
        SumN sumN1 = new SumN(4.5);

        // Print the sum calculated for the integer 3 (0 + 1 + 2 + 3 = 6)
        System.out.println(sumN.getSum()); // Output: 6

        // Print the sum calculated for the double 4.5 (0 + 1 + 2 + 3 + 4 = 10)
        System.out.println(sumN1.getSum()); // Output: 10

        // Uncommenting the following line will cause a compilation error
        // because SumN can only accept types that extend Number
        // SumN sumN2 = new SumN("Hello"); // Compilation Error

        /* ------------- */

        // Create an instance of MyClass with a String type and assign "Hello"
        MyClass<String> instanceOne = new MyClass<>("Hello");

        // Create an instance of MyClass with an Integer type and assign 2
        MyClass<Integer> instanceTwo = new MyClass<>(2);

        // Print the value of instanceOne, which is a String ("Hello")
        System.out.println(instanceOne.getValue()); // Output: Hello

        // Print the value of instanceTwo, which is an Integer (2)
        System.out.println(instanceTwo.getValue()); // Output: 2
    }
}
