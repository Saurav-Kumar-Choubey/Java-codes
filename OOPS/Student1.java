package OOPS;

import java.util.Scanner;

public class Student1 {

		private int roll;
		private char grade;
		private float per;
		
		public void setData()
		{	
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Roll, grade and percentage");
			
			roll=sc.nextInt();
			grade=sc.next().charAt(0);
			per=sc.nextFloat();
			
		}
		//public method to display the student information
		public void displayData() {
			System.out.println("Roll " + roll);
			System.out.println("Grade " + grade);
			System.out.println("Percentage " + per);

			
		}
}
