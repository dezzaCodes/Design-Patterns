package AbstractFactoryPattern;

public interface Factory {
	public Chair makeChair();
	public Table makeTable();
	public Sofa makeSofa();
}
