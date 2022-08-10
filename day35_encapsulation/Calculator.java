package day35_encapsulation;

public class Calculator {
	
	public Floor floor;
	public Carpet carpet;
	
	
    public Calculator(Floor floor, Carpet carpet) { //passing object to method parameters
		this.floor = floor;
		this.carpet = carpet;
	}

    public double getTotalCost() {
	    return carpet.getCost() * floor.getArea();

  }
}