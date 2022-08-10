package day32_arrayList_part2;

import java.util.Scanner;

public class GroceryListMain {
	
	static GroceryList groceryList = new GroceryList();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				//System.out.println("Printing grocery items");
				break;
			case 2:
				addItem();
				//System.out.println("Adding items in the list");
				break;
			case 3:
				modifyItem();
				//System.out.println("Modifying item in the list");
				break;
			case 4:
				removeItem();
				//System.out.println("Removing item from the list");
				break;
			case 5:
				searchItem();
				//System.out.println("Searching item in the list");
				break;
			case 6:
				quit=true;
				break;	
			}	
		}
	}
	
	public static void printInstructions() {
		
		System.out.println("\nPress");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search item from the list.");
		System.out.println("\t 6 - To quit the application.");
				
	}
	public static void addItem() {
		
		System.out.println("Enter your grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine());
	}
	
	public static void modifyItem() {
		
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1,newItem);
	}
	
	public static void removeItem() {
		
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo-1);
	}
	
	public static void searchItem() {
		
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();
		
		if(groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in your grocery list");
		}else {
			System.out.println(searchItem + " is not in the grocery list");
		}
	}
	
	
	
	
	
	
	
	
	

}
