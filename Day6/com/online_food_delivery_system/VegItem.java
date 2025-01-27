package com.online_food_delivery_system;

// Subclass representing a Veg Item
class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return price * quantity;
    }

    @Override
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied on Veg Item: " + itemName);
    }
}

