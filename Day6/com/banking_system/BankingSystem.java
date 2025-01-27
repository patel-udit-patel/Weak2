package com.banking_system;

import java.util.ArrayList;
import java.util.List;

// Main class to demonstrate polymorphism
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("SA123456", "John Doe", 50000));
        accounts.add(new CurrentAccount("CA987654", "Jane Smith", 150000));

        for (BankAccount account : accounts) {
            System.out.println(account.getAccountDetails());
            System.out.println("Interest Earned: Rs." + account.calculateInterest());
            account.applyForLoan();
            System.out.println("Loan Eligibility: Rs." + account.calculateLoanEligibility());
            System.out.println("-----------------------------------");
        }
    }
}
