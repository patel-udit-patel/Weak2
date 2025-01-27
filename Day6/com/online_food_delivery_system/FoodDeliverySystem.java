package com.online_food_delivery_system;

// Main class to test the Food Delivery System
public class FoodDeliverySystem {
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("Total Price: " + item.calculateTotalPrice() + "\n");
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Tikka", 150, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 250, 1);

        processOrder(vegItem);
        processOrder(nonVegItem);

        // Applying discounts
        Discountable discountVeg = new VegItem("Veg Burger", 100, 3);
        discountVeg.applyDiscount(10);
        discountVeg.getDiscountDetails();

        Discountable discountNonVeg = new NonVegItem("Fish Curry", 300, 1);
        discountNonVeg.applyDiscount(15);
        discountNonVeg.getDiscountDetails();
    }
}
