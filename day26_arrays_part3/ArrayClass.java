package day26_arrays_part3;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		
		//toString()
		int[] nums = {43,12,4,1,3,5};
		System.out.println(Arrays.toString(nums));
		
		//equals()
		int[] nums1 = {4,5,6,10,100};
		int[] nums2 = {4,5,6,10,100};
		System.out.println(Arrays.equals(nums1, nums2));
		
		//sort() : sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		String[] languages = {"Zulu","Spanish","Italian","English","1Polish","arabic"};
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		//binarySearch()
		int[] numX = {4,6,7,13,56};
		System.out.println(Arrays.binarySearch(numX, 7));;
		System.out.println(Arrays.binarySearch(numX, 56));
		System.out.println(Arrays.binarySearch(numX, 5)); // (-(insertionPoint)-1)
		
		//copyOf()
		double[] d1 = {2.3,4.5,12.4};
		double[] d2 = d1;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		d1[0] = 100.3;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		d2[1] = 440.5;
		System.out.println(Arrays.toString(d1));
		System.out.println(Arrays.toString(d2));
		
		double[] d3 = Arrays.copyOf(d2, d2.length);
		System.out.println(Arrays.toString(d3));
		
		d2[0] = 5.2;
		System.out.println(Arrays.toString(d2));
		System.out.println(Arrays.toString(d3));
		
		//String : == and .equals
		//Array : reference equality and copyOf()
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
