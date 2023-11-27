package Task1;

import java.util.Scanner;
import java.util.Random;


public class GuessTheNumber {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int minRange = 1;
	        int maxRange = 100;
	        int attemptsLimit = 5;
	        int score = 0;
	        boolean playAgain = true;

	        while (playAgain) {
	            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;
	            int attempts = 0;
	            boolean guessedCorrectly = false;

	            System.out.println("Welcome to Guess the Number Game!");
	            System.out.println("Guess a number between " + minRange + " and " + maxRange);

	            while (attempts < attemptsLimit) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == generatedNumber) {
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                    guessedCorrectly = true;
	                    score++;
	                    break;
	                } else if (userGuess < generatedNumber) {
	                    System.out.println("Too low! Try again.");
	                } else {
	                    System.out.println("Too high! Try again.");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've reached the maximum number of attempts. The number was: " + generatedNumber);
	            }

	            System.out.println("Your current score: " + score);
	            System.out.print("Do you want to play again? (yes/no): ");
	            String playChoice = scanner.next().toLowerCase();

	            if (!playChoice.equals("yes")) {
	                playAgain = false;
	                System.out.println("Thanks for playing! Your final score: " + score);
	            }
	        }
	        scanner.close();
	    }
	}



