package com.mmendoza.thread_basic_example;

public class HThread extends Thread {
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Thread " +
                    Thread.currentThread().getName() + " is running." + i);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException("Error in sleep");
            }
        }
    }

    public static void main(String[] args) {

        HThread threadOne = new HThread();

        HThread threadTwo = new HThread();

        threadOne.start(); //Init thread

        threadTwo.start();
    }
}
