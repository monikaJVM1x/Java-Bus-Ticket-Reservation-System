package BusReservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Booking {

	String passengerName;
	int busNo;
	Date date;
	
	Booking()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter passenger name: ");
		passengerName=scan.next();
		System.out.println("Enter Bus Number: ");
		busNo=scan.nextInt();
		System.out.println("Enter Date (format in dd-mm-yyyy): ");
		String dateInput=scan.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookingList,ArrayList<Bus> busList) {
		
		int busCapacity=0;
		for(Bus bus:busList)
		{
			if(bus.getbusNo()==busNo)
			{
				busCapacity=bus.getCapacity();
			}
		}
		
		int booked=0;
		
		for(Booking book:bookingList)
		{
			if(book.busNo==busNo && book.date==date)
			{
				booked++;
			}
		}
		
		return booked < busCapacity ? true: false;
	}
}
