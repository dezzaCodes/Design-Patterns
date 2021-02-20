package FactoryPattern;

public class WindowsButton implements Button {

	@Override
	public void onClick() {
		System.out.println("Windows button");
	}

	@Override
	public void render() {
		System.out.println("Test button");
		onClick();
	}
}
