package VisitorPattern;

public class Rectangle implements Shape {
	public int width;
	public int length;

	public Rectangle() {
		this.width = 5;
		this.length = 4;
	}

	@Override
	public double accept(Visitor v) {
		return v.visit(this);
	}
}
