package FactoryPattern;

public class TestFactory {
	public static void main(String[] args) {
		Factory mac = new Mac();
		Factory win = new Windows();
		
		mac.renderWindow();
		win.renderWindow();
	}
}
