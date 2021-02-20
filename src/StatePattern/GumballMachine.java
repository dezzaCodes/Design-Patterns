package StatePattern;

public class GumballMachine {
	public State state;
	public int hasGumballs;

	public GumballMachine() {
		this.state = new NoQuarter();
		this.hasGumballs = 3;
	}
	
	// the following are state transitions
	public void insertQuarter() {
		System.out.println("Inserting quarter...");
		state.insertQuarter(this);
	}
	
	public void ejectQuarter() {
		System.out.println("ejecting quarter...");
		state.ejectQuarter(this);
	}
	
	public void turnCrank() {
		System.out.println("Turning crank....");
		state.turnCrank(this);
	}
	
	public void dispenseGumball() {
		System.out.println("Dispensing gumball.....");
		state.dispenseGumball(this);
	}
	
	public void refill(int i) {
		this.hasGumballs += i;
		this.state = new NoQuarter();
	}
}
