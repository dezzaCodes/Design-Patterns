package VisitorPattern;

public class AreaVisitor implements Visitor {

	@Override
	public double visit(Rectangle r) {
		return r.width * r.length;
	}

	@Override
	public double visit(Circle s) {
		return s.radius * s.radius * 3.14;
	}

	
}
