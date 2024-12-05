package Assignment_03;
import java.util.*;
public class SimpleCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two digit");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		System.out.println("Operations to perform");
		System.out.println("1-Add, 2-Substract, 3-multiply, 4-divide");
		
		int operator=sc.nextInt();
		
		switch(operator)
		{
		case 1: System.out.println(n1+n2);
		break;
		
		case 2: System.out.println(n1-n2);
		break;
		
		case 3: System.out.println(n1*n2);
		break;
		
		case 4: System.out.println(n1/n2);
		break;
		
		default:
		System.out.println("Please Enter Valid Operation");
		
		
		
		}
	}

}
