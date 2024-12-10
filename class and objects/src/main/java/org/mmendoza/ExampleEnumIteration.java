package org.mmendoza;

public class ExampleEnumIteration {
    public static void main(String[] args) {

        AutomobileType[] automobileTypes = AutomobileType.values();

        for (AutomobileType type : automobileTypes) {
            System.out.print(type.getName());
            System.out.println();
        }
    }
}
