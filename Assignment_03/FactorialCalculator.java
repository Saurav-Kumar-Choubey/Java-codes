package Assignment_03;
import java.util.*;
public class FactorialCalculator {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int n=sc.nextInt();
			int fact=1;
			if ( n < 0 )
		         System.out.println("Number should be non-negative.");
		      else
		      {
		         for (int i = 1 ; i <= n ; i++ )
		            fact = fact*i;

		         System.out.println("Factorial of "+n+" is = "+fact);
		      }
		
	}

}
