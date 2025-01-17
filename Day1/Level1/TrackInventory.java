import java.util.Scanner;

//Item creates Book objects
  class Item{
	int itemCode;
	String itemName;
	int price;
	
	//Constructor of Book class allocates memory for object when called
	Item (int itemCode, String itemName ,int price){
		this.itemCode=itemCode;
		this.itemName=itemName;
		this.price=price;
	}
	
	//method displays details of object
	public void displayItem(){
		System.out.println("ItemCode is "+this.itemCode+" ,ItemName is "+this.itemName+" and price of item is "+this.price );
	}
}

//this is the main class where execution starts
  class TrackInventory{
	public static void main(String[] args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking book details from user
		System.out.println("Enter itemcode,name of item ,price of item :");
		int itemCode=input.nextInt();

		String itemName=input.next();
		int price=input.nextInt();

		//Creating a object of Book class
		Item first=new Item(itemCode,itemName,price);

		//Calling the display method for first object
		first.displayItem();

		System.out.println("Enter the quantity of Item");
		int quantity=input.nextInt();
		
		System.out.println("The total price of "+quantity+" Items is "+quantity*first.price);
	}
}	