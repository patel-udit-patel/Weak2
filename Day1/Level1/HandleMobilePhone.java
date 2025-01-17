import java.util.Scanner;

//Item creates Book objects
  class MobilePhone{
	String brand;
	String model;
	int price;
	
	//Constructor of Book class allocates memory for object when called
	MobilePhone (String brand, String model ,int price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	//method displays details of object
	public void displayMobile(){
		System.out.println("Brand is "+this.brand+" ,Model is "+this.model+" and price of item is "+this.price );
	}
}

//this is the main class where execution starts
  class HandleMobilePhone{
	public static void main(String[] args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking book details from user
		System.out.println("Enter brand ,model and price of mobile :");
		String brand=input.nextLine();
		String model=input.nextLine();
		int price=input.nextInt();

		//Creating a object of Book class
		MobilePhone first=new MobilePhone(brand,model,price);

		//Calling the display method for first object
		first.displayMobile();

	}
}	