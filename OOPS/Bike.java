package OOPS;

public class Bike {
	
	final int speedlimit = 90;
	
	void run() {
	//	speedlimit = 400; // Error trying to change the value of final variable
	}
	
	public static void main(String[] args) {
		Bike b=new Bike(); // create an instance of bike class
		b.run();  // attempt to call run method
	}
	
}
