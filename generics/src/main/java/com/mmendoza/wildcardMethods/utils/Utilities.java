package com.mmendoza.wildcardMethods.utils;

import java.util.List;

public class Utilities {

    /*
     * wildcard only with lists
     * allows passing any unknown type
     * */

    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }

}
