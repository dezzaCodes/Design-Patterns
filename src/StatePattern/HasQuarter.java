package StatePattern;

public class HasQuarter implements State {

	@Override
	public void insertQuarter(GumballMachine gm) {
		System.out.println("Quarter already inserted");
	}

	@Override
	public void ejectQuarter(GumballMachine gm) {
		gm.state = new NoQuarter();
		System.out.println("Quarter ejected");
	}

	@Override
	public void turnCrank(GumballMachine gm) {
		gm.state = new GumballSold();
		System.out.println("You turned the crank...");
	}

	@Override
	public void dispenseGumball(GumballMachine gm) {
		System.out.println("Please turn the crank first");
	}
	
}
