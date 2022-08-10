package day_21_stringManipulation_part3;

public class Greeting {

	public static void main(String[] args) {
		
	   System.out.println(helloName("Bob"));
	   System.out.println(helloName("Alice"));
	   System.out.println(helloName("X"));
	
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am java"));
		
		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdsjrue"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("a"));

	}
	
	public static String helloName(String str) {
	
	return "Hello ".concat(str).concat("!");
	}
	
//***************************************************
	
	public static String makeAbba(String str1, String str2) {
		
		return str1 + str2 + str2 + str1;
	}
	
//****************************************************
	
	public static String extraEnd(String str) {
		
		if(str.length()<2) {
			return "invalid string";
		}
		
		String dummy = "";
		dummy = str.substring(str.length()-2);
		return dummy + dummy + dummy;
	
	}

  //*************************************************
	
	public static String firstTwo(String str) {
		
		if(str.length()<2) {
			return str;
		}else if(str.isEmpty()) {
			return "";
		}else {
			return str.substring(0,2);
		}
	}
	
	
	
	
	
	
}
