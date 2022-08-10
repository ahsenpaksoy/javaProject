package Methods;

public class SwapValue {

	public static void main(String[] args) {
		// Solution-1  bz using 3rd variable
		int n1 = 10;
		int n2 = 20;
		int n3;
		
		n3 = n1;
		n1 = n2;
		n2 = n3;
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
		//Solution-2 without using 3rd variable
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;

	}
}
