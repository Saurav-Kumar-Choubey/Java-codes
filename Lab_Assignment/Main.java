package Lab_Assignment;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("BMW", "X5", 2024, 2, true),
            new Car("Mercedes", "Maybech", 2022, 4, true),
            
            new Bike("KTM", "DUKE390", 2023, "Adventure", false),
            new Bike("KAWASAKI", "Ninja", 2024, "Rally", true)
            
            
        };

        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
        Car[] car= {
        		new ElectricCar("TATA", "PUNCH", 2024, 4, true, 2000.00 , 500),
        };
        
        for (Car car2 : car) {
        	car2.displayInfo();
        	System.out.println();
			
		}
        
        
    }
    
}
