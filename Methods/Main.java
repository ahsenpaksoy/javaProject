package Methods;

import Methods.Genel.Car;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Convert Mile to KM
		// Genel.convertKM();
		// Genel.greaterNumber();
		// Genel.sumNumbers();
		// String result = Genel.greaterNumberv2(34, 56);
		// System.out.println(result);
		// System.out.println(Genel.greaterNumberv2(34,76, 76));
		//
		// static olmayan bir metotdu sadece zeni object olusturarak cagir
		// ClassDemo4Object myLove = new ClassDemo4Object();
		// myLove.myLove("Ahsen");

		// Genel.mainString(37,84.90);

//		Genel.calculator(6, 3, "+");
//		Genel.calculator(6, 3, "-");
//		Genel.calculator(6, 3, "*");
//		Genel.calculator(6, 3, "/");

		// Lab_1:
		// Genel.stringTimes("Hi", 4);

		// Lab_2:
//		Genel.love6(6,4);
//		Genel.love6(4,5);
//		Genel.love6(1,5);
//		Genel.love6(12,6);

		// Lab_3:
		// Genel.specialEleven(22);
		// Genel.specialEleven(23);
		// Genel.specialEleven(24);

		// Lab_4:
		// Genel.deerPlay(70, false);
		// Genel.deerPlay(95, false);

		// Lab_5:
		// Genel.caughtSpeeding(60, false);
		// Genel.caughtSpeeding(65, false);

		// Lab_6:
		// Genel.cigarParty(50, false);

		// Value return
		// System.out.println(Genel.sum(2, 3));
		// int v1 = Genel.sum(2,3);
		// System.out.println(v1*5);
		// System.out.println(v1);

		// Distence
//		System.out.println(Genel.distance(40, 5));
//		double d = Genel.distance(40,5);
//		System.out.println(d);

//		if (d>500) {
//			System.out.println("you spent too much gas");
//		}else {
//			System.out.println("you spent ok gas");
//		}

		// LastDigit
		// if(Genel.lastDigit(7,17)) {
		// System.out.println("They have the same last digit");
		// }else {
		// System.out.println("They dont have the same last digit");
		// }

		// yearsUntilRetirement
		// Genel.yearsUntilRetirement("Sinem ", 2009);

		// displayHighScorePosition
//		int x = Genel.calculateHighScorePosition(1500);
//		System.out.println(x);
//		System.out.println(Genel.calculateHighScorePosition(1500));
//		Genel.displayHighScorePosition("Mike", x);
//		Genel.displayHighScorePosition("Tom", Genel.calculateHighScorePosition(500));
//		Genel.displayHighScorePosition("Mike", 1);
//		
//		//isPrime
//		int number = 4;
//		if (Genel.isPrime(number)) {
//			System.out.println(number + " is a prime number");
//		}else {
//			System.out.println(number + " is not a prime number");
//		}

		// Method Overloading
//		System.out.println(Genel.sum(1,3,5));
//		int x = Genel.sum(10, 20, 30, 40);
//		System.out.println(x);
//		Genel.sum();

		// calcFeetAndInchesToCentimeters
		// Genel.calcFeetAndInchesToCentimeters(100);
		// Genel.calcFeetAndInchesToCentimeters(6, 5);

		// DogObjects
		
		// OuterClass.InnerClass innerObject = outerObject.new InnerClass();
		Genel genel = new Genel();

		Genel.Dog  dog1 = genel.new Dog();
		Genel.Dog  dog2 = genel.new Dog();
		Genel.Dog  dog3 = genel.new  Dog();

		dog1.age = 10;
		dog1.color = "Red";
		dog1.breed = "Maltese";
		dog1.name = "Rover";

		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);

		dog1.barking();
		dog1.hungry();
		dog1.sleeping();

		dog2.age = 15;
		dog2.color = "White";
		dog2.breed = "Maltese";
		dog2.name = "Lessy";

		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);

		dog2.barking();
		dog2.hungry();
		dog2.sleeping();

//*****************************************************************************		

		// CarObjects
		Genel.Car car1 = genel.new Car();
		car1.printCarInfo();

		car1.make = "Ford";
		car1.model = "Fiesta";
		car1.color = "Grey";
		car1.currentSpeed = 55;

		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.showCurrentSpeed(35);

		car1.drive();
		System.out.println("before: " + car1.currentSpeed);
		car1.accelerate(20);

		System.out.println("after: " + car1.currentSpeed);
//**************************************************************************

		CellPhone cell1 = new CellPhone();
		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);

		cell1.brand = "Nokia 6300";
		cell1.screenSize = 2.0;
		cell1.color = "Silver";
		cell1.price = 76.16;

		System.out.println(cell1.brand);
		System.out.println(cell1.screenSize);
		System.out.println(cell1.color);
		System.out.println(cell1.price);

		cell1.color = "Black";
		System.out.println(cell1.color);

		CellPhone cell2 = new CellPhone();
		cell2.brand = "Siemens";
		cell2.screenSize = 1.5;
		cell2.color = "Red";
		cell2.price = 39.22;
		// TODO Buraya ekleme yapilacak

		System.out.println("###CELL 2 VALUES###");
		System.out.println("Brand: " + cell2.brand);
		System.out.println("screenSize: " + cell2.screenSize);
		System.out.println("Color: " + cell2.color);
		System.out.println("Price: " + cell2.price);

		System.out.println("###Calling Methods###");

		cell1.call();
		cell1.message();
		cell1.takeAphoto();

		cell2.call();
		cell2.message();
		cell2.takeAphoto();

	}

}
