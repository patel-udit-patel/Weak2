package Day2.Level1;


// Parent class BankAccount
class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to modify balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsDetails() {
        System.out.println("\nSavings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public member
        System.out.println("Account Holder: " + accountHolder); // Accessing protected member
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Main class to test the functionality
public class BankManagement {
    public static void main(String[] args) {
        // Creating BankAccount object
        BankAccount account1 = new BankAccount(123456, "John Doe", 5000.00);
        account1.displayAccountDetails();

        // Modifying balance
        account1.setBalance(5500.00);
        System.out.println("Updated Balance: " + account1.getBalance());

        // Creating SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount(789012, "Jane Doe", 10000.00, 3.5);
        savingsAccount.displaySavingsDetails();
    }
}




