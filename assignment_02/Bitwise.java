package assignment_02;

import java.util.Scanner;

public class Bitwise {
	 public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the value X: ");
	 int x = input.nextInt();
	 System.out.println("Enter the value of Y: ");
	 int y = input.nextInt();
	 int and = x & y;
	 System.out.println("Bitwise AND: " + and );
	 int or = x | y;
	 System.out.println("Bitwise OR: " + or );
	 int xor = x ^ y;
	 System.out.println("Bitwise XOR: " + xor );
	 int left = x << y;
	 System.out.println("Bitwise Left: " + left );
	 int right = x >> y;
	 System.out.println("Bitwise Right: " + right );
	 int unsright = x >>> y;
	 System.out.println("Bitwise Unsigned Right: " + unsright );
	 }
}
