import java.util.Scanner;

//Employee class creates employee objects
  class Employee{
	int id;
	String name;
	int salary;

	//Constructor of employee class allocates memory for object when called
	Employee(int id ,String name ,int salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	//method displays details of object
	public void displayDetails(){
		System.out.println("Employee id :"+ this.id+" Employee name :"+this.name +" Employee Salary :"+this.salary);
	}
}

//this is the main class where execution starts
  class EmployeeData{
	public static void main(String[]args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking employee details from user
		System.out.println("Enter employee details :");
		String name=input.nextLine();
		int id=input.nextInt();
		int salary=input.nextInt();

		//Creating a object of Employee class
		Employee first=new Employee(id,name,salary);

		//Calling the display method for first object
		first.displayDetails();
	}
}	