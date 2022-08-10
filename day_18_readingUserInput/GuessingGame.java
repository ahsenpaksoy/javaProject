package day_18_readingUserInput;

import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		int userInput;
		int secretNumber = 8;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 and 20:");
		
		do {
			userInput = sc.nextInt();
			if(userInput<secretNumber) {
				System.out.println("Enter a bigger number:");
			}else if(userInput>secretNumber) {
				System.out.println("Enter a smaller number:");
			}else {
				System.out.println("Congrat y4ou got it....");
			}
			
			
			
		}while(userInput != secretNumber);
		

	}

}
