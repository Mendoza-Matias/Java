package com.mmendoza.thread_basic_example;

public class ThreadRunnable implements Runnable {

    @Override
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

        ThreadRunnable t1 = new ThreadRunnable();

        ThreadRunnable t2 = new ThreadRunnable();

        Thread thread1 = new Thread(t1);

        Thread thread2 = new Thread(t2);

        thread1.start();

        thread2.start();
    }

}
