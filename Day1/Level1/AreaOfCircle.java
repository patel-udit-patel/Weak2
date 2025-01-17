import java.util.Scanner;

//Circle class creates circle objects
  class Circle{
	double radius;
	
	//Constructor of Circle class allocates memory for object when called
	Circle(int radius){
		this.radius=radius;
	}

	//method calculates area of circle
	public double areaOfCircle(){
		double area=3.14*this.radius*this.radius;
		return area;
	}
	
	//method calculates circumference of circle
	public double circumferenceOfCircle(){
		double circumference=2*3.14*this.radius;
		return circumference;
	}

	
	//method displays details of object
	public void displayCircle(){
		System.out.println("The area and circumference of circle with radius "+this.radius+" is "+this.areaOfCircle()+" and "+this.circumferenceOfCircle() );
	}
}

//this is the main class where execution starts
  class AreaOfCircle{
	public static void main(String[] args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking employee details from user
		System.out.println("Enter radius of circle :");
		int radius=input.nextInt();

		//Creating a object of Circle class
		Circle first=new Circle(radius);

		//Calling the display method for first object
		first.displayCircle();
	}
}	