package Day5.hierarchical_inheritance.bank_account_types;

//creating class FixedDepositAccount inheriting BankAccount
public class FixedDepositAccount extends BankAccount{
    int yearsForRefund;

    //constructor for FixedDepositAccount
    FixedDepositAccount(int accountNumber,int balance,int yearsForRefund){
        //super keyword calls parent class constructor
        super(accountNumber, balance);
        this.yearsForRefund=yearsForRefund;
    }

    //method overriding displayAccountDetails from BankAccount class
    @Override
    void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Years For Refund "+this.yearsForRefund);
    }
    //method displays type of account
    void displayAccountType(){
        System.out.println("This is a Fixed Deposit Account ");
    }
}
