import java.util.Scanner;

//BankAccount creates BankAccount objects
  class BankAccount{
	String accountHolder;
	int accountNumber;
	int balance;
	
	//Constructor of BankAccount class allocates memory for object when called
	BankAccount (String accountHolder,int accountNumber ,int balance){
		this.accountHolder=accountHolder;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	//method adds the given amount to balance and prints current details
	void depositingMoney(Scanner input){
		System.out.println("Enter amount to deposit");
		int amount=input.nextInt();
		this.balance=this.balance+amount;

		System.out.println("Name of Account holder :"+this.accountHolder);
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Your amount has been deposit and current balance is "+this.balance);
	}

	//method subtracts given amount from balance if less than balance and prints details
	void withdrawingMoney(Scanner input){
		System.out.println("Enter amount for withdrawl ");
		int amount=input.nextInt();
	
		System.out.println("Name of Account holder :"+this.accountHolder);
		System.out.println("Account Number :"+this.accountNumber);
		if(amount<=this.balance){
			this.balance=this.balance-amount;
			System.out.println("Your amount has been deducted and current balance is "+this.balance);
		}else{
			System.out.println("You don't have sufficient amount ");
		}
	}
	//method prints details of bank Account
	void checkBalance(){

		System.out.println("Name of Account holder :"+this.accountHolder);
		System.out.println("Account Number :"+this.accountNumber);
		System.out.println("Total balance :"+this.balance);
	}
	
}

//this is the main class where execution starts
  class SimulateAnATM{
	public static void main(String[] args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking account details from user
		System.out.println("Enter name ,roll number and marks of Student :");
		String accountHolder=input.nextLine();
		int accountNumber=input.nextInt();
		int balance=input.nextInt();

		//Creating object of BankAccount class
		BankAccount first=new BankAccount(accountHolder,accountNumber,balance);

		//Calling the display method for first object
		System.out.println("Enter for deposit-------------->1");
		System.out.println("Enter for withdrawl------------>2");
		System.out.println("Enter for check Balance-------->3");
		int option;
		do{
			//taking input for options
		option=input.nextInt();

		//matching options for operations
		switch(option){
			case 1:
				first.depositingMoney(input);
				break;
			case 2:
				first.withdrawingMoney(input);
				break;
			case 3:
				first.checkBalance();
				break;
			
		}
		}while(option<=3&&option>0);

	}
}	