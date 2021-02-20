package DecoratorPattern;

public class Tea implements Beverage {

	public double cost;
	public String name;

	public Tea() {
		this.name = "Tea";
		this.cost = 4.32;
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