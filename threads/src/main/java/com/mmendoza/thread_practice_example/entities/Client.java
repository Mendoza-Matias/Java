package com.mmendoza.thread_practice_example.entities;

public class Client {

    // A final field to store the name of the client (immutable after initialization).
    private final String NAME;

    // Constructor to initialize the client's name.
    public Client(String name) {
        this.NAME = name; // Assigning the name passed to the constructor.
    }

    // Getter method to access the name of the client.
    public String getName() {
        return NAME; // Returns the client's name.
    }

    // Optional: Override the toString() method for better string representation of a client.
    @Override
    public String toString() {
        return "Client{" + "name='" + NAME + '\'' + '}';
    }
}
