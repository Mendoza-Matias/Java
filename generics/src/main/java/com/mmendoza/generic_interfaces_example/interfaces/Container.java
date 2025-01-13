package com.mmendoza.generic_interfaces_example.interfaces;

public interface Container<T> {

    // Method to check if an object of type T is contained in the container
    boolean contains(T obj);
}
