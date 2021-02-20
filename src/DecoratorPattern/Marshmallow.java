package DecoratorPattern;

public class Marshmallow extends BeverageDecorator {

	public Marshmallow(Beverage beverage) {
		super("Marshmallow", 2.5, beverage);
	}
}
