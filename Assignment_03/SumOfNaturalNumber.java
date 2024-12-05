package Assignment_03;
import java.util.*;
public class SumOfNaturalNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the last digit");
		 int n=sc.nextInt();
		 
		 int sum=0;
		 int i=1;
		 while(i<=n)
		 {
			 sum=sum+i;
			 i++;
		 }
		 System.out.println("Sum from 1 till last digit is " + sum);

	}

}
