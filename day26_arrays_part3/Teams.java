package day26_arrays_part3;

public class Teams {

	public static void main(String[] args) {
		
		//String[][] teams = new String[2][4];
		/*
		teams[0][0] = "Mike";
		teams[0][1] = "Tony";
		teams[0][2] = "Smith";
		teams[0][3] = "Evan";
		
		teams[1][0] = "David";
		teams[1][1] = "Emy";
		teams[1][2] = "John";
		teams[1][3] = "Ryan";
		*/
		
		String[][] teams = { {"Mike","Tony","Smith","Evan"} , {"David","Emy","John","Ryan"} };
		
		System.out.println("First player of first team");
		System.out.println(teams[0][0]);
		
		System.out.println("number of rows: " + teams.length);
		System.out.println("# People in first team: " + teams[0].length);
		System.out.println("# People in second team: " + teams[1].length);

	}

}
