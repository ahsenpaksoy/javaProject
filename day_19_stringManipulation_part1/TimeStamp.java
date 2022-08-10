package day_19_stringManipulation_part1;

public class TimeStamp {

	public static void main(String[] args) {
		
		String time = "10/01/2019 15:42:00";
		
		System.out.println(timeStamp(time));

	}
	
	public static String timeStamp(String time) {
		
		time = time.replace("/", "").replace(":", "").replace(" ", "");
		
		return time;
	}

}
