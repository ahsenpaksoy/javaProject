package day28_arrays_part4;

import java.util.Arrays;

public class Question7Array {

	public static void main(String[] args) {
		
		int[] x = {17,3,6,34,78,98};
		int[] y = {};
		
		System.out.println(Arrays.toString(makeEnds(x,y)));
	}
	
	public static int[] makeEnds(int[] arr1, int[] arr2) {
		
		arr2 = new int[2];
		
		arr2[0] = arr1[0];
		arr2[1] = arr1[arr1.length-1];
		
		return arr2;
	}

}
