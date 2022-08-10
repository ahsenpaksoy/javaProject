package day28_arrays_part4;

public class Question21Array {

	public static void main(String[] args) {
		
		int[] x = {2,3,2,2,4,2};
		int[] y = {2,5,7,2,2,12,2,2,9};
		
        System.out.println(sum8(x));
        System.out.println(sum8(y));
	}
	
	public static boolean sum8(int[] arr) {
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++){
			if(arr[i] == 2) {
				sum = sum + arr[i];
			}
		}
				
			if(sum == 8) {
				return true;
			}else {
				return false;
			}
		
	}

}
