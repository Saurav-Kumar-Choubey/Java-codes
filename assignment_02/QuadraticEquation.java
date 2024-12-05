package assignment_02;
import java.util.*;
public class QuadraticEquation {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the value of a");
		double a=sc.nextDouble();
		
		System.out.println("enter the value of a");
		double b=sc.nextDouble();
		
		System.out.println("enter the value of a");
		double c=sc.nextDouble();
		
		double det=(b*b)-(4*a*c);
		double sqrt = Math.sqrt(det);
		
		double num1=(b*(-1))+sqrt;
		double num2=(b*(-1))+sqrt;
		
		System.out.println("roots are " + num1/(2*a) + " and " + num2/(2*1));
		
		
		
		
		
	}
}
