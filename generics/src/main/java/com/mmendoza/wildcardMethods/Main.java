package com.mmendoza.wildcardMethods;

import com.mmendoza.wildcardMethods.utils.Utilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> name = List.of("Juan", "Pepe", "Rodolfo");

        List<Integer> ages = List.of(2002, 2003, 2025);

        System.out.println("List of names");
        Utilities.printList(name);

        System.out.println("List of ages");
        Utilities.printList(ages);

    }
}
