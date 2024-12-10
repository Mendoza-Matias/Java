package org.mmendoza;

public enum Color {
    /* Constant values */
    RED("Red"),
    YELLOW("Yellow"), /* Values assigned to the constant */
    BLUE("Blue");

    private final String color; /* Final attribute */

    Color(String color) { /* Assigning a value through the constructor */
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}