package DecoratorPattern;

public class Decaf implements Beverage {

	public double cost;
	public String name;

	public Decaf() {
		this.name = "Decaf";
		this.cost = 2.07;
	}
	
	@Override
	public double calcCost() {
		return cost;
	}

	@Override
	public void printItems() {
		System.out.println(name);
	}
}