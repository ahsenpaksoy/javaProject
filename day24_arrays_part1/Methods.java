package day24_arrays_part1;

import java.util.ArrayList;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
	
		int[] numbers = getNumbers();
		
		showArray(numbers);
		showArray(evenNumbers(numbers));

	}
	public static int[] getNumbers() {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers? ");
		int num = scan.nextInt();
		
		int[] numbers = new int[num];
		
		System.out.println("Enter series of " + numbers.length + " numbers");
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Enter number " + (i+1) + " :");
			numbers[i] = scan.nextInt();
		}
		return numbers;
	}
	public static void showArray(int[] numbers) {
		System.out.println("Here are the numbers you entered");
		for(int value : numbers) {
			System.out.println(value + " ");
		}
		
	}
	
	public static void showArray(ArrayList<Integer> numbers) {
		System.out.println("Here are the even numbers ");
		for(int value : numbers) {
			System.out.print(value + " ");
		}
		
	}
	public static ArrayList<Integer> evenNumbers(int[] numbers) {
		
		ArrayList<Integer> evenNumberArr = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) {
				evenNumberArr.add(numbers[i]);
			}
		}
	return evenNumberArr;
	}
	}
	
	
	

	


