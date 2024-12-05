package Lab_Assignment;

public class Vehicle {
		
	String make;
	String model;
	int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	public void displayInfo()
	{
		System.out.println(make);
		System.out.println(model);
		System.out.println(year);
	}
	
	
}
