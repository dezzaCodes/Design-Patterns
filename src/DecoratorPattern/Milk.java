package DecoratorPattern;

public class Milk extends BeverageDecorator {

	public Milk(Beverage beverage) {
		super("Milk", 4.99, beverage);
	}
}
