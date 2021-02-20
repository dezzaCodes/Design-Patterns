package CompositePattern;

public class TestComponent {
	public static void main(String[] args) {
		Component f1 = new Fanta();
		Component s1 = new Sprite();
		Component c1 = new Case();
		Component p1 = new Pallet();
		
		f1.getName();
		System.out.println(f1.getPrice());
		
		System.out.println("---------------------");
		
		s1.getName();
		System.out.println(s1.getPrice());
		
		System.out.println("---------------------");
		
		c1.addComponent(s1);
		c1.addComponent(f1);
		c1.getName();
		System.out.println(c1.getPrice());
		
		System.out.println("---------------------");
		
		p1.addComponent(c1);
		p1.addComponent(f1);
		p1.addComponent(s1);
		p1.addComponent(c1);
		p1.getName();
		System.out.println(p1.getPrice());
		
	}
}
