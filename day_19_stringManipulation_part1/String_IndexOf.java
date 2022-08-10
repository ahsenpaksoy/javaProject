package day_19_stringManipulation_part1;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));
		
		String url = "www.okta.com";
		int i = url.indexOf(".");
		System.out.println("Pos of . " + i);
		System.out.println(url.charAt(i+1));
		
		//find position of '-' and check if space is on right and left side
		String title = "Java - Google Search";
		
		int dash = title.indexOf("-");
		System.out.println(title.charAt(dash-1));
		System.out.println(title.charAt(dash+1));
		System.out.println("Apple");
		
		String country = "United States of Amerika";
		int states = country.indexOf("States");
		System.out.println("Position of states: " + states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		
		//1)contains()
		if(word2.contains("c++")) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		//2)indexOf()
		if(word2.indexOf("c++") > -1) {
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}

		//indexOf with 2 values
		
		String list = "html-selenium-angular-jenkins-grid";
		int firstDash = list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash = list.indexOf("-", 5);
		System.out.println(secondDash);
		
		int thirdDash = list.indexOf("-", secondDash+1);
		System.out.println(thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println(lastDash);
		
	    
		
		
		
		
		
		
		
	}

}
