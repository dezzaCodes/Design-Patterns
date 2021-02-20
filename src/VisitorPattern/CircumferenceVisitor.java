package VisitorPattern;

public class CircumferenceVisitor implements Visitor {

	@Override
	public double visit(Rectangle r) {
		return 2 * r.length + 2 * r.width;
	}

	@Override
	public double visit(Circle s) {
		return 2 * 3.14 * s.radius;
	}

}
