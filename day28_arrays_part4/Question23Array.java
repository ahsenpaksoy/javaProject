package day28_arrays_part4;

import java.util.Arrays;
import java.util.Random;

public class Question23Array {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fizzArray(7)));
		
	}
	
	public static int[] fizzArray(int x) {
		
		Random rn = new Random();		
		
		int[] array = new int[x];
		
		for(int i=0; i<array.length; i++) {
			
			int arr = rn.nextInt(100);
			
			array[i] = arr;
		}
		return array;
		
	}

}
