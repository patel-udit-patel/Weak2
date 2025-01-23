package Day4.Level1;

import java.util.ArrayList;

// E-commerce platform with Orders, Customers, and Products
class ECommercePlatform {
    private String name;
    private ArrayList<CustomerE> customers;
    private ArrayList<Product> products;

    public ECommercePlatform(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addCustomer(CustomerE customer) {
        customers.add(customer);
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayPlatformDetails() {
        System.out.println("E-Commerce Platform: " + name);
        System.out.println("Customers:");
        for (CustomerE customer : customers) {
            System.out.println(" - " + customer.getName());
        }
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println(" - " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }
}

// Customer class (Places multiple Orders)
class CustomerE {
    private String name;
    private ArrayList<Order> orders;

    public CustomerE(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order.");
    }
}

// Order class (Aggregates multiple Products)
class Order {
    private static int orderCounter = 1;
    private int orderId;
    private ArrayList<Product> products;

    public Order() {
        this.orderId = orderCounter++;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println(" - " + product.getName() + " ($" + product.getPrice() + ")");
        }
    }
}

// Product class (Exists independently but is part of Orders)
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Main class to demonstrate E-commerce platform functionality
public class ECommerceDemonstration {
    public static void main(String[] args) {
        // Creating E-commerce platform
        ECommercePlatform platform = new ECommercePlatform("ShopEase");

        // Creating products
        Product laptop = new Product("Laptop", 1200.00);
        Product phone = new Product("Smartphone", 800.00);
        Product headset = new Product("Wireless Headset", 150.00);

        // Adding products to platform
        platform.addProduct(laptop);
        platform.addProduct(phone);
        platform.addProduct(headset);

        // Creating customers
        CustomerE alice = new CustomerE("Alice");
        CustomerE bob = new CustomerE("Bob");

        // Adding customers to platform
        platform.addCustomer(alice);
        platform.addCustomer(bob);

        // Customers placing orders
        Order order1 = new Order();
        order1.addProduct(laptop);
        order1.addProduct(headset);
        alice.placeOrder(order1);

        Order order2 = new Order();
        order2.addProduct(phone);
        bob.placeOrder(order2);

        // Display platform details
        platform.displayPlatformDetails();

        // Display order details
        System.out.println("\nOrder Details:");
        order1.displayOrderDetails();
        order2.displayOrderDetails();
    }
}

