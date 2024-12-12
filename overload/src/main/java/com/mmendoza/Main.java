package com.mmendoza;

import static com.mmendoza.Calculator.*;

public class Main {
    public static void main(String[] args) {

        /* It is not necessary to instantiate because the methods are static */

        System.out.println(sum(1, 1));

        System.out.println(sum(2, 2));

        System.out.println(sum(10L, 10L)); /* apply addition with floats */

        System.out.println(sum(10, 1L));

        System.out.println(sum(1, 1, 1, 1, 1, 1, 1, 1, 1));

        System.out.println(sum(1L, 1, 1, 1, 1, 1, 1, 1, 1));
    }
}
