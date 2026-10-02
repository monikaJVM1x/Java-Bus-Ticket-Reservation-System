package BusReservation;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;//to access this from another class ,should use get and set method
	
	public Bus(int busNo,boolean ac, int cap)
	{
		this.busNo=busNo;
		this.ac=ac;
		this.capacity=cap;
	}
	
	public int getbusNo()
	{
		return busNo;
	}

	public int getCapacity()
	{
		return capacity;
	}
	public void setCapacity(int cap)
	{
		capacity=cap;
	}
	
	public boolean isAc()
	{
		return ac;
	}
	public void setAc(boolean val)
	{
		ac=val;
	}
	
	public void displayDetails()
	{
		System.out.println("Bus Details: ");
		System.out.println("Bus No - "+busNo+", AC - "+ac+", seats - "+capacity);
	}
	
}
