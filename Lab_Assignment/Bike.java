package Lab_Assignment;

public class Bike extends Vehicle{
	
	String type;
	boolean hasCarrier;
	public Bike(String make, String model, int year, String type, boolean hasCarrier) {
		super(make, model, year);
		this.type = type;
		this.hasCarrier = hasCarrier;
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(type);
		System.out.println(hasCarrier);
	}

}
