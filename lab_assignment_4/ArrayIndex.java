package lab_assignment_4;

import java.util.InputMismatchException;

public class ArrayIndex {

	public static void main(String[] args) {

			try {
				float n1 = 5;
				float n2 = 0;
				float divide = n1/n2;
				
			} 
//			catch (InputMismatchException e) {
//
//			System.out.println("Given Input is not ideal");
//			}
			
			catch(ArithmeticException e)
			{
				System.out.println(" Nunber can't divide by zero");
			}
		
	}

}
