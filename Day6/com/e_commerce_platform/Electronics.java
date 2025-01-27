package com.e_commerce_platform;

// Subclass representing Electronics
class Electronics extends Product implements Taxable {
    private double taxRate = 0.18; // 18% tax

    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return price * taxRate;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Tax on Electronics: " + calculateTax());
    }
}
