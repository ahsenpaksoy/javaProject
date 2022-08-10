package Methods;

public class Genel {

	public static void sumNumbers() {

		int num1 = 10;
		int num2 = 20;
		int num3 = 30;

		int sum = num1 + num2 + num3;

		System.out.println("Total is " + sum);

	}
	// ***********************************************

	public static void greaterNumber() {

		int num3 = 45;
		int num4 = 93;

		if (num3 < num4) {

			System.out.println("Greater number : " + num4);

		} else {

			System.out.println("Greater number : " + num3);
		}

	}
	// *********************************************************

	public static void convertKM() {

		int mile = 80;
		double km = mile * 1.60934;

		System.out.println(mile + " mile = " + km + "km");
	}
	// ********************************************************

	public static String greaterNumberv2(int num3, int num4) {

		if (num3 < num4) {

			return ("Greater number : " + num4);

		} else {

			return ("Greater number : " + num4);
		}

	}
	// **********************************************************

	public static int greaterNumberv2(int num3, int num4, int num5) {

		if (num3 > num4 && num3 > num5) {
			return num3;

		}

		else if (num4 > num3 && num4 > num5) {
			return num4;

		}

		else {
			return num5;

		}

	}
	// **************************************************

	public static int xxx() {

		return 0;
	}

	public static void mainString(double hours, double hourlyPay) {
		double pay = hours * hourlyPay;
		System.out.println(pay);

	}

//***********************************************************************
	public static void calculator(int num1, int num2, String operator) {

		switch (operator) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":

			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}

	}

	// *******************************************************
	public static void stringTimes(String string, int number) {

		String str = "";
		for (int i = 0; i < number; i++) {

			str = str + string;
		}
		System.out.println(str);
	}

	// ****************************************************************
	public static void love6(int num1, int num2) {

		if (num1 == 6 || num2 == 6 || num1 + num2 == 6 || num1 - num2 == 6 || num2 - num1 == 6) {

			System.out.println(true);

		} else {

			System.out.println(false);
		}
	}

	// *****************************************************************
	public static void specialEleven(int number) {

		if (number % 11 == 0 || (number - 1) % 11 == 0 || number % 11 == 1) {

			System.out.println(true);
		} else {

			System.out.println(false);
		}
	}

//**********************************************************************
	public static void deerPlay(int temp, boolean isSummer) {

		if (isSummer) {
			if (temp < 60 && temp < 100) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		} else {
			if (temp > 60 && temp < 90) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}

		}
	}

	// *******************************************************************
	public static void caughtSpeeding(int speed, boolean isBirthday) {

		if (isBirthday) {
			if (speed <= 65) {
				System.out.println(0);
			} else if (speed >= 66 && speed <= 85) {
				System.out.println(1);
			} else if (speed >= 86) {
				System.out.println(2);
			}
		} else {
			if (speed <= 60) {
				System.out.println(0);
			} else if (speed >= 61 && speed <= 80) {
				System.out.println(1);
			} else if (speed >= 81) {
				System.out.println(2);

			}
		}
	}

	// ********************************************************************
	public static void cigarParty(int numberCigar, boolean isWeekend) {
		if (isWeekend) {

			if (numberCigar >= 40) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		} else {
			if (numberCigar >= 40 && numberCigar <= 60) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}

	}

	// ***********************************************************************
	public static int sum(int num1, int num2) {

		int result; // local variable
		result = num1 + num2;
		return result;
	}

	// ************************************************************************
	public static double distance(double speed, int time) {

		double distanceTraveled = speed * time;
		return distanceTraveled;
	}

	// ***************************************************************************
	public static boolean lastDigit(int num1, int num2) {

		if ((num1 % 10) == (num2 % 10)) {
			return true;
		} else {
			return false;
		}

	}

	// ***************************************************************************
	public static int calculateAge(int yearBirth) {
		return 2022 - yearBirth;
	}

	public static void yearsUntilRetirement(String name, int year) {
		// retirement age = 65 - age
		int retirementAge = 65 - calculateAge(year);
		System.out.println(name + " retires in " + retirementAge + " years");
	}

	// ***************************************************************************
	public static void displayHighScorePosition(String playerName, int highScorePosition) {

		System.out.println(
				playerName + " managed to get into position " + highScorePosition + " on the high score table  ");

	}

	public static int calculateHighScorePosition(int playerScore) {

		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}

	}

	// ********************************************************************
	public static boolean isPrime(int number) {
		boolean flag = true;

		if (number == 0 || number == 1) {
			flag = false;

		} else {

			for (int i = 2; i < number; i++) {

				if (number % i == 0) {
					flag = false;
					break;
				}
			}
		}

		return flag;
	}
	// **********************************************************************

	public static void sum() {
		System.out.println("Hello");
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	public static int sum(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}

	/*
	 * 1- Number of parameters add(int,int) add(int,int,int)
	 * 
	 * 2- Data type of parameters add(int,int) add(int,float)
	 * 
	 * 3- Sequence of data type parameters add(int,float) add(float,int)
	 * 
	 * 4- Invalid case - not overloading int add(int,int) float add(int,int)
	 */
	// ***************************************************************
	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

		if (feet < 0 || (inches < 0 || inches > 12)) {
			System.out.println("Invalid feet or inches");
			return -1;
		}
		double centimeters = (feet * 12) * 2.54;
		System.out.println(feet + " feet," + inches + " inches=" + centimeters + " centimeters");
		return centimeters;
	}

	public static double calcFeetAndInchesToCentimeters(double inches) {

		if (inches < 0) {
			return -1;
		}
		double feet = (int) inches / 12;
		double remainingInches = inches % 12;

		System.out.println(inches + " inches=" + feet + " feet and " + remainingInches + "inches");

		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
//**********************************************************************

	public class Dog {

		String breed;
		int age;
		String color;
		String name;

		public void barking() {
			System.out.println(name + " is barking");
		}

		public void hungry() {
			System.out.println(name + " is hungry");

		}

		public void sleeping() {
			System.out.println(name + " is sleeping");
		}

	}
	// *********************************************************

	public class Car {

		String make;
		String model;
		int currentSpeed;
		String color;

		public void printCarInfo() {

			String info = "Car make[" + make + "],model[" + model + "],color[" + color + "],current speed["
					+ currentSpeed + "]";
			System.out.println(info);

		}

		public void showCurrentSpeed(int speedLimit) {
			if (currentSpeed <= speedLimit) {
				System.out.println(
						make + " is driving at" + currentSpeed + " mph,following the speed limit-" + speedLimit);
			} else {
				System.out.println(make + " is driving at" + currentSpeed + " mph,over the speed limit-" + speedLimit);
			}

		}

		public void drive() {
			System.out.println(make + " " + model + " is driving...");
		}

		public void accelerate(int mph) {
			currentSpeed = currentSpeed + mph;
		}

	}

	// ****************************************************************

	public class CellPhone {

		String brand;
		double screenSize;
		String color;
		double price;

		public void call() {
			System.out.println("Calling");
		}

		public void message() {
			System.out.println("Sending text message...");
		}

		public void takeAphoto() {
			System.out.println("Taking a photo");
		}

	}

}
