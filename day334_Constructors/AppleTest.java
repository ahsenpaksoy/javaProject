package day334_Constructors;

public class AppleTest {

	public static void main(String[] args) {
		
		Apple a1 = new Apple();
		changeApple(a1);
		System.out.println(a1.color);
		
		//Apple b1 = methodObject();
		System.out.println(methodObject().color); //holding b1 object

	}
	
	
	public static void changeApple(Apple x) {
		
		x.color = "White";
	}
	
	//i want to return object
	//which object?
	//object belongs to Apple class
	public static Apple methodObject() {
		
		Apple b1 = new Apple();
		return b1;
		
	}

}
