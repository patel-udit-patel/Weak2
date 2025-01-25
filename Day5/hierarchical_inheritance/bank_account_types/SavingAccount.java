package Day5.hierarchical_inheritance.bank_account_types;

//creating SavingAccount class which inherits BankAccount
public class SavingAccount extends BankAccount {
    int interestRate;

    //Constructor for SavingAccount
    SavingAccount(int accountNumber,int balance,int interestRate){
        //super keyword calls parent class constructor
        super(accountNumber,balance);
        this.interestRate=interestRate;
    }

    //method is overriding displayAccount method from BankAccount
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest rate "+this.interestRate);
    }
    //method displays type of account
    void displayAccountType(){
        System.out.println("This is a Saving Account ");
    }
}
