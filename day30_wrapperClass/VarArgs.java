package day30_wrapperClass;

public class VarArgs {

	public static void main(String[] args) {
		
		sum(4,6);
		sum(2,6,12,8);
		sum(9,23,80);
		
		System.out.println(concat("Apple","Orange","123","Result"));

	}
	
	public static void sum(int... numbers) { // varArgs parameter can take a variable number of arguments
		
		int sum = 0;
		for (int value : numbers) {
			sum = sum + value;
		}
		
		System.out.println(sum);
	}
	
	public static String concat(String... strs) {
		
		String newStr = "";
		for (String str : strs) {
			newStr = newStr + str.charAt(2);
		}
		return newStr;
	}

}
