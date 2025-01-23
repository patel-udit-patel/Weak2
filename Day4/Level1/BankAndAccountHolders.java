package Day4.Level1;

import java.util.ArrayList;

// Bank class (Associates with Customers)
class Bank {
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public void openAccount(Customer customer, String accountNumber, double balance) {
        Account newAccount = new Account(accountNumber, balance, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
    }

    public String getName() {
        return name;
    }

    public void displayCustomers() {
        System.out.println("Bank: " + name);
        for (Customer customer : customers) {
            System.out.println(customer.convertToString());
        }
    }
}

// Customer class (Has multiple bank accounts)
class Customer {
    private String name;
    private ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Customer: " + name);
        for (Account account : accounts) {
            System.out.println(account.convertToString());
        }
    }


    public String convertToString() {
        return "Customer{" + "name='" + name + '\'' + ", accounts=" + accounts + '}';
    }
}

// Account class (Linked to a Bank and owned by a Customer)
class Account {
    private String accountNumber;
    private double balance;
    private Bank bank;

    public Account(String accountNumber, double balance, Bank bank) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public String convertToString() {
        return "Account{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + ", bank=" + bank.getName() + '}';
    }
}

// Main class to demonstrate association
public class BankAndAccountHolders {
    public static void main(String[] args) {
        // Creating bank
        Bank bank1 = new Bank("National Bank");

        // Creating customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Opening accounts
        bank1.openAccount(customer1, "123456", 5000.00);
        bank1.openAccount(customer1, "789012", 1500.00);
        bank1.openAccount(customer2, "345678", 3000.00);

        // Viewing customer balances
        customer1.viewBalance();
        System.out.println();
        customer2.viewBalance();
    }
}
