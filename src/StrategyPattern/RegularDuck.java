package StrategyPattern;

// inheritance for the subclasses of duck
public class RegularDuck extends Duck {

	public RegularDuck() {
		super(new SlowSwim(), new LoudQuack());
	}
}
