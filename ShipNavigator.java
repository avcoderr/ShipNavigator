import java.util.Scanner;

public class ShipNavigator {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		boolean continueProgram = true;
		
		System.out.println("Welcome to ShipNavigator!");
		
		while(continueProgram)
		{
			System.out.println("Enter the name of the ship: ");
			String name = key.nextLine();
			
			System.out.println("Enter its launch date (mm/dd/yyyy): ");
			String launchDate = key.nextLine();
			
			System.out.print("Is it a cruise ship or a cargo ship? ");
            String type = key.nextLine();

            if (type.equalsIgnoreCase("Cruise ship")) {
                System.out.print("Enter the ship's passenger capacity: ");
                int capacity = key.nextInt();

                System.out.print("How many crew members are on this ship? ");
                int crew = key.nextInt();
                key.nextLine(); // Clear the buffer

                CruiseShip cruiseShip = new CruiseShip(name, launchDate, capacity, crew);
                System.out.println("Creating a cruise ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cruiseShip);

            } else if (type.equalsIgnoreCase("Cargo ship")) {
                System.out.print("Enter the ship's tonnage (DWT): ");
                double tonnage = key.nextDouble();

                System.out.print("Enter the maximum speed of the ship (in mph): ");
                double speed = key.nextDouble();
                key.nextLine(); // Clear the buffer

                CargoShip cargoShip = new CargoShip(name, launchDate, tonnage, speed);
                System.out.println("Creating a cargo ship...");
                System.out.println("Printing the ship's details:");
                System.out.println(cargoShip);
            } else {
                System.out.println("Invalid ship type entered. Please try again.");
                continue;
            }

            System.out.print("Do you want to construct another ship object? Enter yes or no: ");
            String choice = key.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                continueProgram = false;
                System.out.println("Goodbye!");
            }
        }

		key.close();
		
		}
	
		
		
		
		
	}


