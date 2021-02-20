package FactoryPattern;

public class MacButton implements Button {

	@Override
	public void onClick() {
		System.out.println("Mac button");
	}

	@Override
	public void render() {
		System.out.println("Test button");
		onClick();
	}

}
