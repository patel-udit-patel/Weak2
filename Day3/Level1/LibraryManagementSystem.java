//Book class
class Book{
    //Class variable of Book class
    private static String LibraryName;
    //Instance variables
    private String title;
    private String author;
    private final int isbn;

    //Constructor of Book
    Book(String title,String author,int isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    //method prints Library name
   void displayLibraryName(){
        System.out.println("Name of Library "+LibraryName);
    }
    //method prints details of Book
    void displayDetails(){
        System.out.println("Title "+this.title);
        System.out.println("Author "+this.author);
        System.out.println("ISBN "+this.isbn);
    }

}
public class LibraryManagementSystem {
        //main method where execution starts
        public static void main(String[]args){
            //Creating object of Book class
            Book b1=new Book("Vinay Ki kahaniya","Vinay",123);
            //checking if b1 is instance of Book class
            boolean istrue=b1 instanceof Book;
            if(istrue){
                //calling displayDetail method
                b1.displayDetails();
            }
            else{
                //otherwise printing message
                System.out.println("b1 is not an Object of Book");
            }
        }
}
