package Assignment_03;
import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number between 1 to 100");
			Random random=new Random();
			 int numberToGuess = random.nextInt(100) + 1;
		        System.out.println();
		        int guess;
		        int count=0;
		        do {
		            guess = sc.nextInt();
		            count++;
		            if (guess == numberToGuess) {
		                System.out.println("Congratulation, you guessed the number");
		                System.out.println("The guessed in "+count+ " times");
		                break;
		            } else if (guess > numberToGuess) {
		                System.out.println("The number is too high, Try Again");
		            } else {
		                System.out.println("The number is too low, Try Again");
		            }
		        }while (true);
			
			
		
	}

}
