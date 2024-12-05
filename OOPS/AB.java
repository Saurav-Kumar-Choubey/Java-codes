package OOPS;

public class AB {
	
	// Constructor 1 : Default constructor for class AB
	AB(){
		System.out.println("hello A"); //  this prints hello A when the default constructor is called
	}
	// Parametrized constructor
	
	AB(int x)
	{
		this(); // Calls the default constructor AB
		System.out.println(x);
	}
}
