package day28_arrays_part4;

public class Question18Array {

	public static void main(String[] args) {
		
		int[] x = {1,2,3,3,6,13,7,100,9};
		
		System.out.println(except13(x));
		
		
		//int[] x = {1,2,3,3,6,13,7,100,9};
		//int sum = 0; 
		//for(int i=0; i<arr.length; i++){
		//   if(x[i] != 13) {
		//       sum = sum +x[i];
		//   }else {
		//       break;
		//   }
		//}
		//sout(sum);
		}
	
	public static int except13(int[] arr) {
		
		int sum = 0;
		for (int i=0; i<arr.length; i++) {
			if(arr[i]==13) {
				break;
			}else {
				sum = sum + arr[i];
			}
		}
		return sum;
	}

}
