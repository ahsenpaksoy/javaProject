package day_19_stringManipulation_part1;

public class String_CharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		System.out.println(word.length());
		
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(7));
		
		
	//Check if first character is "A"	
		String word2 = "Apple";
		if(word2.charAt(0) == 'A') {
			
			System.out.println("A is first character");
		}else {
			System.out.println("A is not first character");
		}
		
		
	//Check if first and last characters are same	
		String word3 = "civic";
		if(word3.charAt(0) == word3.charAt(4)) {
			System.out.println("First and last characters are same");
		}else {
			System.out.println("First and last characters are not same");
		}
				
		
	//last index not hard coded.
		String word4 = "Java Script";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last char of  " + word4 + " is " + lastChar);
		
	//PrintEachCharacter	
		
		String str = "Cybertec School";
		for (int i=0; i<str.length(); i++) {
			
			System.out.print(str.charAt(i));
			
		}
					

	}

}
