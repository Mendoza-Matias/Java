package com.mmendoza;

import static com.mmendoza.Calculator.*;

public class Main {
    public static void main(String[] args) {

        // It is not necessary to instantiate the Calculator class
        // because all its methods are static.

        // Sum two integers
        System.out.println(sum(1, 1));

        // Sum another pair of integers
        System.out.println(sum(2, 2));

        // Sum two long values, the result is automatically treated as float
        System.out.println(sum(10L, 10L)); // This applies addition to long values

        // Sum an integer and a long value
        System.out.println(sum(10, 1L));

        // Sum a series of integer values using varargs
        System.out.println(sum(1, 1, 1, 1, 1, 1, 1, 1, 1));

        // Sum a long value and a series of integer values using varargs
        System.out.println(sum(1L, 1, 1, 1, 1, 1, 1, 1, 1));
    }
}
