package TemplatePattern;

public abstract class Drink {
	
	public void prepareDrink() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments())	addCondiments();
		else System.out.println("No condiments wanted");
	}

	public boolean customerWantsCondiments() {
		return true;
	}

	public abstract void addCondiments();


	public abstract void brew();


	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}
}
