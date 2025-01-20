//BankAccount class
class BankAccount{
    //static members of BankAccount class
    public static String bankName;
    public static int numberOfAccounts=0;

    //intstance variables of BankAccount class
    private String accountHolderName;
    private final int accountNumber;

    //constructor of bankaccount with parameters
    BankAccount(String accountHolderName,int accountNumber){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        numberOfAccounts++;
    }

    //method prints total number of accounts
    public static void getTotalAccounts(){
        System.out.println("Total number of accounts "+numberOfAccounts);
    }
    //method displays details about account
    void displayDetail(){
        System.out.println("Bank Name "+bankName);
        System.out.println("Account Holder Name "+this.accountHolderName);
        System.out.println("Account Number "+this.accountNumber);
    }
}
public class BankAccountSystem {
    //main method for execution
    public static void main(String[]args){
        //creating BankAccount object
        BankAccount b1=new BankAccount("Vinay",123);
        //static method call
        BankAccount.getTotalAccounts();

        //checking if b1 is instance of BankAccount
        boolean isTrue=b1 instanceof BankAccount;
        if(isTrue){
            //if true then method call for displayDetail
            b1.displayDetail();
        }
        else{
            //Otherwise print message
            System.out.println("b1 is not an instance of BankAccount");
        }
    }
}
