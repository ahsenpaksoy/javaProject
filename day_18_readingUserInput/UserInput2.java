package day_18_readingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Provide a sentence and I will repeat it:");
//		//String str = scan.next(); // tek kelime alir
//		String str2 = scan.nextLine(); // tum satiri alir
//		System.out.println(str2);
		
	//***************************************************************
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
	
		
		sc.nextLine();
		
		System.out.println("Enter a string;");
		String str = sc.nextLine();
		
		System.out.println("Output:" + num1 + ":" + num2 + ":" + str);
		
		
		
		
		
		
		

	}

}
