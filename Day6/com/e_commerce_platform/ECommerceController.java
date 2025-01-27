package com.e_commerce_platform;

public class ECommerceController {
    public static void processOrder(Product product) {
        product.getProductDetails();
        double discount = product.calculateDiscount();
        double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0;
        double finalPrice = product.price + tax - discount;
        System.out.println("Final Price after tax and discount: " + finalPrice + "\n");
    }

    public static void main(String[] args) {
        Product laptop = new Electronics("E101", "Laptop", 50000);
        Product shirt = new Clothing("C202", "Shirt", 2000);
        Product apple = new Groceries("G303", "Apple", 150);

        processOrder(laptop);
        processOrder(shirt);
        processOrder(apple);
    }
}
