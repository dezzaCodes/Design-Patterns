package StrategyPattern;

public class LoudQuack implements Quack{

	@Override
	public void quack() {
		System.out.println("I QUACK LOUDLY");
	}

}
