package day28_arrays_part4;

public class Question12Arrays {

	public static void main(String[] args) {
		
		int[] x = {1,3,45,7};
		int[] y = {3,5,8,1};
		int[] z = {1,23,4,67};
		
		System.out.println(start1(x,y));
		System.out.println(start1(y,z));
		System.out.println(start1(x,z));
		}

	
	
	public static int start1(int[] arr1,int[] arr2) {
		
		int counter = 0;
		if(arr1[0]==1) {
			counter++;
		}
		if(arr2[0]==1) {
			counter++;
		}
		return counter;
	}

}
