package day36_staticClassMembers;

public class Calculator {
	
	int x;
	
	public static double plus(double num1,double num2) {
		return num1 + num2;
	}
	
	public static double minus(double num1,double num2) {
        return num1-num2;
	}   
	
	public static double multiply(double num1,double num2) {
        return num1*num2;
    }
	
	public int mA() { //if you use instance variable(x) in the method u can't use static
		return x+4;    //u should use instance method
	}
	
	
        
        
        
        
}
	
