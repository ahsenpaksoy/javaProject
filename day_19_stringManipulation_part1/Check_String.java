package day_19_stringManipulation_part1;

public class Check_String {

	public static void main(String[] args) {
		
		checkedString("Your order comfirmation number is XYZ", "comfirmation");
	}	
	
		
		public static void checkedString(String str1, String str2) {
			
			if(str1.contains(str2)) {
				
				System.out.println(str1.indexOf(str2));
			}else {
				 
				System.out.println("Not found");
			}
		}

	

}
