package Lab_Assignment;

public class Car extends Vehicle {

		int numberOfDoors;
		boolean  isAutomatic;
		
		public Car(String make, String model, int year,int numberOfDoors,boolean isAutomatic) {
			super(make, model, year);
			this.numberOfDoors=numberOfDoors;
			this.isAutomatic=isAutomatic;
		}
		
		@Override
		public void displayInfo()
		{
			
			super.displayInfo();
			System.out.println(numberOfDoors);
			System.out.println(isAutomatic);
		}
			
}
