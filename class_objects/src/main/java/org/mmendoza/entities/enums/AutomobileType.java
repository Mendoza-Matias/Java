package org.mmendoza.entities.enums;

public enum AutomobileType {

    // Enum constants for different automobile types
    PICKUP_TRUCK("Pickup Truck", "Large vehicle", 4),
    VAN("Van", "Large vehicle", 4);

    // Private attributes of the enum type
    private final String name;         // The name of the automobile type
    private final int numberOfDoors;   // Number of doors for the automobile type
    private final String description;  // Description of the automobile type

    // Constructor to initialize the enum constants
    AutomobileType(String name, String description, int numberOfDoors) {
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.description = description;
    }

    // Getter for the name of the automobile type
    public String getName() {
        return name;
    }

    // Getter for the number of doors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    // Getter for the description
    public String getDescription() {
        return description;
    }
}
