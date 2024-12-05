package assignment_02;
import java.util.*;
public class MaxOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		int n1=sc.nextInt();
		
		System.out.println("Enter First Number");
		int n2=sc.nextInt();
		
		System.out.println("Enter First Number");
		int n3=sc.nextInt();
		
		if(n1>n2 && n1>n3 )
		{
			System.out.println(n1 + "is greatest");
		}
		else if (n2>n1 && n2>n3 )
		{
			System.out.println(n2 + "is greatest");
		}
		else
			System.out.println(n3 + "is greatest");

		
	}

}
