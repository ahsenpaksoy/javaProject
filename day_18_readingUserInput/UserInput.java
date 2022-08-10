package day_18_readingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a byte value:");
		byte b1 = scan.nextByte();
		System.out.println("Byte value is " + b1);
		
		System.out.println("Enter a short value:");
		short s1 = scan.nextShort();
		System.out.println("Short value is " + s1);
		
		System.out.println("Enter a int value:");
		int i1 = scan.nextInt();
		System.out.println("Int value is " + i1);
		
		System.out.println("Enter a long value:");
		long l1 = scan.nextLong();
		System.out.println("Long value is " + l1);
		
		System.out.println("Enter a double value:");
		double d1 = scan.nextDouble();
		System.out.println("Double value is " + d1);
		
		System.out.println("Enter a boolean value:");
		boolean bool = scan.nextBoolean();
		System.out.println("Boolean value is " + bool);

	}

}
