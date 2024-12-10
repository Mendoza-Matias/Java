package com.mmendoza.models;

public class Product {

    private Integer id;
    private String name;
    private Float price;
    private static Integer lastId = 0;

    /* methods */
    public Product() {
        this.id = lastId++;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
