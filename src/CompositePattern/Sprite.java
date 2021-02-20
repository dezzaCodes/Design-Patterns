package CompositePattern;

public class Sprite implements Component {

	public String name;
	public double price;

	public Sprite() {
		this.name = "Sprite";
		this.price = 1.9;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void getName() {
		System.out.println(this.name);
	}
	
	@Override
	public void addComponent(Component c) {
		return;
	}
}
