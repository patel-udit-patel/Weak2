package com.banking_system;

// Abstract class BankAccount
abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    protected double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public abstract double calculateInterest();

    public String getAccountDetails() {
        return "Account Number: " + accountNumber + ", Holder: " + holderName;
    }
}