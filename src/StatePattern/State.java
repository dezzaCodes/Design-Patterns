package StatePattern;

//obviously the methods should be what we do not the names of the state
//have to pass a reference to the gumball state machine
/**
 * define a state interface with a method for every action inside gm
 * implement a state class for every state inside gm
 * @author Dezza
 *
 */
public interface State {
	public void insertQuarter(GumballMachine gm);
	public void ejectQuarter(GumballMachine gm);
	public void turnCrank(GumballMachine gm);
	public void dispenseGumball(GumballMachine gm);
}
