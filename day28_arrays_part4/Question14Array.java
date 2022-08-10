package day28_arrays_part4;

import java.util.Arrays;

public class Question14Array {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {5,6,3,1,9};
		
		int[] newArray = new int[x.length + y.length];
		
		for(int i=0; i<x.length; i++) {
			
			newArray[i] = x[i];
		}
		
		int a = 0;
		for(int j = x.length; j<newArray.length; j++) {
			newArray[j] = y[a];
			
		}
		
		System.out.println(Arrays.toString(newArray));

	}
	
	
}
