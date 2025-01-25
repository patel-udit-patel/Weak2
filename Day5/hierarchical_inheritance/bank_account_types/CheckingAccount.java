package Day5.hierarchical_inheritance.bank_account_types;

//Creating CheckingAccount class which inherits BankAccount
public class CheckingAccount extends BankAccount{
    int withdrawalLimit;

    //Constructor for CheckingAccount
    CheckingAccount(int accountNumber,int balance,int withdrawalLimit){
       //super keyword calls constructor of parent class
        super(accountNumber, balance);
        this.withdrawalLimit=withdrawalLimit;
    }

    //method is overriding displayAccountDetails of Bank Account
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Withdrawal Limit "+this.withdrawalLimit);
    }
    //method prints the type of Account
    void displayAccountType(){
        System.out.println("This account is Checking Account ");
    }
}
