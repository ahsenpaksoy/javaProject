package day_19_stringManipulation_part1;

import java.util.Scanner;

public class String_Length {

	public static void main(String[] args) {
		
		String str  = "Java";
		System.out.println(str.length());
		int x = str.length();
		System.out.println(x*10);
		
		String str1 = new String("Java");
		System.out.println(str1.length());
		
	//************************************************
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your first name:");
		String firstName = sc.next();
		
		System.out.println("Enter your last name:");
		String lastName = sc.next();
		
		System.out.println("Total characters in your first and last name is:" + ((firstName.length()) + lastName.length()));
		

	}

}
