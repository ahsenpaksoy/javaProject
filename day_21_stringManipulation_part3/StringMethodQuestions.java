package day_21_stringManipulation_part3;

public class StringMethodQuestions {

	public static void main(String[] args) {
		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		
		System.out.println(comboString("Hello", "Hi"));
		System.out.println(comboString("Hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
		
		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
		
		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		
		System.out.println(frontAgain("edited"));
		

	}
	
	public static String firstHalf(String str) {
		
		int x = str.length() / 2;
		return str.substring(0, x);
	}
	
	//*************************************************
	
	public static String withoutEnd(String str) {
		if(str.length()<2) {
			return "invalid string";
		}
		
		return str.substring(1, str.length()-1);
	}
//******************************************************
	
	public static String comboString(String str1, String str2) {
		
		String str;
		if(str1.length()>str2.length()) {
			str = str2.concat(str1).concat(str2);
		}else {
			str = str2.concat(str1).concat(str2);
		}
		
		return str;
	}
//************************************************************
	
	public static String left2(String str) {
		
		return str.substring(2).concat(str.substring(0, 2));
	}
//**************************************************************	
	
	public static String right2(String str) {
		
		return str.substring(str.length()-2).concat(str.substring(0, str.length()-2));
	}
//***************************************************************
	
	public static boolean frontAgain(String str) {
		
		String first2 = str.substring(0, 2);
		String last2 = str.substring(str.length()-2);
		
		return first2.equals(last2);
	}
	
	
	
	
	
	

}
