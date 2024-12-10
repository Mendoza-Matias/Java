package com.mmendoza.models;

public class Item {

    private Integer count;
    private Product product;

    public Item(Integer count, Product product) {
        this.count = count;
        this.product = product;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Float getTotal() {
        return this.count * this.product.getPrice();
    }
}
