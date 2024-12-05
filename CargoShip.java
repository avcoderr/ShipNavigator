
public class CargoShip extends Ship{

	private double tonnage;
	private double maxSpeed;
	
	public CargoShip()
	{
		super();
		this.tonnage = 0.0;
		this.maxSpeed = 0.0;
	}
	
	public CargoShip(String xName, String xLaunch, double xTonnage, double xSpeed)
	{
		super(xName, xLaunch);
		this.tonnage = xTonnage;
		this.maxSpeed = xSpeed;
	}
	
	
	public double getTonnage()
	{
		return this.tonnage;
		
	}
	
	public double getMaxSpeed()
	{
		return this.maxSpeed;
		
	}
	
	
	public void setTonnage(double xTonnage)
	{
		this.tonnage = xTonnage;
	}
	
	public void setMaxSpeed(double xSpeed)
	{
		this.maxSpeed = xSpeed;
	}
	
	
	//tostring
	public String toString()
	{
		return "Name: " + getName() + "\nTonnage: " + "DWT\nMaximum: " + maxSpeed + " mph";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
