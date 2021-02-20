package AbstractFactoryPattern;

public class TestAbstractMethod {
	public static void main(String[] args) {
		Factory a = new AntiqueFactory();
		Factory m = new ModernFactory();
		
		Chair c = a.makeChair();
		Sofa s = m.makeSofa();
		Table t = m.makeTable();
		
		c.sitOn();
		s.relaxOn();
		t.eatOn();
	}
}
