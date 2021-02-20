package CompositePattern;

import java.util.ArrayList;

public class Pallet implements Component {

	public double discount;
	public String name;
	ArrayList<Component> children = new ArrayList<>();

	public Pallet() {
		this.name = "Pallet: ";
		this.discount = 0.5;
	}
	
	@Override
	public double getPrice() {
		double price = 0;
		for (Component c : children) {
			price += c.getPrice();
		}
		price *= this.discount;
		return price;
	}

	@Override
	public void getName() {
		System.out.println(this.name);
		for (Component c : children) {
			c.getName();
		}
	}

	@Override
	public void addComponent(Component c) {
		children.add(c);
	}
}
