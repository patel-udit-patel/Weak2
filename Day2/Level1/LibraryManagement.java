package Day2.Level1;

class Book2{
    protected String title;
    private String author;
    public  String ISBN;

    Book2(String title,String author,String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    String getAuthor(){
        return this.author;
    }
    void setAuthor(String author){
        this.author=author;
    }
   void displayDetails(){
        System.out.println("Title "+this.title);
        System.out.println("Author "+this.author);
        System.out.println("ISBN "+this.ISBN);
   }
}
class EBook extends Book2 {
    private String fileFormat;

    // Constructor
    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    // Method to display ebook details
    public void displayEBookDetails() {
        System.out.println("\nEBook Details:");
        System.out.println("ISBN: " + this.ISBN); // Accessing public member
        System.out.println("Title: " + this.title); // Accessing protected member
        System.out.println("File Format: " + fileFormat);
    }
}

// Main class to test the functionality
class LibraryManagement {
    public static void main(String[] args) {
        // Creating Book object
        Book2 book1 = new Book2("978", "Effective Java", "Joshua Bloch");
        book1.displayDetails();

        // Modifying Author
        book1.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book1.getAuthor());

        // Creating EBook object
        EBook eBook = new EBook("978", "Java Concurrency in Practice", "Brian Goetz", "PDF");
        eBook.displayEBookDetails();
    }
}


