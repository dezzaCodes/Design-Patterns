package TemplatePattern;

public class Coffee extends Drink{

	@Override
	public void addCondiments() {
		System.out.println("Adding sugar and milk");
	}

	@Override
	public void brew() {
		System.out.println("Brewing coffee grinds");
	}

}
