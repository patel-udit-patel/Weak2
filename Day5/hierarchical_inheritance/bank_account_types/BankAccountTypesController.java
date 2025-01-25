package Day5.hierarchical_inheritance.bank_account_types;

//main class for controlling bank account types
public class BankAccountTypesController {
    public static void main(String[]args){
        //Object for BankAccount and calling display account detail for object b1
        BankAccount b1=new BankAccount(1234,1000);
        b1.displayAccountDetails();

        //Creating object for CheckingAccount and calling display account detail and display account type method
        System.out.println();
        CheckingAccount c1=new CheckingAccount(12345,1500,10000);
        c1.displayAccountDetails();
        c1.displayAccountType();

        //Creating object for SavingAccount and calling displayAccountDetails and displayAccountType method
        System.out.println();
        SavingAccount s1=new SavingAccount(2345,3000,4);
        s1.displayAccountDetails();
        s1.displayAccountType();

        //Creating object for FixedDepositAccount and calling displayAccountDetails and displayAccountType method
        System.out.println();
        FixedDepositAccount fd=new FixedDepositAccount(234,100000,10);
        fd.displayAccountDetails();
        fd.displayAccountType();
    }
}
