package com.mmendoza.hierarchy.entities;

import com.mmendoza.hierarchy.interfaces.*; /* import all interfaces - It depends on the case*/

/* Simulate interface hierarchy */

public class ClassX implements InterfaceC {

    /* InterfaceC extends of interface A*/
    @Override
    public void helloFromInterfaceA() {
        System.out.println("Hello from interface A"); /* implements abstract methods */
    }

    @Override
    public void helloFromInterfaceC() {
        System.out.println("Hello from interface C");
    }
}
