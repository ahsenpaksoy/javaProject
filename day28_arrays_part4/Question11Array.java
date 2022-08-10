package day28_arrays_part4;

import java.util.Arrays;

public class Question11Array {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {2,3,5};
		int[] z = {4,5,8,9,2};
		
		System.out.println(Arrays.toString(fix23(x)));
		System.out.println(Arrays.toString(fix23(y)));
		System.out.println(Arrays.toString(fix23(z)));
	}

	public static int[] fix23(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				
				arr[i+1] = 0;
			}
		}
		return arr;
	}
}
