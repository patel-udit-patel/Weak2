package Day2.Level1;


// Parent class Employee
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }

    // Public method to modify salary
    public void modifySalary(double amount) {
        if (salary + amount >= 0) {
            this.salary += amount;
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Invalid salary modification amount.");
        }
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
    }
}

// Subclass Manager
class Manager extends Employee {

    // Constructor
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
    }
}

// Main class to test the functionality
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp1 = new Employee(101, "IT", 75000.00);
        emp1.displayEmployeeDetails();

        // Modifying salary
        emp1.modifySalary(5000.00);
        System.out.println("Updated Salary: " + emp1.getSalary());

        // Creating Manager object
        Manager manager = new Manager(201, "HR", 90000.00);
        manager.displayManagerDetails();
    }
}


