package DecoratorPattern;

public class Sugar extends BeverageDecorator {

	public Sugar(Beverage beverage) {
		super("Sugar", 1.2, beverage);
	}

}
