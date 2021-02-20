package TemplatePattern;

public class TestTemplate {
	public static void main(String[] args) {
		Coffee c = new Coffee();
		c.prepareDrink();
		
		System.out.println("-----------------------");
		
		Tea t = new Tea();
		t.prepareDrink();
	}
}
