package com.e_commerce_platform;

// Subclass representing Clothing
class Clothing extends Product implements Taxable {
    private double taxRate = 0.05; // 5% tax

    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.15; // 15% discount
    }

    @Override
    public double calculateTax() {
        return price * taxRate;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on Clothing: " + calculateTax());
    }
}

