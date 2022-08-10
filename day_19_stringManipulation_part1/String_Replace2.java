package day_19_stringManipulation_part1;

public class String_Replace2 {

	public static void main(String[] args) {
		
		String sentence = "Coding is fun, it is my hobby!!";
		String withNoSpace = sentence.replace(" ", "");
		System.out.println(withNoSpace);
		System.out.println(sentence);
		
		//replace , with !!!
		
		sentence = sentence.replace(",", "!!!");
		System.out.println(sentence);
				
		String mixed = "&^@#j$a-v|a@#$";
		mixed = mixed.replace("&^@#", "");
		System.out.println(mixed);
		mixed = mixed.replace("@#$", "");
		System.out.println(mixed);
		mixed = mixed.replace("$", "").replace("-", "").replace("|","");
		System.out.println(mixed);

	}

}
