package day24_arrays_part1;

import java.util.Arrays;
import java.util.Random;

public class Array1 {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int[] numbers = new int[10];
		numbers[0] = rn.nextInt(100);
		numbers[1] = rn.nextInt(100);
		numbers[2] = rn.nextInt(100);
		numbers[3] = rn.nextInt(100);
		numbers[4] = rn.nextInt(100);
		numbers[5] = rn.nextInt(100);
		numbers[6] = rn.nextInt(100);
		numbers[7] = rn.nextInt(100);
		numbers[8] = rn.nextInt(100);
		numbers[9] = rn.nextInt(100);
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = rn.nextInt(100);
		}
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);

	}
//**********************************************************
		

		int[] numbers1 = new int[10];
		 for(int i=0; i<numbers1.length; i++) {
			 numbers1[i] = i+1;
			 
		 }
		 for(int i=0; i<numbers1.length; i++) {
			 System.out.println(numbers1[i] * 19);
		 }
		 System.out.println(Arrays.toString(numbers1));
		
		
		
			

 }
}