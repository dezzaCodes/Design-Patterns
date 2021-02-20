package FactoryPattern;

public class Windows implements Factory {

	@Override
	public void renderWindow() {
		Button b = createButton();
		b.render();
	}

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
