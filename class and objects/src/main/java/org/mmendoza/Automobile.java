package org.mmendoza;

public class Automobile {

    /* Attributes */
    private String manufacturer; // Private access modifier, visible only within the class
    private String model;
    private Color color; // Using enum as a data type
    private double engineDisplacement;
    private int tankCapacity = 40; // Default value
    private static String licensePlateColor = "Orange";
    // Static -> Belongs to the class, shared among all instances.

    /* Class constants */
    public static final Integer MAX_HIGHWAY_SPEED = 120;
    public static final String RED_COLOR = "red";
    public static final String YELLOW_COLOR = "yellow";

    /* Constructors */
    public Automobile() {
        // No-args constructor
    }

    // To initialize objects with values
    public Automobile(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // Constructor overloading
    public Automobile(String manufacturer, String model, Color color) {
        this(manufacturer, model); // Calls another constructor
        this.color = color;
    }

    /* Methods */
    public String getManufacturer() {
        return this.manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String viewDetails() {
        // Returns a detailed description of the automobile
        return "Manufacturer: " + this.manufacturer +
                "\nEngine Displacement: " + this.engineDisplacement +
                "\nLicense Plate Color: " + licensePlateColor;
    }

    /* Static methods */
    public static String getLicensePlateColor() {
        return Automobile.licensePlateColor;
    }

    public static void setLicensePlateColor(String licensePlateColor) {
        Automobile.licensePlateColor = licensePlateColor;
    }

    public String accelerate(int rpm) {
        return "The car " + this.manufacturer + " is accelerating at " + rpm + " rpm";
    }

    public String brake() {
        return this.manufacturer + " " + this.model + " is braking";
    }

    public String accelerateAndBrake(int rpm) {
        return this.accelerate(rpm) + "\n" + this.brake();
    }

    public float calculateFuelConsumption(int km, float fuelPercentage) {
        return km / (this.tankCapacity * fuelPercentage);
    }

    /* Overriding the equals method */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Checks if they are the same object
        if (obj == null || getClass() != obj.getClass()) return false; // Checks the class

        Automobile a = (Automobile) obj; // Safe cast
        return this.manufacturer != null && this.manufacturer.equals(a.manufacturer);
    }
}
