
import java.util.Scanner;
//MovieTicket creates object of movie Ticket
class MovieTicket{
    String movieName;
    int seatNumber;
    int price;

    //Constructor of class MovieTicket
    MovieTicket(String movieName,int seatNumber,int price){
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.price=price;

    }
    //DisplayTicket displays data of ticket
    void displayTicket(){
        System.out.println("Name of movie "+this.movieName);
        System.out.println("Seat number "+this.seatNumber);
        System.out.println("Price of ticket "+this.price);
    }
}

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        //Use Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Taking input from user
        System.out.println("Enter name ,ticket number and price of movie");
        String movieName = input.next();
        int ticketNumber = input.nextInt();
        int price = input.nextInt();

        //Creating object of MovieTicket
        MovieTicket first = new MovieTicket(movieName, ticketNumber, price);
        //Calling displayTicket method for first object
        first.displayTicket();
    }
}
