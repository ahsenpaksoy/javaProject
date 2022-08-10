package day31_arrayList;

import java.util.ArrayList;

public class ShoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		int count = shoppingList.size();
		System.out.println(count);
		
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList.get(0) + "|" + shoppingList.get(count-1));
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		for (String item : shoppingList) {
			System.out.println(item);
		}
		
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
		
		
		
		
		
		

	}

}
