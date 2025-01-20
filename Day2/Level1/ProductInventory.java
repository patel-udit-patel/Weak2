package Day2.Level1;

class Product{
    private String productName;
    private int price;
    private static int totalProducts;
    Product(String productName,int price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    void displayProductDetails(){
        System.out.println("Name of product "+this.productName);
        System.out.println("Price of product "+this.price);
    }
    void displayTotalProducts(){
        System.out.println("The total number of products created "+totalProducts);
    }
}
public class ProductInventory {
    public static void main(String[]args){
        Product p1=new Product("Shampoo",199);
        p1.displayProductDetails();
        p1.displayTotalProducts();
    }
}