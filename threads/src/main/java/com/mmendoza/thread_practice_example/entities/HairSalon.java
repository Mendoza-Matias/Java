package com.mmendoza.thread_practice_example.entities;

import java.util.LinkedList;
import java.util.Queue;

public class HairSalon {

    // Define constants for the number of hairdressers and clients.
    private static final int NUM_HAIRDRESSER = 3; // Number of hairdressers.
    private static final int NUM_CLIENT = 10;    // Number of clients.

    // Queue to store the waiting clients.
    private Queue<Client> clients = new LinkedList<>();

    // Object used for thread synchronization.
    Object lock = new Object();

    // Array of threads representing the hairdressers.
    private Thread[] hairDresser;

    // Constructor: Initializes the hairdresser threads.
    public HairSalon() {
        hairDresser = new Thread[NUM_HAIRDRESSER]; // Initialize the array for hairdresser threads.

        // Create and assign a thread for each hairdresser.
        for (int i = 0; i < NUM_HAIRDRESSER; i++) {
            hairDresser[i] = new Thread(new Hairdresser(this, "Hairdresser" + (i + 1)));
        }
    }

    // Method to initialize threads and add clients to the salon.
    public void initThreads() {
        // Start the hairdresser threads.
        for (Thread t : hairDresser) {
            t.start();
        }

        // Add clients to the queue to be attended by hairdressers.
        for (int i = 0; i < NUM_CLIENT; i++) {
            this.addClient(new Client("Client " + i));
        }
    }

    // Method to add a client to the clients' queue.
    public void addClient(Client client) {
        synchronized (lock) { // Locking to ensure only one thread modifies the queue at a time.
            clients.offer(client); // Add the client to the queue.
            lock.notify(); // Notify the hairdressers that a new client is available.
        }
    }

    // Method for a hairdresser to get a client from the queue.
    public Client getClient() throws InterruptedException {
        synchronized (lock) { // Locking to access the client queue in a synchronized manner.
            while (clients.isEmpty()) {
                lock.wait(); // If the queue is empty, the thread waits.
            }
            return clients.poll(); // Retrieves and removes the first client from the queue.
        }
    }
}
