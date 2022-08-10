package day_23_stringManipulationLab_randomClass;

public class Question_Doble {

	public static void main(String[] args) {
		
		String str = "Hi-there"; //  The  TThhee  substring(0,1)  substring(1,2)  substring(2,3)
		
		String newString = "";
		
		for(int i =0; i<str.length(); i++) {
			
			newString = newString + str.substring(i, i+1).concat(str.substring(i, i+1));
		}
		
		System.out.println(newString);
		

	}

}
