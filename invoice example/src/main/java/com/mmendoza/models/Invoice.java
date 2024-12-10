package com.mmendoza.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/* example
needs to finish */

public class Invoice {

    private Integer id;
    private String description;
    private LocalDate date;
    private Client client;
    private List<Item> items;
    private static Integer lastId = 0;

    public Invoice(String description, Client client) {
        this.description = description;
        this.client = client;
        this.id = lastId++;
        this.date = LocalDate.now();
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public Client getClient() {
        return client;
    }

    public List<Item> getItems() {
        return this.items;
    }

    /* method add item */
    public void addItem(Item item) {
        if (this.items == null)
            this.items = new ArrayList<>();
        this.items.add(item);
    }

    public Float getTotalInvoice() {
        Float total = 0.0f;
        for (Item item : this.items) {
            if (item == null)
                continue; /* continue next item */
            total += item.getTotal();
        }
        return total;
    }

}
