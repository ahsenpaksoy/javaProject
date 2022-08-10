package day28_arrays_part4;

public class Question16Array {

	public static void main(String[] args) {
		
		int[] x = {2,3,54,12,57,9};
		
		System.out.println(countEvens(x));

	}
	
	public static int countEvens(int[] arr) {
		
		int counter = 0;
		
	for (int value : arr) {
			
			if(value % 2 == 0) {
				counter++;
			}
		}
		
		return counter;
		
		
		
	
		
	}

}
