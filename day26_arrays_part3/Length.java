package day26_arrays_part3;

import java.util.Arrays;

public class Length {

	public static void main(String[] args) {
		
		int[][] numbers = {
				{1,2,3,4},
				{5,6},
				{9,10,11,23,50,60}
		};
		//display the number of rows
		System.out.println(numbers.length);
		
		//display the number of columns in each row
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
		}
		
		System.out.println("------------------------------------");
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
	//********************************************************************
		
		int[][] numbers1 = {{1,2,3},{4,5},{7,8,9}};
		for (int row = 0; row < numbers1.length; row++) {
			for (int column = 0; column < numbers1[row].length; column++) {
				System.out.println(numbers1[row][column]);
			}
		}
	//*********************************************************************
		
		String[][] pizzas = {
				
				{"pinneapple","pepperoni"},
				{"anchovies","mushroom","olives"},
				{"4 cheese"},
				{"chicken","tomatoes","onions"},
				{"green peppers","zuccini","brocoli","spinach","shrimp"}
		
				};
		System.out.println(Arrays.toString(pizzas[0]));
		
		System.out.println("###FOR EACH LOOP###");
		for(String[] pizza : pizzas) {
			System.out.print(pizza.length + "-");
			System.out.println(Arrays.toString(pizza));
		}
		
		System.out.println("###FOR ITERATOR LOOP###");
		for (int i = 0; i < pizzas.length; i++) {
			System.out.print(pizzas[i].length+"-");
			System.out.println(Arrays.toString(pizzas[i]));
		}
		System.out.println("--------------------------------------");

		for (String value : pizzas[3]) {
			System.out.println(value);
		}
	//******************************************************************
		
		int[][] students = {{4,5,6},{12,5,7},{23,56,12,55,3}};
		
		for (int[] group : students) {
			for (int studentID : group) {
				System.out.println(studentID);
			}
		}
		
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students[i].length; j++) {
				System.out.println(students[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		

	}

}
