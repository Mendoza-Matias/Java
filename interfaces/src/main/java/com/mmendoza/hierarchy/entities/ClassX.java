package com.mmendoza.hierarchy.entities;

import com.mmendoza.hierarchy.interfaces.*; /* Import all interfaces - It depends on the case */

/* Simulating interface hierarchy */
public class ClassX implements InterfaceC {

    /* InterfaceC extends InterfaceA */

    // Implementing the method from InterfaceA (through InterfaceC)
    @Override
    public void helloFromInterfaceA() {
        System.out.println("Hello from interface A"); // Implementing the abstract method of InterfaceA
    }

    // Implementing the method from InterfaceC
    @Override
    public void helloFromInterfaceC() {
        System.out.println("Hello from interface C"); // Implementing the abstract method of InterfaceC
    }
}
