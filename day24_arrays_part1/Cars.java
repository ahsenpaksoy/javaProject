package day24_arrays_part1;



import java.util.Scanner;

public class Cars {

	public static void main(String[] args) {
		
	//
		String[] cars = createArray();
		
	if (findCar(cars)) {
		System.out.println("Found");
		
	} else {
		System.out.println("Not Found");

	}
		
		

	}
	
	//createArray method - will accept one parameter which is arraySize 
	//user will enter some cars
	
	//findcar method - will accept 2 parameters which 1-int value, toFindCar 
	//if car is found - return true
	//if not return false
	
	public static String[] createArray() {
		System.out.println("How many cars ? ");
		Scanner sc = new Scanner(System.in);
		int carNo =sc.nextInt();
		String[] carArray = new String[carNo];
		
		for (int i = 0; i < carArray.length; i++) {
			System.out.println("Enter your car #" + (i+1));
			carArray[i] = sc.next();
		}
		return carArray;
		
	}
	
	public static boolean findCar( String[] cars ) {
		
		System.out.println("which car looking for?");
		Scanner sc = new Scanner(System.in);
		String carToFind = sc.nextLine();
		for(String car : cars) {
			
			//System.out.println(car);
			if(car.equalsIgnoreCase(carToFind)) {
				
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}