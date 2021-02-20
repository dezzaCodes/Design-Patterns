package StatePattern;

public class GumballSold implements State {

	@Override
	public void insertQuarter(GumballMachine gm) {
		System.out.println("Please wait, we're preparing your gumball");
	}

	@Override
	public void ejectQuarter(GumballMachine gm) {
		System.out.println("Its soo late for a refund");
	}

	@Override
	public void turnCrank(GumballMachine gm) {
		System.out.println("Please wait");
	}

	@Override
	public void dispenseGumball(GumballMachine gm) {
		if (gm.hasGumballs > 0) {
			System.out.println("Gumball dispensed");
			gm.hasGumballs--;
			gm.state =  new NoQuarter();
		} else {
			System.out.println("We are out of gumballs sorry");
			gm.state = new OutOfGumballs();
		}
	}

}
