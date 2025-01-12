package org.mmendoza;

import org.mmendoza.entities.enums.AutomobileType;

public class EnumIterationExample {
    public static void main(String[] args) {

        // Get an array of all enum constants defined in the AutomobileType enum
        AutomobileType[] automobileTypes = AutomobileType.values();

        // Iterate over each enum constant and print its name
        for (AutomobileType type : automobileTypes) {
            System.out.print(type.getName()); // Get the name of the automobile type
            System.out.println(); // Print a new line after each type's name
        }
    }
}
