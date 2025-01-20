package Day2.Level1;


class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking(){
        this.guestName="Vinay";
        this.roomType="Single";
        this.nights=1;
        System.out.println("HotelBooking object is created with default values");
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
        System.out.println("HotelBooking object is created with parameterised values");
    }
    HotelBooking(HotelBooking booking){
        this.guestName=booking.guestName;
        this.roomType=booking.roomType;
        this.nights=booking.nights;
        System.out.println("HotelBooking object is created with values of parameterised objects ");
    }

    void display(){
        System.out.println("Guest Name "+this.guestName);
        System.out.println("Room Type "+this.roomType);
        System.out.println("Nights "+this.nights);
    }
}
public class HotelBookingSystem {
    public static void main(String[]args){
        HotelBooking day1=new HotelBooking();
        HotelBooking day2=new HotelBooking("Aman Patel","Couple",2);
        HotelBooking day3=new HotelBooking(day2);

        day1.display();
        day2.display();
        day3.display();
    }
}


