package Assignment_03;
import java.util.*;
public class PrimeChecker {

	public static void main(String[] args) {

		
		 int j, num, flag = 0;
	        System.out.print("Enter the number :");
	        Scanner sc = new Scanner(System.in);
	        num = sc.nextInt();
	        for( j = 2; j < num; j++)
	        {
	            if(num % j == 0)
	            {
	                flag = 0;
	                break;
	            }
	            else
	            {
	                flag = 1;
	            }
	         }
	         if(flag == 1)
	         {
	             System.out.println(""+num+" is a prime number.");
	         }
	         else
	         {
	             System.out.println(""+num+" is not a prime number.");
	         }           
	    }
	}
