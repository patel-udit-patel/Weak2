package Day5.single_inheritance.library_management;

public class LibraryController {
    public static void main(String[]args) {
        Book vinayKiKahaniya = new Book("Vinay Ki Kahaniya", 2024);
        Author vinay = new Author("Vinay Jadaun", "Senoir analyst", "Vinay ki Professional life", 2025);
        vinayKiKahaniya.displayInfo();
        vinay.displayInfo();
    }
}
