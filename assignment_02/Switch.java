package assignment_02;
import java.util.*;
public class Switch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the First Number");
		int n1=sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int n2=sc.nextInt();
		
		System.out.println("Select an operation:");
        System.out.println("1: Add");
        System.out.println("2: Subtract");
        System.out.println("3: Multiply");
        System.out.println("4: Divide");
        System.out.println("5: Modulo");
        System.out.println("6: Power");
        
        System.out.print("Action perform ");
        int action = sc.nextInt();
        
        switch (action) {
        case 1:
            System.out.println("Result: " + (n1 + n2));
            break;
        case 2:
            System.out.println("Result: " + (n1 - n2));
            break;
        case 3:
            System.out.println("Result: " + (n1 * n2));
            break;
        case 4:
            if (n2 != 0) {
                System.out.println("Result: " + (n1 / n2));
            } else {
                System.out.println("Error: Division by zero");
            }
            break;
        case 5:
            System.out.println("Result: " + (n1 % n2));
            break;
        case 6:
            System.out.println("Result: " + Math.pow(n1, n2));
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
        
        
		
		
	}

}
