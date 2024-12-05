package Lab_Assignment;

public class ElectricCar extends Car {
	
	double batteryCapacity;
	int range ;
	
		
	public ElectricCar(String make, String model, int year, int numberOfDoors, boolean isAutomatic,
			double batteryCapacity, int range) {
		super(make, model, year, numberOfDoors, isAutomatic);
		this.batteryCapacity = batteryCapacity;
		this.range = range;
	}

	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(batteryCapacity);
		System.out.println(range);
	}

}
