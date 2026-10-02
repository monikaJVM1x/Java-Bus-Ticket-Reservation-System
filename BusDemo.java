package BusReservation;
import java.util.*;

public class BusDemo {
	public static void main(String[] args)
	{
		ArrayList<Bus> busList=new ArrayList<Bus>();
		ArrayList<Booking> bookingList=new ArrayList<Booking>();
		
		busList.add(new Bus(1,true,2));
		busList.add(new Bus(2,false,3));
		busList.add(new Bus(3,true,2));
		
		for(Bus b:busList)
		{
			b.displayDetails();
		}
		
		//Bus buses[]=new Bus[50];//not better ,use ArrayList
		
		int userOpt=1;
		Scanner obj=new Scanner(System.in);
		
		while(userOpt==1)
		{
			System.out.println("Enter 1 to Book and 2 to exit");	
			userOpt=obj.nextInt();
			if(userOpt==1)
			{
				Booking booking=new Booking();
				if(booking.isAvailable(bookingList,busList))
				{
					bookingList.add(booking);
					
					System.out.println("Your Booking is Done.");
				}
				else
				{
					System.out.println("Sorry. Bus is Full. Try Another Bus or Date.");
				}
			}
		}
	}

}
