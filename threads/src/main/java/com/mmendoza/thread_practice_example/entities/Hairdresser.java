package com.mmendoza.thread_practice_example.entities;

import java.util.Random;

public class Hairdresser implements Runnable {

    private final HairSalon hairSalon;

    private final String name;

    public Hairdresser(HairSalon hairSalon, String name) {
        this.hairSalon = hairSalon;
        this.name = name;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            while (true) {
                Client client = hairSalon.getClient();
                System.out.println(this.name + " begins to attend " + client.getName());
                int time = random.nextInt(10) + 1;
                Thread.sleep(time * 1000);
                System.out.println(this.name + " ends att " + client.getName());
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
