package VisitorPattern;

public interface Visitor {
	public double visit(Rectangle r);
	public double visit(Circle s);
}
