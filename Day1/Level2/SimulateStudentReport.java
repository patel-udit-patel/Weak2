import java.util.Scanner;

//Student creates Student objects
  class Student{
	String name;
	int rollNumber;
	int marks;
	
	//Constructor of Book class allocates memory for object when called
	Student (String name,int rollNumber ,int marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
	}
	
	char calculateGrade(){
		if(this.marks>80){
			return 'A';
		}else if(this.marks>80){
			return 'A';
		}else if(this.marks>70){
			return 'B';
		}else if(this.marks>60){
			return 'C';
		}else if(this.marks>50){
			return 'D';
		}else if(this.marks>40){
			return 'E';
		}else{
			return 'R';
		}
	}
	
	
	//method displays details of object
	public void displayStudent(){
		System.out.println("Name Of Student "+this.name+" ,Roll Number "+this.rollNumber+" ,Marks "+this.marks +" and grade is "+this.calculateGrade());
	}
}

//this is the main class where execution starts
  class SimulateStudentReport{
	public static void main(String[] args){
		//using scanner object for user input
		Scanner input=new Scanner(System.in);

		//Taking book details from user
		System.out.println("Enter name ,roll number and marks of Student :");
		String name=input.nextLine();
		int rollNumber=input.nextInt();
		int marks=input.nextInt();

		//Creating a object of Book class
		Student first=new Student(name,rollNumber,marks);

		//Calling the display method for first object
		first.displayStudent();

	}
}	