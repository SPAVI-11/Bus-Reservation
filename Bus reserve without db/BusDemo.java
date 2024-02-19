
import java.util.*;
public class BusDemo {
    public static void main(String[] args){
        ArrayList<Bus> buses =new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,40));
        buses.add(new Bus(3,true,40));

        int userOpt=1;
        for(Bus i: buses){
            i.display();
        }
        Scanner sc=new Scanner(System.in);
        while(userOpt==1){
         System.out.println("Enter 1 to Book and 2 to exit");
        userOpt=sc.nextInt();
        sc.close(); 
        if(userOpt==1){
            Booking booking=new Booking();
            if(booking.isAvailable(bookings,buses)){
                bookings.add(booking);
                System.out.println("Your booking is confirmed");
            }
            else{
                System.out.println("Sorry.Bus is full.Try another bus or date.");
            }
        }
    }
    }
    
}
