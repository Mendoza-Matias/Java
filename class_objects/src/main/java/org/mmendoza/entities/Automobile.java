package org.mmendoza.entities;

public class Automobile {

    /* Attributes */
    private String manufacturer; // Manufacturer of the automobile
    private String model; // Model of the automobile
    private Color color; // Using enum Color as a data type for the car's color
    private double engineDisplacement; // Engine displacement in liters
    private int tankCapacity = 40; // Default fuel tank capacity in liters
    private static String licensePlateColor = "Orange"; // Static variable, shared by all instances

    /* Class constants */
    public static final Integer MAX_HIGHWAY_SPEED = 120; // Maximum allowed speed on highways (in km/h)
    public static final String RED_COLOR = "red"; // Constant for the red color
    public static final String YELLOW_COLOR = "yellow"; // Constant for the yellow color

    /* Constructors */
    public Automobile() {
        // No-argument constructor
    }

    // Constructor to initialize the automobile with manufacturer and model
    public Automobile(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    // Constructor overloading: Initializes with manufacturer, model, and color
    public Automobile(String manufacturer, String model, Color color) {
        this(manufacturer, model); // Calls the previous constructor
        this.color = color;
    }

    /* Getter and Setter methods */
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

    // Method to view the details of the automobile
    public String viewDetails() {
        return "Manufacturer: " + this.manufacturer +
                "\nEngine Displacement: " + this.engineDisplacement +
                "\nLicense Plate Color: " + licensePlateColor;
    }

    /* Static methods */
    // Static getter for license plate color (shared across all instances)
    public static String getLicensePlateColor() {
        return Automobile.licensePlateColor;
    }

    // Static setter for license plate color (modifies the static variable)
    public static void setLicensePlateColor(String licensePlateColor) {
        Automobile.licensePlateColor = licensePlateColor;
    }

    // Method to simulate the acceleration of the automobile
    public String accelerate(int rpm) {
        return "The car " + this.manufacturer + " is accelerating at " + rpm + " rpm";
    }

    // Method to simulate the automobile braking
    public String brake() {
        return this.manufacturer + " " + this.model + " is braking";
    }

    // Combined method for accelerating and braking
    public String accelerateAndBrake(int rpm) {
        return this.accelerate(rpm) + "\n" + this.brake();
    }

    // Method to calculate fuel consumption based on distance and fuel percentage
    public float calculateFuelConsumption(int km, float fuelPercentage) {
        return km / (this.tankCapacity * fuelPercentage);
    }

    /* Overriding the equals method to compare two Automobile objects */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Checks if both objects are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Checks if the objects are of the same class

        Automobile a = (Automobile) obj; // Safe cast
        return this.manufacturer != null && this.manufacturer.equals(a.manufacturer); // Compares manufacturers
    }
}
