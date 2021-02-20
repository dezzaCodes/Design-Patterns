package StrategyPattern;

public class SlowSwim implements Swim {
	@Override
	public void swim() {
		System.out.println("I swim slow");
	}
}
