
public class Ship {

private String shipName;
private String shipLaunch;


public Ship()
{
	this.shipName = "unknown";
	this.shipLaunch = "01/01/1990";
}

public Ship(String xName, String xLaunch)
{
	this.shipName = xName;
	setLaunch(xLaunch);
}


public String getName()
{
	return this.shipName;
}

public String getLaunch()
{
	return this.shipLaunch;
}


public void setName(String xName)
{
	this.shipName = xName;
}

public void setLaunch(String xLaunch)
{
	String[] dateParts = xLaunch.split("/");
	int year = Integer.parseInt(dateParts[2]);
	
	if(year < 1990 || year > 2019)
	{
		System.out.println("Erro: Launch date must be between 1990 and 2019. Resetting to default 01/01/1990.");
		this.shipLaunch = "01/01/1990";
	}
	else
	{
		this.shipLaunch = xLaunch;
	}
	
}

//the toString method.

public String toString()
{
		return "Name: " + shipName + "\nLaunch Date: " + shipLaunch;
	}




















}
