package com.e_commerce_platform;

// Subclass representing Groceries
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05; // 5% discount
    }
}
