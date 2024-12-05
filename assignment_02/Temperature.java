package assignment_02;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Celcius");
		double celcius=sc.nextDouble();
		
		double f=(celcius*9/5)+32;
		System.out.println("Fahrenheit =" + f);
		
		System.out.println("Enter the temperature in fahrenheit");
		double ft=sc.nextDouble();
		
		double cel=(ft-32)*5/9;
		System.out.println("celsius =" + cel);
		
	}

}
