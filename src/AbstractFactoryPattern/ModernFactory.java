package AbstractFactoryPattern;

public class ModernFactory implements Factory {

	@Override
	public Chair makeChair() {
		return new ModernChair();
	}

	@Override
	public Table makeTable() {
		return new ModernTable();
	}

	@Override
	public Sofa makeSofa() {
		return new ModernSofa();
	}
	
}
