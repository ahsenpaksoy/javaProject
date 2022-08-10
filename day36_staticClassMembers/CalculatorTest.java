package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		double result = Calculator.plus(55, 7); //static way
		System.out.println("Result:" + result);
		
		Calculator c = new Calculator();
		System.out.println("Result:" + c.plus(55, 7));
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('5'));
		
		CalculatorTest.m1();
		
		CalculatorTest C1 = new CalculatorTest();
		C1.m1();
		
		m1();
		
		//static methods are called as ClassName.methodName(); or 
		//methodName(); only if in the same class
		
		// Aciklama eklenecek
		
		
	}
	
	public static void m1() {
		System.out.println("hello");
	}
	
	public static void m2() {
		System.out.println("java");
	}
	
	
	
	
	
	
	
	

}
