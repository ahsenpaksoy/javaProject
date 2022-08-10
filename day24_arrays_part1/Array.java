package day24_arrays_part1;

public class Array {

	public static void main(String[] args) {
		
		int[] myList = {10,20,30,40};
		
		String[] myArray = {"Apple","Orange","Watermelon"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		int sum = 0;
		int[] scores = {80,90,100,35,60,72,64,30,10,80,90,100,64,30,10,5,3,99,89};
		
		for(int i=0; i<scores.length; i++) {
			
			sum = sum + scores[i];
		}
		System.out.println("Sum is: " + sum);
		System.out.println("Total element is:" + scores.length);
		System.out.println("Average is:" + sum/scores.length);
		
	//*************************************************************************
		
		String[] shoppingList = {"cheese","pumpkin","bread","eggs","milk"};
		
		for(int i = 0; i<shoppingList.length; i++) {
			
			System.out.println(shoppingList[i]);
		}
	
  //**************************************************************************
		
		String[] cars = {"toyota","nissan","bmw","mercedes","honda"};
		
		boolean flag = false;
		
		for(int i = 0; i<cars.length; i++) {
			
			if(cars[i].equals("honda")) {
		
				flag=true;
				break;
			}
		}
		
		if(flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it");
		}

		
		
		
		
		
		
		
		
		

	}

}
