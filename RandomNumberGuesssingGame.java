import java.util.Scanner;
import java.util.Random;

public class RandomNumberGuesssingGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int LowerRange = 1;
		int UpperRange = 100;
		int maxAttempt = 5;
		int Score = 0;
		
		System.out.println("Welcome to number guessing game!");
		
		
		while(true) {
			int secretNumber = rd.nextInt(UpperRange - LowerRange + 1) -LowerRange;
			int attempts = 0;
			
			System.out.println("Please guess number between" + LowerRange + "and" + UpperRange + ".");
			
			while (attempts < maxAttempt) {
				System.out.println("Enter your choise from given range: ");
				int userGuess = sc.nextInt();
				attempts++;
				
				
				if(userGuess == secretNumber)
				{
					System.out.println("Congratulations!You guess the correct number");
					Score++;
					break;
				} else if (userGuess < secretNumber) {
					System.out.println("Your guess is Too Low,Try again.");	
				}else {
					System.out.println("Your guess is Too High,Try again");
					
				}
				System.out.println("You can not guess correct number");
	    	}
			System.out.println("Do you want to play again? (Yes/No:");
			String playAgainResponse = sc.next().toLowerCase();
			if(!playAgainResponse.equals("Yes")) {
				break;
			}
		}
		
		System.out.println("Your final score is:"+Score);
		sc.close();
	}

}
