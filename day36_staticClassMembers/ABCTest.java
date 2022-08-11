package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		ABC.m1();
		
		/*
		ABC o1 = new ABC();
		o1.m1();
		*/
		
		//Whenever all of your methods in your class are static, and you want everyone to call them
		//static way Classname.methodname(), then you can simply make your constructor private	
		
	}	
		
		public static void print() {
			//static int a = 5; //local variables can not be static
		}
		

}
