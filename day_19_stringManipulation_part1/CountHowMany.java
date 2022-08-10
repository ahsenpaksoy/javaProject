package day_19_stringManipulation_part1;

public class CountHowMany {

	public static void main(String[] args) {
		
		String str = "abcabqcabc";
		char myChar = 'a';
		
		int counter = 0;
		
		for(int i = 0; i<str.length(); i++) {
			
			if(str.charAt(i) == myChar) {
				counter++;
			}
		}
		
		System.out.println("Count for " + myChar + " is "+ counter);

	// write a program to print only vowel(a,e,o,i,u) in given string
		
		String word = "CybertekSchool";
		for (int i = 0; i<word.length(); i++) {
			
			char letter = word.charAt(i);
			if(letter=='a' || letter == 'e' || letter == 'o' || letter == 'i' || letter == 'u') {
				
				System.out.print(letter);
				
				if(i != word.length()-2) {
					
					System.out.print(",");
				}
			}
			
		}
		
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		
		String list = "potatoes,tomatoes,eggs,milk,bread,meat,apples";
		
		if(list.contains("apples")) {
			System.out.println("Apples are in your list");
		}else {
			System.out.println("Apples are not in your list");
		}
		
		boolean hasEggs = list.contains("eggs");
		
		System.out.println("Contains eggs: " + hasEggs);		
		
		
		
	}

}
