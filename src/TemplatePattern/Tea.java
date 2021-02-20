package TemplatePattern;

public class Tea extends Drink {

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
	}

	@Override
	public void brew() {
		System.out.println("Brewing tea leaves");
	}
	
	@Override
	public boolean customerWantsCondiments() {
		return false;
	}
	
}
