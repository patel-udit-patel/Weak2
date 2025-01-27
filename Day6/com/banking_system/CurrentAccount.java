package com.banking_system;

// Subclass CurrentAccount
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02;

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * INTEREST_RATE;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Current account holders can apply for business loans.");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10;
    }
}
