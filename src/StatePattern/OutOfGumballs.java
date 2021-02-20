package StatePattern;

public class OutOfGumballs implements State {

	@Override
	public void insertQuarter(GumballMachine gm) {
		System.out.println("We are out of gumballs");
	}

	@Override
	public void ejectQuarter(GumballMachine gm) {
		System.out.println("We are out of gumballs");
	}

	@Override
	public void turnCrank(GumballMachine gm) {
		System.out.println("We are out of gumballs");
	}

	@Override
	public void dispenseGumball(GumballMachine gm) {
		System.out.println("We are out of gumballs");
	}

}
