package day24_arrays_part1;

public class ForEachLoop {

	public static void main(String[] args) {
	
		String[] products = {"Timberland","Shirt","Watch","Bag","Shoes"};
		double[] prices = {120.0 , 12.99 , 300 , 35,  68.89};
		
		for(int i = 0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		for(int i=0; i<prices.length; i++) {
			System.out.println(prices[i]);
		}
		
		System.out.println("-----------------------------");
		
		for(String prod : products) {
			System.out.println(prod);
		}
		
		for(double pr : prices) {
			System.out.println(pr);
		}
		
		//Print products item in reverse order
		
		for(int i=products.length-1; i>=0; i--) {
			System.out.println(products[i]);
		}
		
		
		

	}

}
