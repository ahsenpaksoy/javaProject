package day28_arrays_part4;

import java.util.Arrays;

public class Question15Array {

	public static void main(String[] args) {
		
		int[] x = {3,5,8,9,7};
		System.out.println(Arrays.toString(swapEnds(x)));

	}
	
	public static int[] swapEnds(int[] arr) {
		
		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length-1];
		arr[arr.length-1] = temp;
		
		return arr;
	}

}
