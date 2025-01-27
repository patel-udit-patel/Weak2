package com.online_food_delivery_system;

// Subclass representing a Non-Veg Item
class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 20.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (price + ADDITIONAL_CHARGE) * quantity;
    }

    @Override
    public void applyDiscount(double percentage) {
        price -= price * (percentage / 100);
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Discount applied on Non-Veg Item: " + itemName);
    }
}
