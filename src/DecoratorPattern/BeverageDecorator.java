package DecoratorPattern;

public abstract class BeverageDecorator implements Beverage {

	public String name;
	public Beverage beverage;
	public double price;

	public BeverageDecorator(String name, double price, Beverage beverage) {
		this.name = name;
		this.price = price;
		this.beverage = beverage;
	}


	@Override
	public void printItems() {
		System.out.println(name);
		beverage.printItems();
	}

	@Override
	public double calcCost() {
		return price + beverage.calcCost();
	}
}
