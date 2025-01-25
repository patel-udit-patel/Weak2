package Day5.hierarchical_inheritance.bank_account_types;

//class BankAccount is public
public class BankAccount {
    int accountNumber;
    int balance;

    //Constructor for BankAccount
    BankAccount(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    //method displays details of bank account
    void displayAccountDetails(){
        System.out.println("Account Number "+this.accountNumber);
        System.out.println("Balance "+this.balance);
    }
}
