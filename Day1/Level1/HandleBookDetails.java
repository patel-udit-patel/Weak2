import java.util.Scanner;

//Circle Book creates Book objects
  class Book{
	String title;
	String author;
	int price;
	
	//Constructor of Book class allocates memory for object when called
	Book (String title, String author,int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	//method displays details of object
	public void displayBook(){
		System.out.println("Title of book is "+this.title+" ,Author of book is "+this.author+" and price of book is "+this.price );
	}
}

//this is the main class where execution starts
  class HandleBookDetails{
	public static void main(String[] args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking book details from user
		System.out.println("Enter title,author,price of book :");
		String title=input.nextLine();
		String author=input.nextLine();
		int price=input.nextInt();

		//Creating a object of Book class
		Book first=new Book(title,author,price);

		//Calling the display method for first object
		first.displayBook();
	}
}	