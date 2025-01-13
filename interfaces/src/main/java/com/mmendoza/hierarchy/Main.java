package com.mmendoza.hierarchy;

import com.mmendoza.hierarchy.entities.ClassX;  // Import the ClassX

public class Main {
    public static void main(String[] args) {

        // Create an instance of ClassX
        ClassX classX = new ClassX();

        /* Using the methods from the interfaces */
        classX.helloFromInterfaceA();  // Call the method from InterfaceA
        // classX.helloFromInterfaceB();  // This line is commented out because ClassX does not implement InterfaceB directly
        classX.helloFromInterfaceC();  // Call the method from InterfaceC
    }
}
