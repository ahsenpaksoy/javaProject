package day334_Constructors;

public class DiceTest {

	public static void main(String[] args) {
		
		final int SIX_SIDES = 6;
		Dice sixDice = new Dice(SIX_SIDES);
	
		rollDice(sixDice);
		
		//mete ekledi
		//int s = sixDice.getSides() ;
		//int g = sixDice.getValue();
		
		//mete ekledi
		//rollDice222(sixDice.getSides(),sixDice.getValue());
		//rollDice222(s,g);

	}
	
	public static void rollDice(Dice d) {
		//Rolling a 6 sided dice
		System.out.println("Rolling a " + d.getSides() + " sided dice ");
		
		//The dice's value : 5
		System.out.println("The dice's value : " + d.getValue());
		
		
	}
	
	//mete ekledi
//	public static void rollDice222(int s, int g) {
//		//Rolling a 6 sided dice
//		System.out.println("Rolling a " + s + " sided dice ");
//		
//		//The dice's value : 5
//		System.out.println("The dice's value : " + g);
//		
//		
//	}

}
