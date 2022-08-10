package day_21_stringManipulation_part3;

public class String_SubString {

	public static void main(String[] args) {
		
		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length());
		System.out.println(sentence.substring(5, sentence.length()-5));
		
		String chars = "{{}}";
		String word = "AUTOMATION";
		
		String result = chars.substring(0,  2) + word + chars.substring(2);
		System.out.println(result);
		
		System.out.println(word.toLowerCase());
		
	//***********************************************************
		
		//Write a program to display |342| from given string.
		
		String str = " 342 ";
		System.out.println("|" + str.trim() + "|");
		
	//***********************************************************
		
		String userName = "";
		String password = "";
		
		if(userName.isEmpty()) {
			System.out.println("Username fields can not be empty");
		}else {
			System.out.println("Username is not empty");
		}
		
		if(userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password can not be empty");
		}else {
			System.out.println("Username or password is not empty");
		}
			
	//************************************************************
		
		String word1 = "eclipse";
		
		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));
		
		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.startsWith("xe"));

		
		
		
	}

}
