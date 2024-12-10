package org.mmendoza;

public enum AutomobileType {
    PICKUP_TRUCK("Pickup Truck", "Large vehicle", 4),
    VAN("Van", "Large vehicle", 4);

    private final String name;
    private final int numberOfDoors;
    private final String description;

    AutomobileType(String name, String description, int numberOfDoors) {
        this.name = name;
        this.numberOfDoors = numberOfDoors;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public String getDescription() {
        return description;
    }
}
