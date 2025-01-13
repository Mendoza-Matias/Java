package com.mmendoza.generic_interfaces_example.entities;

import com.mmendoza.generic_interfaces_example.interfaces.Container;

// MyClass expects a type parameter and implements the Container interface with the same type.
public class MyClass<T> implements Container<T> {

    // Generic attribute to hold an array of type T
    private T[] value;

    // Constructor that initializes the value attribute with an array of type T
    public MyClass(T[] value) {
        this.value = value;
    }

    // Implementation of the contains method from the Container interface
    // Checks if the given object is contained in the value array
    @Override
    public boolean contains(T obj) {
        // Iterate through the array to check if any element equals the provided object
        for (T element : value) {
            if (element.equals(obj)) {
                return true; // Return true if the object is found
            }
        }
        return false; // Return false if the object is not found
    }
}
