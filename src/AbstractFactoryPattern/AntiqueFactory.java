package AbstractFactoryPattern;

public class AntiqueFactory implements Factory {

	@Override
	public Chair makeChair() {
		return new AntiqueChair();
	}

	@Override
	public Table makeTable() {
		return new AntiqueTable();
	}

	@Override
	public Sofa makeSofa() {
		return new AntiqueSofa();
	}

}
