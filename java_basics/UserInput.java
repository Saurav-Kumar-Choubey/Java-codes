package java_basics;
import java.util.*;
public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name= sc.nextLine();
		
		System.out.println("Enter Your age");
		int n=sc.nextInt();
		
		System.out.println("Enter Your GPA");
		double d=sc.nextDouble();
		
		System.out.println("Name "+name);
		System.out.println("Age "+n);
		System.out.println("GPA "+d);
		
	}

}
