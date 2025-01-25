package Day5.hybrid_inheritance.resturant_management_system;

// Main class to test the implementation
public class RestaurantManagement {
    public static void main(String[] args) {
        Worker[] workers = {
                new Chef("Gordon", 101),
                new Waiter("James", 202),
                new Manager("Anna", 303)
        };

        for (Worker worker : workers) {
            ((Person) worker).displayInfo();
            worker.performDuties();
            System.out.println();
        }
    }
}

