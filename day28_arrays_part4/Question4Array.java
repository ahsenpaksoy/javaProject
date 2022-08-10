package day28_arrays_part4;

public class Question4Array {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {-4,3,0};
		
		int a = sum(x);
		System.out.println(a);
		
		System.out.println(sum(y));
		
		System.out.println(sum1(x));
	}
	
	public static int sum(int[] arr) {
		
		int sum = 0;
		for(int value : arr) {
			sum = sum + value;
		}
		return sum;
	}
	
	public static int sum1(int[] arr) {
		
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		return sum1;
	}

}
