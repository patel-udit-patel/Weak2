package com.banking_system;

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Savings account holders can apply for personal loans.");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}

