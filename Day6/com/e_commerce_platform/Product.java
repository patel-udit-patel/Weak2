package com.e_commerce_platform;
// Abstract class representing a product in the e-commerce platform
abstract class Product {
    protected String productId;
    protected String name;
    protected double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calculateDiscount();

    // Concrete method to display product details
    public void getProductDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}
