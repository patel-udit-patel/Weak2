package Day2.Level1;

class Book1{
    private String title;
    private String author;
    private int price;
    private boolean availability;

    Book1(String title,String author,int price,boolean availability){
        this.title=title;
        this.author=author;
        this.price=price;
        this.availability=availability;
    }
    String get(){
        return this.author;
    }
    void borrowBook(){
        if(this.availability){
            this.availability=false;
            System.out.println(this.title+" book of author "+this.author+" of price "+this.price+" has now issued");
        }
        else{
            System.out.println(this.title+" book of author "+this.author+" of price "+this.price+" is not available");
        }
    }
}
class LibraryBookSystem {
    public static void main(String[]args) {
        Book1 b1 = new Book1("The Udit", "udit patel", 1000, true);
        b1.borrowBook();
        b1.borrowBook();
    }
}
