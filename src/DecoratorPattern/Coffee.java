package DecoratorPattern;

public class Coffee implements Beverage {

	public double cost;
	public String name;

	public Coffee() {
		this.name = "Coffee";
		this.cost = 6.99;
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