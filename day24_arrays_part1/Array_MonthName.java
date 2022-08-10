package day24_arrays_part1;

import java.util.Scanner;

public class Array_MonthName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] myArray = new String[12];
		myArray[0] = "Jan";
		myArray[1] = "Feb";
		myArray[2] = "March";
		myArray[3] = "April";
		myArray[4] = "May";
		myArray[5] = "Jun";
		myArray[6] = "July";
		myArray[7] = "August";
		myArray[8] = "Sep";
		myArray[9] = "October";
		myArray[10] = "Nov";
		myArray[11] = "Dec";
		
		System.out.println("Enter your month index number:");
		int index = sc.nextInt();
		
		System.out.println("The month is " + myArray[index]);
		
	//****************************************************************
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thirsday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		System.out.println("Enter your day index number:");
		int index1 = scan.nextInt();
		System.out.println("The day is " + days[index1]);
		
		
		
		
		
		
		
		
		

	}

}
