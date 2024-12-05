
public class CruiseShip extends Ship{

	private int passengerCapacity;
	private int crewCount;
	
	public CruiseShip()
	{
		super();
		this.passengerCapacity = 0;
		this.crewCount = 0;
	}
	
	public CruiseShip(String xName, String xLaunch, int xCapacity, int xCrew)
	{
		super(xName, xLaunch);
		this.passengerCapacity = xCapacity;
		this.crewCount = xCrew;
	}
	
	
	public int getCapacity()
	{
		return this.passengerCapacity;
	}
	
	public int getCrew()
	{
		return this.crewCount;
	}
	
	
	public void setCapacity(int xCapacity)
	{
		this.passengerCapacity = xCapacity;
	}
	
	public void setCrew(int xCrew)
	{
		this.crewCount = xCrew;
	}
	
	
	//tostring
	
	public String toString()
	{
		return "Name: " + getName() + "\nPassenger Capacity: " + passengerCapacity + "\nCrew: " + crewCount;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
