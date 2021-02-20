package StrategyPattern;

public class TestDuck {

	public static void main(String[] args) {
		Duck d1 = new Duck(new FastSwim(), new SoftQuack());
		d1.quack();
		d1.swim();
		
		System.out.println("-------------------");
		
		Duck d2 = new Duck(new SlowSwim(), new SoftQuack());
		d2.quack();
		d2.swim();
		
		System.out.println("-------------------");
		
		Duck d3 = new RegularDuck();
		d3.quack();
		d3.swim();
	}

}
