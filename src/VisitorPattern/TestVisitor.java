package VisitorPattern;

public class TestVisitor {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Visitor area = new AreaVisitor();
		Visitor circum = new CircumferenceVisitor();
		
		System.out.println(r.accept(area));
		System.out.println(c.accept(circum));
	}

}
