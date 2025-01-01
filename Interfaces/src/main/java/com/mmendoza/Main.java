package com.mmendoza;

public class Main {
    public static void main(String[] args) {

        Accumulator acc = new Accumulator(25);

        System.out.println(acc.getValue()); // 25

        acc.increment(10);

        System.out.println(acc.getValue()); // 35
    }
}