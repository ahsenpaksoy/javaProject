package day_19_stringManipulation_part1;

public class EmojiProgram {

	public static void main(String[] args) {
		
		String emoji = ":)";
		
		//check if it does not equal to 2 chars
		
		if(emoji.length() != 2) {
			System.out.println("Invalid Emoji");
			return; //stop execution
		}
		
		//get first and second chars and assign to variables
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {
			if(second == ')') {
				System.out.println("Smile");
			}else if(second =='(') {
				System.out.println("Sad");
			}else if(second == '/') {
				System.out.println("upset");
			}else {
				System.out.println("Unknown emoji");
			}
			
		}else if(first == ';') {
			if(second == ')') {
				System.out.println("Wink");
			}else if(second == '0') {
				System.out.println("Suprised");
			}else {
				System.out.println("Unknown emoji");
			}
			
			
		}
		

	}

}
