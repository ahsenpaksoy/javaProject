package day28_arrays_part4;

import java.util.Arrays;

public class Question5Array {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		
		System.out.println(Arrays.toString(rotateLeft(x)));
		

	}
	
	public static int[] rotateLeft(int[] arr) {
		
		int x = arr[0];
		for (int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = x;
		return arr;
	}

}
