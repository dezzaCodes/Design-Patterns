package CompositePattern;

import java.util.ArrayList;

public class Case implements Component {

	public double discount;
	public String name;
	ArrayList<Component> children = new ArrayList<>();

	public Case() {
		this.name = "Case: ";
		this.discount = 0.8;
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
