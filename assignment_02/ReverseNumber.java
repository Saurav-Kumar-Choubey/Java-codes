package assignment_02;
import java.util.*;
public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int rev=sc.nextInt();
		
		int temp=0,sum=0;
		
		while(rev>0) {
		
		temp=rev%10;
		sum = (sum*10)+temp;
		rev=rev/10;
		}
		System.out.println(sum);
	}

}
