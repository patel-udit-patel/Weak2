package Day2.Level1;

class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;

    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
        System.out.println("CarRental object is created with parameterised values ");
    }
    int calculateTotalCost(int price){
        int totalCost;
        totalCost=rentalDays*price;
        return totalCost;
    }
}
public class CarRentalSystem {
    public static void main(String[]args){
        CarRental car1=new CarRental("Udit Patel","Toyota Fortuner",7);
        System.out.println(car1.calculateTotalCost(2000));
    }
}
