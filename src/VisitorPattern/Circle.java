package VisitorPattern;

public class Circle implements Shape {
	public int radius;

	public Circle() {
		this.radius = 3;
	}

	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}
}
