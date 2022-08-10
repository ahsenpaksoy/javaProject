package day28_arrays_part4;

import java.util.Arrays;

public class Question9Array {

	public static void main(String[] args) {
		
		int[] x = {3,4,8,6,9};
		
		System.out.println(Arrays.toString(makeLast(x)));
	}
	
	public static int[] makeLast(int[] arr) {
		
		int[] newArray = new int[2* arr.length];
		
		newArray[newArray.length-1] = arr[arr.length-1];
		
		return newArray;
	}

}
