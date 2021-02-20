package StatePattern;

public class NoQuarter implements State {

	@Override
	public void insertQuarter(GumballMachine gm) {
		System.out.println("Quarter inserted");
		gm.state = new HasQuarter();
	}

	@Override
	public void ejectQuarter(GumballMachine gm) {
		System.out.println("No quarter to eject");
	}

	@Override
	public void turnCrank(GumballMachine gm) {
		System.out.println("You turned the crank, but there is no quarter");
	}

	@Override
	public void dispenseGumball(GumballMachine gm) {
		System.out.println("You need to pay first");
	}

}
