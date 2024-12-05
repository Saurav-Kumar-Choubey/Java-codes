package assignment_02;
import java.util.*;
public class AddIndividualDigit {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 digit Number");
		
		int n=sc.nextInt();
		
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum=temp+sum;
			n=n/10;
		}
		
		System.out.println("sum of all digit is "+ sum);
	}

}
