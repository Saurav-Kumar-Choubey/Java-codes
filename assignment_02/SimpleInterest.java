package assignment_02;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the principal");
		float p=sc.nextFloat();
		
		System.out.println("Enter the Rate");
		float r=sc.nextFloat();
		
		System.out.println("Enter the time");
		float t=sc.nextFloat();
		
		double si=(p*r*t)/100;
		
		System.out.println("Simple Interest is "+ si);
		
		
		
		
	}

}
