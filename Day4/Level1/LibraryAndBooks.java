package Day4.Level1;
import java.util.ArrayList;

// Book class (Can exist independently of Library)
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + '}';
    }
}

// Library class (Aggregates Book objects)
class Library {
    private String name;
    private ArrayList<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

// Main class to demonstrate aggregation
public class LibraryAndBooks {
    public static void main(String[] args) {
        // Creating books (Can exist independently)
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating libraries
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Adding books to different libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book3);
        library2.addBook(book1); // Same book in another library

        // Display books in each library
        library1.displayBooks();
        System.out.println();
        library2.displayBooks();
    }
}

