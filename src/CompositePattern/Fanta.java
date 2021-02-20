package CompositePattern;

public class Fanta implements Component {

	public String name;
	public double price;

	public Fanta() {
		this.name = "Fanta";
		this.price = 2.5;
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
