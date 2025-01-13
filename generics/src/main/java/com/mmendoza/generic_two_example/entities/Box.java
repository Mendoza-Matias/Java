package com.mmendoza.generic_two_example.entities;

/* limitation that must extend the class and implement the interface */
public class Box<T extends Animal & Flying> {

    private T content;

    public Box(T content) {
        this.content = content;
    }

    public void callMethod() {
        content.eat();
        content.fly();
    }

}
