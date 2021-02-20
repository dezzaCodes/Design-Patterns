package DecoratorPattern;

public class TestBeverage {
	public static void main(String[] args) {
		Beverage c = new Coffee();
		Beverage t = new Tea();
		Beverage d = new Decaf();
		
		c = new Milk(c);
		c = new Marshmallow(c);
		
		c.printItems();
		System.out.println(c.calcCost());
		
		System.out.println("--------------------");
		
		t = new Milk(t);
		t = new Milk(t);
		t = new Milk(t);
		t = new Milk(t);
		t = new Milk(t);
		t = new Milk(t);
		
		t.printItems();
		System.out.println(t.calcCost());
		
		System.out.println("--------------------");
		
		d = new Marshmallow(d);
		d = new Milk(d);
		d = new Sugar(d);
		d = new Marshmallow(d);
		d = new Marshmallow(d);
		
		d.printItems();
		System.out.println(d.calcCost());
	}
}
